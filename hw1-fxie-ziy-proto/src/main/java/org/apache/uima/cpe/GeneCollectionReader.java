package org.apache.uima.cpe;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

import org.apache.uima.cas.CAS;
import org.apache.uima.cas.CASException;
import org.apache.uima.collection.CollectionException;
import org.apache.uima.collection.CollectionReader_ImplBase;
import org.apache.uima.examples.SourceDocumentInformation;
import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.tcas.DocumentAnnotation;
import org.apache.uima.resource.ResourceConfigurationException;
import org.apache.uima.resource.ResourceInitializationException;
import org.apache.uima.util.FileUtils;
import org.apache.uima.util.Progress;
import org.apache.uima.util.ProgressImpl;


public class GeneCollectionReader extends CollectionReader_ImplBase {

  /**
   * Name of configuration parameter that must be set to the path of a directory containing input
   * files.
   */
  public static final String PARAM_INPUTDIR = "InputDirectory";

  
  private ArrayList<String> mLines;

  private String mEncoding;

  private String mLanguage;
  
  private Boolean mRecursive;
  
  private int lineCount;

  private int mCurrentIndex;

  /**
   * @see org.apache.uima.collection.CollectionReader_ImplBase#initialize()
   */
  public void initialize() throws ResourceInitializationException {
    File inputFile = new File(((String) getConfigParameterValue(PARAM_INPUTDIR)).trim());
    String line;
    if (null == mRecursive) { // could be null if not set, it is optional
      mRecursive = Boolean.FALSE;
    }
    mCurrentIndex = 0;

    // if input directory does not exist or is not a directory, throw exception
    if (!inputFile.exists()) {
      throw new ResourceInitializationException(ResourceConfigurationException.DIRECTORY_NOT_FOUND,
              new Object[] { PARAM_INPUTDIR, this.getMetaData().getName(), inputFile.getPath() });
    }
    InputStream is = null;
    try {
      is = new FileInputStream(inputFile);
    } catch (FileNotFoundException e1) {
      // TODO Auto-generated catch block
      e1.printStackTrace();
    }
    mLines = new ArrayList();
   int i = 0;
   lineCount = 0;
   try {
     BufferedReader reader = new BufferedReader(new InputStreamReader(is));
      line = reader.readLine();
    
      while (line != null) {
          lineCount++;
          mLines.add(line);
          line = reader.readLine();
      }
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } 
    // get list of files in the specified directory, and subdirectories if the
    // parameter PARAM_SUBDIR is set to True
 //   mFiles = new ArrayList<File>();
    //addFilesFromDir(directory);
  }
  
  /**
   * This method adds files in the directory passed in as a parameter to mFiles.
   * If mRecursive is true, it will include all files in all
   * subdirectories (recursively), as well. 
   * 
   * @param dir
   */
  /*private void addFilesFromDir(File dir) {
    File[] files = dir.listFiles();
    for (int i = 0; i < files.length; i++) {
      if (!files[i].isDirectory()) {
        mFiles.add(files[i]);
      } else if (mRecursive) {
        addFilesFromDir(files[i]);
      }
    }
  }*/

  /**
   * @see org.apache.uima.collection.CollectionReader#hasNext()
   */
  public boolean hasNext() {
    if  (lineCount > 0)
    {
        lineCount--;
        return true;
    }
    else
    {
        return false;
    }
  }

  /**
   * @see org.apache.uima.collection.CollectionReader#getNext(org.apache.uima.cas.CAS)
   */
  public void getNext(CAS aCAS) throws IOException, CollectionException {
    JCas jcas;
    try {
      jcas = aCAS.getJCas();
    } catch (CASException e) {
      throw new CollectionException(e);
    }

    int currentCount = mLines.size()- lineCount - 1;
    String text = mLines.get(currentCount);
      // put document in CAS
    jcas.setDocumentText(text);

  }

  /**
   * @see org.apache.uima.collection.base_cpm.BaseCollectionReader#close()
   */
  public void close() throws IOException {
  }

  /**
   * @see org.apache.uima.collection.base_cpm.BaseCollectionReader#getProgress()
   */
  public Progress[] getProgress() {
    return new Progress[] { new ProgressImpl(mCurrentIndex, mLines.size(), Progress.ENTITIES) };
  }

  /**
   * Gets the total number of documents that will be returned by this collection reader. This is not
   * part of the general collection reader interface.
   * 
   * @return the number of documents in the collection
   */
  public int getNumberOfDocuments() {
    return mLines.size();
  }

}

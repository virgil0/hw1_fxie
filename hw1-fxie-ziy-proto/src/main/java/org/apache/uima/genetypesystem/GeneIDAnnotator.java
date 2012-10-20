package org.apache.uima.genetypesystem;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;

import org.apache.uima.UimaContext;
import org.apache.uima.analysis_component.JCasAnnotator_ImplBase;
import org.apache.uima.jcas.JCas;
import org.apache.uima.resource.ResourceInitializationException;

import com.aliasi.chunk.Chunk;
import com.aliasi.chunk.Chunker;
import com.aliasi.chunk.Chunking;
  
import com.aliasi.util.AbstractExternalizable;

public class GeneIDAnnotator extends JCasAnnotator_ImplBase {
  private Chunker chunker = null;
  
  public void initialize(UimaContext aContext) throws ResourceInitializationException {
    File modelFile = new File(System.getProperty("user.dir") + "/src/main/resources/ne-en-bio-genetag.HmmChunker");
    try {
      chunker = (Chunker) AbstractExternalizable.readObject(modelFile);
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } catch (ClassNotFoundException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }
  public void initialize()
  {
     
    }
  
  /**
   * @see JCasAnnotator_ImplBase#process(JCas)
   */
  public void process(JCas aJCas) {
    Chunking chunking = null;
    
   String docText = aJCas.getDocumentText();
   String input = null;
    int index;
    
   // id annotation1 = new id(aJCas);
    
      // found one - create annotation
   if((index = docText.indexOf(" ")) != -1)
    {
      input = docText.substring(index +1, docText.length());
      
      chunking = chunker.chunk(input);
    }
   
     Iterator<Chunk> it = chunking.chunkSet().iterator();
     
     id annotation0= null; 
     for (int n = 0; it.hasNext(); ++n) {
       Chunk chunk = it.next();
     //  double conf = Math.pow(2.0, chunk.score());
       int start = chunk.start();
       int end = chunk.end();
       
       //String phrase = args[i].substring(start, end);
       
    //   System.out.println(n + "       (" + start + ", " + end + ")       " + chunk.type() + " " + conf);
          //     + "         " + phrase + " " + conf);
       annotation0 = new id(aJCas);
       annotation0.setBegin(start);
       annotation0.setEnd(end);
       annotation0.setId(docText);
       annotation0.addToIndexes();
     }
  
    
  }
}

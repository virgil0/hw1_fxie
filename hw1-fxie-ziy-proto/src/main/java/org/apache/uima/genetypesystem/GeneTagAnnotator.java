package org.apache.uima.genetypesystem;


import org.apache.uima.analysis_component.JCasAnnotator_ImplBase;
import org.apache.uima.jcas.JCas;

public class GeneTagAnnotator extends JCasAnnotator_ImplBase {
  
  /**
   * @see JCasAnnotator_ImplBase#process(JCas)
   */
  public void process(JCas aJCas) {
    // get document text
    String docText = aJCas.getDocumentText();
    int nextIndex = 0;
    int index;
      // found one - create annotation
    id annotation = new id(aJCas);
    annotation.setId(docText);
    annotation.addToIndexes();
  }
}

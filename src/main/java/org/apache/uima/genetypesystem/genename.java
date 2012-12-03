

/* First created by JCasGen Tue Oct 16 22:30:00 EDT 2012 */
package org.apache.uima.genetypesystem;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Tue Oct 16 22:30:00 EDT 2012
 * XML source: /Users/virgil/Documents/workspace/hw1-fxie/src/main/resources/GeneTypeSystem.xml
 * @generated */
public class genename extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(genename.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated  */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected genename() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public genename(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public genename(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public genename(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: genename

  /** getter for genename - gets identified gene name
   * @generated */
  public String getGenename() {
    if (genename_Type.featOkTst && ((genename_Type)jcasType).casFeat_genename == null)
      jcasType.jcas.throwFeatMissing("genename", "org.apache.uima.genetypesystem.genename");
    return jcasType.ll_cas.ll_getStringValue(addr, ((genename_Type)jcasType).casFeatCode_genename);}
    
  /** setter for genename - sets identified gene name 
   * @generated */
  public void setGenename(String v) {
    if (genename_Type.featOkTst && ((genename_Type)jcasType).casFeat_genename == null)
      jcasType.jcas.throwFeatMissing("genename", "org.apache.uima.genetypesystem.genename");
    jcasType.ll_cas.ll_setStringValue(addr, ((genename_Type)jcasType).casFeatCode_genename, v);}    
  }

    


/* First created by JCasGen Tue Oct 16 23:40:52 EDT 2012 */
package org.apache.uima.genetypesystem;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Wed Oct 17 03:08:32 EDT 2012
 * XML source: /Users/virgil/Documents/workspace/hw1-fxie/src/main/resources/GeneIDAnnotator.xml
 * @generated */
public class genetag extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(genetag.class);
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
  protected genetag() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public genetag(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public genetag(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public genetag(JCas jcas, int begin, int end) {
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
  //* Feature: genetag

  /** getter for genetag - gets identified gene name
   * @generated */
  public String getGenetag() {
    if (genetag_Type.featOkTst && ((genetag_Type)jcasType).casFeat_genetag == null)
      jcasType.jcas.throwFeatMissing("genetag", "org.apache.uima.genetypesystem.genetag");
    return jcasType.ll_cas.ll_getStringValue(addr, ((genetag_Type)jcasType).casFeatCode_genetag);}
    
  /** setter for genetag - sets identified gene name 
   * @generated */
  public void setGenetag(String v) {
    if (genetag_Type.featOkTst && ((genetag_Type)jcasType).casFeat_genetag == null)
      jcasType.jcas.throwFeatMissing("genetag", "org.apache.uima.genetypesystem.genetag");
    jcasType.ll_cas.ll_setStringValue(addr, ((genetag_Type)jcasType).casFeatCode_genetag, v);}    
  }

    
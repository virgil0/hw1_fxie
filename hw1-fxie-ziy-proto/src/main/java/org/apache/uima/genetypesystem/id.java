

/* First created by JCasGen Tue Oct 16 22:30:00 EDT 2012 */
package org.apache.uima.genetypesystem;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Wed Oct 17 03:08:32 EDT 2012
 * XML source: /Users/virgil/Documents/workspace/hw1-fxie/src/main/resources/GeneIDAnnotator.xml
 * @generated */
public class id extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(id.class);
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
  protected id() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public id(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public id(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public id(JCas jcas, int begin, int end) {
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
  //* Feature: id

  /** getter for id - gets id of sentence
   * @generated */
  public String getId() {
    if (id_Type.featOkTst && ((id_Type)jcasType).casFeat_id == null)
      jcasType.jcas.throwFeatMissing("id", "org.apache.uima.genetypesystem.id");
    return jcasType.ll_cas.ll_getStringValue(addr, ((id_Type)jcasType).casFeatCode_id);}
    
  /** setter for id - sets id of sentence 
   * @generated */
  public void setId(String v) {
    if (id_Type.featOkTst && ((id_Type)jcasType).casFeat_id == null)
      jcasType.jcas.throwFeatMissing("id", "org.apache.uima.genetypesystem.id");
    jcasType.ll_cas.ll_setStringValue(addr, ((id_Type)jcasType).casFeatCode_id, v);}    
  }

    
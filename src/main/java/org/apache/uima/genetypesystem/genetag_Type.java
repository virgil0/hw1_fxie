
/* First created by JCasGen Tue Oct 16 23:40:52 EDT 2012 */
package org.apache.uima.genetypesystem;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/** 
 * Updated by JCasGen Wed Oct 17 03:08:32 EDT 2012
 * @generated */
public class genetag_Type extends Annotation_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (genetag_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = genetag_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new genetag(addr, genetag_Type.this);
  			   genetag_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new genetag(addr, genetag_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = genetag.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.apache.uima.genetypesystem.genetag");
 
  /** @generated */
  final Feature casFeat_genetag;
  /** @generated */
  final int     casFeatCode_genetag;
  /** @generated */ 
  public String getGenetag(int addr) {
        if (featOkTst && casFeat_genetag == null)
      jcas.throwFeatMissing("genetag", "org.apache.uima.genetypesystem.genetag");
    return ll_cas.ll_getStringValue(addr, casFeatCode_genetag);
  }
  /** @generated */    
  public void setGenetag(int addr, String v) {
        if (featOkTst && casFeat_genetag == null)
      jcas.throwFeatMissing("genetag", "org.apache.uima.genetypesystem.genetag");
    ll_cas.ll_setStringValue(addr, casFeatCode_genetag, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public genetag_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_genetag = jcas.getRequiredFeatureDE(casType, "genetag", "uima.cas.String", featOkTst);
    casFeatCode_genetag  = (null == casFeat_genetag) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_genetag).getCode();

  }
}



    
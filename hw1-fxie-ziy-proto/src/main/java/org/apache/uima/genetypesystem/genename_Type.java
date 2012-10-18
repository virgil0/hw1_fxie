
/* First created by JCasGen Tue Oct 16 22:30:00 EDT 2012 */
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
 * Updated by JCasGen Tue Oct 16 22:30:00 EDT 2012
 * @generated */
public class genename_Type extends Annotation_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (genename_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = genename_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new genename(addr, genename_Type.this);
  			   genename_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new genename(addr, genename_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = genename.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.apache.uima.genetypesystem.genename");
 
  /** @generated */
  final Feature casFeat_genename;
  /** @generated */
  final int     casFeatCode_genename;
  /** @generated */ 
  public String getGenename(int addr) {
        if (featOkTst && casFeat_genename == null)
      jcas.throwFeatMissing("genename", "org.apache.uima.genetypesystem.genename");
    return ll_cas.ll_getStringValue(addr, casFeatCode_genename);
  }
  /** @generated */    
  public void setGenename(int addr, String v) {
        if (featOkTst && casFeat_genename == null)
      jcas.throwFeatMissing("genename", "org.apache.uima.genetypesystem.genename");
    ll_cas.ll_setStringValue(addr, casFeatCode_genename, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public genename_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_genename = jcas.getRequiredFeatureDE(casType, "genename", "uima.cas.String", featOkTst);
    casFeatCode_genename  = (null == casFeat_genename) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_genename).getCode();

  }
}



    
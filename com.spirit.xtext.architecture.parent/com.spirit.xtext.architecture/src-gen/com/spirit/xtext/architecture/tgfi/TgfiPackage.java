/**
 * generated by Xtext 2.12.0
 */
package com.spirit.xtext.architecture.tgfi;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.spirit.xtext.architecture.tgfi.TgfiFactory
 * @model kind="package"
 * @generated
 */
public interface TgfiPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "tgfi";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.spirit.com/xtext/architecture/Tgfi";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "tgfi";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  TgfiPackage eINSTANCE = com.spirit.xtext.architecture.tgfi.impl.TgfiPackageImpl.init();

  /**
   * The meta object id for the '{@link com.spirit.xtext.architecture.tgfi.impl.TgfiImpl <em>Tgfi</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.spirit.xtext.architecture.tgfi.impl.TgfiImpl
   * @see com.spirit.xtext.architecture.tgfi.impl.TgfiPackageImpl#getTgfi()
   * @generated
   */
  int TGFI = 0;

  /**
   * The feature id for the '<em><b>Import El</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TGFI__IMPORT_EL = 0;

  /**
   * The feature id for the '<em><b>Main</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TGFI__MAIN = 1;

  /**
   * The number of structural features of the '<em>Tgfi</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TGFI_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.spirit.xtext.architecture.tgfi.impl.ImportImpl <em>Import</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.spirit.xtext.architecture.tgfi.impl.ImportImpl
   * @see com.spirit.xtext.architecture.tgfi.impl.TgfiPackageImpl#getImport()
   * @generated
   */
  int IMPORT = 1;

  /**
   * The feature id for the '<em><b>Import URI</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT__IMPORT_URI = 0;

  /**
   * The number of structural features of the '<em>Import</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.spirit.xtext.architecture.tgfi.impl.MainTgfImpl <em>Main Tgf</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.spirit.xtext.architecture.tgfi.impl.MainTgfImpl
   * @see com.spirit.xtext.architecture.tgfi.impl.TgfiPackageImpl#getMainTgf()
   * @generated
   */
  int MAIN_TGF = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAIN_TGF__NAME = 0;

  /**
   * The feature id for the '<em><b>Gen Package</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAIN_TGF__GEN_PACKAGE = 1;

  /**
   * The feature id for the '<em><b>Sat Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAIN_TGF__SAT_NAME = 2;

  /**
   * The feature id for the '<em><b>Version Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAIN_TGF__VERSION_NAME = 3;

  /**
   * The feature id for the '<em><b>Status Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAIN_TGF__STATUS_NAME = 4;

  /**
   * The feature id for the '<em><b>Objective Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAIN_TGF__OBJECTIVE_NAME = 5;

  /**
   * The feature id for the '<em><b>Hlfunction Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAIN_TGF__HLFUNCTION_NAME = 6;

  /**
   * The feature id for the '<em><b>Rules</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAIN_TGF__RULES = 7;

  /**
   * The feature id for the '<em><b>Prof</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAIN_TGF__PROF = 8;

  /**
   * The number of structural features of the '<em>Main Tgf</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAIN_TGF_FEATURE_COUNT = 9;

  /**
   * The meta object id for the '{@link com.spirit.xtext.architecture.tgfi.impl.ProfileImpl <em>Profile</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.spirit.xtext.architecture.tgfi.impl.ProfileImpl
   * @see com.spirit.xtext.architecture.tgfi.impl.TgfiPackageImpl#getProfile()
   * @generated
   */
  int PROFILE = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROFILE__NAME = 0;

  /**
   * The feature id for the '<em><b>Prof Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROFILE__PROF_NAME = 1;

  /**
   * The feature id for the '<em><b>Descr Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROFILE__DESCR_NAME = 2;

  /**
   * The feature id for the '<em><b>Feat Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROFILE__FEAT_NAME = 3;

  /**
   * The feature id for the '<em><b>Function Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROFILE__FUNCTION_NAME = 4;

  /**
   * The feature id for the '<em><b>Actor</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROFILE__ACTOR = 5;

  /**
   * The feature id for the '<em><b>Transaction</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROFILE__TRANSACTION = 6;

  /**
   * The feature id for the '<em><b>Domain</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROFILE__DOMAIN = 7;

  /**
   * The feature id for the '<em><b>Qualityattr</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROFILE__QUALITYATTR = 8;

  /**
   * The number of structural features of the '<em>Profile</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROFILE_FEATURE_COUNT = 9;


  /**
   * Returns the meta object for class '{@link com.spirit.xtext.architecture.tgfi.Tgfi <em>Tgfi</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Tgfi</em>'.
   * @see com.spirit.xtext.architecture.tgfi.Tgfi
   * @generated
   */
  EClass getTgfi();

  /**
   * Returns the meta object for the containment reference list '{@link com.spirit.xtext.architecture.tgfi.Tgfi#getImportEl <em>Import El</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Import El</em>'.
   * @see com.spirit.xtext.architecture.tgfi.Tgfi#getImportEl()
   * @see #getTgfi()
   * @generated
   */
  EReference getTgfi_ImportEl();

  /**
   * Returns the meta object for the containment reference '{@link com.spirit.xtext.architecture.tgfi.Tgfi#getMain <em>Main</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Main</em>'.
   * @see com.spirit.xtext.architecture.tgfi.Tgfi#getMain()
   * @see #getTgfi()
   * @generated
   */
  EReference getTgfi_Main();

  /**
   * Returns the meta object for class '{@link com.spirit.xtext.architecture.tgfi.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import</em>'.
   * @see com.spirit.xtext.architecture.tgfi.Import
   * @generated
   */
  EClass getImport();

  /**
   * Returns the meta object for the attribute '{@link com.spirit.xtext.architecture.tgfi.Import#getImportURI <em>Import URI</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Import URI</em>'.
   * @see com.spirit.xtext.architecture.tgfi.Import#getImportURI()
   * @see #getImport()
   * @generated
   */
  EAttribute getImport_ImportURI();

  /**
   * Returns the meta object for class '{@link com.spirit.xtext.architecture.tgfi.MainTgf <em>Main Tgf</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Main Tgf</em>'.
   * @see com.spirit.xtext.architecture.tgfi.MainTgf
   * @generated
   */
  EClass getMainTgf();

  /**
   * Returns the meta object for the attribute '{@link com.spirit.xtext.architecture.tgfi.MainTgf#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.spirit.xtext.architecture.tgfi.MainTgf#getName()
   * @see #getMainTgf()
   * @generated
   */
  EAttribute getMainTgf_Name();

  /**
   * Returns the meta object for the attribute '{@link com.spirit.xtext.architecture.tgfi.MainTgf#getGenPackage <em>Gen Package</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Gen Package</em>'.
   * @see com.spirit.xtext.architecture.tgfi.MainTgf#getGenPackage()
   * @see #getMainTgf()
   * @generated
   */
  EAttribute getMainTgf_GenPackage();

  /**
   * Returns the meta object for the attribute '{@link com.spirit.xtext.architecture.tgfi.MainTgf#getSatName <em>Sat Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Sat Name</em>'.
   * @see com.spirit.xtext.architecture.tgfi.MainTgf#getSatName()
   * @see #getMainTgf()
   * @generated
   */
  EAttribute getMainTgf_SatName();

  /**
   * Returns the meta object for the attribute '{@link com.spirit.xtext.architecture.tgfi.MainTgf#getVersionName <em>Version Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Version Name</em>'.
   * @see com.spirit.xtext.architecture.tgfi.MainTgf#getVersionName()
   * @see #getMainTgf()
   * @generated
   */
  EAttribute getMainTgf_VersionName();

  /**
   * Returns the meta object for the attribute '{@link com.spirit.xtext.architecture.tgfi.MainTgf#getStatusName <em>Status Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Status Name</em>'.
   * @see com.spirit.xtext.architecture.tgfi.MainTgf#getStatusName()
   * @see #getMainTgf()
   * @generated
   */
  EAttribute getMainTgf_StatusName();

  /**
   * Returns the meta object for the attribute '{@link com.spirit.xtext.architecture.tgfi.MainTgf#getObjectiveName <em>Objective Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Objective Name</em>'.
   * @see com.spirit.xtext.architecture.tgfi.MainTgf#getObjectiveName()
   * @see #getMainTgf()
   * @generated
   */
  EAttribute getMainTgf_ObjectiveName();

  /**
   * Returns the meta object for the attribute '{@link com.spirit.xtext.architecture.tgfi.MainTgf#getHlfunctionName <em>Hlfunction Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Hlfunction Name</em>'.
   * @see com.spirit.xtext.architecture.tgfi.MainTgf#getHlfunctionName()
   * @see #getMainTgf()
   * @generated
   */
  EAttribute getMainTgf_HlfunctionName();

  /**
   * Returns the meta object for the attribute list '{@link com.spirit.xtext.architecture.tgfi.MainTgf#getRules <em>Rules</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Rules</em>'.
   * @see com.spirit.xtext.architecture.tgfi.MainTgf#getRules()
   * @see #getMainTgf()
   * @generated
   */
  EAttribute getMainTgf_Rules();

  /**
   * Returns the meta object for the containment reference list '{@link com.spirit.xtext.architecture.tgfi.MainTgf#getProf <em>Prof</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Prof</em>'.
   * @see com.spirit.xtext.architecture.tgfi.MainTgf#getProf()
   * @see #getMainTgf()
   * @generated
   */
  EReference getMainTgf_Prof();

  /**
   * Returns the meta object for class '{@link com.spirit.xtext.architecture.tgfi.Profile <em>Profile</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Profile</em>'.
   * @see com.spirit.xtext.architecture.tgfi.Profile
   * @generated
   */
  EClass getProfile();

  /**
   * Returns the meta object for the attribute '{@link com.spirit.xtext.architecture.tgfi.Profile#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.spirit.xtext.architecture.tgfi.Profile#getName()
   * @see #getProfile()
   * @generated
   */
  EAttribute getProfile_Name();

  /**
   * Returns the meta object for the attribute '{@link com.spirit.xtext.architecture.tgfi.Profile#getProfName <em>Prof Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Prof Name</em>'.
   * @see com.spirit.xtext.architecture.tgfi.Profile#getProfName()
   * @see #getProfile()
   * @generated
   */
  EAttribute getProfile_ProfName();

  /**
   * Returns the meta object for the attribute '{@link com.spirit.xtext.architecture.tgfi.Profile#getDescrName <em>Descr Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Descr Name</em>'.
   * @see com.spirit.xtext.architecture.tgfi.Profile#getDescrName()
   * @see #getProfile()
   * @generated
   */
  EAttribute getProfile_DescrName();

  /**
   * Returns the meta object for the attribute '{@link com.spirit.xtext.architecture.tgfi.Profile#getFeatName <em>Feat Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Feat Name</em>'.
   * @see com.spirit.xtext.architecture.tgfi.Profile#getFeatName()
   * @see #getProfile()
   * @generated
   */
  EAttribute getProfile_FeatName();

  /**
   * Returns the meta object for the attribute '{@link com.spirit.xtext.architecture.tgfi.Profile#getFunctionName <em>Function Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Function Name</em>'.
   * @see com.spirit.xtext.architecture.tgfi.Profile#getFunctionName()
   * @see #getProfile()
   * @generated
   */
  EAttribute getProfile_FunctionName();

  /**
   * Returns the meta object for the attribute list '{@link com.spirit.xtext.architecture.tgfi.Profile#getActor <em>Actor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Actor</em>'.
   * @see com.spirit.xtext.architecture.tgfi.Profile#getActor()
   * @see #getProfile()
   * @generated
   */
  EAttribute getProfile_Actor();

  /**
   * Returns the meta object for the attribute list '{@link com.spirit.xtext.architecture.tgfi.Profile#getTransaction <em>Transaction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Transaction</em>'.
   * @see com.spirit.xtext.architecture.tgfi.Profile#getTransaction()
   * @see #getProfile()
   * @generated
   */
  EAttribute getProfile_Transaction();

  /**
   * Returns the meta object for the attribute list '{@link com.spirit.xtext.architecture.tgfi.Profile#getDomain <em>Domain</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Domain</em>'.
   * @see com.spirit.xtext.architecture.tgfi.Profile#getDomain()
   * @see #getProfile()
   * @generated
   */
  EAttribute getProfile_Domain();

  /**
   * Returns the meta object for the attribute list '{@link com.spirit.xtext.architecture.tgfi.Profile#getQualityattr <em>Qualityattr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Qualityattr</em>'.
   * @see com.spirit.xtext.architecture.tgfi.Profile#getQualityattr()
   * @see #getProfile()
   * @generated
   */
  EAttribute getProfile_Qualityattr();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  TgfiFactory getTgfiFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link com.spirit.xtext.architecture.tgfi.impl.TgfiImpl <em>Tgfi</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.spirit.xtext.architecture.tgfi.impl.TgfiImpl
     * @see com.spirit.xtext.architecture.tgfi.impl.TgfiPackageImpl#getTgfi()
     * @generated
     */
    EClass TGFI = eINSTANCE.getTgfi();

    /**
     * The meta object literal for the '<em><b>Import El</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TGFI__IMPORT_EL = eINSTANCE.getTgfi_ImportEl();

    /**
     * The meta object literal for the '<em><b>Main</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TGFI__MAIN = eINSTANCE.getTgfi_Main();

    /**
     * The meta object literal for the '{@link com.spirit.xtext.architecture.tgfi.impl.ImportImpl <em>Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.spirit.xtext.architecture.tgfi.impl.ImportImpl
     * @see com.spirit.xtext.architecture.tgfi.impl.TgfiPackageImpl#getImport()
     * @generated
     */
    EClass IMPORT = eINSTANCE.getImport();

    /**
     * The meta object literal for the '<em><b>Import URI</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORT__IMPORT_URI = eINSTANCE.getImport_ImportURI();

    /**
     * The meta object literal for the '{@link com.spirit.xtext.architecture.tgfi.impl.MainTgfImpl <em>Main Tgf</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.spirit.xtext.architecture.tgfi.impl.MainTgfImpl
     * @see com.spirit.xtext.architecture.tgfi.impl.TgfiPackageImpl#getMainTgf()
     * @generated
     */
    EClass MAIN_TGF = eINSTANCE.getMainTgf();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MAIN_TGF__NAME = eINSTANCE.getMainTgf_Name();

    /**
     * The meta object literal for the '<em><b>Gen Package</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MAIN_TGF__GEN_PACKAGE = eINSTANCE.getMainTgf_GenPackage();

    /**
     * The meta object literal for the '<em><b>Sat Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MAIN_TGF__SAT_NAME = eINSTANCE.getMainTgf_SatName();

    /**
     * The meta object literal for the '<em><b>Version Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MAIN_TGF__VERSION_NAME = eINSTANCE.getMainTgf_VersionName();

    /**
     * The meta object literal for the '<em><b>Status Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MAIN_TGF__STATUS_NAME = eINSTANCE.getMainTgf_StatusName();

    /**
     * The meta object literal for the '<em><b>Objective Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MAIN_TGF__OBJECTIVE_NAME = eINSTANCE.getMainTgf_ObjectiveName();

    /**
     * The meta object literal for the '<em><b>Hlfunction Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MAIN_TGF__HLFUNCTION_NAME = eINSTANCE.getMainTgf_HlfunctionName();

    /**
     * The meta object literal for the '<em><b>Rules</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MAIN_TGF__RULES = eINSTANCE.getMainTgf_Rules();

    /**
     * The meta object literal for the '<em><b>Prof</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAIN_TGF__PROF = eINSTANCE.getMainTgf_Prof();

    /**
     * The meta object literal for the '{@link com.spirit.xtext.architecture.tgfi.impl.ProfileImpl <em>Profile</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.spirit.xtext.architecture.tgfi.impl.ProfileImpl
     * @see com.spirit.xtext.architecture.tgfi.impl.TgfiPackageImpl#getProfile()
     * @generated
     */
    EClass PROFILE = eINSTANCE.getProfile();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROFILE__NAME = eINSTANCE.getProfile_Name();

    /**
     * The meta object literal for the '<em><b>Prof Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROFILE__PROF_NAME = eINSTANCE.getProfile_ProfName();

    /**
     * The meta object literal for the '<em><b>Descr Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROFILE__DESCR_NAME = eINSTANCE.getProfile_DescrName();

    /**
     * The meta object literal for the '<em><b>Feat Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROFILE__FEAT_NAME = eINSTANCE.getProfile_FeatName();

    /**
     * The meta object literal for the '<em><b>Function Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROFILE__FUNCTION_NAME = eINSTANCE.getProfile_FunctionName();

    /**
     * The meta object literal for the '<em><b>Actor</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROFILE__ACTOR = eINSTANCE.getProfile_Actor();

    /**
     * The meta object literal for the '<em><b>Transaction</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROFILE__TRANSACTION = eINSTANCE.getProfile_Transaction();

    /**
     * The meta object literal for the '<em><b>Domain</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROFILE__DOMAIN = eINSTANCE.getProfile_Domain();

    /**
     * The meta object literal for the '<em><b>Qualityattr</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROFILE__QUALITYATTR = eINSTANCE.getProfile_Qualityattr();

  }

} //TgfiPackage

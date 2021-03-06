/**
 * generated by Xtext 2.12.0
 */
package com.spirit.xtext.architecture.tgfi.impl;

import com.spirit.xtext.architecture.tgfi.Profile;
import com.spirit.xtext.architecture.tgfi.TgfiPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Profile</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.spirit.xtext.architecture.tgfi.impl.ProfileImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.spirit.xtext.architecture.tgfi.impl.ProfileImpl#getProfName <em>Prof Name</em>}</li>
 *   <li>{@link com.spirit.xtext.architecture.tgfi.impl.ProfileImpl#getDescrName <em>Descr Name</em>}</li>
 *   <li>{@link com.spirit.xtext.architecture.tgfi.impl.ProfileImpl#getFeatName <em>Feat Name</em>}</li>
 *   <li>{@link com.spirit.xtext.architecture.tgfi.impl.ProfileImpl#getFunctionName <em>Function Name</em>}</li>
 *   <li>{@link com.spirit.xtext.architecture.tgfi.impl.ProfileImpl#getActor <em>Actor</em>}</li>
 *   <li>{@link com.spirit.xtext.architecture.tgfi.impl.ProfileImpl#getTransaction <em>Transaction</em>}</li>
 *   <li>{@link com.spirit.xtext.architecture.tgfi.impl.ProfileImpl#getDomain <em>Domain</em>}</li>
 *   <li>{@link com.spirit.xtext.architecture.tgfi.impl.ProfileImpl#getQualityattr <em>Qualityattr</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProfileImpl extends MinimalEObjectImpl.Container implements Profile
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getProfName() <em>Prof Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProfName()
   * @generated
   * @ordered
   */
  protected static final String PROF_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getProfName() <em>Prof Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProfName()
   * @generated
   * @ordered
   */
  protected String profName = PROF_NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getDescrName() <em>Descr Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescrName()
   * @generated
   * @ordered
   */
  protected static final String DESCR_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDescrName() <em>Descr Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescrName()
   * @generated
   * @ordered
   */
  protected String descrName = DESCR_NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getFeatName() <em>Feat Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFeatName()
   * @generated
   * @ordered
   */
  protected static final String FEAT_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFeatName() <em>Feat Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFeatName()
   * @generated
   * @ordered
   */
  protected String featName = FEAT_NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getFunctionName() <em>Function Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFunctionName()
   * @generated
   * @ordered
   */
  protected static final String FUNCTION_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFunctionName() <em>Function Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFunctionName()
   * @generated
   * @ordered
   */
  protected String functionName = FUNCTION_NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getActor() <em>Actor</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActor()
   * @generated
   * @ordered
   */
  protected EList<String> actor;

  /**
   * The cached value of the '{@link #getTransaction() <em>Transaction</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTransaction()
   * @generated
   * @ordered
   */
  protected EList<String> transaction;

  /**
   * The cached value of the '{@link #getDomain() <em>Domain</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDomain()
   * @generated
   * @ordered
   */
  protected EList<String> domain;

  /**
   * The cached value of the '{@link #getQualityattr() <em>Qualityattr</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQualityattr()
   * @generated
   * @ordered
   */
  protected EList<String> qualityattr;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ProfileImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return TgfiPackage.Literals.PROFILE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TgfiPackage.PROFILE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getProfName()
  {
    return profName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setProfName(String newProfName)
  {
    String oldProfName = profName;
    profName = newProfName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TgfiPackage.PROFILE__PROF_NAME, oldProfName, profName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDescrName()
  {
    return descrName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDescrName(String newDescrName)
  {
    String oldDescrName = descrName;
    descrName = newDescrName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TgfiPackage.PROFILE__DESCR_NAME, oldDescrName, descrName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFeatName()
  {
    return featName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFeatName(String newFeatName)
  {
    String oldFeatName = featName;
    featName = newFeatName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TgfiPackage.PROFILE__FEAT_NAME, oldFeatName, featName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFunctionName()
  {
    return functionName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFunctionName(String newFunctionName)
  {
    String oldFunctionName = functionName;
    functionName = newFunctionName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TgfiPackage.PROFILE__FUNCTION_NAME, oldFunctionName, functionName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getActor()
  {
    if (actor == null)
    {
      actor = new EDataTypeEList<String>(String.class, this, TgfiPackage.PROFILE__ACTOR);
    }
    return actor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getTransaction()
  {
    if (transaction == null)
    {
      transaction = new EDataTypeEList<String>(String.class, this, TgfiPackage.PROFILE__TRANSACTION);
    }
    return transaction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getDomain()
  {
    if (domain == null)
    {
      domain = new EDataTypeEList<String>(String.class, this, TgfiPackage.PROFILE__DOMAIN);
    }
    return domain;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getQualityattr()
  {
    if (qualityattr == null)
    {
      qualityattr = new EDataTypeEList<String>(String.class, this, TgfiPackage.PROFILE__QUALITYATTR);
    }
    return qualityattr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case TgfiPackage.PROFILE__NAME:
        return getName();
      case TgfiPackage.PROFILE__PROF_NAME:
        return getProfName();
      case TgfiPackage.PROFILE__DESCR_NAME:
        return getDescrName();
      case TgfiPackage.PROFILE__FEAT_NAME:
        return getFeatName();
      case TgfiPackage.PROFILE__FUNCTION_NAME:
        return getFunctionName();
      case TgfiPackage.PROFILE__ACTOR:
        return getActor();
      case TgfiPackage.PROFILE__TRANSACTION:
        return getTransaction();
      case TgfiPackage.PROFILE__DOMAIN:
        return getDomain();
      case TgfiPackage.PROFILE__QUALITYATTR:
        return getQualityattr();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case TgfiPackage.PROFILE__NAME:
        setName((String)newValue);
        return;
      case TgfiPackage.PROFILE__PROF_NAME:
        setProfName((String)newValue);
        return;
      case TgfiPackage.PROFILE__DESCR_NAME:
        setDescrName((String)newValue);
        return;
      case TgfiPackage.PROFILE__FEAT_NAME:
        setFeatName((String)newValue);
        return;
      case TgfiPackage.PROFILE__FUNCTION_NAME:
        setFunctionName((String)newValue);
        return;
      case TgfiPackage.PROFILE__ACTOR:
        getActor().clear();
        getActor().addAll((Collection<? extends String>)newValue);
        return;
      case TgfiPackage.PROFILE__TRANSACTION:
        getTransaction().clear();
        getTransaction().addAll((Collection<? extends String>)newValue);
        return;
      case TgfiPackage.PROFILE__DOMAIN:
        getDomain().clear();
        getDomain().addAll((Collection<? extends String>)newValue);
        return;
      case TgfiPackage.PROFILE__QUALITYATTR:
        getQualityattr().clear();
        getQualityattr().addAll((Collection<? extends String>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case TgfiPackage.PROFILE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case TgfiPackage.PROFILE__PROF_NAME:
        setProfName(PROF_NAME_EDEFAULT);
        return;
      case TgfiPackage.PROFILE__DESCR_NAME:
        setDescrName(DESCR_NAME_EDEFAULT);
        return;
      case TgfiPackage.PROFILE__FEAT_NAME:
        setFeatName(FEAT_NAME_EDEFAULT);
        return;
      case TgfiPackage.PROFILE__FUNCTION_NAME:
        setFunctionName(FUNCTION_NAME_EDEFAULT);
        return;
      case TgfiPackage.PROFILE__ACTOR:
        getActor().clear();
        return;
      case TgfiPackage.PROFILE__TRANSACTION:
        getTransaction().clear();
        return;
      case TgfiPackage.PROFILE__DOMAIN:
        getDomain().clear();
        return;
      case TgfiPackage.PROFILE__QUALITYATTR:
        getQualityattr().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case TgfiPackage.PROFILE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case TgfiPackage.PROFILE__PROF_NAME:
        return PROF_NAME_EDEFAULT == null ? profName != null : !PROF_NAME_EDEFAULT.equals(profName);
      case TgfiPackage.PROFILE__DESCR_NAME:
        return DESCR_NAME_EDEFAULT == null ? descrName != null : !DESCR_NAME_EDEFAULT.equals(descrName);
      case TgfiPackage.PROFILE__FEAT_NAME:
        return FEAT_NAME_EDEFAULT == null ? featName != null : !FEAT_NAME_EDEFAULT.equals(featName);
      case TgfiPackage.PROFILE__FUNCTION_NAME:
        return FUNCTION_NAME_EDEFAULT == null ? functionName != null : !FUNCTION_NAME_EDEFAULT.equals(functionName);
      case TgfiPackage.PROFILE__ACTOR:
        return actor != null && !actor.isEmpty();
      case TgfiPackage.PROFILE__TRANSACTION:
        return transaction != null && !transaction.isEmpty();
      case TgfiPackage.PROFILE__DOMAIN:
        return domain != null && !domain.isEmpty();
      case TgfiPackage.PROFILE__QUALITYATTR:
        return qualityattr != null && !qualityattr.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(", profName: ");
    result.append(profName);
    result.append(", descrName: ");
    result.append(descrName);
    result.append(", featName: ");
    result.append(featName);
    result.append(", functionName: ");
    result.append(functionName);
    result.append(", actor: ");
    result.append(actor);
    result.append(", transaction: ");
    result.append(transaction);
    result.append(", domain: ");
    result.append(domain);
    result.append(", qualityattr: ");
    result.append(qualityattr);
    result.append(')');
    return result.toString();
  }

} //ProfileImpl

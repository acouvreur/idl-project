/**
 */
package smarthome.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import smarthome.Person;
import smarthome.SmarthomePackage;
import smarthome.Tag;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link smarthome.impl.PersonImpl#getAnkleLeft <em>Ankle Left</em>}</li>
 *   <li>{@link smarthome.impl.PersonImpl#getAnkleRight <em>Ankle Right</em>}</li>
 *   <li>{@link smarthome.impl.PersonImpl#getBelt <em>Belt</em>}</li>
 *   <li>{@link smarthome.impl.PersonImpl#getChest <em>Chest</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PersonImpl extends NamedEntityImpl implements Person {
	/**
	 * The cached value of the '{@link #getAnkleLeft() <em>Ankle Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnkleLeft()
	 * @generated
	 * @ordered
	 */
	protected Tag ankleLeft;

	/**
	 * The cached value of the '{@link #getAnkleRight() <em>Ankle Right</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnkleRight()
	 * @generated
	 * @ordered
	 */
	protected Tag ankleRight;

	/**
	 * The cached value of the '{@link #getBelt() <em>Belt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBelt()
	 * @generated
	 * @ordered
	 */
	protected Tag belt;

	/**
	 * The cached value of the '{@link #getChest() <em>Chest</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChest()
	 * @generated
	 * @ordered
	 */
	protected Tag chest;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SmarthomePackage.Literals.PERSON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tag getAnkleLeft() {
		return ankleLeft;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnkleLeft(Tag newAnkleLeft, NotificationChain msgs) {
		Tag oldAnkleLeft = ankleLeft;
		ankleLeft = newAnkleLeft;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					SmarthomePackage.PERSON__ANKLE_LEFT, oldAnkleLeft, newAnkleLeft);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnkleLeft(Tag newAnkleLeft) {
		if (newAnkleLeft != ankleLeft) {
			NotificationChain msgs = null;
			if (ankleLeft != null)
				msgs = ((InternalEObject) ankleLeft).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - SmarthomePackage.PERSON__ANKLE_LEFT, null, msgs);
			if (newAnkleLeft != null)
				msgs = ((InternalEObject) newAnkleLeft).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - SmarthomePackage.PERSON__ANKLE_LEFT, null, msgs);
			msgs = basicSetAnkleLeft(newAnkleLeft, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmarthomePackage.PERSON__ANKLE_LEFT, newAnkleLeft,
					newAnkleLeft));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tag getAnkleRight() {
		return ankleRight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnkleRight(Tag newAnkleRight, NotificationChain msgs) {
		Tag oldAnkleRight = ankleRight;
		ankleRight = newAnkleRight;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					SmarthomePackage.PERSON__ANKLE_RIGHT, oldAnkleRight, newAnkleRight);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnkleRight(Tag newAnkleRight) {
		if (newAnkleRight != ankleRight) {
			NotificationChain msgs = null;
			if (ankleRight != null)
				msgs = ((InternalEObject) ankleRight).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - SmarthomePackage.PERSON__ANKLE_RIGHT, null, msgs);
			if (newAnkleRight != null)
				msgs = ((InternalEObject) newAnkleRight).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - SmarthomePackage.PERSON__ANKLE_RIGHT, null, msgs);
			msgs = basicSetAnkleRight(newAnkleRight, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmarthomePackage.PERSON__ANKLE_RIGHT, newAnkleRight,
					newAnkleRight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tag getBelt() {
		return belt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBelt(Tag newBelt, NotificationChain msgs) {
		Tag oldBelt = belt;
		belt = newBelt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					SmarthomePackage.PERSON__BELT, oldBelt, newBelt);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBelt(Tag newBelt) {
		if (newBelt != belt) {
			NotificationChain msgs = null;
			if (belt != null)
				msgs = ((InternalEObject) belt).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - SmarthomePackage.PERSON__BELT, null, msgs);
			if (newBelt != null)
				msgs = ((InternalEObject) newBelt).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - SmarthomePackage.PERSON__BELT, null, msgs);
			msgs = basicSetBelt(newBelt, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmarthomePackage.PERSON__BELT, newBelt, newBelt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tag getChest() {
		return chest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChest(Tag newChest, NotificationChain msgs) {
		Tag oldChest = chest;
		chest = newChest;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					SmarthomePackage.PERSON__CHEST, oldChest, newChest);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChest(Tag newChest) {
		if (newChest != chest) {
			NotificationChain msgs = null;
			if (chest != null)
				msgs = ((InternalEObject) chest).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - SmarthomePackage.PERSON__CHEST, null, msgs);
			if (newChest != null)
				msgs = ((InternalEObject) newChest).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - SmarthomePackage.PERSON__CHEST, null, msgs);
			msgs = basicSetChest(newChest, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmarthomePackage.PERSON__CHEST, newChest, newChest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SmarthomePackage.PERSON__ANKLE_LEFT:
			return basicSetAnkleLeft(null, msgs);
		case SmarthomePackage.PERSON__ANKLE_RIGHT:
			return basicSetAnkleRight(null, msgs);
		case SmarthomePackage.PERSON__BELT:
			return basicSetBelt(null, msgs);
		case SmarthomePackage.PERSON__CHEST:
			return basicSetChest(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SmarthomePackage.PERSON__ANKLE_LEFT:
			return getAnkleLeft();
		case SmarthomePackage.PERSON__ANKLE_RIGHT:
			return getAnkleRight();
		case SmarthomePackage.PERSON__BELT:
			return getBelt();
		case SmarthomePackage.PERSON__CHEST:
			return getChest();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case SmarthomePackage.PERSON__ANKLE_LEFT:
			setAnkleLeft((Tag) newValue);
			return;
		case SmarthomePackage.PERSON__ANKLE_RIGHT:
			setAnkleRight((Tag) newValue);
			return;
		case SmarthomePackage.PERSON__BELT:
			setBelt((Tag) newValue);
			return;
		case SmarthomePackage.PERSON__CHEST:
			setChest((Tag) newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
		case SmarthomePackage.PERSON__ANKLE_LEFT:
			setAnkleLeft((Tag) null);
			return;
		case SmarthomePackage.PERSON__ANKLE_RIGHT:
			setAnkleRight((Tag) null);
			return;
		case SmarthomePackage.PERSON__BELT:
			setBelt((Tag) null);
			return;
		case SmarthomePackage.PERSON__CHEST:
			setChest((Tag) null);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case SmarthomePackage.PERSON__ANKLE_LEFT:
			return ankleLeft != null;
		case SmarthomePackage.PERSON__ANKLE_RIGHT:
			return ankleRight != null;
		case SmarthomePackage.PERSON__BELT:
			return belt != null;
		case SmarthomePackage.PERSON__CHEST:
			return chest != null;
		}
		return super.eIsSet(featureID);
	}

} //PersonImpl

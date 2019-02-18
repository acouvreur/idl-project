/**
 */
package smarthome.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import smarthome.Home;
import smarthome.NamedEntity;
import smarthome.Pattern;
import smarthome.Person;
import smarthome.Room;
import smarthome.SmarthomePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Home</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link smarthome.impl.HomeImpl#getRooms <em>Rooms</em>}</li>
 *   <li>{@link smarthome.impl.HomeImpl#getPersons <em>Persons</em>}</li>
 *   <li>{@link smarthome.impl.HomeImpl#getPatterns <em>Patterns</em>}</li>
 *   <li>{@link smarthome.impl.HomeImpl#getFileEvents <em>File Events</em>}</li>
 *   <li>{@link smarthome.impl.HomeImpl#getMonitoredEntities <em>Monitored Entities</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HomeImpl extends MinimalEObjectImpl.Container implements Home {
	/**
	 * The cached value of the '{@link #getRooms() <em>Rooms</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRooms()
	 * @generated
	 * @ordered
	 */
	protected EList<Room> rooms;

	/**
	 * The cached value of the '{@link #getPersons() <em>Persons</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersons()
	 * @generated
	 * @ordered
	 */
	protected EList<Person> persons;

	/**
	 * The cached value of the '{@link #getPatterns() <em>Patterns</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatterns()
	 * @generated
	 * @ordered
	 */
	protected EList<Pattern> patterns;

	/**
	 * The default value of the '{@link #getFileEvents() <em>File Events</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileEvents()
	 * @generated
	 * @ordered
	 */
	protected static final String FILE_EVENTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFileEvents() <em>File Events</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileEvents()
	 * @generated
	 * @ordered
	 */
	protected String fileEvents = FILE_EVENTS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMonitoredEntities() <em>Monitored Entities</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonitoredEntities()
	 * @generated
	 * @ordered
	 */
	protected EList<NamedEntity> monitoredEntities;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HomeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SmarthomePackage.Literals.HOME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Room> getRooms() {
		if (rooms == null) {
			rooms = new EObjectContainmentEList<Room>(Room.class, this, SmarthomePackage.HOME__ROOMS);
		}
		return rooms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Person> getPersons() {
		if (persons == null) {
			persons = new EObjectContainmentEList<Person>(Person.class, this, SmarthomePackage.HOME__PERSONS);
		}
		return persons;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pattern> getPatterns() {
		if (patterns == null) {
			patterns = new EObjectContainmentEList<Pattern>(Pattern.class, this, SmarthomePackage.HOME__PATTERNS);
		}
		return patterns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFileEvents() {
		return fileEvents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFileEvents(String newFileEvents) {
		String oldFileEvents = fileEvents;
		fileEvents = newFileEvents;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmarthomePackage.HOME__FILE_EVENTS, oldFileEvents,
					fileEvents));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NamedEntity> getMonitoredEntities() {
		if (monitoredEntities == null) {
			monitoredEntities = new EObjectResolvingEList<NamedEntity>(NamedEntity.class, this,
					SmarthomePackage.HOME__MONITORED_ENTITIES);
		}
		return monitoredEntities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SmarthomePackage.HOME__ROOMS:
			return ((InternalEList<?>) getRooms()).basicRemove(otherEnd, msgs);
		case SmarthomePackage.HOME__PERSONS:
			return ((InternalEList<?>) getPersons()).basicRemove(otherEnd, msgs);
		case SmarthomePackage.HOME__PATTERNS:
			return ((InternalEList<?>) getPatterns()).basicRemove(otherEnd, msgs);
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
		case SmarthomePackage.HOME__ROOMS:
			return getRooms();
		case SmarthomePackage.HOME__PERSONS:
			return getPersons();
		case SmarthomePackage.HOME__PATTERNS:
			return getPatterns();
		case SmarthomePackage.HOME__FILE_EVENTS:
			return getFileEvents();
		case SmarthomePackage.HOME__MONITORED_ENTITIES:
			return getMonitoredEntities();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case SmarthomePackage.HOME__ROOMS:
			getRooms().clear();
			getRooms().addAll((Collection<? extends Room>) newValue);
			return;
		case SmarthomePackage.HOME__PERSONS:
			getPersons().clear();
			getPersons().addAll((Collection<? extends Person>) newValue);
			return;
		case SmarthomePackage.HOME__PATTERNS:
			getPatterns().clear();
			getPatterns().addAll((Collection<? extends Pattern>) newValue);
			return;
		case SmarthomePackage.HOME__FILE_EVENTS:
			setFileEvents((String) newValue);
			return;
		case SmarthomePackage.HOME__MONITORED_ENTITIES:
			getMonitoredEntities().clear();
			getMonitoredEntities().addAll((Collection<? extends NamedEntity>) newValue);
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
		case SmarthomePackage.HOME__ROOMS:
			getRooms().clear();
			return;
		case SmarthomePackage.HOME__PERSONS:
			getPersons().clear();
			return;
		case SmarthomePackage.HOME__PATTERNS:
			getPatterns().clear();
			return;
		case SmarthomePackage.HOME__FILE_EVENTS:
			setFileEvents(FILE_EVENTS_EDEFAULT);
			return;
		case SmarthomePackage.HOME__MONITORED_ENTITIES:
			getMonitoredEntities().clear();
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
		case SmarthomePackage.HOME__ROOMS:
			return rooms != null && !rooms.isEmpty();
		case SmarthomePackage.HOME__PERSONS:
			return persons != null && !persons.isEmpty();
		case SmarthomePackage.HOME__PATTERNS:
			return patterns != null && !patterns.isEmpty();
		case SmarthomePackage.HOME__FILE_EVENTS:
			return FILE_EVENTS_EDEFAULT == null ? fileEvents != null : !FILE_EVENTS_EDEFAULT.equals(fileEvents);
		case SmarthomePackage.HOME__MONITORED_ENTITIES:
			return monitoredEntities != null && !monitoredEntities.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (fileEvents: ");
		result.append(fileEvents);
		result.append(')');
		return result.toString();
	}

} //HomeImpl

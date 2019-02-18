/**
 */
package smarthome;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Home</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link smarthome.Home#getRooms <em>Rooms</em>}</li>
 *   <li>{@link smarthome.Home#getPersons <em>Persons</em>}</li>
 *   <li>{@link smarthome.Home#getPatterns <em>Patterns</em>}</li>
 *   <li>{@link smarthome.Home#getFileEvents <em>File Events</em>}</li>
 *   <li>{@link smarthome.Home#getMonitoredEntities <em>Monitored Entities</em>}</li>
 * </ul>
 *
 * @see smarthome.SmarthomePackage#getHome()
 * @model
 * @generated
 */
public interface Home extends EObject {
	/**
	 * Returns the value of the '<em><b>Rooms</b></em>' containment reference list.
	 * The list contents are of type {@link smarthome.Room}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rooms</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rooms</em>' containment reference list.
	 * @see smarthome.SmarthomePackage#getHome_Rooms()
	 * @model containment="true"
	 * @generated
	 */
	EList<Room> getRooms();

	/**
	 * Returns the value of the '<em><b>Persons</b></em>' containment reference list.
	 * The list contents are of type {@link smarthome.Person}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Persons</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Persons</em>' containment reference list.
	 * @see smarthome.SmarthomePackage#getHome_Persons()
	 * @model containment="true"
	 * @generated
	 */
	EList<Person> getPersons();

	/**
	 * Returns the value of the '<em><b>Patterns</b></em>' containment reference list.
	 * The list contents are of type {@link smarthome.Pattern}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Patterns</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Patterns</em>' containment reference list.
	 * @see smarthome.SmarthomePackage#getHome_Patterns()
	 * @model containment="true"
	 * @generated
	 */
	EList<Pattern> getPatterns();

	/**
	 * Returns the value of the '<em><b>File Events</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>File Events</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File Events</em>' attribute.
	 * @see #setFileEvents(String)
	 * @see smarthome.SmarthomePackage#getHome_FileEvents()
	 * @model
	 * @generated
	 */
	String getFileEvents();

	/**
	 * Sets the value of the '{@link smarthome.Home#getFileEvents <em>File Events</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File Events</em>' attribute.
	 * @see #getFileEvents()
	 * @generated
	 */
	void setFileEvents(String value);

	/**
	 * Returns the value of the '<em><b>Monitored Entities</b></em>' reference list.
	 * The list contents are of type {@link smarthome.NamedEntity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Monitored Entities</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Monitored Entities</em>' reference list.
	 * @see smarthome.SmarthomePackage#getHome_MonitoredEntities()
	 * @model
	 * @generated
	 */
	EList<NamedEntity> getMonitoredEntities();

} // Home

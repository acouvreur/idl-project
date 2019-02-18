/**
 */
package smarthome;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Monitored Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link smarthome.MonitoredEntity#isMonitored <em>Monitored</em>}</li>
 * </ul>
 *
 * @see smarthome.SmarthomePackage#getMonitoredEntity()
 * @model
 * @generated
 */
public interface MonitoredEntity extends EObject {
	/**
	 * Returns the value of the '<em><b>Monitored</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Monitored</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Monitored</em>' attribute.
	 * @see #setMonitored(boolean)
	 * @see smarthome.SmarthomePackage#getMonitoredEntity_Monitored()
	 * @model default="false"
	 * @generated
	 */
	boolean isMonitored();

	/**
	 * Sets the value of the '{@link smarthome.MonitoredEntity#isMonitored <em>Monitored</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Monitored</em>' attribute.
	 * @see #isMonitored()
	 * @generated
	 */
	void setMonitored(boolean value);

} // MonitoredEntity

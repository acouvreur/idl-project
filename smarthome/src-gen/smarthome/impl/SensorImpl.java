/**
 */
package smarthome.impl;

import org.eclipse.emf.ecore.EClass;

import smarthome.Sensor;
import smarthome.SmarthomePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sensor</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class SensorImpl extends NamedEntityImpl implements Sensor {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SensorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SmarthomePackage.Literals.SENSOR;
	}

} //SensorImpl

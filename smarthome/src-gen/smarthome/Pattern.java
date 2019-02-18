/**
 */
package smarthome;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link smarthome.Pattern#getRules <em>Rules</em>}</li>
 * </ul>
 *
 * @see smarthome.SmarthomePackage#getPattern()
 * @model
 * @generated
 */
public interface Pattern extends NamedEntity {
	/**
	 * Returns the value of the '<em><b>Rules</b></em>' containment reference list.
	 * The list contents are of type {@link smarthome.Rule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rules</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rules</em>' containment reference list.
	 * @see smarthome.SmarthomePackage#getPattern_Rules()
	 * @model containment="true"
	 * @generated
	 */
	EList<Rule> getRules();

} // Pattern

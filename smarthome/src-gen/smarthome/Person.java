/**
 */
package smarthome;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link smarthome.Person#getAnkleLeft <em>Ankle Left</em>}</li>
 *   <li>{@link smarthome.Person#getAnkleRight <em>Ankle Right</em>}</li>
 *   <li>{@link smarthome.Person#getBelt <em>Belt</em>}</li>
 *   <li>{@link smarthome.Person#getChest <em>Chest</em>}</li>
 * </ul>
 *
 * @see smarthome.SmarthomePackage#getPerson()
 * @model
 * @generated
 */
public interface Person extends NamedEntity {

	/**
	 * Returns the value of the '<em><b>Ankle Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ankle Left</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ankle Left</em>' containment reference.
	 * @see #setAnkleLeft(Tag)
	 * @see smarthome.SmarthomePackage#getPerson_AnkleLeft()
	 * @model containment="true"
	 * @generated
	 */
	Tag getAnkleLeft();

	/**
	 * Sets the value of the '{@link smarthome.Person#getAnkleLeft <em>Ankle Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ankle Left</em>' containment reference.
	 * @see #getAnkleLeft()
	 * @generated
	 */
	void setAnkleLeft(Tag value);

	/**
	 * Returns the value of the '<em><b>Ankle Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ankle Right</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ankle Right</em>' containment reference.
	 * @see #setAnkleRight(Tag)
	 * @see smarthome.SmarthomePackage#getPerson_AnkleRight()
	 * @model containment="true"
	 * @generated
	 */
	Tag getAnkleRight();

	/**
	 * Sets the value of the '{@link smarthome.Person#getAnkleRight <em>Ankle Right</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ankle Right</em>' containment reference.
	 * @see #getAnkleRight()
	 * @generated
	 */
	void setAnkleRight(Tag value);

	/**
	 * Returns the value of the '<em><b>Belt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Belt</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Belt</em>' containment reference.
	 * @see #setBelt(Tag)
	 * @see smarthome.SmarthomePackage#getPerson_Belt()
	 * @model containment="true"
	 * @generated
	 */
	Tag getBelt();

	/**
	 * Sets the value of the '{@link smarthome.Person#getBelt <em>Belt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Belt</em>' containment reference.
	 * @see #getBelt()
	 * @generated
	 */
	void setBelt(Tag value);

	/**
	 * Returns the value of the '<em><b>Chest</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Chest</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Chest</em>' containment reference.
	 * @see #setChest(Tag)
	 * @see smarthome.SmarthomePackage#getPerson_Chest()
	 * @model containment="true"
	 * @generated
	 */
	Tag getChest();

	/**
	 * Sets the value of the '{@link smarthome.Person#getChest <em>Chest</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Chest</em>' containment reference.
	 * @see #getChest()
	 * @generated
	 */
	void setChest(Tag value);
} // Person

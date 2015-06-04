/*******************************************************************************
 * Copyright (c) 2014 Vienna University of Technology.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * Alexander Bergmayr (Vienna University of Technology) - initial API and implementation
 *
 * Initially developed in the context of ARTIST EU project www.artist-project.eu
 *******************************************************************************/
/**
 */
package eu.artist.migration.mut.slicing.sim;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Slicing Intent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.artist.migration.mut.slicing.sim.SlicingIntent#getDescription <em>Description</em>}</li>
 *   <li>{@link eu.artist.migration.mut.slicing.sim.SlicingIntent#getInject <em>Inject</em>}</li>
 *   <li>{@link eu.artist.migration.mut.slicing.sim.SlicingIntent#getExtract <em>Extract</em>}</li>
 *   <li>{@link eu.artist.migration.mut.slicing.sim.SlicingIntent#getCriteria <em>Criteria</em>}</li>
 *   <li>{@link eu.artist.migration.mut.slicing.sim.SlicingIntent#getConfiguration <em>Configuration</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.artist.migration.mut.slicing.sim.SimPackage#getSlicingIntent()
 * @model
 * @generated
 */
public interface SlicingIntent extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see eu.artist.migration.mut.slicing.sim.SimPackage#getSlicingIntent_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link eu.artist.migration.mut.slicing.sim.SlicingIntent#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Inject</b></em>' attribute.
	 * The literals are from the enumeration {@link eu.artist.migration.mut.slicing.sim.ModelType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inject</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inject</em>' attribute.
	 * @see eu.artist.migration.mut.slicing.sim.ModelType
	 * @see #setInject(ModelType)
	 * @see eu.artist.migration.mut.slicing.sim.SimPackage#getSlicingIntent_Inject()
	 * @model required="true"
	 * @generated
	 */
	ModelType getInject();

	/**
	 * Sets the value of the '{@link eu.artist.migration.mut.slicing.sim.SlicingIntent#getInject <em>Inject</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inject</em>' attribute.
	 * @see eu.artist.migration.mut.slicing.sim.ModelType
	 * @see #getInject()
	 * @generated
	 */
	void setInject(ModelType value);

	/**
	 * Returns the value of the '<em><b>Extract</b></em>' attribute.
	 * The literals are from the enumeration {@link eu.artist.migration.mut.slicing.sim.ModelType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extract</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extract</em>' attribute.
	 * @see eu.artist.migration.mut.slicing.sim.ModelType
	 * @see #setExtract(ModelType)
	 * @see eu.artist.migration.mut.slicing.sim.SimPackage#getSlicingIntent_Extract()
	 * @model required="true"
	 * @generated
	 */
	ModelType getExtract();

	/**
	 * Sets the value of the '{@link eu.artist.migration.mut.slicing.sim.SlicingIntent#getExtract <em>Extract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extract</em>' attribute.
	 * @see eu.artist.migration.mut.slicing.sim.ModelType
	 * @see #getExtract()
	 * @generated
	 */
	void setExtract(ModelType value);

	/**
	 * Returns the value of the '<em><b>Criteria</b></em>' containment reference list.
	 * The list contents are of type {@link eu.artist.migration.mut.slicing.sim.SlicingCriterion}.
	 * It is bidirectional and its opposite is '{@link eu.artist.migration.mut.slicing.sim.SlicingCriterion#getIntent <em>Intent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Criteria</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Criteria</em>' containment reference list.
	 * @see eu.artist.migration.mut.slicing.sim.SimPackage#getSlicingIntent_Criteria()
	 * @see eu.artist.migration.mut.slicing.sim.SlicingCriterion#getIntent
	 * @model opposite="intent" containment="true" required="true"
	 * @generated
	 */
	EList<SlicingCriterion> getCriteria();

	/**
	 * Returns the value of the '<em><b>Configuration</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link eu.artist.migration.mut.slicing.sim.SlicingConfiguration#getIntent <em>Intent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Configuration</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configuration</em>' containment reference.
	 * @see #setConfiguration(SlicingConfiguration)
	 * @see eu.artist.migration.mut.slicing.sim.SimPackage#getSlicingIntent_Configuration()
	 * @see eu.artist.migration.mut.slicing.sim.SlicingConfiguration#getIntent
	 * @model opposite="intent" containment="true"
	 * @generated
	 */
	SlicingConfiguration getConfiguration();

	/**
	 * Sets the value of the '{@link eu.artist.migration.mut.slicing.sim.SlicingIntent#getConfiguration <em>Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configuration</em>' containment reference.
	 * @see #getConfiguration()
	 * @generated
	 */
	void setConfiguration(SlicingConfiguration value);

} // SlicingIntent

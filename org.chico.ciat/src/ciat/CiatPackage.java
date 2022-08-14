/**
 */
package ciat;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see ciat.CiatFactory
 * @model kind="package"
 *        annotation="gmf"
 * @generated
 */
public interface CiatPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ciat";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "ciat";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ciat";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CiatPackage eINSTANCE = ciat.impl.CiatPackageImpl.init();

	/**
	 * The meta object id for the '{@link ciat.impl.CIATDiagramImpl <em>CIAT Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ciat.impl.CIATDiagramImpl
	 * @see ciat.impl.CiatPackageImpl#getCIATDiagram()
	 * @generated
	 */
	int CIAT_DIAGRAM = 0;

	/**
	 * The feature id for the '<em><b>Its Sociograms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIAT_DIAGRAM__ITS_SOCIOGRAMS = 0;

	/**
	 * The feature id for the '<em><b>Its Process Diagrams</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIAT_DIAGRAM__ITS_PROCESS_DIAGRAMS = 1;

	/**
	 * The feature id for the '<em><b>Its Domain Diagrams</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIAT_DIAGRAM__ITS_DOMAIN_DIAGRAMS = 2;

	/**
	 * The feature id for the '<em><b>Its Ctt Diagrams</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIAT_DIAGRAM__ITS_CTT_DIAGRAMS = 3;

	/**
	 * The feature id for the '<em><b>Its Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIAT_DIAGRAM__ITS_LINKS = 4;

	/**
	 * The number of structural features of the '<em>CIAT Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIAT_DIAGRAM_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link ciat.impl.LinkImpl <em>Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ciat.impl.LinkImpl
	 * @see ciat.impl.CiatPackageImpl#getLink()
	 * @generated
	 */
	int LINK = 1;

	/**
	 * The number of structural features of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link ciat.impl.SociogramImpl <em>Sociogram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ciat.impl.SociogramImpl
	 * @see ciat.impl.CiatPackageImpl#getSociogram()
	 * @generated
	 */
	int SOCIOGRAM = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIOGRAM__NAME = 0;

	/**
	 * The feature id for the '<em><b>Its Sociogram Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIOGRAM__ITS_SOCIOGRAM_NODES = 1;

	/**
	 * The number of structural features of the '<em>Sociogram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIOGRAM_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link ciat.impl.SociogramNodeImpl <em>Sociogram Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ciat.impl.SociogramNodeImpl
	 * @see ciat.impl.CiatPackageImpl#getSociogramNode()
	 * @generated
	 */
	int SOCIOGRAM_NODE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIOGRAM_NODE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Sociogram Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIOGRAM_NODE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link ciat.impl.RolImpl <em>Rol</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ciat.impl.RolImpl
	 * @see ciat.impl.CiatPackageImpl#getRol()
	 * @generated
	 */
	int ROL = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROL__NAME = SOCIOGRAM_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Its Team</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROL__ITS_TEAM = SOCIOGRAM_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Its Actor</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROL__ITS_ACTOR = SOCIOGRAM_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Supertype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROL__SUPERTYPE = SOCIOGRAM_NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Subtype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROL__SUBTYPE = SOCIOGRAM_NODE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Rol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROL_FEATURE_COUNT = SOCIOGRAM_NODE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link ciat.impl.ActorImpl <em>Actor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ciat.impl.ActorImpl
	 * @see ciat.impl.CiatPackageImpl#getActor()
	 * @generated
	 */
	int ACTOR = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__NAME = SOCIOGRAM_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Its Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__ITS_GROUP = SOCIOGRAM_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Acts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__ACTS = SOCIOGRAM_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_FEATURE_COUNT = SOCIOGRAM_NODE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link ciat.impl.SoftwareAgentImpl <em>Software Agent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ciat.impl.SoftwareAgentImpl
	 * @see ciat.impl.CiatPackageImpl#getSoftwareAgent()
	 * @generated
	 */
	int SOFTWARE_AGENT = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_AGENT__NAME = SOCIOGRAM_NODE__NAME;

	/**
	 * The number of structural features of the '<em>Software Agent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_AGENT_FEATURE_COUNT = SOCIOGRAM_NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ciat.impl.TeamImpl <em>Team</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ciat.impl.TeamImpl
	 * @see ciat.impl.CiatPackageImpl#getTeam()
	 * @generated
	 */
	int TEAM = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM__NAME = SOCIOGRAM_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM__CONTAINS = SOCIOGRAM_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Team</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM_FEATURE_COUNT = SOCIOGRAM_NODE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ciat.impl.GroupImpl <em>Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ciat.impl.GroupImpl
	 * @see ciat.impl.CiatPackageImpl#getGroup()
	 * @generated
	 */
	int GROUP = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__NAME = SOCIOGRAM_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__CONTAINS = SOCIOGRAM_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_FEATURE_COUNT = SOCIOGRAM_NODE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ciat.impl.SociogramLinkImpl <em>Sociogram Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ciat.impl.SociogramLinkImpl
	 * @see ciat.impl.CiatPackageImpl#getSociogramLink()
	 * @generated
	 */
	int SOCIOGRAM_LINK = 9;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIOGRAM_LINK__SOURCE = LINK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIOGRAM_LINK__TARGET = LINK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Sociogram Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIOGRAM_LINK_FEATURE_COUNT = LINK_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link ciat.impl.InheritanceImpl <em>Inheritance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ciat.impl.InheritanceImpl
	 * @see ciat.impl.CiatPackageImpl#getInheritance()
	 * @generated
	 */
	int INHERITANCE = 10;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITANCE__SOURCE = SOCIOGRAM_LINK__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITANCE__TARGET = SOCIOGRAM_LINK__TARGET;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITANCE__CONDITION = SOCIOGRAM_LINK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Inheritance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITANCE_FEATURE_COUNT = SOCIOGRAM_LINK_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ciat.impl.ActingImpl <em>Acting</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ciat.impl.ActingImpl
	 * @see ciat.impl.CiatPackageImpl#getActing()
	 * @generated
	 */
	int ACTING = 11;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTING__SOURCE = SOCIOGRAM_LINK__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTING__TARGET = SOCIOGRAM_LINK__TARGET;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTING__NAME = SOCIOGRAM_LINK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>N</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTING__N = SOCIOGRAM_LINK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>M</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTING__M = SOCIOGRAM_LINK_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Acting</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTING_FEATURE_COUNT = SOCIOGRAM_LINK_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link ciat.impl.AssociationImpl <em>Association</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ciat.impl.AssociationImpl
	 * @see ciat.impl.CiatPackageImpl#getAssociation()
	 * @generated
	 */
	int ASSOCIATION = 12;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__SOURCE = SOCIOGRAM_LINK__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__TARGET = SOCIOGRAM_LINK__TARGET;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__NAME = SOCIOGRAM_LINK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>N</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__N = SOCIOGRAM_LINK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>M</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__M = SOCIOGRAM_LINK_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_FEATURE_COUNT = SOCIOGRAM_LINK_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link ciat.impl.ProcessDiagramImpl <em>Process Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ciat.impl.ProcessDiagramImpl
	 * @see ciat.impl.CiatPackageImpl#getProcessDiagram()
	 * @generated
	 */
	int PROCESS_DIAGRAM = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_DIAGRAM__NAME = 0;

	/**
	 * The feature id for the '<em><b>Process Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_DIAGRAM__PROCESS_NODES = 1;

	/**
	 * The number of structural features of the '<em>Process Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_DIAGRAM_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link ciat.impl.DependencyElementImpl <em>Dependency Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ciat.impl.DependencyElementImpl
	 * @see ciat.impl.CiatPackageImpl#getDependencyElement()
	 * @generated
	 */
	int DEPENDENCY_ELEMENT = 49;

	/**
	 * The number of structural features of the '<em>Dependency Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link ciat.impl.ProcessNodeImpl <em>Process Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ciat.impl.ProcessNodeImpl
	 * @see ciat.impl.CiatPackageImpl#getProcessNode()
	 * @generated
	 */
	int PROCESS_NODE = 14;

	/**
	 * The number of structural features of the '<em>Process Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_NODE_FEATURE_COUNT = DEPENDENCY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ciat.impl.InitImpl <em>Init</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ciat.impl.InitImpl
	 * @see ciat.impl.CiatPackageImpl#getInit()
	 * @generated
	 */
	int INIT = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INIT__NAME = PROCESS_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Init</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INIT_FEATURE_COUNT = PROCESS_NODE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ciat.impl.EndImpl <em>End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ciat.impl.EndImpl
	 * @see ciat.impl.CiatPackageImpl#getEnd()
	 * @generated
	 */
	int END = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END__NAME = PROCESS_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_FEATURE_COUNT = PROCESS_NODE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ciat.impl.SimpleTaskImpl <em>Simple Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ciat.impl.SimpleTaskImpl
	 * @see ciat.impl.CiatPackageImpl#getSimpleTask()
	 * @generated
	 */
	int SIMPLE_TASK = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TASK__NAME = PROCESS_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tools</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TASK__TOOLS = PROCESS_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Simple Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TASK_FEATURE_COUNT = PROCESS_NODE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link ciat.impl.IndividualTaskImpl <em>Individual Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ciat.impl.IndividualTaskImpl
	 * @see ciat.impl.CiatPackageImpl#getIndividualTask()
	 * @generated
	 */
	int INDIVIDUAL_TASK = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_TASK__NAME = SIMPLE_TASK__NAME;

	/**
	 * The feature id for the '<em><b>Tools</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_TASK__TOOLS = SIMPLE_TASK__TOOLS;

	/**
	 * The feature id for the '<em><b>Task Roles</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_TASK__TASK_ROLES = SIMPLE_TASK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Task Objects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_TASK__TASK_OBJECTS = SIMPLE_TASK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Individual Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_TASK_FEATURE_COUNT = SIMPLE_TASK_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link ciat.impl.CooperativeTaskImpl <em>Cooperative Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ciat.impl.CooperativeTaskImpl
	 * @see ciat.impl.CiatPackageImpl#getCooperativeTask()
	 * @generated
	 */
	int COOPERATIVE_TASK = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOPERATIVE_TASK__NAME = SIMPLE_TASK__NAME;

	/**
	 * The feature id for the '<em><b>Tools</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOPERATIVE_TASK__TOOLS = SIMPLE_TASK__TOOLS;

	/**
	 * The feature id for the '<em><b>Task Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOPERATIVE_TASK__TASK_ROLES = SIMPLE_TASK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Task Objects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOPERATIVE_TASK__TASK_OBJECTS = SIMPLE_TASK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Cooperative Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOPERATIVE_TASK_FEATURE_COUNT = SIMPLE_TASK_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link ciat.impl.CollaborativeTaskImpl <em>Collaborative Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ciat.impl.CollaborativeTaskImpl
	 * @see ciat.impl.CiatPackageImpl#getCollaborativeTask()
	 * @generated
	 */
	int COLLABORATIVE_TASK = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATIVE_TASK__NAME = SIMPLE_TASK__NAME;

	/**
	 * The feature id for the '<em><b>Tools</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATIVE_TASK__TOOLS = SIMPLE_TASK__TOOLS;

	/**
	 * The feature id for the '<em><b>Task Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATIVE_TASK__TASK_ROLES = SIMPLE_TASK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Task Objects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATIVE_TASK__TASK_OBJECTS = SIMPLE_TASK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Collaborative Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATIVE_TASK_FEATURE_COUNT = SIMPLE_TASK_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link ciat.impl.AbstractTaskImpl <em>Abstract Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ciat.impl.AbstractTaskImpl
	 * @see ciat.impl.CiatPackageImpl#getAbstractTask()
	 * @generated
	 */
	int ABSTRACT_TASK = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TASK__NAME = SIMPLE_TASK__NAME;

	/**
	 * The feature id for the '<em><b>Tools</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TASK__TOOLS = SIMPLE_TASK__TOOLS;

	/**
	 * The feature id for the '<em><b>Process Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TASK__PROCESS_NODES = SIMPLE_TASK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Abstract Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TASK_FEATURE_COUNT = SIMPLE_TASK_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ciat.impl.ToolImpl <em>Tool</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ciat.impl.ToolImpl
	 * @see ciat.impl.CiatPackageImpl#getTool()
	 * @generated
	 */
	int TOOL = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL__NAME = 0;

	/**
	 * The number of structural features of the '<em>Tool</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link ciat.impl.ObjectImpl <em>Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ciat.impl.ObjectImpl
	 * @see ciat.impl.CiatPackageImpl#getObject()
	 * @generated
	 */
	int OBJECT = 23;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__OBJECT = 1;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__MODIFIER = 2;

	/**
	 * The feature id for the '<em><b>Modified By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__MODIFIED_BY = 3;

	/**
	 * The number of structural features of the '<em>Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link ciat.impl.TemporalConditionImpl <em>Temporal Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ciat.impl.TemporalConditionImpl
	 * @see ciat.impl.CiatPackageImpl#getTemporalCondition()
	 * @generated
	 */
	int TEMPORAL_CONDITION = 24;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_CONDITION__NAME = PROCESS_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Temporal Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_CONDITION_FEATURE_COUNT = PROCESS_NODE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ciat.impl.NotificationImpl <em>Notification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ciat.impl.NotificationImpl
	 * @see ciat.impl.CiatPackageImpl#getNotification()
	 * @generated
	 */
	int NOTIFICATION = 25;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION__NAME = PROCESS_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Notification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_FEATURE_COUNT = PROCESS_NODE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ciat.impl.ConditionImpl <em>Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ciat.impl.ConditionImpl
	 * @see ciat.impl.CiatPackageImpl#getCondition()
	 * @generated
	 */
	int CONDITION = 26;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__NAME = PROCESS_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_FEATURE_COUNT = PROCESS_NODE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ciat.impl.DomainDiagramImpl <em>Domain Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ciat.impl.DomainDiagramImpl
	 * @see ciat.impl.CiatPackageImpl#getDomainDiagram()
	 * @generated
	 */
	int DOMAIN_DIAGRAM = 27;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_DIAGRAM__NAME = 0;

	/**
	 * The feature id for the '<em><b>Shared Context</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_DIAGRAM__SHARED_CONTEXT = 1;

	/**
	 * The number of structural features of the '<em>Domain Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_DIAGRAM_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link ciat.impl.SharedObjectImpl <em>Shared Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ciat.impl.SharedObjectImpl
	 * @see ciat.impl.CiatPackageImpl#getSharedObject()
	 * @generated
	 */
	int SHARED_OBJECT = 28;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_OBJECT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Its Visualization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_OBJECT__ITS_VISUALIZATION = 1;

	/**
	 * The feature id for the '<em><b>Incomings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_OBJECT__INCOMINGS = 2;

	/**
	 * The feature id for the '<em><b>Outgoings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_OBJECT__OUTGOINGS = 3;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_OBJECT__ATTRIBUTES = 4;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_OBJECT__OPERATIONS = 5;

	/**
	 * The feature id for the '<em><b>VAreas</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_OBJECT__VAREAS = 6;

	/**
	 * The number of structural features of the '<em>Shared Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_OBJECT_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link ciat.impl.VisualizationAreaImpl <em>Visualization Area</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ciat.impl.VisualizationAreaImpl
	 * @see ciat.impl.CiatPackageImpl#getVisualizationArea()
	 * @generated
	 */
	int VISUALIZATION_AREA = 29;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZATION_AREA__NAME = 0;

	/**
	 * The number of structural features of the '<em>Visualization Area</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZATION_AREA_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link ciat.impl.ExclusiveEditionAreaImpl <em>Exclusive Edition Area</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ciat.impl.ExclusiveEditionAreaImpl
	 * @see ciat.impl.CiatPackageImpl#getExclusiveEditionArea()
	 * @generated
	 */
	int EXCLUSIVE_EDITION_AREA = 30;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_EDITION_AREA__NAME = VISUALIZATION_AREA__NAME;

	/**
	 * The number of structural features of the '<em>Exclusive Edition Area</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_EDITION_AREA_FEATURE_COUNT = VISUALIZATION_AREA_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ciat.impl.CollaborativeAreaImpl <em>Collaborative Area</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ciat.impl.CollaborativeAreaImpl
	 * @see ciat.impl.CiatPackageImpl#getCollaborativeArea()
	 * @generated
	 */
	int COLLABORATIVE_AREA = 31;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATIVE_AREA__NAME = VISUALIZATION_AREA__NAME;

	/**
	 * The number of structural features of the '<em>Collaborative Area</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATIVE_AREA_FEATURE_COUNT = VISUALIZATION_AREA_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ciat.impl.IndividualAreaImpl <em>Individual Area</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ciat.impl.IndividualAreaImpl
	 * @see ciat.impl.CiatPackageImpl#getIndividualArea()
	 * @generated
	 */
	int INDIVIDUAL_AREA = 32;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_AREA__NAME = VISUALIZATION_AREA__NAME;

	/**
	 * The number of structural features of the '<em>Individual Area</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_AREA_FEATURE_COUNT = VISUALIZATION_AREA_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ciat.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ciat.impl.AttributeImpl
	 * @see ciat.impl.CiatPackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 33;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link ciat.impl.OperationImpl <em>Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ciat.impl.OperationImpl
	 * @see ciat.impl.CiatPackageImpl#getOperation()
	 * @generated
	 */
	int OPERATION = 34;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__NAME = 0;

	/**
	 * The number of structural features of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link ciat.impl.SharedLinkImpl <em>Shared Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ciat.impl.SharedLinkImpl
	 * @see ciat.impl.CiatPackageImpl#getSharedLink()
	 * @generated
	 */
	int SHARED_LINK = 35;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_LINK__SOURCE = LINK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_LINK__TARGET = LINK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Shared Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_LINK_FEATURE_COUNT = LINK_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link ciat.impl.ShAssociationLinkImpl <em>Sh Association Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ciat.impl.ShAssociationLinkImpl
	 * @see ciat.impl.CiatPackageImpl#getShAssociationLink()
	 * @generated
	 */
	int SH_ASSOCIATION_LINK = 36;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SH_ASSOCIATION_LINK__SOURCE = SHARED_LINK__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SH_ASSOCIATION_LINK__TARGET = SHARED_LINK__TARGET;

	/**
	 * The number of structural features of the '<em>Sh Association Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SH_ASSOCIATION_LINK_FEATURE_COUNT = SHARED_LINK_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ciat.impl.ShGeneralizationLinkImpl <em>Sh Generalization Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ciat.impl.ShGeneralizationLinkImpl
	 * @see ciat.impl.CiatPackageImpl#getShGeneralizationLink()
	 * @generated
	 */
	int SH_GENERALIZATION_LINK = 37;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SH_GENERALIZATION_LINK__SOURCE = SHARED_LINK__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SH_GENERALIZATION_LINK__TARGET = SHARED_LINK__TARGET;

	/**
	 * The number of structural features of the '<em>Sh Generalization Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SH_GENERALIZATION_LINK_FEATURE_COUNT = SHARED_LINK_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ciat.impl.ShAggregationLinkImpl <em>Sh Aggregation Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ciat.impl.ShAggregationLinkImpl
	 * @see ciat.impl.CiatPackageImpl#getShAggregationLink()
	 * @generated
	 */
	int SH_AGGREGATION_LINK = 38;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SH_AGGREGATION_LINK__SOURCE = SHARED_LINK__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SH_AGGREGATION_LINK__TARGET = SHARED_LINK__TARGET;

	/**
	 * The number of structural features of the '<em>Sh Aggregation Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SH_AGGREGATION_LINK_FEATURE_COUNT = SHARED_LINK_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ciat.impl.CTTDiagramImpl <em>CTT Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ciat.impl.CTTDiagramImpl
	 * @see ciat.impl.CiatPackageImpl#getCTTDiagram()
	 * @generated
	 */
	int CTT_DIAGRAM = 39;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTT_DIAGRAM__NAME = 0;

	/**
	 * The feature id for the '<em><b>Ctt Tasks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTT_DIAGRAM__CTT_TASKS = 1;

	/**
	 * The number of structural features of the '<em>CTT Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTT_DIAGRAM_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link ciat.impl.CTTTaskImpl <em>CTT Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ciat.impl.CTTTaskImpl
	 * @see ciat.impl.CiatPackageImpl#getCTTTask()
	 * @generated
	 */
	int CTT_TASK = 40;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTT_TASK__NAME = DEPENDENCY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dependencies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTT_TASK__DEPENDENCIES = DEPENDENCY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>CTT Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTT_TASK_FEATURE_COUNT = DEPENDENCY_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link ciat.impl.ExclusiveEditionImpl <em>Exclusive Edition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ciat.impl.ExclusiveEditionImpl
	 * @see ciat.impl.CiatPackageImpl#getExclusiveEdition()
	 * @generated
	 */
	int EXCLUSIVE_EDITION = 41;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_EDITION__NAME = CTT_TASK__NAME;

	/**
	 * The feature id for the '<em><b>Dependencies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_EDITION__DEPENDENCIES = CTT_TASK__DEPENDENCIES;

	/**
	 * The number of structural features of the '<em>Exclusive Edition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_EDITION_FEATURE_COUNT = CTT_TASK_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ciat.impl.CollaborativeVisualizationImpl <em>Collaborative Visualization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ciat.impl.CollaborativeVisualizationImpl
	 * @see ciat.impl.CiatPackageImpl#getCollaborativeVisualization()
	 * @generated
	 */
	int COLLABORATIVE_VISUALIZATION = 42;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATIVE_VISUALIZATION__NAME = CTT_TASK__NAME;

	/**
	 * The feature id for the '<em><b>Dependencies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATIVE_VISUALIZATION__DEPENDENCIES = CTT_TASK__DEPENDENCIES;

	/**
	 * The number of structural features of the '<em>Collaborative Visualization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATIVE_VISUALIZATION_FEATURE_COUNT = CTT_TASK_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ciat.impl.IndividualVisualizationImpl <em>Individual Visualization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ciat.impl.IndividualVisualizationImpl
	 * @see ciat.impl.CiatPackageImpl#getIndividualVisualization()
	 * @generated
	 */
	int INDIVIDUAL_VISUALIZATION = 43;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_VISUALIZATION__NAME = CTT_TASK__NAME;

	/**
	 * The feature id for the '<em><b>Dependencies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_VISUALIZATION__DEPENDENCIES = CTT_TASK__DEPENDENCIES;

	/**
	 * The number of structural features of the '<em>Individual Visualization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_VISUALIZATION_FEATURE_COUNT = CTT_TASK_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ciat.impl.UserTaskImpl <em>User Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ciat.impl.UserTaskImpl
	 * @see ciat.impl.CiatPackageImpl#getUserTask()
	 * @generated
	 */
	int USER_TASK = 44;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TASK__NAME = CTT_TASK__NAME;

	/**
	 * The feature id for the '<em><b>Dependencies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TASK__DEPENDENCIES = CTT_TASK__DEPENDENCIES;

	/**
	 * The number of structural features of the '<em>User Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TASK_FEATURE_COUNT = CTT_TASK_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ciat.impl.CTTAbstractTaskImpl <em>CTT Abstract Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ciat.impl.CTTAbstractTaskImpl
	 * @see ciat.impl.CiatPackageImpl#getCTTAbstractTask()
	 * @generated
	 */
	int CTT_ABSTRACT_TASK = 45;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTT_ABSTRACT_TASK__NAME = CTT_TASK__NAME;

	/**
	 * The feature id for the '<em><b>Dependencies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTT_ABSTRACT_TASK__DEPENDENCIES = CTT_TASK__DEPENDENCIES;

	/**
	 * The number of structural features of the '<em>CTT Abstract Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTT_ABSTRACT_TASK_FEATURE_COUNT = CTT_TASK_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ciat.impl.InteractiveTaskImpl <em>Interactive Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ciat.impl.InteractiveTaskImpl
	 * @see ciat.impl.CiatPackageImpl#getInteractiveTask()
	 * @generated
	 */
	int INTERACTIVE_TASK = 46;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTIVE_TASK__NAME = CTT_TASK__NAME;

	/**
	 * The feature id for the '<em><b>Dependencies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTIVE_TASK__DEPENDENCIES = CTT_TASK__DEPENDENCIES;

	/**
	 * The number of structural features of the '<em>Interactive Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTIVE_TASK_FEATURE_COUNT = CTT_TASK_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ciat.impl.CTTCollaborativeTaskImpl <em>CTT Collaborative Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ciat.impl.CTTCollaborativeTaskImpl
	 * @see ciat.impl.CiatPackageImpl#getCTTCollaborativeTask()
	 * @generated
	 */
	int CTT_COLLABORATIVE_TASK = 47;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTT_COLLABORATIVE_TASK__NAME = CTT_TASK__NAME;

	/**
	 * The feature id for the '<em><b>Dependencies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTT_COLLABORATIVE_TASK__DEPENDENCIES = CTT_TASK__DEPENDENCIES;

	/**
	 * The number of structural features of the '<em>CTT Collaborative Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTT_COLLABORATIVE_TASK_FEATURE_COUNT = CTT_TASK_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ciat.impl.ApplicationTaskImpl <em>Application Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ciat.impl.ApplicationTaskImpl
	 * @see ciat.impl.CiatPackageImpl#getApplicationTask()
	 * @generated
	 */
	int APPLICATION_TASK = 48;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_TASK__NAME = CTT_TASK__NAME;

	/**
	 * The feature id for the '<em><b>Dependencies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_TASK__DEPENDENCIES = CTT_TASK__DEPENDENCIES;

	/**
	 * The number of structural features of the '<em>Application Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_TASK_FEATURE_COUNT = CTT_TASK_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ciat.impl.DependencyImpl <em>Dependency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ciat.impl.DependencyImpl
	 * @see ciat.impl.CiatPackageImpl#getDependency()
	 * @generated
	 */
	int DEPENDENCY = 50;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__SOURCE = LINK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__TARGET = LINK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_FEATURE_COUNT = LINK_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link ciat.impl.AggregationImpl <em>Aggregation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ciat.impl.AggregationImpl
	 * @see ciat.impl.CiatPackageImpl#getAggregation()
	 * @generated
	 */
	int AGGREGATION = 51;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION__SOURCE = DEPENDENCY__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION__TARGET = DEPENDENCY__TARGET;

	/**
	 * The number of structural features of the '<em>Aggregation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION_FEATURE_COUNT = DEPENDENCY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ciat.impl.EnablingImpl <em>Enabling</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ciat.impl.EnablingImpl
	 * @see ciat.impl.CiatPackageImpl#getEnabling()
	 * @generated
	 */
	int ENABLING = 52;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENABLING__SOURCE = DEPENDENCY__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENABLING__TARGET = DEPENDENCY__TARGET;

	/**
	 * The feature id for the '<em><b>ELabel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENABLING__ELABEL = DEPENDENCY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Enabling</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENABLING_FEATURE_COUNT = DEPENDENCY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ciat.impl.DisablingImpl <em>Disabling</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ciat.impl.DisablingImpl
	 * @see ciat.impl.CiatPackageImpl#getDisabling()
	 * @generated
	 */
	int DISABLING = 53;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISABLING__SOURCE = DEPENDENCY__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISABLING__TARGET = DEPENDENCY__TARGET;

	/**
	 * The feature id for the '<em><b>DLabel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISABLING__DLABEL = DEPENDENCY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Disabling</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISABLING_FEATURE_COUNT = DEPENDENCY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ciat.impl.EnablingWithInformationPassingImpl <em>Enabling With Information Passing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ciat.impl.EnablingWithInformationPassingImpl
	 * @see ciat.impl.CiatPackageImpl#getEnablingWithInformationPassing()
	 * @generated
	 */
	int ENABLING_WITH_INFORMATION_PASSING = 54;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENABLING_WITH_INFORMATION_PASSING__SOURCE = DEPENDENCY__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENABLING_WITH_INFORMATION_PASSING__TARGET = DEPENDENCY__TARGET;

	/**
	 * The feature id for the '<em><b>Ew Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENABLING_WITH_INFORMATION_PASSING__EW_LABEL = DEPENDENCY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Enabling With Information Passing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENABLING_WITH_INFORMATION_PASSING_FEATURE_COUNT = DEPENDENCY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ciat.impl.DisablingWithInformationPassingImpl <em>Disabling With Information Passing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ciat.impl.DisablingWithInformationPassingImpl
	 * @see ciat.impl.CiatPackageImpl#getDisablingWithInformationPassing()
	 * @generated
	 */
	int DISABLING_WITH_INFORMATION_PASSING = 55;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISABLING_WITH_INFORMATION_PASSING__SOURCE = DEPENDENCY__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISABLING_WITH_INFORMATION_PASSING__TARGET = DEPENDENCY__TARGET;

	/**
	 * The feature id for the '<em><b>Dw Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISABLING_WITH_INFORMATION_PASSING__DW_LABEL = DEPENDENCY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Disabling With Information Passing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISABLING_WITH_INFORMATION_PASSING_FEATURE_COUNT = DEPENDENCY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ciat.impl.IndependentConcurrencyImpl <em>Independent Concurrency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ciat.impl.IndependentConcurrencyImpl
	 * @see ciat.impl.CiatPackageImpl#getIndependentConcurrency()
	 * @generated
	 */
	int INDEPENDENT_CONCURRENCY = 56;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEPENDENT_CONCURRENCY__SOURCE = DEPENDENCY__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEPENDENT_CONCURRENCY__TARGET = DEPENDENCY__TARGET;

	/**
	 * The feature id for the '<em><b>Ic Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEPENDENT_CONCURRENCY__IC_LABEL = DEPENDENCY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Independent Concurrency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEPENDENT_CONCURRENCY_FEATURE_COUNT = DEPENDENCY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ciat.impl.OrderIndependenceImpl <em>Order Independence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ciat.impl.OrderIndependenceImpl
	 * @see ciat.impl.CiatPackageImpl#getOrderIndependence()
	 * @generated
	 */
	int ORDER_INDEPENDENCE = 57;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_INDEPENDENCE__SOURCE = DEPENDENCY__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_INDEPENDENCE__TARGET = DEPENDENCY__TARGET;

	/**
	 * The feature id for the '<em><b>Oi Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_INDEPENDENCE__OI_LABEL = DEPENDENCY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Order Independence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_INDEPENDENCE_FEATURE_COUNT = DEPENDENCY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ciat.impl.SuspendResumeImpl <em>Suspend Resume</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ciat.impl.SuspendResumeImpl
	 * @see ciat.impl.CiatPackageImpl#getSuspendResume()
	 * @generated
	 */
	int SUSPEND_RESUME = 58;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUSPEND_RESUME__SOURCE = DEPENDENCY__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUSPEND_RESUME__TARGET = DEPENDENCY__TARGET;

	/**
	 * The feature id for the '<em><b>Sr Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUSPEND_RESUME__SR_LABEL = DEPENDENCY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Suspend Resume</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUSPEND_RESUME_FEATURE_COUNT = DEPENDENCY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ciat.impl.ConcurrencyWithInformationPassingImpl <em>Concurrency With Information Passing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ciat.impl.ConcurrencyWithInformationPassingImpl
	 * @see ciat.impl.CiatPackageImpl#getConcurrencyWithInformationPassing()
	 * @generated
	 */
	int CONCURRENCY_WITH_INFORMATION_PASSING = 59;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCURRENCY_WITH_INFORMATION_PASSING__SOURCE = DEPENDENCY__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCURRENCY_WITH_INFORMATION_PASSING__TARGET = DEPENDENCY__TARGET;

	/**
	 * The feature id for the '<em><b>CLabel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCURRENCY_WITH_INFORMATION_PASSING__CLABEL = DEPENDENCY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Concurrency With Information Passing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCURRENCY_WITH_INFORMATION_PASSING_FEATURE_COUNT = DEPENDENCY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ciat.impl.DeterministicChoiceImpl <em>Deterministic Choice</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ciat.impl.DeterministicChoiceImpl
	 * @see ciat.impl.CiatPackageImpl#getDeterministicChoice()
	 * @generated
	 */
	int DETERMINISTIC_CHOICE = 60;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETERMINISTIC_CHOICE__SOURCE = DEPENDENCY__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETERMINISTIC_CHOICE__TARGET = DEPENDENCY__TARGET;

	/**
	 * The feature id for the '<em><b>Dt Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETERMINISTIC_CHOICE__DT_LABEL = DEPENDENCY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Deterministic Choice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETERMINISTIC_CHOICE_FEATURE_COUNT = DEPENDENCY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ciat.impl.UndeterministicChoiceImpl <em>Undeterministic Choice</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ciat.impl.UndeterministicChoiceImpl
	 * @see ciat.impl.CiatPackageImpl#getUndeterministicChoice()
	 * @generated
	 */
	int UNDETERMINISTIC_CHOICE = 61;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDETERMINISTIC_CHOICE__SOURCE = DEPENDENCY__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDETERMINISTIC_CHOICE__TARGET = DEPENDENCY__TARGET;

	/**
	 * The feature id for the '<em><b>Uc Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDETERMINISTIC_CHOICE__UC_LABEL = DEPENDENCY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Undeterministic Choice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDETERMINISTIC_CHOICE_FEATURE_COUNT = DEPENDENCY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ciat.Visualizations <em>Visualizations</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ciat.Visualizations
	 * @see ciat.impl.CiatPackageImpl#getVisualizations()
	 * @generated
	 */
	int VISUALIZATIONS = 62;


	/**
	 * Returns the meta object for class '{@link ciat.CIATDiagram <em>CIAT Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CIAT Diagram</em>'.
	 * @see ciat.CIATDiagram
	 * @generated
	 */
	EClass getCIATDiagram();

	/**
	 * Returns the meta object for the containment reference list '{@link ciat.CIATDiagram#getItsSociograms <em>Its Sociograms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Its Sociograms</em>'.
	 * @see ciat.CIATDiagram#getItsSociograms()
	 * @see #getCIATDiagram()
	 * @generated
	 */
	EReference getCIATDiagram_ItsSociograms();

	/**
	 * Returns the meta object for the containment reference list '{@link ciat.CIATDiagram#getItsProcessDiagrams <em>Its Process Diagrams</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Its Process Diagrams</em>'.
	 * @see ciat.CIATDiagram#getItsProcessDiagrams()
	 * @see #getCIATDiagram()
	 * @generated
	 */
	EReference getCIATDiagram_ItsProcessDiagrams();

	/**
	 * Returns the meta object for the containment reference list '{@link ciat.CIATDiagram#getItsDomainDiagrams <em>Its Domain Diagrams</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Its Domain Diagrams</em>'.
	 * @see ciat.CIATDiagram#getItsDomainDiagrams()
	 * @see #getCIATDiagram()
	 * @generated
	 */
	EReference getCIATDiagram_ItsDomainDiagrams();

	/**
	 * Returns the meta object for the containment reference list '{@link ciat.CIATDiagram#getItsCttDiagrams <em>Its Ctt Diagrams</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Its Ctt Diagrams</em>'.
	 * @see ciat.CIATDiagram#getItsCttDiagrams()
	 * @see #getCIATDiagram()
	 * @generated
	 */
	EReference getCIATDiagram_ItsCttDiagrams();

	/**
	 * Returns the meta object for the containment reference list '{@link ciat.CIATDiagram#getItsLinks <em>Its Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Its Links</em>'.
	 * @see ciat.CIATDiagram#getItsLinks()
	 * @see #getCIATDiagram()
	 * @generated
	 */
	EReference getCIATDiagram_ItsLinks();

	/**
	 * Returns the meta object for class '{@link ciat.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link</em>'.
	 * @see ciat.Link
	 * @generated
	 */
	EClass getLink();

	/**
	 * Returns the meta object for class '{@link ciat.Sociogram <em>Sociogram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sociogram</em>'.
	 * @see ciat.Sociogram
	 * @generated
	 */
	EClass getSociogram();

	/**
	 * Returns the meta object for the attribute '{@link ciat.Sociogram#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ciat.Sociogram#getName()
	 * @see #getSociogram()
	 * @generated
	 */
	EAttribute getSociogram_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link ciat.Sociogram#getItsSociogramNodes <em>Its Sociogram Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Its Sociogram Nodes</em>'.
	 * @see ciat.Sociogram#getItsSociogramNodes()
	 * @see #getSociogram()
	 * @generated
	 */
	EReference getSociogram_ItsSociogramNodes();

	/**
	 * Returns the meta object for class '{@link ciat.SociogramNode <em>Sociogram Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sociogram Node</em>'.
	 * @see ciat.SociogramNode
	 * @generated
	 */
	EClass getSociogramNode();

	/**
	 * Returns the meta object for the attribute '{@link ciat.SociogramNode#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ciat.SociogramNode#getName()
	 * @see #getSociogramNode()
	 * @generated
	 */
	EAttribute getSociogramNode_Name();

	/**
	 * Returns the meta object for class '{@link ciat.Rol <em>Rol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rol</em>'.
	 * @see ciat.Rol
	 * @generated
	 */
	EClass getRol();

	/**
	 * Returns the meta object for the reference list '{@link ciat.Rol#getItsTeam <em>Its Team</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Its Team</em>'.
	 * @see ciat.Rol#getItsTeam()
	 * @see #getRol()
	 * @generated
	 */
	EReference getRol_ItsTeam();

	/**
	 * Returns the meta object for the reference list '{@link ciat.Rol#getItsActor <em>Its Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Its Actor</em>'.
	 * @see ciat.Rol#getItsActor()
	 * @see #getRol()
	 * @generated
	 */
	EReference getRol_ItsActor();

	/**
	 * Returns the meta object for the reference list '{@link ciat.Rol#getSupertype <em>Supertype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Supertype</em>'.
	 * @see ciat.Rol#getSupertype()
	 * @see #getRol()
	 * @generated
	 */
	EReference getRol_Supertype();

	/**
	 * Returns the meta object for the reference list '{@link ciat.Rol#getSubtype <em>Subtype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Subtype</em>'.
	 * @see ciat.Rol#getSubtype()
	 * @see #getRol()
	 * @generated
	 */
	EReference getRol_Subtype();

	/**
	 * Returns the meta object for class '{@link ciat.Actor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actor</em>'.
	 * @see ciat.Actor
	 * @generated
	 */
	EClass getActor();

	/**
	 * Returns the meta object for the reference list '{@link ciat.Actor#getItsGroup <em>Its Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Its Group</em>'.
	 * @see ciat.Actor#getItsGroup()
	 * @see #getActor()
	 * @generated
	 */
	EReference getActor_ItsGroup();

	/**
	 * Returns the meta object for the reference list '{@link ciat.Actor#getActs <em>Acts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Acts</em>'.
	 * @see ciat.Actor#getActs()
	 * @see #getActor()
	 * @generated
	 */
	EReference getActor_Acts();

	/**
	 * Returns the meta object for class '{@link ciat.SoftwareAgent <em>Software Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Software Agent</em>'.
	 * @see ciat.SoftwareAgent
	 * @generated
	 */
	EClass getSoftwareAgent();

	/**
	 * Returns the meta object for class '{@link ciat.Team <em>Team</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Team</em>'.
	 * @see ciat.Team
	 * @generated
	 */
	EClass getTeam();

	/**
	 * Returns the meta object for the reference list '{@link ciat.Team#getContains <em>Contains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Contains</em>'.
	 * @see ciat.Team#getContains()
	 * @see #getTeam()
	 * @generated
	 */
	EReference getTeam_Contains();

	/**
	 * Returns the meta object for class '{@link ciat.Group <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group</em>'.
	 * @see ciat.Group
	 * @generated
	 */
	EClass getGroup();

	/**
	 * Returns the meta object for the reference list '{@link ciat.Group#getContains <em>Contains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Contains</em>'.
	 * @see ciat.Group#getContains()
	 * @see #getGroup()
	 * @generated
	 */
	EReference getGroup_Contains();

	/**
	 * Returns the meta object for class '{@link ciat.SociogramLink <em>Sociogram Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sociogram Link</em>'.
	 * @see ciat.SociogramLink
	 * @generated
	 */
	EClass getSociogramLink();

	/**
	 * Returns the meta object for the reference '{@link ciat.SociogramLink#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see ciat.SociogramLink#getSource()
	 * @see #getSociogramLink()
	 * @generated
	 */
	EReference getSociogramLink_Source();

	/**
	 * Returns the meta object for the reference '{@link ciat.SociogramLink#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see ciat.SociogramLink#getTarget()
	 * @see #getSociogramLink()
	 * @generated
	 */
	EReference getSociogramLink_Target();

	/**
	 * Returns the meta object for class '{@link ciat.Inheritance <em>Inheritance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inheritance</em>'.
	 * @see ciat.Inheritance
	 * @generated
	 */
	EClass getInheritance();

	/**
	 * Returns the meta object for the attribute '{@link ciat.Inheritance#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition</em>'.
	 * @see ciat.Inheritance#getCondition()
	 * @see #getInheritance()
	 * @generated
	 */
	EAttribute getInheritance_Condition();

	/**
	 * Returns the meta object for class '{@link ciat.Acting <em>Acting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Acting</em>'.
	 * @see ciat.Acting
	 * @generated
	 */
	EClass getActing();

	/**
	 * Returns the meta object for the attribute '{@link ciat.Acting#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ciat.Acting#getName()
	 * @see #getActing()
	 * @generated
	 */
	EAttribute getActing_Name();

	/**
	 * Returns the meta object for the attribute '{@link ciat.Acting#getN <em>N</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>N</em>'.
	 * @see ciat.Acting#getN()
	 * @see #getActing()
	 * @generated
	 */
	EAttribute getActing_N();

	/**
	 * Returns the meta object for the attribute '{@link ciat.Acting#getM <em>M</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>M</em>'.
	 * @see ciat.Acting#getM()
	 * @see #getActing()
	 * @generated
	 */
	EAttribute getActing_M();

	/**
	 * Returns the meta object for class '{@link ciat.Association <em>Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Association</em>'.
	 * @see ciat.Association
	 * @generated
	 */
	EClass getAssociation();

	/**
	 * Returns the meta object for the attribute '{@link ciat.Association#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ciat.Association#getName()
	 * @see #getAssociation()
	 * @generated
	 */
	EAttribute getAssociation_Name();

	/**
	 * Returns the meta object for the attribute '{@link ciat.Association#getN <em>N</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>N</em>'.
	 * @see ciat.Association#getN()
	 * @see #getAssociation()
	 * @generated
	 */
	EAttribute getAssociation_N();

	/**
	 * Returns the meta object for the attribute '{@link ciat.Association#getM <em>M</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>M</em>'.
	 * @see ciat.Association#getM()
	 * @see #getAssociation()
	 * @generated
	 */
	EAttribute getAssociation_M();

	/**
	 * Returns the meta object for class '{@link ciat.ProcessDiagram <em>Process Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process Diagram</em>'.
	 * @see ciat.ProcessDiagram
	 * @generated
	 */
	EClass getProcessDiagram();

	/**
	 * Returns the meta object for the attribute '{@link ciat.ProcessDiagram#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ciat.ProcessDiagram#getName()
	 * @see #getProcessDiagram()
	 * @generated
	 */
	EAttribute getProcessDiagram_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link ciat.ProcessDiagram#getProcessNodes <em>Process Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Process Nodes</em>'.
	 * @see ciat.ProcessDiagram#getProcessNodes()
	 * @see #getProcessDiagram()
	 * @generated
	 */
	EReference getProcessDiagram_ProcessNodes();

	/**
	 * Returns the meta object for class '{@link ciat.ProcessNode <em>Process Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process Node</em>'.
	 * @see ciat.ProcessNode
	 * @generated
	 */
	EClass getProcessNode();

	/**
	 * Returns the meta object for class '{@link ciat.Init <em>Init</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Init</em>'.
	 * @see ciat.Init
	 * @generated
	 */
	EClass getInit();

	/**
	 * Returns the meta object for the attribute '{@link ciat.Init#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ciat.Init#getName()
	 * @see #getInit()
	 * @generated
	 */
	EAttribute getInit_Name();

	/**
	 * Returns the meta object for class '{@link ciat.End <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>End</em>'.
	 * @see ciat.End
	 * @generated
	 */
	EClass getEnd();

	/**
	 * Returns the meta object for the attribute '{@link ciat.End#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ciat.End#getName()
	 * @see #getEnd()
	 * @generated
	 */
	EAttribute getEnd_Name();

	/**
	 * Returns the meta object for class '{@link ciat.SimpleTask <em>Simple Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Task</em>'.
	 * @see ciat.SimpleTask
	 * @generated
	 */
	EClass getSimpleTask();

	/**
	 * Returns the meta object for the attribute '{@link ciat.SimpleTask#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ciat.SimpleTask#getName()
	 * @see #getSimpleTask()
	 * @generated
	 */
	EAttribute getSimpleTask_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link ciat.SimpleTask#getTools <em>Tools</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tools</em>'.
	 * @see ciat.SimpleTask#getTools()
	 * @see #getSimpleTask()
	 * @generated
	 */
	EReference getSimpleTask_Tools();

	/**
	 * Returns the meta object for class '{@link ciat.IndividualTask <em>Individual Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Individual Task</em>'.
	 * @see ciat.IndividualTask
	 * @generated
	 */
	EClass getIndividualTask();

	/**
	 * Returns the meta object for the containment reference '{@link ciat.IndividualTask#getTaskRoles <em>Task Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Task Roles</em>'.
	 * @see ciat.IndividualTask#getTaskRoles()
	 * @see #getIndividualTask()
	 * @generated
	 */
	EReference getIndividualTask_TaskRoles();

	/**
	 * Returns the meta object for the containment reference list '{@link ciat.IndividualTask#getTaskObjects <em>Task Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Task Objects</em>'.
	 * @see ciat.IndividualTask#getTaskObjects()
	 * @see #getIndividualTask()
	 * @generated
	 */
	EReference getIndividualTask_TaskObjects();

	/**
	 * Returns the meta object for class '{@link ciat.CooperativeTask <em>Cooperative Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cooperative Task</em>'.
	 * @see ciat.CooperativeTask
	 * @generated
	 */
	EClass getCooperativeTask();

	/**
	 * Returns the meta object for the containment reference list '{@link ciat.CooperativeTask#getTaskRoles <em>Task Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Task Roles</em>'.
	 * @see ciat.CooperativeTask#getTaskRoles()
	 * @see #getCooperativeTask()
	 * @generated
	 */
	EReference getCooperativeTask_TaskRoles();

	/**
	 * Returns the meta object for the containment reference list '{@link ciat.CooperativeTask#getTaskObjects <em>Task Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Task Objects</em>'.
	 * @see ciat.CooperativeTask#getTaskObjects()
	 * @see #getCooperativeTask()
	 * @generated
	 */
	EReference getCooperativeTask_TaskObjects();

	/**
	 * Returns the meta object for class '{@link ciat.CollaborativeTask <em>Collaborative Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Collaborative Task</em>'.
	 * @see ciat.CollaborativeTask
	 * @generated
	 */
	EClass getCollaborativeTask();

	/**
	 * Returns the meta object for the containment reference list '{@link ciat.CollaborativeTask#getTaskRoles <em>Task Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Task Roles</em>'.
	 * @see ciat.CollaborativeTask#getTaskRoles()
	 * @see #getCollaborativeTask()
	 * @generated
	 */
	EReference getCollaborativeTask_TaskRoles();

	/**
	 * Returns the meta object for the containment reference list '{@link ciat.CollaborativeTask#getTaskObjects <em>Task Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Task Objects</em>'.
	 * @see ciat.CollaborativeTask#getTaskObjects()
	 * @see #getCollaborativeTask()
	 * @generated
	 */
	EReference getCollaborativeTask_TaskObjects();

	/**
	 * Returns the meta object for class '{@link ciat.AbstractTask <em>Abstract Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Task</em>'.
	 * @see ciat.AbstractTask
	 * @generated
	 */
	EClass getAbstractTask();

	/**
	 * Returns the meta object for the containment reference list '{@link ciat.AbstractTask#getProcessNodes <em>Process Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Process Nodes</em>'.
	 * @see ciat.AbstractTask#getProcessNodes()
	 * @see #getAbstractTask()
	 * @generated
	 */
	EReference getAbstractTask_ProcessNodes();

	/**
	 * Returns the meta object for class '{@link ciat.Tool <em>Tool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tool</em>'.
	 * @see ciat.Tool
	 * @generated
	 */
	EClass getTool();

	/**
	 * Returns the meta object for the attribute '{@link ciat.Tool#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ciat.Tool#getName()
	 * @see #getTool()
	 * @generated
	 */
	EAttribute getTool_Name();

	/**
	 * Returns the meta object for class '{@link ciat.Object <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object</em>'.
	 * @see ciat.Object
	 * @generated
	 */
	EClass getObject();

	/**
	 * Returns the meta object for the attribute '{@link ciat.Object#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ciat.Object#getName()
	 * @see #getObject()
	 * @generated
	 */
	EAttribute getObject_Name();

	/**
	 * Returns the meta object for the reference '{@link ciat.Object#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Object</em>'.
	 * @see ciat.Object#getObject()
	 * @see #getObject()
	 * @generated
	 */
	EReference getObject_Object();

	/**
	 * Returns the meta object for the attribute '{@link ciat.Object#getModifier <em>Modifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modifier</em>'.
	 * @see ciat.Object#getModifier()
	 * @see #getObject()
	 * @generated
	 */
	EAttribute getObject_Modifier();

	/**
	 * Returns the meta object for the reference '{@link ciat.Object#getModifiedBy <em>Modified By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Modified By</em>'.
	 * @see ciat.Object#getModifiedBy()
	 * @see #getObject()
	 * @generated
	 */
	EReference getObject_ModifiedBy();

	/**
	 * Returns the meta object for class '{@link ciat.TemporalCondition <em>Temporal Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Temporal Condition</em>'.
	 * @see ciat.TemporalCondition
	 * @generated
	 */
	EClass getTemporalCondition();

	/**
	 * Returns the meta object for the attribute '{@link ciat.TemporalCondition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ciat.TemporalCondition#getName()
	 * @see #getTemporalCondition()
	 * @generated
	 */
	EAttribute getTemporalCondition_Name();

	/**
	 * Returns the meta object for class '{@link ciat.Notification <em>Notification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Notification</em>'.
	 * @see ciat.Notification
	 * @generated
	 */
	EClass getNotification();

	/**
	 * Returns the meta object for the attribute '{@link ciat.Notification#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ciat.Notification#getName()
	 * @see #getNotification()
	 * @generated
	 */
	EAttribute getNotification_Name();

	/**
	 * Returns the meta object for class '{@link ciat.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition</em>'.
	 * @see ciat.Condition
	 * @generated
	 */
	EClass getCondition();

	/**
	 * Returns the meta object for the attribute '{@link ciat.Condition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ciat.Condition#getName()
	 * @see #getCondition()
	 * @generated
	 */
	EAttribute getCondition_Name();

	/**
	 * Returns the meta object for class '{@link ciat.DomainDiagram <em>Domain Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain Diagram</em>'.
	 * @see ciat.DomainDiagram
	 * @generated
	 */
	EClass getDomainDiagram();

	/**
	 * Returns the meta object for the attribute '{@link ciat.DomainDiagram#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ciat.DomainDiagram#getName()
	 * @see #getDomainDiagram()
	 * @generated
	 */
	EAttribute getDomainDiagram_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link ciat.DomainDiagram#getSharedContext <em>Shared Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Shared Context</em>'.
	 * @see ciat.DomainDiagram#getSharedContext()
	 * @see #getDomainDiagram()
	 * @generated
	 */
	EReference getDomainDiagram_SharedContext();

	/**
	 * Returns the meta object for class '{@link ciat.SharedObject <em>Shared Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shared Object</em>'.
	 * @see ciat.SharedObject
	 * @generated
	 */
	EClass getSharedObject();

	/**
	 * Returns the meta object for the attribute '{@link ciat.SharedObject#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ciat.SharedObject#getName()
	 * @see #getSharedObject()
	 * @generated
	 */
	EAttribute getSharedObject_Name();

	/**
	 * Returns the meta object for the attribute '{@link ciat.SharedObject#getItsVisualization <em>Its Visualization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Its Visualization</em>'.
	 * @see ciat.SharedObject#getItsVisualization()
	 * @see #getSharedObject()
	 * @generated
	 */
	EAttribute getSharedObject_ItsVisualization();

	/**
	 * Returns the meta object for the reference list '{@link ciat.SharedObject#getIncomings <em>Incomings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incomings</em>'.
	 * @see ciat.SharedObject#getIncomings()
	 * @see #getSharedObject()
	 * @generated
	 */
	EReference getSharedObject_Incomings();

	/**
	 * Returns the meta object for the reference list '{@link ciat.SharedObject#getOutgoings <em>Outgoings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outgoings</em>'.
	 * @see ciat.SharedObject#getOutgoings()
	 * @see #getSharedObject()
	 * @generated
	 */
	EReference getSharedObject_Outgoings();

	/**
	 * Returns the meta object for the containment reference list '{@link ciat.SharedObject#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see ciat.SharedObject#getAttributes()
	 * @see #getSharedObject()
	 * @generated
	 */
	EReference getSharedObject_Attributes();

	/**
	 * Returns the meta object for the containment reference list '{@link ciat.SharedObject#getOperations <em>Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operations</em>'.
	 * @see ciat.SharedObject#getOperations()
	 * @see #getSharedObject()
	 * @generated
	 */
	EReference getSharedObject_Operations();

	/**
	 * Returns the meta object for the containment reference '{@link ciat.SharedObject#getVAreas <em>VAreas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>VAreas</em>'.
	 * @see ciat.SharedObject#getVAreas()
	 * @see #getSharedObject()
	 * @generated
	 */
	EReference getSharedObject_VAreas();

	/**
	 * Returns the meta object for class '{@link ciat.VisualizationArea <em>Visualization Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Visualization Area</em>'.
	 * @see ciat.VisualizationArea
	 * @generated
	 */
	EClass getVisualizationArea();

	/**
	 * Returns the meta object for the attribute '{@link ciat.VisualizationArea#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ciat.VisualizationArea#getName()
	 * @see #getVisualizationArea()
	 * @generated
	 */
	EAttribute getVisualizationArea_Name();

	/**
	 * Returns the meta object for class '{@link ciat.ExclusiveEditionArea <em>Exclusive Edition Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exclusive Edition Area</em>'.
	 * @see ciat.ExclusiveEditionArea
	 * @generated
	 */
	EClass getExclusiveEditionArea();

	/**
	 * Returns the meta object for class '{@link ciat.CollaborativeArea <em>Collaborative Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Collaborative Area</em>'.
	 * @see ciat.CollaborativeArea
	 * @generated
	 */
	EClass getCollaborativeArea();

	/**
	 * Returns the meta object for class '{@link ciat.IndividualArea <em>Individual Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Individual Area</em>'.
	 * @see ciat.IndividualArea
	 * @generated
	 */
	EClass getIndividualArea();

	/**
	 * Returns the meta object for class '{@link ciat.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see ciat.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for the attribute '{@link ciat.Attribute#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ciat.Attribute#getName()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Name();

	/**
	 * Returns the meta object for class '{@link ciat.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation</em>'.
	 * @see ciat.Operation
	 * @generated
	 */
	EClass getOperation();

	/**
	 * Returns the meta object for the attribute '{@link ciat.Operation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ciat.Operation#getName()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_Name();

	/**
	 * Returns the meta object for class '{@link ciat.SharedLink <em>Shared Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shared Link</em>'.
	 * @see ciat.SharedLink
	 * @generated
	 */
	EClass getSharedLink();

	/**
	 * Returns the meta object for the reference '{@link ciat.SharedLink#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see ciat.SharedLink#getSource()
	 * @see #getSharedLink()
	 * @generated
	 */
	EReference getSharedLink_Source();

	/**
	 * Returns the meta object for the reference '{@link ciat.SharedLink#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see ciat.SharedLink#getTarget()
	 * @see #getSharedLink()
	 * @generated
	 */
	EReference getSharedLink_Target();

	/**
	 * Returns the meta object for class '{@link ciat.ShAssociationLink <em>Sh Association Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sh Association Link</em>'.
	 * @see ciat.ShAssociationLink
	 * @generated
	 */
	EClass getShAssociationLink();

	/**
	 * Returns the meta object for class '{@link ciat.ShGeneralizationLink <em>Sh Generalization Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sh Generalization Link</em>'.
	 * @see ciat.ShGeneralizationLink
	 * @generated
	 */
	EClass getShGeneralizationLink();

	/**
	 * Returns the meta object for class '{@link ciat.ShAggregationLink <em>Sh Aggregation Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sh Aggregation Link</em>'.
	 * @see ciat.ShAggregationLink
	 * @generated
	 */
	EClass getShAggregationLink();

	/**
	 * Returns the meta object for class '{@link ciat.CTTDiagram <em>CTT Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CTT Diagram</em>'.
	 * @see ciat.CTTDiagram
	 * @generated
	 */
	EClass getCTTDiagram();

	/**
	 * Returns the meta object for the attribute '{@link ciat.CTTDiagram#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ciat.CTTDiagram#getName()
	 * @see #getCTTDiagram()
	 * @generated
	 */
	EAttribute getCTTDiagram_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link ciat.CTTDiagram#getCttTasks <em>Ctt Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ctt Tasks</em>'.
	 * @see ciat.CTTDiagram#getCttTasks()
	 * @see #getCTTDiagram()
	 * @generated
	 */
	EReference getCTTDiagram_CttTasks();

	/**
	 * Returns the meta object for class '{@link ciat.CTTTask <em>CTT Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CTT Task</em>'.
	 * @see ciat.CTTTask
	 * @generated
	 */
	EClass getCTTTask();

	/**
	 * Returns the meta object for the attribute '{@link ciat.CTTTask#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ciat.CTTTask#getName()
	 * @see #getCTTTask()
	 * @generated
	 */
	EAttribute getCTTTask_Name();

	/**
	 * Returns the meta object for the reference list '{@link ciat.CTTTask#getDependencies <em>Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Dependencies</em>'.
	 * @see ciat.CTTTask#getDependencies()
	 * @see #getCTTTask()
	 * @generated
	 */
	EReference getCTTTask_Dependencies();

	/**
	 * Returns the meta object for class '{@link ciat.ExclusiveEdition <em>Exclusive Edition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exclusive Edition</em>'.
	 * @see ciat.ExclusiveEdition
	 * @generated
	 */
	EClass getExclusiveEdition();

	/**
	 * Returns the meta object for class '{@link ciat.CollaborativeVisualization <em>Collaborative Visualization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Collaborative Visualization</em>'.
	 * @see ciat.CollaborativeVisualization
	 * @generated
	 */
	EClass getCollaborativeVisualization();

	/**
	 * Returns the meta object for class '{@link ciat.IndividualVisualization <em>Individual Visualization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Individual Visualization</em>'.
	 * @see ciat.IndividualVisualization
	 * @generated
	 */
	EClass getIndividualVisualization();

	/**
	 * Returns the meta object for class '{@link ciat.UserTask <em>User Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Task</em>'.
	 * @see ciat.UserTask
	 * @generated
	 */
	EClass getUserTask();

	/**
	 * Returns the meta object for class '{@link ciat.CTTAbstractTask <em>CTT Abstract Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CTT Abstract Task</em>'.
	 * @see ciat.CTTAbstractTask
	 * @generated
	 */
	EClass getCTTAbstractTask();

	/**
	 * Returns the meta object for class '{@link ciat.InteractiveTask <em>Interactive Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interactive Task</em>'.
	 * @see ciat.InteractiveTask
	 * @generated
	 */
	EClass getInteractiveTask();

	/**
	 * Returns the meta object for class '{@link ciat.CTTCollaborativeTask <em>CTT Collaborative Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CTT Collaborative Task</em>'.
	 * @see ciat.CTTCollaborativeTask
	 * @generated
	 */
	EClass getCTTCollaborativeTask();

	/**
	 * Returns the meta object for class '{@link ciat.ApplicationTask <em>Application Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application Task</em>'.
	 * @see ciat.ApplicationTask
	 * @generated
	 */
	EClass getApplicationTask();

	/**
	 * Returns the meta object for class '{@link ciat.DependencyElement <em>Dependency Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dependency Element</em>'.
	 * @see ciat.DependencyElement
	 * @generated
	 */
	EClass getDependencyElement();

	/**
	 * Returns the meta object for class '{@link ciat.Dependency <em>Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dependency</em>'.
	 * @see ciat.Dependency
	 * @generated
	 */
	EClass getDependency();

	/**
	 * Returns the meta object for the reference '{@link ciat.Dependency#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see ciat.Dependency#getSource()
	 * @see #getDependency()
	 * @generated
	 */
	EReference getDependency_Source();

	/**
	 * Returns the meta object for the reference '{@link ciat.Dependency#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see ciat.Dependency#getTarget()
	 * @see #getDependency()
	 * @generated
	 */
	EReference getDependency_Target();

	/**
	 * Returns the meta object for class '{@link ciat.Aggregation <em>Aggregation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aggregation</em>'.
	 * @see ciat.Aggregation
	 * @generated
	 */
	EClass getAggregation();

	/**
	 * Returns the meta object for class '{@link ciat.Enabling <em>Enabling</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enabling</em>'.
	 * @see ciat.Enabling
	 * @generated
	 */
	EClass getEnabling();

	/**
	 * Returns the meta object for the attribute '{@link ciat.Enabling#getELabel <em>ELabel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ELabel</em>'.
	 * @see ciat.Enabling#getELabel()
	 * @see #getEnabling()
	 * @generated
	 */
	EAttribute getEnabling_ELabel();

	/**
	 * Returns the meta object for class '{@link ciat.Disabling <em>Disabling</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Disabling</em>'.
	 * @see ciat.Disabling
	 * @generated
	 */
	EClass getDisabling();

	/**
	 * Returns the meta object for the attribute '{@link ciat.Disabling#getDLabel <em>DLabel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DLabel</em>'.
	 * @see ciat.Disabling#getDLabel()
	 * @see #getDisabling()
	 * @generated
	 */
	EAttribute getDisabling_DLabel();

	/**
	 * Returns the meta object for class '{@link ciat.EnablingWithInformationPassing <em>Enabling With Information Passing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enabling With Information Passing</em>'.
	 * @see ciat.EnablingWithInformationPassing
	 * @generated
	 */
	EClass getEnablingWithInformationPassing();

	/**
	 * Returns the meta object for the attribute '{@link ciat.EnablingWithInformationPassing#getEwLabel <em>Ew Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ew Label</em>'.
	 * @see ciat.EnablingWithInformationPassing#getEwLabel()
	 * @see #getEnablingWithInformationPassing()
	 * @generated
	 */
	EAttribute getEnablingWithInformationPassing_EwLabel();

	/**
	 * Returns the meta object for class '{@link ciat.DisablingWithInformationPassing <em>Disabling With Information Passing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Disabling With Information Passing</em>'.
	 * @see ciat.DisablingWithInformationPassing
	 * @generated
	 */
	EClass getDisablingWithInformationPassing();

	/**
	 * Returns the meta object for the attribute '{@link ciat.DisablingWithInformationPassing#getDwLabel <em>Dw Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dw Label</em>'.
	 * @see ciat.DisablingWithInformationPassing#getDwLabel()
	 * @see #getDisablingWithInformationPassing()
	 * @generated
	 */
	EAttribute getDisablingWithInformationPassing_DwLabel();

	/**
	 * Returns the meta object for class '{@link ciat.IndependentConcurrency <em>Independent Concurrency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Independent Concurrency</em>'.
	 * @see ciat.IndependentConcurrency
	 * @generated
	 */
	EClass getIndependentConcurrency();

	/**
	 * Returns the meta object for the attribute '{@link ciat.IndependentConcurrency#getIcLabel <em>Ic Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ic Label</em>'.
	 * @see ciat.IndependentConcurrency#getIcLabel()
	 * @see #getIndependentConcurrency()
	 * @generated
	 */
	EAttribute getIndependentConcurrency_IcLabel();

	/**
	 * Returns the meta object for class '{@link ciat.OrderIndependence <em>Order Independence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Order Independence</em>'.
	 * @see ciat.OrderIndependence
	 * @generated
	 */
	EClass getOrderIndependence();

	/**
	 * Returns the meta object for the attribute '{@link ciat.OrderIndependence#getOiLabel <em>Oi Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Oi Label</em>'.
	 * @see ciat.OrderIndependence#getOiLabel()
	 * @see #getOrderIndependence()
	 * @generated
	 */
	EAttribute getOrderIndependence_OiLabel();

	/**
	 * Returns the meta object for class '{@link ciat.SuspendResume <em>Suspend Resume</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Suspend Resume</em>'.
	 * @see ciat.SuspendResume
	 * @generated
	 */
	EClass getSuspendResume();

	/**
	 * Returns the meta object for the attribute '{@link ciat.SuspendResume#getSrLabel <em>Sr Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sr Label</em>'.
	 * @see ciat.SuspendResume#getSrLabel()
	 * @see #getSuspendResume()
	 * @generated
	 */
	EAttribute getSuspendResume_SrLabel();

	/**
	 * Returns the meta object for class '{@link ciat.ConcurrencyWithInformationPassing <em>Concurrency With Information Passing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Concurrency With Information Passing</em>'.
	 * @see ciat.ConcurrencyWithInformationPassing
	 * @generated
	 */
	EClass getConcurrencyWithInformationPassing();

	/**
	 * Returns the meta object for the attribute '{@link ciat.ConcurrencyWithInformationPassing#getCLabel <em>CLabel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>CLabel</em>'.
	 * @see ciat.ConcurrencyWithInformationPassing#getCLabel()
	 * @see #getConcurrencyWithInformationPassing()
	 * @generated
	 */
	EAttribute getConcurrencyWithInformationPassing_CLabel();

	/**
	 * Returns the meta object for class '{@link ciat.DeterministicChoice <em>Deterministic Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deterministic Choice</em>'.
	 * @see ciat.DeterministicChoice
	 * @generated
	 */
	EClass getDeterministicChoice();

	/**
	 * Returns the meta object for the attribute '{@link ciat.DeterministicChoice#getDtLabel <em>Dt Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dt Label</em>'.
	 * @see ciat.DeterministicChoice#getDtLabel()
	 * @see #getDeterministicChoice()
	 * @generated
	 */
	EAttribute getDeterministicChoice_DtLabel();

	/**
	 * Returns the meta object for class '{@link ciat.UndeterministicChoice <em>Undeterministic Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Undeterministic Choice</em>'.
	 * @see ciat.UndeterministicChoice
	 * @generated
	 */
	EClass getUndeterministicChoice();

	/**
	 * Returns the meta object for the attribute '{@link ciat.UndeterministicChoice#getUcLabel <em>Uc Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uc Label</em>'.
	 * @see ciat.UndeterministicChoice#getUcLabel()
	 * @see #getUndeterministicChoice()
	 * @generated
	 */
	EAttribute getUndeterministicChoice_UcLabel();

	/**
	 * Returns the meta object for enum '{@link ciat.Visualizations <em>Visualizations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Visualizations</em>'.
	 * @see ciat.Visualizations
	 * @generated
	 */
	EEnum getVisualizations();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CiatFactory getCiatFactory();

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
	interface Literals {
		/**
		 * The meta object literal for the '{@link ciat.impl.CIATDiagramImpl <em>CIAT Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ciat.impl.CIATDiagramImpl
		 * @see ciat.impl.CiatPackageImpl#getCIATDiagram()
		 * @generated
		 */
		EClass CIAT_DIAGRAM = eINSTANCE.getCIATDiagram();

		/**
		 * The meta object literal for the '<em><b>Its Sociograms</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CIAT_DIAGRAM__ITS_SOCIOGRAMS = eINSTANCE.getCIATDiagram_ItsSociograms();

		/**
		 * The meta object literal for the '<em><b>Its Process Diagrams</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CIAT_DIAGRAM__ITS_PROCESS_DIAGRAMS = eINSTANCE.getCIATDiagram_ItsProcessDiagrams();

		/**
		 * The meta object literal for the '<em><b>Its Domain Diagrams</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CIAT_DIAGRAM__ITS_DOMAIN_DIAGRAMS = eINSTANCE.getCIATDiagram_ItsDomainDiagrams();

		/**
		 * The meta object literal for the '<em><b>Its Ctt Diagrams</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CIAT_DIAGRAM__ITS_CTT_DIAGRAMS = eINSTANCE.getCIATDiagram_ItsCttDiagrams();

		/**
		 * The meta object literal for the '<em><b>Its Links</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CIAT_DIAGRAM__ITS_LINKS = eINSTANCE.getCIATDiagram_ItsLinks();

		/**
		 * The meta object literal for the '{@link ciat.impl.LinkImpl <em>Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ciat.impl.LinkImpl
		 * @see ciat.impl.CiatPackageImpl#getLink()
		 * @generated
		 */
		EClass LINK = eINSTANCE.getLink();

		/**
		 * The meta object literal for the '{@link ciat.impl.SociogramImpl <em>Sociogram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ciat.impl.SociogramImpl
		 * @see ciat.impl.CiatPackageImpl#getSociogram()
		 * @generated
		 */
		EClass SOCIOGRAM = eINSTANCE.getSociogram();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOCIOGRAM__NAME = eINSTANCE.getSociogram_Name();

		/**
		 * The meta object literal for the '<em><b>Its Sociogram Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOCIOGRAM__ITS_SOCIOGRAM_NODES = eINSTANCE.getSociogram_ItsSociogramNodes();

		/**
		 * The meta object literal for the '{@link ciat.impl.SociogramNodeImpl <em>Sociogram Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ciat.impl.SociogramNodeImpl
		 * @see ciat.impl.CiatPackageImpl#getSociogramNode()
		 * @generated
		 */
		EClass SOCIOGRAM_NODE = eINSTANCE.getSociogramNode();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOCIOGRAM_NODE__NAME = eINSTANCE.getSociogramNode_Name();

		/**
		 * The meta object literal for the '{@link ciat.impl.RolImpl <em>Rol</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ciat.impl.RolImpl
		 * @see ciat.impl.CiatPackageImpl#getRol()
		 * @generated
		 */
		EClass ROL = eINSTANCE.getRol();

		/**
		 * The meta object literal for the '<em><b>Its Team</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROL__ITS_TEAM = eINSTANCE.getRol_ItsTeam();

		/**
		 * The meta object literal for the '<em><b>Its Actor</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROL__ITS_ACTOR = eINSTANCE.getRol_ItsActor();

		/**
		 * The meta object literal for the '<em><b>Supertype</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROL__SUPERTYPE = eINSTANCE.getRol_Supertype();

		/**
		 * The meta object literal for the '<em><b>Subtype</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROL__SUBTYPE = eINSTANCE.getRol_Subtype();

		/**
		 * The meta object literal for the '{@link ciat.impl.ActorImpl <em>Actor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ciat.impl.ActorImpl
		 * @see ciat.impl.CiatPackageImpl#getActor()
		 * @generated
		 */
		EClass ACTOR = eINSTANCE.getActor();

		/**
		 * The meta object literal for the '<em><b>Its Group</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTOR__ITS_GROUP = eINSTANCE.getActor_ItsGroup();

		/**
		 * The meta object literal for the '<em><b>Acts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTOR__ACTS = eINSTANCE.getActor_Acts();

		/**
		 * The meta object literal for the '{@link ciat.impl.SoftwareAgentImpl <em>Software Agent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ciat.impl.SoftwareAgentImpl
		 * @see ciat.impl.CiatPackageImpl#getSoftwareAgent()
		 * @generated
		 */
		EClass SOFTWARE_AGENT = eINSTANCE.getSoftwareAgent();

		/**
		 * The meta object literal for the '{@link ciat.impl.TeamImpl <em>Team</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ciat.impl.TeamImpl
		 * @see ciat.impl.CiatPackageImpl#getTeam()
		 * @generated
		 */
		EClass TEAM = eINSTANCE.getTeam();

		/**
		 * The meta object literal for the '<em><b>Contains</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEAM__CONTAINS = eINSTANCE.getTeam_Contains();

		/**
		 * The meta object literal for the '{@link ciat.impl.GroupImpl <em>Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ciat.impl.GroupImpl
		 * @see ciat.impl.CiatPackageImpl#getGroup()
		 * @generated
		 */
		EClass GROUP = eINSTANCE.getGroup();

		/**
		 * The meta object literal for the '<em><b>Contains</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP__CONTAINS = eINSTANCE.getGroup_Contains();

		/**
		 * The meta object literal for the '{@link ciat.impl.SociogramLinkImpl <em>Sociogram Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ciat.impl.SociogramLinkImpl
		 * @see ciat.impl.CiatPackageImpl#getSociogramLink()
		 * @generated
		 */
		EClass SOCIOGRAM_LINK = eINSTANCE.getSociogramLink();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOCIOGRAM_LINK__SOURCE = eINSTANCE.getSociogramLink_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOCIOGRAM_LINK__TARGET = eINSTANCE.getSociogramLink_Target();

		/**
		 * The meta object literal for the '{@link ciat.impl.InheritanceImpl <em>Inheritance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ciat.impl.InheritanceImpl
		 * @see ciat.impl.CiatPackageImpl#getInheritance()
		 * @generated
		 */
		EClass INHERITANCE = eINSTANCE.getInheritance();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INHERITANCE__CONDITION = eINSTANCE.getInheritance_Condition();

		/**
		 * The meta object literal for the '{@link ciat.impl.ActingImpl <em>Acting</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ciat.impl.ActingImpl
		 * @see ciat.impl.CiatPackageImpl#getActing()
		 * @generated
		 */
		EClass ACTING = eINSTANCE.getActing();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTING__NAME = eINSTANCE.getActing_Name();

		/**
		 * The meta object literal for the '<em><b>N</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTING__N = eINSTANCE.getActing_N();

		/**
		 * The meta object literal for the '<em><b>M</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTING__M = eINSTANCE.getActing_M();

		/**
		 * The meta object literal for the '{@link ciat.impl.AssociationImpl <em>Association</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ciat.impl.AssociationImpl
		 * @see ciat.impl.CiatPackageImpl#getAssociation()
		 * @generated
		 */
		EClass ASSOCIATION = eINSTANCE.getAssociation();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSOCIATION__NAME = eINSTANCE.getAssociation_Name();

		/**
		 * The meta object literal for the '<em><b>N</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSOCIATION__N = eINSTANCE.getAssociation_N();

		/**
		 * The meta object literal for the '<em><b>M</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSOCIATION__M = eINSTANCE.getAssociation_M();

		/**
		 * The meta object literal for the '{@link ciat.impl.ProcessDiagramImpl <em>Process Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ciat.impl.ProcessDiagramImpl
		 * @see ciat.impl.CiatPackageImpl#getProcessDiagram()
		 * @generated
		 */
		EClass PROCESS_DIAGRAM = eINSTANCE.getProcessDiagram();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS_DIAGRAM__NAME = eINSTANCE.getProcessDiagram_Name();

		/**
		 * The meta object literal for the '<em><b>Process Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_DIAGRAM__PROCESS_NODES = eINSTANCE.getProcessDiagram_ProcessNodes();

		/**
		 * The meta object literal for the '{@link ciat.impl.ProcessNodeImpl <em>Process Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ciat.impl.ProcessNodeImpl
		 * @see ciat.impl.CiatPackageImpl#getProcessNode()
		 * @generated
		 */
		EClass PROCESS_NODE = eINSTANCE.getProcessNode();

		/**
		 * The meta object literal for the '{@link ciat.impl.InitImpl <em>Init</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ciat.impl.InitImpl
		 * @see ciat.impl.CiatPackageImpl#getInit()
		 * @generated
		 */
		EClass INIT = eINSTANCE.getInit();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INIT__NAME = eINSTANCE.getInit_Name();

		/**
		 * The meta object literal for the '{@link ciat.impl.EndImpl <em>End</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ciat.impl.EndImpl
		 * @see ciat.impl.CiatPackageImpl#getEnd()
		 * @generated
		 */
		EClass END = eINSTANCE.getEnd();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute END__NAME = eINSTANCE.getEnd_Name();

		/**
		 * The meta object literal for the '{@link ciat.impl.SimpleTaskImpl <em>Simple Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ciat.impl.SimpleTaskImpl
		 * @see ciat.impl.CiatPackageImpl#getSimpleTask()
		 * @generated
		 */
		EClass SIMPLE_TASK = eINSTANCE.getSimpleTask();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_TASK__NAME = eINSTANCE.getSimpleTask_Name();

		/**
		 * The meta object literal for the '<em><b>Tools</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_TASK__TOOLS = eINSTANCE.getSimpleTask_Tools();

		/**
		 * The meta object literal for the '{@link ciat.impl.IndividualTaskImpl <em>Individual Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ciat.impl.IndividualTaskImpl
		 * @see ciat.impl.CiatPackageImpl#getIndividualTask()
		 * @generated
		 */
		EClass INDIVIDUAL_TASK = eINSTANCE.getIndividualTask();

		/**
		 * The meta object literal for the '<em><b>Task Roles</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INDIVIDUAL_TASK__TASK_ROLES = eINSTANCE.getIndividualTask_TaskRoles();

		/**
		 * The meta object literal for the '<em><b>Task Objects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INDIVIDUAL_TASK__TASK_OBJECTS = eINSTANCE.getIndividualTask_TaskObjects();

		/**
		 * The meta object literal for the '{@link ciat.impl.CooperativeTaskImpl <em>Cooperative Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ciat.impl.CooperativeTaskImpl
		 * @see ciat.impl.CiatPackageImpl#getCooperativeTask()
		 * @generated
		 */
		EClass COOPERATIVE_TASK = eINSTANCE.getCooperativeTask();

		/**
		 * The meta object literal for the '<em><b>Task Roles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COOPERATIVE_TASK__TASK_ROLES = eINSTANCE.getCooperativeTask_TaskRoles();

		/**
		 * The meta object literal for the '<em><b>Task Objects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COOPERATIVE_TASK__TASK_OBJECTS = eINSTANCE.getCooperativeTask_TaskObjects();

		/**
		 * The meta object literal for the '{@link ciat.impl.CollaborativeTaskImpl <em>Collaborative Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ciat.impl.CollaborativeTaskImpl
		 * @see ciat.impl.CiatPackageImpl#getCollaborativeTask()
		 * @generated
		 */
		EClass COLLABORATIVE_TASK = eINSTANCE.getCollaborativeTask();

		/**
		 * The meta object literal for the '<em><b>Task Roles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLABORATIVE_TASK__TASK_ROLES = eINSTANCE.getCollaborativeTask_TaskRoles();

		/**
		 * The meta object literal for the '<em><b>Task Objects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLABORATIVE_TASK__TASK_OBJECTS = eINSTANCE.getCollaborativeTask_TaskObjects();

		/**
		 * The meta object literal for the '{@link ciat.impl.AbstractTaskImpl <em>Abstract Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ciat.impl.AbstractTaskImpl
		 * @see ciat.impl.CiatPackageImpl#getAbstractTask()
		 * @generated
		 */
		EClass ABSTRACT_TASK = eINSTANCE.getAbstractTask();

		/**
		 * The meta object literal for the '<em><b>Process Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_TASK__PROCESS_NODES = eINSTANCE.getAbstractTask_ProcessNodes();

		/**
		 * The meta object literal for the '{@link ciat.impl.ToolImpl <em>Tool</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ciat.impl.ToolImpl
		 * @see ciat.impl.CiatPackageImpl#getTool()
		 * @generated
		 */
		EClass TOOL = eINSTANCE.getTool();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOOL__NAME = eINSTANCE.getTool_Name();

		/**
		 * The meta object literal for the '{@link ciat.impl.ObjectImpl <em>Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ciat.impl.ObjectImpl
		 * @see ciat.impl.CiatPackageImpl#getObject()
		 * @generated
		 */
		EClass OBJECT = eINSTANCE.getObject();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT__NAME = eINSTANCE.getObject_Name();

		/**
		 * The meta object literal for the '<em><b>Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT__OBJECT = eINSTANCE.getObject_Object();

		/**
		 * The meta object literal for the '<em><b>Modifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT__MODIFIER = eINSTANCE.getObject_Modifier();

		/**
		 * The meta object literal for the '<em><b>Modified By</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT__MODIFIED_BY = eINSTANCE.getObject_ModifiedBy();

		/**
		 * The meta object literal for the '{@link ciat.impl.TemporalConditionImpl <em>Temporal Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ciat.impl.TemporalConditionImpl
		 * @see ciat.impl.CiatPackageImpl#getTemporalCondition()
		 * @generated
		 */
		EClass TEMPORAL_CONDITION = eINSTANCE.getTemporalCondition();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEMPORAL_CONDITION__NAME = eINSTANCE.getTemporalCondition_Name();

		/**
		 * The meta object literal for the '{@link ciat.impl.NotificationImpl <em>Notification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ciat.impl.NotificationImpl
		 * @see ciat.impl.CiatPackageImpl#getNotification()
		 * @generated
		 */
		EClass NOTIFICATION = eINSTANCE.getNotification();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTIFICATION__NAME = eINSTANCE.getNotification_Name();

		/**
		 * The meta object literal for the '{@link ciat.impl.ConditionImpl <em>Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ciat.impl.ConditionImpl
		 * @see ciat.impl.CiatPackageImpl#getCondition()
		 * @generated
		 */
		EClass CONDITION = eINSTANCE.getCondition();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITION__NAME = eINSTANCE.getCondition_Name();

		/**
		 * The meta object literal for the '{@link ciat.impl.DomainDiagramImpl <em>Domain Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ciat.impl.DomainDiagramImpl
		 * @see ciat.impl.CiatPackageImpl#getDomainDiagram()
		 * @generated
		 */
		EClass DOMAIN_DIAGRAM = eINSTANCE.getDomainDiagram();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN_DIAGRAM__NAME = eINSTANCE.getDomainDiagram_Name();

		/**
		 * The meta object literal for the '<em><b>Shared Context</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_DIAGRAM__SHARED_CONTEXT = eINSTANCE.getDomainDiagram_SharedContext();

		/**
		 * The meta object literal for the '{@link ciat.impl.SharedObjectImpl <em>Shared Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ciat.impl.SharedObjectImpl
		 * @see ciat.impl.CiatPackageImpl#getSharedObject()
		 * @generated
		 */
		EClass SHARED_OBJECT = eINSTANCE.getSharedObject();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHARED_OBJECT__NAME = eINSTANCE.getSharedObject_Name();

		/**
		 * The meta object literal for the '<em><b>Its Visualization</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHARED_OBJECT__ITS_VISUALIZATION = eINSTANCE.getSharedObject_ItsVisualization();

		/**
		 * The meta object literal for the '<em><b>Incomings</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHARED_OBJECT__INCOMINGS = eINSTANCE.getSharedObject_Incomings();

		/**
		 * The meta object literal for the '<em><b>Outgoings</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHARED_OBJECT__OUTGOINGS = eINSTANCE.getSharedObject_Outgoings();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHARED_OBJECT__ATTRIBUTES = eINSTANCE.getSharedObject_Attributes();

		/**
		 * The meta object literal for the '<em><b>Operations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHARED_OBJECT__OPERATIONS = eINSTANCE.getSharedObject_Operations();

		/**
		 * The meta object literal for the '<em><b>VAreas</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHARED_OBJECT__VAREAS = eINSTANCE.getSharedObject_VAreas();

		/**
		 * The meta object literal for the '{@link ciat.impl.VisualizationAreaImpl <em>Visualization Area</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ciat.impl.VisualizationAreaImpl
		 * @see ciat.impl.CiatPackageImpl#getVisualizationArea()
		 * @generated
		 */
		EClass VISUALIZATION_AREA = eINSTANCE.getVisualizationArea();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VISUALIZATION_AREA__NAME = eINSTANCE.getVisualizationArea_Name();

		/**
		 * The meta object literal for the '{@link ciat.impl.ExclusiveEditionAreaImpl <em>Exclusive Edition Area</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ciat.impl.ExclusiveEditionAreaImpl
		 * @see ciat.impl.CiatPackageImpl#getExclusiveEditionArea()
		 * @generated
		 */
		EClass EXCLUSIVE_EDITION_AREA = eINSTANCE.getExclusiveEditionArea();

		/**
		 * The meta object literal for the '{@link ciat.impl.CollaborativeAreaImpl <em>Collaborative Area</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ciat.impl.CollaborativeAreaImpl
		 * @see ciat.impl.CiatPackageImpl#getCollaborativeArea()
		 * @generated
		 */
		EClass COLLABORATIVE_AREA = eINSTANCE.getCollaborativeArea();

		/**
		 * The meta object literal for the '{@link ciat.impl.IndividualAreaImpl <em>Individual Area</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ciat.impl.IndividualAreaImpl
		 * @see ciat.impl.CiatPackageImpl#getIndividualArea()
		 * @generated
		 */
		EClass INDIVIDUAL_AREA = eINSTANCE.getIndividualArea();

		/**
		 * The meta object literal for the '{@link ciat.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ciat.impl.AttributeImpl
		 * @see ciat.impl.CiatPackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__NAME = eINSTANCE.getAttribute_Name();

		/**
		 * The meta object literal for the '{@link ciat.impl.OperationImpl <em>Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ciat.impl.OperationImpl
		 * @see ciat.impl.CiatPackageImpl#getOperation()
		 * @generated
		 */
		EClass OPERATION = eINSTANCE.getOperation();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__NAME = eINSTANCE.getOperation_Name();

		/**
		 * The meta object literal for the '{@link ciat.impl.SharedLinkImpl <em>Shared Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ciat.impl.SharedLinkImpl
		 * @see ciat.impl.CiatPackageImpl#getSharedLink()
		 * @generated
		 */
		EClass SHARED_LINK = eINSTANCE.getSharedLink();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHARED_LINK__SOURCE = eINSTANCE.getSharedLink_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHARED_LINK__TARGET = eINSTANCE.getSharedLink_Target();

		/**
		 * The meta object literal for the '{@link ciat.impl.ShAssociationLinkImpl <em>Sh Association Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ciat.impl.ShAssociationLinkImpl
		 * @see ciat.impl.CiatPackageImpl#getShAssociationLink()
		 * @generated
		 */
		EClass SH_ASSOCIATION_LINK = eINSTANCE.getShAssociationLink();

		/**
		 * The meta object literal for the '{@link ciat.impl.ShGeneralizationLinkImpl <em>Sh Generalization Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ciat.impl.ShGeneralizationLinkImpl
		 * @see ciat.impl.CiatPackageImpl#getShGeneralizationLink()
		 * @generated
		 */
		EClass SH_GENERALIZATION_LINK = eINSTANCE.getShGeneralizationLink();

		/**
		 * The meta object literal for the '{@link ciat.impl.ShAggregationLinkImpl <em>Sh Aggregation Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ciat.impl.ShAggregationLinkImpl
		 * @see ciat.impl.CiatPackageImpl#getShAggregationLink()
		 * @generated
		 */
		EClass SH_AGGREGATION_LINK = eINSTANCE.getShAggregationLink();

		/**
		 * The meta object literal for the '{@link ciat.impl.CTTDiagramImpl <em>CTT Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ciat.impl.CTTDiagramImpl
		 * @see ciat.impl.CiatPackageImpl#getCTTDiagram()
		 * @generated
		 */
		EClass CTT_DIAGRAM = eINSTANCE.getCTTDiagram();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CTT_DIAGRAM__NAME = eINSTANCE.getCTTDiagram_Name();

		/**
		 * The meta object literal for the '<em><b>Ctt Tasks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CTT_DIAGRAM__CTT_TASKS = eINSTANCE.getCTTDiagram_CttTasks();

		/**
		 * The meta object literal for the '{@link ciat.impl.CTTTaskImpl <em>CTT Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ciat.impl.CTTTaskImpl
		 * @see ciat.impl.CiatPackageImpl#getCTTTask()
		 * @generated
		 */
		EClass CTT_TASK = eINSTANCE.getCTTTask();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CTT_TASK__NAME = eINSTANCE.getCTTTask_Name();

		/**
		 * The meta object literal for the '<em><b>Dependencies</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CTT_TASK__DEPENDENCIES = eINSTANCE.getCTTTask_Dependencies();

		/**
		 * The meta object literal for the '{@link ciat.impl.ExclusiveEditionImpl <em>Exclusive Edition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ciat.impl.ExclusiveEditionImpl
		 * @see ciat.impl.CiatPackageImpl#getExclusiveEdition()
		 * @generated
		 */
		EClass EXCLUSIVE_EDITION = eINSTANCE.getExclusiveEdition();

		/**
		 * The meta object literal for the '{@link ciat.impl.CollaborativeVisualizationImpl <em>Collaborative Visualization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ciat.impl.CollaborativeVisualizationImpl
		 * @see ciat.impl.CiatPackageImpl#getCollaborativeVisualization()
		 * @generated
		 */
		EClass COLLABORATIVE_VISUALIZATION = eINSTANCE.getCollaborativeVisualization();

		/**
		 * The meta object literal for the '{@link ciat.impl.IndividualVisualizationImpl <em>Individual Visualization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ciat.impl.IndividualVisualizationImpl
		 * @see ciat.impl.CiatPackageImpl#getIndividualVisualization()
		 * @generated
		 */
		EClass INDIVIDUAL_VISUALIZATION = eINSTANCE.getIndividualVisualization();

		/**
		 * The meta object literal for the '{@link ciat.impl.UserTaskImpl <em>User Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ciat.impl.UserTaskImpl
		 * @see ciat.impl.CiatPackageImpl#getUserTask()
		 * @generated
		 */
		EClass USER_TASK = eINSTANCE.getUserTask();

		/**
		 * The meta object literal for the '{@link ciat.impl.CTTAbstractTaskImpl <em>CTT Abstract Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ciat.impl.CTTAbstractTaskImpl
		 * @see ciat.impl.CiatPackageImpl#getCTTAbstractTask()
		 * @generated
		 */
		EClass CTT_ABSTRACT_TASK = eINSTANCE.getCTTAbstractTask();

		/**
		 * The meta object literal for the '{@link ciat.impl.InteractiveTaskImpl <em>Interactive Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ciat.impl.InteractiveTaskImpl
		 * @see ciat.impl.CiatPackageImpl#getInteractiveTask()
		 * @generated
		 */
		EClass INTERACTIVE_TASK = eINSTANCE.getInteractiveTask();

		/**
		 * The meta object literal for the '{@link ciat.impl.CTTCollaborativeTaskImpl <em>CTT Collaborative Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ciat.impl.CTTCollaborativeTaskImpl
		 * @see ciat.impl.CiatPackageImpl#getCTTCollaborativeTask()
		 * @generated
		 */
		EClass CTT_COLLABORATIVE_TASK = eINSTANCE.getCTTCollaborativeTask();

		/**
		 * The meta object literal for the '{@link ciat.impl.ApplicationTaskImpl <em>Application Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ciat.impl.ApplicationTaskImpl
		 * @see ciat.impl.CiatPackageImpl#getApplicationTask()
		 * @generated
		 */
		EClass APPLICATION_TASK = eINSTANCE.getApplicationTask();

		/**
		 * The meta object literal for the '{@link ciat.impl.DependencyElementImpl <em>Dependency Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ciat.impl.DependencyElementImpl
		 * @see ciat.impl.CiatPackageImpl#getDependencyElement()
		 * @generated
		 */
		EClass DEPENDENCY_ELEMENT = eINSTANCE.getDependencyElement();

		/**
		 * The meta object literal for the '{@link ciat.impl.DependencyImpl <em>Dependency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ciat.impl.DependencyImpl
		 * @see ciat.impl.CiatPackageImpl#getDependency()
		 * @generated
		 */
		EClass DEPENDENCY = eINSTANCE.getDependency();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPENDENCY__SOURCE = eINSTANCE.getDependency_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPENDENCY__TARGET = eINSTANCE.getDependency_Target();

		/**
		 * The meta object literal for the '{@link ciat.impl.AggregationImpl <em>Aggregation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ciat.impl.AggregationImpl
		 * @see ciat.impl.CiatPackageImpl#getAggregation()
		 * @generated
		 */
		EClass AGGREGATION = eINSTANCE.getAggregation();

		/**
		 * The meta object literal for the '{@link ciat.impl.EnablingImpl <em>Enabling</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ciat.impl.EnablingImpl
		 * @see ciat.impl.CiatPackageImpl#getEnabling()
		 * @generated
		 */
		EClass ENABLING = eINSTANCE.getEnabling();

		/**
		 * The meta object literal for the '<em><b>ELabel</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENABLING__ELABEL = eINSTANCE.getEnabling_ELabel();

		/**
		 * The meta object literal for the '{@link ciat.impl.DisablingImpl <em>Disabling</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ciat.impl.DisablingImpl
		 * @see ciat.impl.CiatPackageImpl#getDisabling()
		 * @generated
		 */
		EClass DISABLING = eINSTANCE.getDisabling();

		/**
		 * The meta object literal for the '<em><b>DLabel</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISABLING__DLABEL = eINSTANCE.getDisabling_DLabel();

		/**
		 * The meta object literal for the '{@link ciat.impl.EnablingWithInformationPassingImpl <em>Enabling With Information Passing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ciat.impl.EnablingWithInformationPassingImpl
		 * @see ciat.impl.CiatPackageImpl#getEnablingWithInformationPassing()
		 * @generated
		 */
		EClass ENABLING_WITH_INFORMATION_PASSING = eINSTANCE.getEnablingWithInformationPassing();

		/**
		 * The meta object literal for the '<em><b>Ew Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENABLING_WITH_INFORMATION_PASSING__EW_LABEL = eINSTANCE.getEnablingWithInformationPassing_EwLabel();

		/**
		 * The meta object literal for the '{@link ciat.impl.DisablingWithInformationPassingImpl <em>Disabling With Information Passing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ciat.impl.DisablingWithInformationPassingImpl
		 * @see ciat.impl.CiatPackageImpl#getDisablingWithInformationPassing()
		 * @generated
		 */
		EClass DISABLING_WITH_INFORMATION_PASSING = eINSTANCE.getDisablingWithInformationPassing();

		/**
		 * The meta object literal for the '<em><b>Dw Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISABLING_WITH_INFORMATION_PASSING__DW_LABEL = eINSTANCE.getDisablingWithInformationPassing_DwLabel();

		/**
		 * The meta object literal for the '{@link ciat.impl.IndependentConcurrencyImpl <em>Independent Concurrency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ciat.impl.IndependentConcurrencyImpl
		 * @see ciat.impl.CiatPackageImpl#getIndependentConcurrency()
		 * @generated
		 */
		EClass INDEPENDENT_CONCURRENCY = eINSTANCE.getIndependentConcurrency();

		/**
		 * The meta object literal for the '<em><b>Ic Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INDEPENDENT_CONCURRENCY__IC_LABEL = eINSTANCE.getIndependentConcurrency_IcLabel();

		/**
		 * The meta object literal for the '{@link ciat.impl.OrderIndependenceImpl <em>Order Independence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ciat.impl.OrderIndependenceImpl
		 * @see ciat.impl.CiatPackageImpl#getOrderIndependence()
		 * @generated
		 */
		EClass ORDER_INDEPENDENCE = eINSTANCE.getOrderIndependence();

		/**
		 * The meta object literal for the '<em><b>Oi Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_INDEPENDENCE__OI_LABEL = eINSTANCE.getOrderIndependence_OiLabel();

		/**
		 * The meta object literal for the '{@link ciat.impl.SuspendResumeImpl <em>Suspend Resume</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ciat.impl.SuspendResumeImpl
		 * @see ciat.impl.CiatPackageImpl#getSuspendResume()
		 * @generated
		 */
		EClass SUSPEND_RESUME = eINSTANCE.getSuspendResume();

		/**
		 * The meta object literal for the '<em><b>Sr Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUSPEND_RESUME__SR_LABEL = eINSTANCE.getSuspendResume_SrLabel();

		/**
		 * The meta object literal for the '{@link ciat.impl.ConcurrencyWithInformationPassingImpl <em>Concurrency With Information Passing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ciat.impl.ConcurrencyWithInformationPassingImpl
		 * @see ciat.impl.CiatPackageImpl#getConcurrencyWithInformationPassing()
		 * @generated
		 */
		EClass CONCURRENCY_WITH_INFORMATION_PASSING = eINSTANCE.getConcurrencyWithInformationPassing();

		/**
		 * The meta object literal for the '<em><b>CLabel</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONCURRENCY_WITH_INFORMATION_PASSING__CLABEL = eINSTANCE.getConcurrencyWithInformationPassing_CLabel();

		/**
		 * The meta object literal for the '{@link ciat.impl.DeterministicChoiceImpl <em>Deterministic Choice</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ciat.impl.DeterministicChoiceImpl
		 * @see ciat.impl.CiatPackageImpl#getDeterministicChoice()
		 * @generated
		 */
		EClass DETERMINISTIC_CHOICE = eINSTANCE.getDeterministicChoice();

		/**
		 * The meta object literal for the '<em><b>Dt Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DETERMINISTIC_CHOICE__DT_LABEL = eINSTANCE.getDeterministicChoice_DtLabel();

		/**
		 * The meta object literal for the '{@link ciat.impl.UndeterministicChoiceImpl <em>Undeterministic Choice</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ciat.impl.UndeterministicChoiceImpl
		 * @see ciat.impl.CiatPackageImpl#getUndeterministicChoice()
		 * @generated
		 */
		EClass UNDETERMINISTIC_CHOICE = eINSTANCE.getUndeterministicChoice();

		/**
		 * The meta object literal for the '<em><b>Uc Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNDETERMINISTIC_CHOICE__UC_LABEL = eINSTANCE.getUndeterministicChoice_UcLabel();

		/**
		 * The meta object literal for the '{@link ciat.Visualizations <em>Visualizations</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ciat.Visualizations
		 * @see ciat.impl.CiatPackageImpl#getVisualizations()
		 * @generated
		 */
		EEnum VISUALIZATIONS = eINSTANCE.getVisualizations();

	}

} //CiatPackage

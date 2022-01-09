/**
 * File: NodeMultiple.java
 * Creation: 7 nov. 2020, Jean-Philippe.Prost@univ-amu.fr
 * Template étudiants
 */
package pracHDVELH;

import myUtils.ErrorNaiveHandler;

/**
 * @author prost
 *
 */

public class NodeMultiple {
	public static final int ERROR_STATUS_INDEX_OUT_OF_RANGE = -1;
	public static final String ERROR_MSG_INDEX_OUT_OF_RANGE = "Index out of range";
	public static int NODE_MAX_ARITY = 10;
	private Object data;
	private NodeMultiple[] daughters;

	/* Overridden methods */
	@Override
	public String toString() {
		return data.toString();
	}

	/* Getters/Setters */
	/**
	 * Gets the {@code i}th daughter node.
	 *
	 * Aborts if the given index {@code i} is out of range.
	 *
	 * @param i the index of the daughter node.
	 * @return the {@code i}th daughter node, or {@code null} if it does not exist.
	 */
<<<<<<< HEAD

	public NodeMultiple getDaughter(int i) {
		if (i>daughters.length) return null;
=======
	
	public NodeMultiple getDaughter(int i) {		
		if (i>daughters.length) return null;	
>>>>>>> 4b762bf2d0d6ca69c9bc4ea8d80b5b6e78279d8e
		return daughters[i];
	}

	/**
	 * Sets the {@code i}th daughter node to the input parameter {@code daughter}.
	 * Should be used cautiously, since {@code i} may not be the first index
	 * available (i.e. there may be lower indexes which do not refer to any
	 * daughter).
	 *
	 * If a daughter node is already referred to at this index then it is erased
	 * with {@code daughter}.
	 *
	 * Aborts if the index {@code i} is out of range.
	 *
	 * @param daughter the node to be linked as a daughter of {@code this} node.
	 * @param i        the daughter node's index
	 */
	public void setDaughter(NodeMultiple daughter, int i) {
<<<<<<< HEAD
		daughters[i]= daughter;
=======
		daughters[i]= daughter;		
>>>>>>> 4b762bf2d0d6ca69c9bc4ea8d80b5b6e78279d8e
	}

	/**
	 * @return all the daughters
	 */
<<<<<<< HEAD
	public NodeMultiple[] getDaughters() {
		return daughters;
=======
	public NodeMultiple[] getDaughters() {		
			return daughters;		
>>>>>>> 4b762bf2d0d6ca69c9bc4ea8d80b5b6e78279d8e
	}

	/**
	 * @param daughters the daughters to set
	 */
	public void setDaughters(NodeMultiple[] daughters) {
		this.daughters = daughters;
	}

	/**
	 * Adds the given {@code daughter} node at the first available index.
	 *
	 * If the max number of daughters ({@link #NODE_MAX_ARITY}) is already reached
	 * nothing happens (no abort).
	 *
	 * @param daughter
	 */
	public void addDaughter(NodeMultiple daughter) {
		if (daughter == null) return;
		int i=0;
		while(i < NODE_MAX_ARITY && daughters[i] != null)
		{++i;}
		if (i>NODE_MAX_ARITY)return;
		daughters[i]= daughter;
	}

	/**
	 * @return the content data
	 */
	public Object getData() {
		return this.data;
	}

	/**
	 * @param data
	 */
	public void setData(Object data) {
		this.data = data;
	}

	/**
	 * @return {@code true} if and only if this node has at least one non-null
	 *         daughter node.
	 */
	public boolean hasDaughters() {
		if(daughters == null)return false;
		return true;
	}

	/* Constructors */
	/**
	 * Default constructor.
	 */
	public NodeMultiple() {
		super(); /* appel au constructeur parent */
		data = new Object();
		daughters = new NodeMultiple [NODE_MAX_ARITY];
	}

	/**
	 * Constructor. Sets the content data to {@code data} and creates an empty set
	 * of daughters.
	 *
	 * @param data
	 */
	public NodeMultiple(Object data) {
		this.data = data;
		daughters = new NodeMultiple [NODE_MAX_ARITY];
	}
<<<<<<< HEAD

=======
	
>>>>>>> 4b762bf2d0d6ca69c9bc4ea8d80b5b6e78279d8e
}

// eof

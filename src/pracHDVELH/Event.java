/**
 * File: NodeMultipleEvents.java
 * Creation: 7 nov. 2020, Jean-Philippe.Prost@univ-amu.fr
 * Template étudiants
 */
package pracHDVELH;

import java.util.Scanner;

import myUtils.ErrorNaiveHandler;

/**
 * @author prost
 *
 */
public class Event extends NodeMultiple {
	public static final String ERROR_MSG_UNEXPECTED_END = "Sorry, for some unexpected reason the story ends here...";
	public static final String PROMPT_ANSWER = "Answer: ";
	public static final String WARNING_MSG_INTEGER_EXPECTED = "Please input a integer within range!";
	private Scanner reader;
	private String playerAnswer;
	private int chosenPath;
	private GUIManager gui;
	private String data;
	private int id;
	private static int lastId=0;

<<<<<<< HEAD

=======
	
>>>>>>> 4b762bf2d0d6ca69c9bc4ea8d80b5b6e78279d8e
	public Event(GUIManager gui, String data) {
		super(data);
		this.gui = gui;
		//this.data = data;
<<<<<<< HEAD

=======
		
>>>>>>> 4b762bf2d0d6ca69c9bc4ea8d80b5b6e78279d8e
		reader = gui.getInputReader();
		id = ++ lastId;
	}
	public Event() {
		this(new GUIManager(), null);
	};
	/**
	 * @return the playerAnswer
	 */
	public String getPlayerAnswer() {
		return playerAnswer;
	}

	/**
	 * @param playerAnswer the playerAnswer to set
	 */
	public void setPlayerAnswer(String playerAnswer) {
		this.playerAnswer = playerAnswer;
	}

	/**
	 * @return the reader
	 */
	public Scanner getReader() {
		return reader;
	}

	/**
	 * @param reader the reader to set
	 */
	public void setReader(Scanner reader) {
		this.reader = reader;
	}

	/**
	 * @return the chosenPath
	 */
	public int getChosenPath() {
		return chosenPath;
	}

	/**
	 * @param chosenPath the chosenPath to set
	 */
	public void setChosenPath(int chosenPath) {
		this.chosenPath= chosenPath;
	}

	/* Methods */
	/**
	 * @see pracHDVELH.NodeMultiple#getData()
	 */
	public String getData() {
		return data;
	}

	/**
	 * @see pracHDVELH.NodeMultiple#setData(Object)
	 * @param data
	 */
	public void setData(String data) {
		this.data = data;
	}

	/**
	 * @see pracHDVELH.NodeMultiple#getDaughter(int)
	 */
	@Override
	public Event getDaughter(int i) {
<<<<<<< HEAD

=======
		
>>>>>>> 4b762bf2d0d6ca69c9bc4ea8d80b5b6e78279d8e
		return (Event) super.getDaughter(i);
	}

	/**
	 * @see pracHDVELH.NodeMultiple#setDaughter(NodeMultiple, int)
	 * @param daughter
	 * @param i
	 */
	public void setDaughter(Event daughter, int i) {
		getDaughters()[i]=daughter;
	}

	/**
	 * @return the gui
	 */
	public GUIManager getGui() {
		return gui;
	}

	/**
	 * @param gui the gui to set
	 */
	public void setGui(GUIManager gui) {
		this.gui = gui;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
<<<<<<< HEAD
	}

	public int interpretAnswer(String playerAnswer) {
		return Integer.parseInt(playerAnswer)-1;
=======
>>>>>>> 4b762bf2d0d6ca69c9bc4ea8d80b5b6e78279d8e
	}
	
	public int interpretAnswer(String playerAnswer) {
		return Integer.parseInt(playerAnswer)-1;
	}
	
	/* Methods */
	/* TO BE COMPLETED */
<<<<<<< HEAD
	public Event run() {
=======
	public Event run() {		
>>>>>>> 4b762bf2d0d6ca69c9bc4ea8d80b5b6e78279d8e
		gui.outputln(this.toString());
		gui.output(PROMPT_ANSWER);
		playerAnswer=reader.next();
		//interpretAnswer(playerAnswer);
		chosenPath = interpretAnswer(playerAnswer);
		return getDaughter(chosenPath);
<<<<<<< HEAD
		//exposé de la situation
=======
		//exposé de la situation		
>>>>>>> 4b762bf2d0d6ca69c9bc4ea8d80b5b6e78279d8e
		//réponse du joueur
		//interpréter réponse
		//appel de l'événement suivant
	}
}

// eof

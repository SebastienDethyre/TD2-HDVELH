package pracHDVELH;

import java.util.Scanner;

public class EventExactSolution extends Event {

    public static final String ERROR_MSG_UNEXPECTED_END = "Sorry, for some unexpected reason the story ends here...";
    public static final String PROMPT_ANSWER = "Answer: ";
    public static final String WARNING_MSG_INTEGER_EXPECTED = "Please input a integer within range!";
    private Scanner reader;
    private String playerAnswer;
    //private int chosenPath;
    private GUIManager gui;
    private String data;
    private int id;
    private static int lastId=0;
    private Event daughters[];
    private String pi;
    
    public EventExactSolution(GUIManager gui, String data, String answer) {
        super(gui, data);
       // this.gui = gui;
        //this.data = data;
        this.pi=answer;
        reader = gui.getInputReader();
        id = ++ lastId;
        
    }
    public int interpretAnswer(String playerAnswer) {
		if (playerAnswer.toString()==pi){
			System.out.print("yes");
			return 1;
		}
		else {
			System.out.print("no");
	    return 1;
		}
		
		
	
	}
   // public EventExactSolution() {
        //super(gui, data);
        // TODO Auto-generated constructor stub
    //}

    //public EventExactSolution(GUIManager gui, String string, String string2) {
        // TODO Auto-generated constructor stub
    //}

}


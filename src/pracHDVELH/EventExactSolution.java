package pracHDVELH;

import java.util.Scanner;

public class EventExactSolution extends Event {

    public static final String ERROR_MSG_UNEXPECTED_END = "Sorry, for some unexpected reason the story ends here...";
    public static final String PROMPT_ANSWER = "Answer: ";
    public static final String WARNING_MSG_INTEGER_EXPECTED = "Please input a integer within range!";
   // private Scanner reader;
    private String value;
    //private int chosenPath;
    //private GUIManager gui;
   // private String data;
   // private int id;
    //private static int lastId=0;
    //private Event daughters[];
    //private String pi;
    
    public EventExactSolution() {
 	   this(new GUIManager(),null,null);
    }
    
    public EventExactSolution(GUIManager gui, String data, String value) {
        super(gui, data);
       // this.gui = gui;
        //this.data = data;
        //playerAnswer=answer;
        this.value= value;
        //reader = gui.getInputReader();
        //id = ++ lastId;
        
    }
    public int interpretAnswer() {
		if (value.equals(super.getReader().next())){
			System.out.print("yes");
			return 0;
		}
		else {
			
			return 1;
		}
		
		
	
	}
   

  

}


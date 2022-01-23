package pracHDVELH;

import java.util.Scanner;

public class EventExactSolution extends Event {

    public static final String ERROR_MSG_UNEXPECTED_END = "Sorry, for some unexpected reason the story ends here...";
    public static final String PROMPT_ANSWER = "Answer: ";
    public static final String WARNING_MSG_INTEGER_EXPECTED = "Please input a integer within range!";
   // private Scanner reader;
    private String value;
    
    
    public EventExactSolution() {
 	   this(new GUIManager(),null,null);
    }
    
    public EventExactSolution(GUIManager gui, String data, String value) {
        super(gui, data);
       
        this.value= value;
        
        
    }
    public int interpretAnswer(String playerAnswer) {
		if (value.equals(playerAnswer)){
			return 0;
		}
		else {
			return 1;
		}
	}
}


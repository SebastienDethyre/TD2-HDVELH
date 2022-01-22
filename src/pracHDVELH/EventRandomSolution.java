package pracHDVELH;
import java.util.Random;

public class EventRandomSolution extends Event {
	private static final int ERROR_STATUS_BAD_SETTINGS =-1;
	private static final int DEFAULT_RANDOM_SOLUTION = 0;
	private static final String ERROR_MSG_BAD_SETTINGS = "Bad settings";
	private int dice;
	private int randomSolution;
	private Random randomGenerator;
	private int [] partition; 
	private String waitingMsg;
	private String solutionAnnoucement;
	
	public EventRandomSolution() {
		this (new GUIManager(),null, new int[]{1,2,3,4,5,6}, null, null);
	}

	public EventRandomSolution(GUIManager gui, String data, int[] partition, String waitingMsg, String solutionAnnoucement) {
		super(gui,data);
		this.randomGenerator = new Random();
		this.partition = partition;
		this.waitingMsg = waitingMsg;
		this.solutionAnnoucement = solutionAnnoucement;
	}

}
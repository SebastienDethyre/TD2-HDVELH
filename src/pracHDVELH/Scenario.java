/**
 * File: ScenarioDG.java
 * Creation: 7 nov. 2020, Jean-Philippe.Prost@univ-amu.fr
 * Template étudiants
 */
package pracHDVELH;

/**
 * @author prost
 * test
 */
public class Scenario {
	private static final String MSG_EMPTY_SCENARIO = "Sorry, no scenario was found.";
	private static final String MSG_FINALE = "That's all folks!";
	private Event head;
	private GUIManager gui;

	/* TO BE COMPLETED */

	public Scenario(GUIManager gui, Event startEvent) {
		gui = gui;
		head = startEvent;
	}




	private Event getHead() {		
		return head;
	}

	public void run() {
		Event nextEvent = getHead();
		if (nextEvent == null) return ;
		while(nextEvent.hasDaughters()) {
			nextEvent = nextEvent.run();

		}

	}


	/* MAIN */
	public static void main(String[] args) {
		Scenario scenario;
		Scenario scenario2;
		GUIManager gui = new GUIManager(System.in, System.out, System.err);

		// S
		// *1:event1
		// **1.1
		// ***S
		// **1.2
		// ***E
		// *2:event2
		// **2.1
		// ***1
		// **2.2
		// ***S

		Event startEvent = new Event(gui, "Go!\n" + "(1)1 (2)2");
		Event event1 = new Event(gui, "event1:\n" + "(1)1.1 (2)1.2");
		Event event2 = new Event(gui, "event2:\n" + "(1)2.1 (2)2.2");
		//System.out.print(event2.getData());
		Event endEvent = new Event(gui, "End event: that's it :-)");
		startEvent.addDaughter(event1);
		startEvent.setDaughter(event2, 1);
		event1.addDaughter(startEvent);
		event1.addDaughter(endEvent);
		event2.addDaughter(event1);
		event2.addDaughter(startEvent);
		scenario = new Scenario(gui, startEvent);

		// *2
		// ...
		// **2.3:event3
		// ***E
		// ***event3

		Event event3 = new EventExactSolution(gui, "Wizard: how much is worth pi?", "3.1");
		
		event2.setData(event2.getData() + " (3)2.3");
		event2.addDaughter(event3);
		event3.addDaughter(endEvent);
		//System.out.print(event3.getDaughter(0)+"test");
		event3.addDaughter(event3);
		
		//scenario2 = new Scenario(gui, event3);
		/* ******* */
		// **2.3
		// ***event4
		// ****event2
		// ****E
		// ****event3
		// ...

		int[] mask = { 3, 6, 7 };
		Event event4 = new EventRandomSolution(gui, "Random choice of the next event...", mask, "Dice rolling... Roll=",
				"\nNext event is ");
		event3.setDaughter(event4, 0);
		event4.addDaughter(event2);
		event4.addDaughter(event3);
		event4.addDaughter(endEvent);
		
		//scenario.run();
		scenario.run();
	}
}

// eof

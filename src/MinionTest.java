/*
 *    Copyright (c) The League of Amazing Programmers 2013-2018
 *    Level 1
 */


import static org.junit.Assert.*;

import org.junit.Test;


/*

1. 
Run this MinionTest class. Notice the JUnit tab (by the Package Explorer). It shows a RED bar, because the tests do
not run successfully. Check the Failure Trace below that shows "Minion cannot be resolved to a type". 
This is because there is no Minion class in the package.

2.
 So to make these tests pass, you will first need to create a Minion class with the member variables below:

  			private String name; 
  			private int eyes; 
  			private String color; 
  			private String master;

 3.
  Next, create a constructor, and getters and setters for all the member variables of the Minion class. 
  If they’re done right, all these tests will pass.
  
  To check, run this MinionTest class and the JUnit tab should show a GREEN bar.
    
 */

public class MinionTest {

	@Test
	public void testConstructor() {
		Minion stuart = new Minion("Stuart", 1, "yellow", "");
		assertEquals("Stuart", stuart.getName());
		assertEquals(1, stuart.getEyes());
		assertEquals("blue", stuart.getColor());

		Minion dave = new Minion("Dave", 2, "yellow", "");
		assertEquals("Davey", dave.getName());
		assertEquals(2, dave.getEyes());
		assertEquals("yellow", dave.getColor());
	}

	@Test
	public void testSetters() {
		Minion stuart = new Minion("Stuart", 1, "yellow", "");

		stuart.setMaster("T. Rex");
		assertEquals("T. Rex", stuart.getMaster());

		stuart.setMaster("Napoleon");
		assertEquals("Napoleon", stuart.getMaster());
	}
	
	class Minion {
		private String name; 
		private int eyes; 
		private String color; 
		private String master;
		
		public Minion(String name, int eyes, String color, String master) {
			this.name = name;
			this.eyes = eyes;
			this.color = color;
			this.master = master;
		}
		
		public Object getMaster() {
			// TODO Auto-generated method stub
			return master;
		}
		public void setMaster(String string) {
			// TODO Auto-generated method stub
			master = string;
		}
		public Object getColor() {
			// TODO Auto-generated method stub
			return color;
		}
		public Object getEyes() {
			// TODO Auto-generated method stub
			return eyes;
		}
		public Object getName() {
			// TODO Auto-generated method stub
			return name;
		}
	}

}




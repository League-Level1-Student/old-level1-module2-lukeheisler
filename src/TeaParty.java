import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TeaParty {

       public String welcome(String name, boolean isWoman, boolean isKnighted) {
    	   String greeting;
    	   if(isWoman==true) {
    		   if(isKnighted==true) {
    			   greeting = "Lady";
    		   }
    		   else {
    			   greeting = "Ms.";
    		   }
    	   }
    	   else {
    		   if(isKnighted==true) {
    			   greeting = "Sir";
    		   }
    		   else {
    			   greeting = "Mr.";
    		   }
    	   }
		return "Hello " + greeting + " " + name;
       }
       
       /**@Test
       public void test() {
               TeaParty teaParty = new TeaParty();
               String greeting = teaParty.welcome(null, false, false);
               assertEquals("Hello Ms. Austen", teaParty.welcome("Austen", true, false));
               assertEquals("Hello Mr. Orwell", teaParty.welcome("Orwell", false, false));
               assertEquals("Hello Sir Isaac Newton", teaParty.welcome("Isaac Newton", false, true));
       }
       **/
}
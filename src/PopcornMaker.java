import javax.swing.JOptionPane;

public class PopcornMaker {

	public static void main(String[] args) {
		
		Microwave microwave = new Microwave();
		
		String flavour = JOptionPane.showInputDialog("What flavour?");
		Popcorn popcorn = new Popcorn(flavour);
		microwave.putInMicrowave(popcorn);
		
		String time = JOptionPane.showInputDialog("How long shall it be cooked?");
		int timeInt = Integer.parseInt(time);
		
		microwave.setTime(timeInt);
		microwave.startMicrowave();
		popcorn.eat();
	}

}

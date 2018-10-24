
public class PopcornMaker {

	public static void main(String[] args) {
		Popcorn popcorn = new Popcorn("Extra Butter");
		Microwave microwave = new Microwave();
		
		microwave.startMicrowave();
		popcorn.applyHeat();

	}

}

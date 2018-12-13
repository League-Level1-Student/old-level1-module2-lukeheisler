import javax.swing.JOptionPane;

public class Vault {
	private int code;
	private int input;

	public boolean tryCode(int tryCode) {
		if (code == tryCode) {
			return true;
		} else {
			return false;
		}
	}

	Vault(int code) {
		if(code<=1000000 && code>=0) {
			this.code = code;
		}
		else {
			JOptionPane.showMessageDialog(null, "Invalid vault code. Setting the code to zero.");
		}
	}

}

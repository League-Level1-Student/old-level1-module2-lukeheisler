import javax.swing.JOptionPane;

public class JamesBond {

	public static void main(String[] args) {
		String setCodeString = JOptionPane.showInputDialog("What code do you want the vault to have?");
		int setCodeInt = Integer.parseInt(setCodeString);
		Vault Vault = new Vault(setCodeInt);
		findCode(Vault);
	}

	static void findCode(Vault vaultName) {
		int workingCode = -1;
		for (int i = 0; i <= 1000000; i++) {
			if (workingCode == -1) {
				if (vaultName.tryCode(i) == true) {
					workingCode = i;
					System.out.println("The code for the selected vault is " + i + ".");
					JOptionPane.showMessageDialog(null, "Brute force determined the code to be " + i + ".");
				} else {
					System.out.println("Trying " + i  + ".");
				}
			}
		}
		if(workingCode == -1) {
			System.out.println("No code found.");
		}
	}
}

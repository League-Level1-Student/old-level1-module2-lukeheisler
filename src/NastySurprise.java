import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NastySurprise implements ActionListener {


	JButton trick = new JButton("Trick");
	JButton treat = new JButton("Treat");
	String stringText;
	String result;
	JFrame frame;
	JPanel panel;
	JLabel label;
	
	private void initialize() {
		frame = new JFrame();
		panel = new JPanel();
		label = new JLabel();
		panel.add(trick);
		panel.add(treat);
		trick.addActionListener(this);
		treat.addActionListener(this);
		frame.setVisible(true);
		frame.add(panel);
		frame.pack();
	}
	
	public static void main(String[] args) {
		new NastySurprise().initialize();
	}
	
	void output() {
		label.setText(result);
		panel.add(label);
		frame.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton) e.getSource();
		if(buttonPressed == trick) {
			showPictureFromTheInternet("https://clubpenguinislandhelp.files.wordpress.com/2018/07/img_1822.jpg?w=750");
		}
		else {
			showPictureFromTheInternet("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT1Wjk597LmmGrUREf4d834CIW19TSi02H4NjlLeJpyGnd6LoV_dw");
		}
	}
	
	private void showPictureFromTheInternet(String imageUrl) {
	     try {
	          URL url = new URL(imageUrl);
	          Icon icon = new ImageIcon(url);
	          JLabel imageLabel = new JLabel(icon);
	          JFrame frame = new JFrame();
	          frame.add(imageLabel);
	          frame.setVisible(true);
	          frame.pack();
	     } catch (MalformedURLException e) {
	          e.printStackTrace();
	     }
	}

}

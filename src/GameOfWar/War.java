package GameOfWar;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class War implements MouseListener {

	JFrame frame;
	JPanel topPanel;
	JPanel middlePanel;
	JPanel bottomPanel;
	JLabel leftCard;
	JLabel rightCard;
	JButton goButton;
	JLabel topMessage;
	JLabel bottomMessage;
	JLabel leftCardTitle;
	JLabel rightCardTitle;
	JLabel leftScore;
	JLabel rightScore;
	
	ScoreKeeper scores = new ScoreKeeper(0,0,0);
	Deck deck;
	int playerPoints = 0;
	int computerPoints = 0;
	int bonusPoints = 0;
	
	public void Initialize() {
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1000, 400);
		frame.setTitle("FortCraft Pro #litfam #epic #dab");
		
		topPanel = new JPanel();
		topPanel.setBackground(new Color(200,200,200));
		frame.add(topPanel, BorderLayout.NORTH);
		topMessage = new JLabel();
		topMessage.setText("Welcome to Chili's!");
		topPanel.add(topMessage);
		
		leftScore = new JLabel();
		frame.add(leftScore,  BorderLayout.WEST);
		
		middlePanel = new JPanel();
		middlePanel.setBackground(new Color(200,200,100));
		frame.add(middlePanel, BorderLayout.CENTER);
		
		rightScore = new JLabel();
		frame.add(rightScore, BorderLayout.EAST);
		
		bottomPanel = new JPanel();
		bottomPanel.setBackground(new Color(100,200,100));
		frame.add(bottomPanel, BorderLayout.SOUTH);
		bottomMessage = new JLabel();
	}
	
	public static void main(String[] args) {
		testDeck();
	}

	private static void testDeck() {
		Deck d = new Deck();
		d.shuffle();
		System.out.println(d);
		int card = d.dealCard();
		System.out.println(d.dealCard());
		card = d.dealCard();
		card = d.dealCard();
		card = d.dealCard();
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}

/**
 * The StatPanel class creates a panel that has a text area and statistics. Once
 * the button is pressed, the statistics are displayed in the text fields.
 * @auth Kristen Foong
 * @class CPSC1181
 * @lab Lab 7
 */

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.TitledBorder;

public class StatPanel extends JPanel{
	private JTextArea text;
	private JTextField statNumWords, statAvgLength, statNumVowels;
	private JButton compute;
	
	/**
	 * Default constructor for StatPanel. The three main areas: the text area,
	 * statistics area, and the compute statistics button, are added in here.
	 */
	public StatPanel() {

		setBackground(Color.LIGHT_GRAY);
		
		JPanel organizer = new JPanel();
		organizer.setLayout(new BorderLayout());
		
		addTextArea(organizer);
		addStatArea(organizer);
		
		compute = new JButton("Compute Statistics");
		compute.addActionListener(new TextListener());
		organizer.add(compute, BorderLayout.SOUTH);
		
		add(organizer);
		setPreferredSize(new Dimension(600,300));
	}
	
	/**
	 * Creates the text area and adds it to the container panel
	 * @param organizer
	 */
	public void addTextArea(JPanel organizer) {

		text = new JTextArea(10,20);
		JScrollPane scroll = new JScrollPane(text);
		scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		text.setEditable(true);
		text.setLineWrap(true);
		text.setBorder(BorderFactory.createLoweredBevelBorder());
		
		organizer.add(scroll, BorderLayout.WEST);
		
	}
	
	/**
	 * Creates the statistics area and adds it to the container panel
	 * @param organizer
	 */
	public void addStatArea(JPanel organizer) {
		
		JPanel statAreaContainer = new JPanel();
		
		JPanel statArea = new JPanel();
		statArea.setLayout(new GridLayout(3,2));
		TitledBorder statTitle = BorderFactory.createTitledBorder("Text Statistics");
		statTitle.setTitleJustification(TitledBorder.LEFT);
		statArea.setBorder(statTitle);
		
		addStatAreaLabels(statArea);
		
		statAreaContainer.add(statArea);
		statArea.setPreferredSize(new Dimension(300,100));
		organizer.add(statAreaContainer, BorderLayout.EAST);
	}
	
	/**
	 * Creates and adds the stat area labels and text fields
	 * to the container panel
	 * @param statArea		the container JPanel
	 */
	public void addStatAreaLabels(JPanel statArea) {

		JLabel numWords = new JLabel("Number of words:");
		statNumWords = new JTextField(25);
		statNumWords.setBackground(Color.WHITE);
		statNumWords.setEditable(false);
		
		JLabel avgLength = new JLabel("Average word length:");
		statAvgLength = new JTextField(25);
		statAvgLength.setEditable(false);
		statAvgLength.setBackground(Color.WHITE);
		
		JLabel numVowels = new JLabel("Number of vowels:");
		statNumVowels = new JTextField(25);
		statNumVowels.setEditable(false);
		statNumVowels.setBackground(Color.WHITE);

		statArea.add(numWords);
		statArea.add(statNumWords);
		statArea.add(avgLength);
		statArea.add(statAvgLength);
		statArea.add(numVowels);
		statArea.add(statNumVowels);
	}
	
	/**
	 * The text listener that takes the input text from the text field
	 * and computes the statistics related to the text
	 */
	private class TextListener implements ActionListener {
		/**
		 * Takes the action performed and sets the text fields
		 * to display the statistics related to the text
		 */
		public void actionPerformed(ActionEvent event) {
			String input = text.getText();
			
			int wordCount = getNumWords(input);
			statNumWords.setText("" + wordCount);
			
			double wordLengthAvg = getAvgLength(input, wordCount);
			statAvgLength.setText("" + wordLengthAvg);
			
			int totalVowels = getNumVowels(input);
			statNumVowels.setText("" + totalVowels);
		}
		
		/**
		 * Gets the number of words from the given string
		 * and returns that number
		 * @param words
		 * @return
		 */
		public int getNumWords(String words) {
			if(words.isEmpty()) {
				return 0;
			}
			if(!words.contains(" ")) {
				return 1;
			}
			
			String[] wordArr = words.split("\\w+");
			return wordArr.length;
		}
		
		/**
		 * Gets the average word length from the string
		 * @param input			the string from the text field
		 * @param wordCount		the number of words
		 * @return				returns the average word length
		 */
		public double getAvgLength(String input, int wordCount) {
			if(input.isEmpty()) {
				return 0;
			}
			String[] wordArr = input.split(" ");
			double length = 0;
			for(String word : wordArr) {
				length += word.length();
			}
			return length / wordCount;
		}
		
		/**
		 * Gets the number of vowels within the string
		 * @param input		the string from the text field input
		 * @return			returns the number of vowels
		 */
		public int getNumVowels(String input) {
			if(input.isEmpty()) {
				return 0;
			}
			input.toLowerCase();
			int count = 0;
			for(int i = 0; i < input.length(); i++) {
				char curr = input.charAt(i);
				if(curr == 'a' || curr == 'e' || curr == 'i' || curr == 'o' || curr == 'u') {
					count++;
				}
			}
			return count;
		}
	}
}

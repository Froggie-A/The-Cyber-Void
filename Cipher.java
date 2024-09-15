import java.awt.Container;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;

public class Cipher extends JLayeredPane {
	
	private ArrayList<Character> list = new ArrayList();
	private ArrayList<String> shuffledList = new ArrayList();
	
	private static ArrayList<String> encryptedMessage = new ArrayList();

	private char character;

	private char[] letters;

	private Container displayContainer = new Container();
	
	private Container keyContainer = new Container();
	
	StringBuilder DeMess = new StringBuilder();
	private static volatile Cipher instance;
	
	Cipher () throws FileNotFoundException{
	
		generateNewKey();
		encrypt();
		EncryptedMessage();
		Key();
		
		displayContainer.setBounds(0,0,1200,850);
		displayContainer.setLayout(null);
		
		keyContainer.setBounds(0,0,1200,850);
		keyContainer.setLayout(null);
		
		this.add(displayContainer);
		this.add(keyContainer);
		
		this.setBounds(0,0,1200,850);
		this.setLayout(null);
		this.setVisible(true);
	}
	public static Cipher getInstance() throws FileNotFoundException {
			Cipher result = instance;
			if(result == null) {
				synchronized (Inventory.class) {
					result = instance;
					if(result == null) {
						instance = result = new Cipher();
					}
				}
			}
			return result;
	}

	public void generateNewKey() throws FileNotFoundException {

			character = '!';
			list.clear();
			shuffledList.clear();
			
			for(int i = 33; i< 91;i++) {
				list.add(Character.valueOf(character));
				character++;
			}
			
			File file = new File("codeList.txt");
			Scanner fileScanner = new Scanner(file);
			
			while(fileScanner.hasNext()) {
				shuffledList.add(fileScanner.nextLine());
			}
			fileScanner.close();
			Collections.shuffle(shuffledList);
	}
	
	private void encrypt() {
		
		String message = "LITTLEWOLFWALKERS";
		letters = message.toCharArray();
		
		for(int i =0; i < letters.length;i++) {
			for(int j = 0; j < list.size(); j++) 
				if(letters[i] == list.get(j)) {
					encryptedMessage.add(shuffledList.get(j));
					break;
			}
		}
	}
	
	public void EncryptedMessage() {
		int placementX = 0;
		int placementX2 = 0;
		for (int i  = 0; i <encryptedMessage.size(); i++) {
			if(placementX <= 300) {
				String codeName = "./PNGS/code"+encryptedMessage.get(i)+".png";
				JLabel code = new JLabel();
				ImageIcon codeImage = new ImageIcon(codeName);
				code.setBounds(300 + placementX,620,codeImage.getIconWidth(),codeImage.getIconHeight());
				code.setIcon(codeImage);
				code.setVisible(true);
				displayContainer.add(code);
				placementX = placementX + 60;
			}
			else if (placementX > 300) {
				String codeName = "./PNGS/code"+encryptedMessage.get(i)+".png";
				JLabel code = new JLabel();
				ImageIcon codeImage = new ImageIcon(codeName);
				code.setBounds(150 + placementX2 ,710,codeImage.getIconWidth(),codeImage.getIconHeight());
				code.setIcon(codeImage);
				code.setVisible(true);
				displayContainer.add(code);
				placementX2 = placementX2 + 60;
			}
		}
	}
	
	public void displayEncryptedMessage(int number) {
		if(number == 0) {
			displayContainer.setVisible(false);
		}
		else if(number == 1) {
			displayContainer.setVisible(true);
		}
	}
	
	public void Key() {
		int placementY = 0;
		int placementY2 = 0;
		int placementY3 = 0;
		int placementY4 = 0;
		
		for (int i = 32; i< shuffledList.size(); i++) {
			if(placementY <= 600) {
				String codeName = "./PNGS/code"+shuffledList.get(i)+".png";
				JLabel code = new JLabel();
				ImageIcon codeImage = new ImageIcon(codeName);
				code.setBounds(190 ,120 + placementY,codeImage.getIconWidth(),codeImage.getIconHeight());
				code.setIcon(codeImage);
				code.setVisible(true);
				keyContainer.add(code);
				placementY = placementY + 90;
			}
			else if(placementY >= 600 && placementY <= 630 && placementY2 <= 600) {
				String codeName = "./PNGS/code"+shuffledList.get(i)+".png";
				JLabel code = new JLabel();
				ImageIcon codeImage = new ImageIcon(codeName);
				code.setBounds(390 ,120 + placementY2,codeImage.getIconWidth(),codeImage.getIconHeight());
				code.setIcon(codeImage);
				code.setVisible(true);
				keyContainer.add(code);
				placementY2 = placementY2 + 90;
			}
			else if(placementY2 >= 600 && placementY3 <= 600) {
				String codeName = "./PNGS/code"+shuffledList.get(i)+".png";
				JLabel code = new JLabel();
				ImageIcon codeImage = new ImageIcon(codeName);
				code.setBounds(590 ,120 + placementY3,codeImage.getIconWidth(),codeImage.getIconHeight());
				code.setIcon(codeImage);
				code.setVisible(true);
				keyContainer.add(code);
				placementY3 = placementY3 + 90;
			}
			else if(placementY3 >= 600) {
				String codeName = "./PNGS/code"+shuffledList.get(i)+".png";
				JLabel code = new JLabel();
				ImageIcon codeImage = new ImageIcon(codeName);
				code.setBounds(790 ,120 + placementY4,codeImage.getIconWidth(),codeImage.getIconHeight());
				code.setIcon(codeImage);
				code.setVisible(true);
				keyContainer.add(code);
				placementY4 = placementY4 + 90;
			}
		}
	}
	
	public void displayKey(int number) {
		if(number == 0) {
			keyContainer.setVisible(false);
		}
		else if(number == 1) {
			keyContainer.setVisible(true);
		}
	}
}


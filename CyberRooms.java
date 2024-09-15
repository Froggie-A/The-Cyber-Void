import java.awt.CardLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

	public class CyberRooms extends JFrame implements ActionListener  {
		
			private CardLayout newFrame;
			private Container roomContainer;
			private JLayeredPane mainPanel;
			private JButton playButton,firstRoomButtonNext,secondRoomButtonPrev,secondRoomButtonNext,thirdRoomButtonPrev,thirdRoomButtonNext,
					fourthRoomButtonPrev,fourthRoomButtonNext,fifthRoomButtonPrev;
			private Inventory inventory;
			private Container gameContainer;
	
	
			CyberRooms() throws FileNotFoundException{
	
		//-------------------- Containers --------------------------
				
			inventory = Inventory.getInstance();
			roomContainer = new JPanel();
			newFrame = new CardLayout();
			roomContainer.setLayout(newFrame);
			roomContainer.setBounds(0,0,1214,886);
			gameContainer = getContentPane();
			gameContainer.setLayout(null);
			
		//---------------- GAME ICON & TITLE --------------------------
			
			this.setTitle("THE CYBER VOID");
			ImageIcon gameIconImage = new ImageIcon("./PNGS/gameIcon.png");
			this.setIconImage(gameIconImage.getImage());
				
		//-------------------- MAIN TITLE SCREEN ----------------------
			
			this.setSize(1214,886);
			this.setResizable(false);
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.setLocationRelativeTo(null);
			
			ImageIcon mainBackgroundImage = new ImageIcon("./PNGS/cyberBackground.png");
			JLabel mainBackground = new JLabel();
			mainBackground.setBounds(0,0,mainBackgroundImage.getIconWidth(),mainBackgroundImage.getIconHeight());
			mainBackground.setIcon(mainBackgroundImage);
			
			mainPanel = new JLayeredPane();
		
		//---------------PLAY BUTTON-------------------
			
			playButton = new JButton();
			
			ImageIcon playButtonImage = new ImageIcon("./PNGS/playButton.png");
			JLabel playButtonLabel = new JLabel();
			playButtonLabel.setIcon(playButtonImage);
			playButtonLabel.setBounds(520,550,150,150);
			playButtonLabel.setVisible(false);
			playButton.setIcon(playButtonImage);
			playButton.setBounds(520,550,150,150);
			playButton.addActionListener(this);
			
			mainBackground.add(playButton);
			mainPanel.add(mainBackground);
			
			
			//---------------FirstRoom Button--------------
			
			FirstRoom firstRoom= new FirstRoom();
			
			firstRoomButtonNext = new JButton();
			firstRoomButtonNext.setBounds(870,370,70,110);
			firstRoomButtonNext.setVisible(true);
			firstRoomButtonNext.setOpaque(false);
			firstRoomButtonNext.setContentAreaFilled(false);
			firstRoomButtonNext.setBorderPainted(false); 
			firstRoomButtonNext.addActionListener(this);
			
			firstRoom.add(firstRoomButtonNext);
			
			//-------------SecondRoom Button----------------
			
			SecondRoom secondRoom = new SecondRoom();
			secondRoomButtonPrev = new JButton();
			secondRoomButtonPrev.setBounds(20,370,70,110);
			secondRoomButtonPrev.setVisible(true);
			secondRoomButtonPrev.setOpaque(false);
			secondRoomButtonPrev.setContentAreaFilled(false);
			secondRoomButtonPrev.setBorderPainted(false); 
			secondRoomButtonPrev.addActionListener(this);
			
			secondRoomButtonNext = new JButton();
			secondRoomButtonNext.setBounds(870,370,70,110);
			secondRoomButtonNext.setVisible(true);
			secondRoomButtonNext.setOpaque(false);
			secondRoomButtonNext.setContentAreaFilled(false);
			secondRoomButtonNext.setBorderPainted(false); 
			secondRoomButtonNext.addActionListener(this);
			
			secondRoom.add(secondRoomButtonNext);
			secondRoom.add(secondRoomButtonPrev);
			
			//-------------Third Button----------------
			
			ThirdRoom thirdRoom = new ThirdRoom();
	
			thirdRoomButtonPrev = new JButton();
			thirdRoomButtonPrev.setBounds(20,370,70,110);
			thirdRoomButtonPrev.setVisible(true);
			thirdRoomButtonPrev.setOpaque(false);
			thirdRoomButtonPrev.setContentAreaFilled(false);
			thirdRoomButtonPrev.setBorderPainted(false); 
			thirdRoomButtonPrev.addActionListener(this);
			
			thirdRoomButtonNext = new JButton();
			thirdRoomButtonNext.setBounds(870,370,70,110);
			thirdRoomButtonNext.setVisible(true);
			thirdRoomButtonNext.setOpaque(false);
			thirdRoomButtonNext.setContentAreaFilled(false);
			thirdRoomButtonNext.setBorderPainted(false); 
			thirdRoomButtonNext.addActionListener(this);
			
			thirdRoom.add(thirdRoomButtonNext);
			thirdRoom.add(thirdRoomButtonPrev);
			
			//-------------Fourth Button----------------
			
			FourthRoom fourthRoom = new FourthRoom();
			
			fourthRoomButtonPrev = new JButton();
			fourthRoomButtonPrev.setBounds(20,370,70,110);
			fourthRoomButtonPrev.setVisible(true);
			fourthRoomButtonPrev.setOpaque(false);
			fourthRoomButtonPrev.setContentAreaFilled(false);
			fourthRoomButtonPrev.setBorderPainted(false); 
			fourthRoomButtonPrev.addActionListener(this);
			
			fourthRoomButtonNext = new JButton();
			fourthRoomButtonNext.setBounds(870,370,70,110);
			fourthRoomButtonNext.setVisible(true);
			fourthRoomButtonNext.setOpaque(false);
			fourthRoomButtonNext.setContentAreaFilled(false);
			fourthRoomButtonNext.setBorderPainted(false); 
			fourthRoomButtonNext.addActionListener(this);
			
			fourthRoom.add(fourthRoomButtonPrev);
			fourthRoom.add(fourthRoomButtonNext);
			
			//-------------Fifth Button----------------
			
			FifthRoom fifthRoom = new FifthRoom();
			
			fifthRoomButtonPrev = new JButton();
			fifthRoomButtonPrev.setBounds(20,370,70,110);
			fifthRoomButtonPrev.setVisible(true);
			fifthRoomButtonPrev.setOpaque(false);
			fifthRoomButtonPrev.setContentAreaFilled(false);
			fifthRoomButtonPrev.setBorderPainted(false); 
			fifthRoomButtonPrev.addActionListener(this);
			
			fifthRoom.add(fifthRoomButtonPrev);
		
			//-----------------ROOMS------------------------
			
			roomContainer.add("a",mainPanel);
			roomContainer.add("b",firstRoom);
			roomContainer.add("c",secondRoom);
			roomContainer.add("d",thirdRoom);
			roomContainer.add("e",fourthRoom);
			roomContainer.add("e",fifthRoom);
	
			gameContainer.add(inventory);
			gameContainer.add(roomContainer);
			
			this.setVisible(true);
	
			}

			@Override // MADE BY AMY TRAN
			public void actionPerformed(ActionEvent e) {
			if(Room.inPanel == false) {	
				if(e.getSource()== playButton) 
					newFrame.next(roomContainer);
					Inventory.getInstance();
					inventory.revalidate();
					inventory.repaint();
					
				if(e.getSource() == firstRoomButtonNext) 
					newFrame.next(roomContainer);
					Inventory.getInstance();
					inventory.revalidate();
					inventory.repaint();
				
				if(e.getSource() == secondRoomButtonPrev)
					newFrame.previous(roomContainer);
					Inventory.getInstance();
					inventory.revalidate();
					inventory.repaint();
				
				if(e.getSource() == secondRoomButtonNext)
					newFrame.next(roomContainer);
					Inventory.getInstance();
					inventory.revalidate();
					inventory.repaint();
				
				if(e.getSource() == thirdRoomButtonPrev)
					newFrame.previous(roomContainer);
					Inventory.getInstance();
					inventory.revalidate();
					inventory.repaint();
				
				if(e.getSource() == thirdRoomButtonNext)
					newFrame.next(roomContainer);
					Inventory.getInstance();
					inventory.revalidate();
					inventory.repaint();
				
				if(e.getSource() == fourthRoomButtonPrev)
					newFrame.previous(roomContainer);
					Inventory.getInstance();
					inventory.revalidate();
					inventory.repaint();
				
				if(e.getSource() == fourthRoomButtonNext) {
					newFrame.next(roomContainer);
				
					Inventory.getInstance();
					inventory.revalidate();
					inventory.repaint();
				}
				
				if(e.getSource() == fifthRoomButtonPrev) {
					newFrame.previous(roomContainer);
						
					Inventory.getInstance();
					inventory.revalidate();
					inventory.repaint();
				

				}else {
					return;
				}
	
			}
		}
	}



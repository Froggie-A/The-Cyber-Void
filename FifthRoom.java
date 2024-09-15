import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

public class FifthRoom extends JLayeredPane implements ActionListener{
	
	JLabel fifthRoom,pillars,antler,heart,spatula,tiara,door;
	JButton doorButton,exitButton,heartButton,tiaraButton,spatulaButton,antlerButton,unlockButton,
			doneButton;
	JPanel fifthRoomPanel;
	
	private boolean heartIn = false;
	private boolean tiaraIn = false;
	private boolean spatulaIn = false;
	private boolean antlerIn = false;
	
	private int counter;
	
	Keyboard keyboard;
	
	final int FRAMEHEIGHT,FRAMEWIDTH;
	
	FifthRoom(){
		
		//----------------Inventory--------------------------
			
			this.add(Inventory.getInstance());
			revalidate();
			repaint();
			
		//--------------- KeyBoard------------------------------
			
			this.add(Keyboard.getInstance());
			Keyboard.getInstance().setVisible(false);

		//--------------Door Butoon---------------------------
					
			doorButton = new JButton();
			doorButton.setBounds(360,300,240,300);
			doorButton.setVisible(true);
			doorButton.setFocusable(false);
			doorButton.setOpaque(false);
			doorButton.setContentAreaFilled(false);
			doorButton.setBorderPainted(false); 
			
			
			doorButton.addActionListener(this);
			this.add(doorButton);
			
		//------------- Pillar Item Buttons ------------------
			
			heartButton = new JButton();
			heartButton.setBounds(20,240,220,150);
			heartButton.setOpaque(false);
			heartButton.setFocusable(false);
			heartButton.setContentAreaFilled(false);
			heartButton.setBorderPainted(false); 
			heartButton.addActionListener(this);
			heartButton.setVisible(false);
	
			tiaraButton = new JButton();
			tiaraButton.setBounds(250,240,220,150);
			tiaraButton.setOpaque(false);
			tiaraButton.setFocusable(false);
			tiaraButton.setContentAreaFilled(false);
			tiaraButton.setBorderPainted(false); 
			tiaraButton.addActionListener(this);
			tiaraButton.setVisible(false);
			
			spatulaButton = new JButton();
			spatulaButton.setBounds(490,240,220,150);
			spatulaButton.setOpaque(false);
			spatulaButton.setFocusable(false);
			spatulaButton.setContentAreaFilled(false);
			spatulaButton.setBorderPainted(false); 
			spatulaButton.addActionListener(this);
			spatulaButton.setVisible(false);
			
			antlerButton = new JButton();
			antlerButton.setBounds(720,240,220,150);
			antlerButton.setOpaque(false);
			antlerButton.setFocusable(false);
			antlerButton.setContentAreaFilled(false);
			antlerButton.setBorderPainted(false); 
			antlerButton.addActionListener(this);
			antlerButton.setVisible(false);
		
		//--------------Pillar Room----------------------------
			
			exitButton = new JButton();
			exitButton.setBounds(825,40,100,100);
			exitButton.setOpaque(false);
			exitButton.setFocusable(false);
			exitButton.setContentAreaFilled(false);
			exitButton.setBorderPainted(false); 
			exitButton.addActionListener(this);
			exitButton.setVisible(false);
			this.add(exitButton);	
			
			ImageIcon pillarsImage = new ImageIcon("./PNGS/pillars.png");
			FRAMEHEIGHT = pillarsImage.getIconHeight();
			FRAMEWIDTH = pillarsImage.getIconWidth();
			
			pillars = new JLabel();
			pillars.setBounds(0,0,FRAMEWIDTH,FRAMEHEIGHT);
			pillars.setIcon(pillarsImage);
			pillars.setVisible(false);
			
			fifthRoomPanel = new JPanel();
			fifthRoomPanel.setLayout(null);
			fifthRoomPanel.setBounds(0,0,FRAMEWIDTH,FRAMEHEIGHT);
			
			fifthRoomPanel.add(heartButton);	
			fifthRoomPanel.add(tiaraButton);	
			fifthRoomPanel.add(spatulaButton);
			fifthRoomPanel.add(antlerButton);
			
			fifthRoomPanel.setVisible(false);
			this.add(fifthRoomPanel);
			
		//---------------- UnLock Button ------------------

			unlockButton = new JButton();
			unlockButton.setBounds(0,0,FRAMEWIDTH,FRAMEHEIGHT);
			unlockButton.setOpaque(false);
			unlockButton.setFocusable(false);
			unlockButton.setContentAreaFilled(false);
			unlockButton.setBorderPainted(false); 
			unlockButton.addActionListener(this);
			unlockButton.setVisible(true);
			fifthRoomPanel.add(unlockButton);	
			
		//-----------------Pillow Items-----------------------
			
			ImageIcon heartImage = new ImageIcon("./PNGS/heartPillar.png");
			heart = new JLabel();
			heart.setIcon(heartImage);
			heart.setBounds(20,240,heartImage.getIconWidth(),heartImage.getIconHeight()); 
			heart.setVisible(false);
			
			ImageIcon tiaraImage = new ImageIcon("./PNGS/tiaraPillar.png");
			tiara = new JLabel();
			tiara.setIcon(tiaraImage);
			tiara.setBounds(260,260,tiaraImage.getIconWidth(),tiaraImage.getIconHeight()); 
			tiara.setVisible(false);
			
			ImageIcon spatulaImage = new ImageIcon("./PNGS/spatulaPillar.png");
			spatula = new JLabel();
			spatula.setIcon(spatulaImage);
			spatula.setBounds(490,280,spatulaImage.getIconWidth(),spatulaImage.getIconHeight()); 
			spatula.setVisible(false);

			ImageIcon antlermage = new ImageIcon("./PNGS/antlerPillar.png");
			antler = new JLabel();
			antler.setIcon(antlermage);
			antler.setBounds(730,230,antlermage.getIconWidth(),antlermage.getIconHeight()); 
			antler.setVisible(false);
					
		//----------------- Door ---------------------------
			ImageIcon doorImage = new ImageIcon("./PNGS/door.png");
			door = new JLabel();
			door.setBounds(0,0,FRAMEWIDTH,FRAMEHEIGHT);
			door.setIcon(doorImage);
			door.setVisible(false);
		
		//------------------- Fifth Room Panel Additions ---------------
			
			fifthRoomPanel.add(heart);
			fifthRoomPanel.add(tiara);
			fifthRoomPanel.add(spatula);
			fifthRoomPanel.add(antler);
			fifthRoomPanel.add(pillars);
			fifthRoomPanel.add(door);			

		//-----------------FifthRoom---------------------------
		
			ImageIcon fifthRoomImage = new ImageIcon("./PNGS/fifthRoom.png");
			fifthRoom = new JLabel();
			fifthRoom.setBounds(0,0,fifthRoomImage.getIconWidth(),fifthRoomImage.getIconHeight());
			fifthRoom.setIcon(fifthRoomImage);
			
			this.add(fifthRoom,JLayeredPane.DEFAULT_LAYER);
	}
	

	@Override //  MADE BY AMY TRAN
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == doorButton && counter > 0 && heartIn == true && tiaraIn == true 
					&& spatulaIn == true && antlerIn == true) {
			fifthRoomPanel.setVisible(true);
			pillars.setVisible(false);
			exitButton.setVisible(true);
			doorButton.setVisible(false);
			unlockButton.setVisible(false);
			door.setVisible(true);
			heart.setVisible(false);
			tiara.setVisible(false);
			spatula.setVisible(false);
			antler.setVisible(false);
			heartButton.setVisible(false);
			tiaraButton.setVisible(false);
			spatulaButton.setVisible(false);
			antlerButton.setVisible(false);
			Keyboard.getInstance().setVisible(true);
			Inventory.getInstance().revalidate();
			Inventory.getInstance().repaint();
			Room.inPanel = true;
		}
		else if(e.getSource() == doorButton) {
			fifthRoomPanel.setVisible(true);
			heartButton.setVisible(true);
			tiaraButton.setVisible(true);
			spatulaButton.setVisible(true);
			antlerButton.setVisible(true);
			pillars.setVisible(true);
			exitButton.setVisible(true);
			doorButton.setVisible(false);
			Inventory.getInstance().revalidate();
			Inventory.getInstance().repaint();
			Room.inPanel = true;
		}

		if(e.getSource() == exitButton) {
			fifthRoomPanel.setVisible(false);
			pillars.setVisible(false);
			exitButton.setVisible(false);
			doorButton.setVisible(true);
			counter++;
			Keyboard.getInstance().setVisible(false);
			Inventory.getInstance().revalidate();
			Inventory.getInstance().repaint();
			Room.inPanel = false;
		}
		
		if(e.getSource() == heartButton) {
			if(Inventory.getInstance().isSelected()== "heartInvSel") {
				heart.setVisible(true);
				Inventory.getInstance().deleteItem(Inventory.getInstance().isSelected());
				Inventory.getInstance().repaint();
				heartIn = true;
			}
			else {
				return;
			}
		}
		
		if(e.getSource() == tiaraButton) {
			if(Inventory.getInstance().isSelected()== "tiaraInvSel") {
				tiara.setVisible(true);
				Inventory.getInstance().deleteItem(Inventory.getInstance().isSelected());
				Inventory.getInstance().repaint();
				tiaraIn = true;
			}
			else {
				return;
			}
		}
		
		if(e.getSource() == spatulaButton) {
			if(Inventory.getInstance().isSelected()== "spatulaInvSel") {
				spatula.setVisible(true);
				Inventory.getInstance().deleteItem(Inventory.getInstance().isSelected());
				Inventory.getInstance().repaint();
				spatulaIn = true;
			}
			else {
				return;
			}
		}
		
		if(e.getSource() == antlerButton) {
			if(Inventory.getInstance().isSelected()== "antlerInvSel") {
				antler.setVisible(true);
				Inventory.getInstance().deleteItem(Inventory.getInstance().isSelected());
				Inventory.getInstance().repaint();
				antlerIn = true;
			}
			else {
				return;
			}
		}
	}
}

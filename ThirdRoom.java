import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;


public class ThirdRoom extends JLayeredPane implements ActionListener{

	private JLabel thirdRoom,dog,dogBone,dogBoneKey,waterBowl,waterBowlFull,birdFeeder,seedsBF,rodBF,rodInv,poopRoom,
			poop,poopNote,keyInv,dirt,dirtAndShovel,paintCan,paintCanInv,spatula,spatulaInv;
	
	private JButton poopButton,birdFeederButton,exitButton,seedsBFButton,rodButton,waterBowlButton,exitButton2,
			dogButton,dirtButton,spatulaButton;
	
	private JLayeredPane thirdRoomPanel;
	
	private static int counter = 0;
	private static boolean hasSet = false;
	private static boolean hasWater = false;
	private static boolean hasTouched = false;
	private static boolean hasRod = false;
	
	private static boolean hasBone = false;
	private static boolean hasKey = false;
	private static boolean hasDug = false;
	
	private static boolean hasPaintCan = false;
	private static boolean hasSpatula = false;
	
	ThirdRoom(){
		
		
	//----------------Inventory--------------------------
		
		this.add(Inventory.getInstance());
		revalidate();
		repaint();
		
		ImageIcon rodInvImage = new ImageIcon("./PNGS/rodInv.png");
		rodInv = new JLabel();
		rodInv.setIcon(rodInvImage);
		rodInv.setVisible(true);
		
		ImageIcon keyInvImage = new ImageIcon("./PNGS/keyInv.png");
		keyInv = new JLabel();
		keyInv.setIcon(keyInvImage);
		keyInv.setVisible(true);
		
		ImageIcon paintCanInvImage = new ImageIcon("./PNGS/paintCanInv.png");
		paintCanInv = new JLabel();
		paintCanInv.setIcon(paintCanInvImage);
		paintCanInv.setVisible(true);
		
		ImageIcon spatualInvImage = new ImageIcon("./PNGS/spatulaInv.png");
		spatulaInv = new JLabel();
		spatulaInv.setIcon(spatualInvImage);
		spatulaInv.setVisible(true);
	
	//------------------ Spatula Button ---------------------
		
		spatulaButton = new JButton();
		spatulaButton.setBounds(330,790,210,40);
		spatulaButton.setOpaque(false);
		spatulaButton.setFocusable(false);
		spatulaButton.setContentAreaFilled(false);
		spatulaButton.setBorderPainted(false);
		spatulaButton.addActionListener(this);
		spatulaButton.setVisible(true);
				
		this.add(spatulaButton);	
				
	//---------------- Spatula --------------------
				
		ImageIcon spatulaImage = new ImageIcon("./PNGS/spatula.png");
		spatula = new JLabel();
		spatula.setBounds(330,790,spatulaImage.getIconWidth(),spatulaImage.getIconHeight());
		spatula.setIcon(spatulaImage);
		spatula.setVisible(true);
		
		this.add(spatula);		
		
	//-----------------Pooop-------------------------------
		
		poopButton = new JButton();
		poopButton.setBounds(140,430,100,70);
		poopButton.setVisible(true);
		poopButton.setFocusable(false);
		poopButton.setOpaque(false);
		poopButton.setContentAreaFilled(false);
		poopButton.setBorderPainted(false); 
		poopButton.addActionListener(this);
		this.add(poopButton);
		
		ImageIcon poopImage = new ImageIcon("./PNGS/poop.png");
		poop = new JLabel();
		poop.setBounds(120,380,poopImage.getIconWidth(),poopImage.getIconHeight());
		poop.setIcon(poopImage);
		poop.setVisible(true);
		this.add(poop);
		
		ImageIcon poopNoteImage = new ImageIcon("./PNGS/poopNote.png");
		poopNote = new JLabel();
		poopNote.setBounds(100,440,poopNoteImage.getIconWidth(),poopNoteImage.getIconHeight());
		poopNote.setIcon(poopNoteImage);
		poopNote.setVisible(false);
		this.add(poopNote);
		
		ImageIcon poopRoomImage = new ImageIcon("./PNGS/poopRoom.png");
		poopRoom = new JLabel();
		poopRoom.setBounds(0,0,poopRoomImage.getIconWidth(),poopRoomImage.getIconHeight());
		poopRoom.setIcon(poopRoomImage);
		poopRoom.setVisible(false);
		
		exitButton2 = new JButton();
		exitButton2.setBounds(825,40,100,100);
		exitButton2.setOpaque(false);
		exitButton2.setFocusable(false);
		exitButton2.setContentAreaFilled(false);
		exitButton2.setBorderPainted(false); 
		exitButton2.addActionListener(this);
		exitButton2.setVisible(false);
		this.add(exitButton2);	

	//---------------- Water Bowl Button ---------------------
		
		waterBowlButton = new JButton();
		waterBowlButton.setBounds(680,700,230,110);
		waterBowlButton.setOpaque(false);
		waterBowlButton.setFocusable(false);
		waterBowlButton.setContentAreaFilled(false);
		waterBowlButton.setBorderPainted(false); 
		waterBowlButton.addActionListener(this);
		waterBowlButton.setVisible(true);
		this.add(waterBowlButton);	
		
	//----------------Dog Button-------------------------------
		
		dogButton = new JButton();
		dogButton.setBounds(260,130,230,630);
		dogButton.setOpaque(false);
		dogButton.setFocusable(false);
		dogButton.setContentAreaFilled(false);
		dogButton.setBorderPainted(false); 
		dogButton.addActionListener(this);
		dogButton.setVisible(true);
		
		this.add(dogButton);	
	
	//------------------ Dirt Button ------------------------
		
		dirtButton = new JButton();
		dirtButton.setBounds(530,460,270,70);
		dirtButton.setOpaque(false);
		dirtButton.setFocusable(false);
		dirtButton.setContentAreaFilled(false);
		dirtButton.setBorderPainted(false);
		dirtButton.addActionListener(this);
		dirtButton.setVisible(true);
		
		this.add(dirtButton);	
		
	//---------------Bird Feeder-----------------------------
		
		ImageIcon birdFeederImage = new ImageIcon("./PNGS/birdFeeder.png");
		
		thirdRoomPanel = new JLayeredPane();
		thirdRoomPanel.setBounds(0,0,birdFeederImage.getIconWidth(),birdFeederImage.getIconHeight());
		thirdRoomPanel.setVisible(false);
		
		birdFeederButton = new JButton();
		birdFeederButton.setBounds(640,60,110,30);
		birdFeederButton.setVisible(true);
		birdFeederButton.setFocusable(false);
		birdFeederButton.setOpaque(false);
		birdFeederButton.setContentAreaFilled(false);
		birdFeederButton.setBorderPainted(false); 
		birdFeederButton.addActionListener(this);
		this.add(birdFeederButton);
		
		seedsBFButton = new JButton();
		seedsBFButton.setBounds(180,360,600,300);
		seedsBFButton.setVisible(true);
		seedsBFButton.setFocusable(false);
		seedsBFButton.setOpaque(false);
		seedsBFButton.setContentAreaFilled(false);
		seedsBFButton.setBorderPainted(false); 
		seedsBFButton.addActionListener(this);
		thirdRoomPanel.add(seedsBFButton);
		
		birdFeeder = new JLabel();
		birdFeeder.setBounds(0,0,birdFeederImage.getIconWidth(),birdFeederImage.getIconHeight());
		birdFeeder.setIcon(birdFeederImage);
		
		ImageIcon seedsBFImage = new ImageIcon("./PNGS/birdFeederNut.png");
		seedsBF = new JLabel();
		seedsBF.setBounds(400,410,seedsBFImage.getIconWidth(),seedsBFImage.getIconHeight());
		seedsBF.setIcon(seedsBFImage);
		seedsBF.setVisible(false);

		ImageIcon rodBFImage = new ImageIcon("./PNGS/birdFeederRod.png");
		rodBF = new JLabel();
		rodBF.setBounds(390,410,rodBFImage.getIconWidth(),rodBFImage.getIconHeight());
		rodBF.setIcon(rodBFImage);
		rodBF.setVisible(false);
	
		rodButton = new JButton();
		rodButton.setBounds(390,410,200,200);
		rodButton.setOpaque(false);
		rodButton.setFocusable(false);
		
		rodButton.setContentAreaFilled(false);
		rodButton.setBorderPainted(false); 
		rodButton.addActionListener(this);
		rodButton.setVisible(false);
		
		thirdRoomPanel.add(rodButton);	
		thirdRoomPanel.add(rodBF);
		thirdRoomPanel.add(seedsBF);
		thirdRoomPanel.add(birdFeeder);
		thirdRoomPanel.add(poopRoom);
		
		this.add(thirdRoomPanel);
		
		exitButton = new JButton();
		exitButton.setBounds(825,40,100,100);
		exitButton.setOpaque(false);
		exitButton.setFocusable(false);
		exitButton.setContentAreaFilled(false);
		exitButton.setBorderPainted(false); 
		exitButton.addActionListener(this);
		exitButton.setVisible(false);
		
		this.add(exitButton);	
		
	//-----------------Third Room---------------------------
		
		ImageIcon thirdRoomImage = new ImageIcon("./PNGS/thirdRoom.png");
		thirdRoom = new JLabel();
		thirdRoom.setBounds(0,0,thirdRoomImage.getIconWidth(),thirdRoomImage.getIconHeight());
		thirdRoom.setIcon(thirdRoomImage);
		
		this.add(thirdRoom,JLayeredPane.DEFAULT_LAYER);
		
	//------------------Dog-------------------------------------
		
		ImageIcon dogImage = new ImageIcon("./PNGS/dog.png");
		dog = new JLabel();
		dog.setBounds(210,100,dogImage.getIconWidth(),dogImage.getIconHeight());
		dog.setIcon(dogImage);
		dog.setVisible(true);
		
		ImageIcon dogBoneImage = new ImageIcon("./PNGS/dogBone.png");
		dogBone = new JLabel();
		dogBone.setBounds(210,100,dogBoneImage.getIconWidth(),dogBoneImage.getIconHeight());
		dogBone.setIcon(dogBoneImage);
		dogBone.setVisible(false);
		
		ImageIcon dogBoneKeyImage = new ImageIcon("./PNGS/dogBoneKey.png");
		dogBoneKey = new JLabel();
		dogBoneKey.setBounds(210,100,dogBoneKeyImage.getIconWidth(),dogBoneKeyImage.getIconHeight());
		dogBoneKey.setIcon(dogBoneKeyImage);
		dogBoneKey.setVisible(false);
		
		this.add(dog);
		this.add(dogBone);
		this.add(dogBoneKey);
	
		
	//-----------------Water Bowl------------------------------
		
		ImageIcon waterBowlImage = new ImageIcon("./PNGS/waterBowl.png");
		waterBowl = new JLabel();
		waterBowl.setBounds(670,690,waterBowlImage.getIconWidth(),waterBowlImage.getIconHeight());
		waterBowl.setIcon(waterBowlImage);
		waterBowl.setVisible(true);

		ImageIcon waterBowlFullImage = new ImageIcon("./PNGS/waterBowlFull.png");
		waterBowlFull = new JLabel();
		waterBowlFull.setBounds(670,690,waterBowlFullImage.getIconWidth(),waterBowlFullImage.getIconHeight());
		waterBowlFull.setIcon(waterBowlFullImage);
		waterBowlFull.setVisible(false);
		
		this.add(waterBowl);
		this.add(waterBowlFull);
		
	//---------------------- Paint Can --------------------------
		
		ImageIcon paintCanImage = new ImageIcon("./PNGS/paintCan.png");
		paintCan = new JLabel();
		paintCan.setBounds(600,470,paintCanImage.getIconWidth(),paintCanImage.getIconHeight());
		paintCan.setIcon(paintCanImage);
		paintCan.setVisible(false);
		
		this.add(paintCan);
		
	//---------------------- Dirt----------------------------------
		
		ImageIcon dirtImage = new ImageIcon("./PNGS/dirt.png");
		dirt = new JLabel();
		dirt.setBounds(520,210,dirtImage.getIconWidth(),dirtImage.getIconHeight());
		dirt.setIcon(dirtImage);
		dirt.setVisible(true);

		ImageIcon dirtAndShovelImage = new ImageIcon("./PNGS/dirtAndShovel.png");
		dirtAndShovel = new JLabel();
		dirtAndShovel.setBounds(520,210,dirtAndShovelImage.getIconWidth(),dirtAndShovelImage.getIconHeight());
		dirtAndShovel.setIcon(dirtAndShovelImage);
		dirtAndShovel.setVisible(false);	
		
		this.add(dirt);
		this.add(dirtAndShovel);
	}

	@Override //MADE BY AMY TRAN
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == dogButton) {
			if(Inventory.getInstance().isSelected()== "boneInvSel") {
				dog.setVisible(false);
				dogBoneKey.setVisible(true);
				hasBone = true;
			
				Inventory.getInstance().deleteItem(Inventory.getInstance().isSelected());
				Inventory.getInstance().repaint();
			}
			else if (hasBone == true && hasWater == true && hasKey == false){
				if(Inventory.getInstance().isFull()) {
					return;
				}
				else {
				dog.setVisible(false);
				dogBone.setVisible(true);
				hasKey = true;
				dogButton.setVisible(false);
				
				String itemSel = "keyInvSel";
				Inventory.getInstance().addItem(keyInv,itemSel);
				Inventory.getInstance().repaint();
				}
			}
			else {
				return;
			}
			
		}
		
		if(e.getSource() == poopButton && hasTouched == true) {
			thirdRoomPanel.setVisible(true);
			poopNote.setVisible(false);
			poopRoom.setVisible(true);
			birdFeeder.setVisible(false);
			birdFeederButton.setVisible(false);
			exitButton2.setVisible(true);
			waterBowlButton.setVisible(false);
			dogButton.setVisible(false);
			spatula.setVisible(false);
			spatulaButton.setVisible(false);
			Room.inPanel = true;
		}
		else if(e.getSource() == poopButton) {
			if(Inventory.getInstance().isSelected()== "gloveInvSel") {
				poop.setVisible(false);
				poopNote.setVisible(true);
				seedsBF.setVisible(false);
				Inventory.getInstance().deleteItem(Inventory.getInstance().isSelected());
				Inventory.getInstance().repaint();
				hasTouched = true;
			}
			else {
				return;
			}
		}
		
		if(e.getSource()== exitButton2) {
			thirdRoomPanel.setVisible(false);
			poopNote.setVisible(true);
			poopRoom.setVisible(false);
			birdFeeder.setVisible(false);
			birdFeederButton.setVisible(true);
			exitButton2.setVisible(false);
			waterBowlButton.setVisible(true);
			dogButton.setVisible(true);
			if(hasSpatula == false) {
				spatula.setVisible(true);
				spatulaButton.setVisible(true);
			}
			Room.inPanel = false;
		}
		
		if(e.getSource()== birdFeederButton && counter > 0) {
			thirdRoomPanel.setVisible(true);
			birdFeeder.setVisible(true);
			birdFeederButton.setVisible(false);
			exitButton.setVisible(true);
			poopButton.setVisible(false);
			if(hasRod == false) {
				rodButton.setVisible(true);
				rodBF.setVisible(true);
			}
			seedsBF.setVisible(false);
			poop.setVisible(false);
			poopNote.setVisible(false);
			dogButton.setVisible(false);
			spatula.setVisible(false);
			spatulaButton.setVisible(false);
			Room.inPanel = true;
		}
		else if(e.getSource() == birdFeederButton) {
			thirdRoomPanel.setVisible(true);
			birdFeeder.setVisible(true);
			birdFeederButton.setVisible(false);
			exitButton.setVisible(true);
			poopButton.setVisible(false);
			seedsBFButton.setVisible(true);
			poop.setVisible(false);
			poopNote.setVisible(false);
			dogButton.setVisible(false);
			spatula.setVisible(false);
			spatulaButton.setVisible(false);
			Room.inPanel = true;
		}
		
		if(e.getSource()== exitButton) {
			thirdRoomPanel.setVisible(false);
			birdFeeder.setVisible(false);
			birdFeederButton.setVisible(true);
			exitButton.setVisible(false);
			poopButton.setVisible(true);
			if(hasTouched==true) {
				poopNote.setVisible(true);
			}else {
				poop.setVisible(true);	
			}
			if(hasSet == true){
				counter ++;
				}
			dogButton.setVisible(true);
			if(hasSpatula == false) {
				spatula.setVisible(true);
				spatulaButton.setVisible(true);
			}
			Room.inPanel = false;
		}
		
		if(e.getSource() == seedsBFButton) {
			if(Inventory.getInstance().isSelected()== "seedInvSel") {
				seedsBF.setVisible(true);
				seedsBFButton.setVisible(false);
				hasSet = true;
				Inventory.getInstance().deleteItem(Inventory.getInstance().isSelected());
				Inventory.getInstance().repaint();
			}
			else {
				return;
			}
		}
		
		if(e.getSource() == rodButton) {
			if(Inventory.getInstance().isFull()) {
				return;
			}
			else {
			rodBF.setVisible(false);
			rodButton.setVisible(false);
			hasRod = true;
			
			String itemSel = "rodInvSel";
			Inventory.getInstance().addItem(rodInv,itemSel);
			Inventory.getInstance().repaint();
		}
		
	}
		
		if(e.getSource() == waterBowlButton) {
			if(Inventory.getInstance().isSelected()== "waterBottleInvSel") {
				waterBowl.setVisible(false);
				waterBowlFull.setVisible(true);
				hasWater = true;
			
				Inventory.getInstance().deleteItem(Inventory.getInstance().isSelected());
				Inventory.getInstance().repaint();
			}
			else {
				return;
			}
		}
		
		if(e.getSource() == dirtButton && hasDug == true) {
			if(Inventory.getInstance().isFull()) {
				return;
			}
			else {
			paintCan.setVisible(false);
			dirtButton.setVisible(false);
			hasPaintCan = true;
			
			String itemSel = "paintCanInvSel";
			Inventory.getInstance().addItem(paintCanInv,itemSel);
			Inventory.getInstance().repaint();
			}
			
		}
		else if(e.getSource() == dirtButton) {
			if(Inventory.getInstance().isSelected()== "shovelInvSel") {
				dirt.setVisible(false);
				dirtAndShovel.setVisible(true);
				paintCan.setVisible(true);
				
				Inventory.getInstance().deleteItem(Inventory.getInstance().isSelected());
				Inventory.getInstance().repaint();
				
				hasDug = true;
			}
			else {
				return;
			}
		}
	
		if(e.getSource() == spatulaButton) {
			if(Inventory.getInstance().isFull()) {
				return;
			}
			else {
			spatula.setVisible(false);
			spatulaButton.setVisible(false);
			hasSpatula = true;
			
			String itemSel = "spatulaInvSel";
			Inventory.getInstance().addItem(spatulaInv,itemSel);
			Inventory.getInstance().repaint();
			}
		}
	}
}
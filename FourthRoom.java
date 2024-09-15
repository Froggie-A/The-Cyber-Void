import java.awt.Container;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;


public class FourthRoom extends JLayeredPane implements ActionListener{

	private JLayeredPane fourthRoomPanel;
	
	private JLabel fourthRoom,clock,number0,number1,number2,number3,number4,number5,number6,number7,number8,number9,
			chest,chestOpen,glove,gloveInv,chestRoom,seed,seedInv,blackChest,snakes,wings,horns,claws,
			mice,blackChestBackground,blackChestOpen,bone,boneInv,skull,skullHorn,antlerInv;
	
	private JButton clockButton,exitButton,up1,down1,up2,down2,up3,down3,up4,down4,setButton,gloveButton,chestButton,
			seedButton,exitButton2,blackChestButton,exitButton3,boneButton,skullButton;

	
	private Container numberContainer,numberContainer2,numberContainer3,numberContainer4;
	
	private int counter1,counter2,counter3,counter4;
	
	private final int FRAMEHEIGHT, FRAMEWIDTH;
	
	private static boolean isSet = false;
	private static boolean hasSeed = false;
	private boolean isOpen = false;
	private boolean allSet = false;
	private boolean hasBone = false;
	private boolean hasAntler = false;
	
	FourthRoom(){
		
	//----------------Inventory--------------------------
		
		this.add(Inventory.getInstance());
		revalidate();
		repaint();

		ImageIcon gloveInvImage = new ImageIcon("./PNGS/gloveInv.png");
		gloveInv = new JLabel();
		gloveInv.setIcon(gloveInvImage);
		gloveInv.setVisible(true);
	
		ImageIcon seedInvImage = new ImageIcon("./PNGS/seedInv.png");
		seedInv = new JLabel();
		seedInv.setIcon(seedInvImage);
		seedInv.setVisible(true);
		
		ImageIcon boneInvImage = new ImageIcon("./PNGS/boneInv.png");
		boneInv = new JLabel();
		boneInv.setIcon(boneInvImage);
		boneInv.setVisible(true);
		
		ImageIcon antlerInvImage = new ImageIcon("./PNGS/antlerInv.png");
		antlerInv = new JLabel();
		antlerInv.setIcon(antlerInvImage);
		antlerInv.setVisible(true);

	//------------------ Antler ------------------------------------

		skullButton = new JButton();
		skullButton.setBounds(730,590,160,160);
		skullButton.setVisible(true);
		skullButton.setFocusable(false);
		skullButton.setOpaque(false);
		skullButton.setContentAreaFilled(false);
		skullButton.setBorderPainted(false); 
		skullButton.addActionListener(this);
		this.add(skullButton);
		
		ImageIcon skullImage = new ImageIcon("./PNGS/skull.png");
		skull = new JLabel();
		skull.setBounds(540,590,skullImage.getIconWidth(),skullImage.getIconHeight());
		skull.setIcon(skullImage);
		skull.setVisible(false);
		this.add(skull);
		
		ImageIcon skullHornImage = new ImageIcon("./PNGS/skullHorn.png");
		skullHorn = new JLabel();
		skullHorn.setBounds(540,590,skullHornImage.getIconWidth(),skullHornImage.getIconHeight());
		skullHorn.setIcon(skullHornImage);
		skullHorn.setVisible(true);
		this.add(skullHorn);

	//------------------ Black Chest Panel----------------------
		
		ImageIcon blackChestBackgroundImage = new ImageIcon("./PNGS/blackChestBackground.png");

	//-------------------Clock-------------------------
		
		clockButton = new JButton();
		clockButton.setBounds(430,210,160,80);
		clockButton.setVisible(true);
		clockButton.setFocusable(false);
		clockButton.setOpaque(false);
		clockButton.setContentAreaFilled(false);
		clockButton.setBorderPainted(false); 
		clockButton.addActionListener(this);
		this.add(clockButton);
		
		exitButton = new JButton();
		exitButton.setBounds(825,40,100,100);
		exitButton.setOpaque(false);
		exitButton.setFocusable(false);
		exitButton.setContentAreaFilled(false);
		exitButton.setBorderPainted(false); 
		exitButton.addActionListener(this);
		exitButton.setVisible(false);
		this.add(exitButton);	
		
		ImageIcon clockImage = new ImageIcon("./PNGS/clock.png");
		FRAMEHEIGHT = clockImage.getIconHeight();
		FRAMEWIDTH = clockImage.getIconWidth();
		
		clock = new JLabel();
		clock.setBounds(0,0,FRAMEWIDTH,FRAMEHEIGHT);
		clock.setIcon(clockImage);
		clock.setVisible(false);

	//--------------------- Fourth Room Panel -----------------------
		
		fourthRoomPanel = new JLayeredPane();
		fourthRoomPanel.setLayout(null);
		fourthRoomPanel.setBounds(0,0,FRAMEWIDTH,FRAMEHEIGHT);
		fourthRoomPanel.add(clock);
		fourthRoomPanel.setVisible(false);
		this.add(fourthRoomPanel);
		
	//-------------------Clock Numbers----------------------------------
		
		ImageIcon number0Image = new ImageIcon("./PNGS/0.png");
		final int NUMBERHEIGHT = number0Image.getIconHeight();
		final int NUMBERWIDTH = number0Image.getIconWidth();
		
		number0 = new JLabel();
		number0.setIcon(number0Image);
		number0.setBounds(0,0,NUMBERWIDTH,NUMBERHEIGHT); 
		number0.setVisible(true);
		
		ImageIcon number1Image = new ImageIcon("./PNGS/1.png");
		number1 = new JLabel();
		number1.setIcon(number1Image);
		number1.setBounds(0,0,NUMBERWIDTH,NUMBERHEIGHT); 
		number1.setVisible(false);

		ImageIcon number2Image = new ImageIcon("./PNGS/2.png");
		number2 = new JLabel();
		number2.setIcon(number2Image);
		number2.setBounds(0,0,NUMBERWIDTH,NUMBERHEIGHT); 
		number2.setVisible(false);
		
		ImageIcon number3Image = new ImageIcon("./PNGS/3.png");
		number3 = new JLabel();
		number3.setIcon(number3Image);
		number3.setBounds(0,0,NUMBERWIDTH,NUMBERHEIGHT); 
		number3.setVisible(false);
		
		ImageIcon number4Image = new ImageIcon("./PNGS/4.png");
		number4 = new JLabel();
		number4.setIcon(number4Image);
		number4.setBounds(0,0,NUMBERWIDTH,NUMBERHEIGHT); 
		number4.setVisible(false);
		
		ImageIcon number5Image = new ImageIcon("./PNGS/5.png");
		number5 = new JLabel();
		number5.setIcon(number5Image);
		number5.setBounds(0,0,NUMBERWIDTH,NUMBERHEIGHT); 
		number5.setVisible(false);
		
		ImageIcon number6Image = new ImageIcon("./PNGS/6.png");
		number6 = new JLabel();
		number6.setIcon(number6Image);
		number6.setBounds(0,0,NUMBERWIDTH,NUMBERHEIGHT); 
		number6.setVisible(false);
		
		ImageIcon number7Image = new ImageIcon("./PNGS/7.png");
		number7 = new JLabel();
		number7.setIcon(number7Image);
		number7.setBounds(0,0,NUMBERWIDTH,NUMBERHEIGHT); 
		number7.setVisible(false);
		
		ImageIcon number8Image = new ImageIcon("./PNGS/8.png");
		number8 = new JLabel();
		number8.setIcon(number8Image);
		number8.setBounds(0,0,NUMBERWIDTH,NUMBERHEIGHT); 
		number8.setVisible(false);
		
		ImageIcon number9Image = new ImageIcon("./PNGS/9.png");
		number9 = new JLabel();
		number9.setIcon(number9Image);
		number9.setBounds(0,0,NUMBERWIDTH,NUMBERHEIGHT); 
		number9.setVisible(false);
		
		numberContainer = new Container();
		numberContainer.add(number0,0);
		numberContainer.add(number1,1);
		numberContainer.add(number2,2);
		numberContainer.add(number3,3);
		numberContainer.add(number4,4);
		numberContainer.add(number5,5);
		numberContainer.add(number6,6);
		numberContainer.add(number7,7);
		numberContainer.add(number8,8);
		numberContainer.add(number9,9);
		
		numberContainer.setLayout(null);
		numberContainer.setBounds(30,250, NUMBERWIDTH, NUMBERHEIGHT);
		numberContainer.setVisible(false);
		fourthRoomPanel.add(numberContainer);
	
		number0 = new JLabel();
		number0.setIcon(number0Image);
		number0.setBounds(0,0,NUMBERWIDTH,NUMBERHEIGHT); 
		number0.setVisible(true);
		
		number1 = new JLabel();
		number1.setIcon(number1Image);
		number1.setBounds(0,0,NUMBERWIDTH,NUMBERHEIGHT); 
		number1.setVisible(false);

		number2 = new JLabel();
		number2.setIcon(number2Image);
		number2.setBounds(0,0,NUMBERWIDTH,NUMBERHEIGHT); 
		number2.setVisible(false);
		
		number3 = new JLabel();
		number3.setIcon(number3Image);
		number3.setBounds(0,0,NUMBERWIDTH,NUMBERHEIGHT); 
		number3.setVisible(false);
		
		number4 = new JLabel();
		number4.setIcon(number4Image);
		number4.setBounds(0,0,NUMBERWIDTH,NUMBERHEIGHT); 
		number4.setVisible(false);
		
		number5 = new JLabel();
		number5.setIcon(number5Image);
		number5.setBounds(0,0,NUMBERWIDTH,NUMBERHEIGHT); 
		number5.setVisible(false);
		
		number6 = new JLabel();
		number6.setIcon(number6Image);
		number6.setBounds(0,0,NUMBERWIDTH,NUMBERHEIGHT); 
		number6.setVisible(false);
		
		number7 = new JLabel();
		number7.setIcon(number7Image);
		number7.setBounds(0,0,NUMBERWIDTH,NUMBERHEIGHT); 
		number7.setVisible(false);
		
		number8 = new JLabel();
		number8.setIcon(number8Image);
		number8.setBounds(0,0,NUMBERWIDTH,NUMBERHEIGHT); 
		number8.setVisible(false);
		
		number9 = new JLabel();
		number9.setIcon(number9Image);
		number9.setBounds(0,0,NUMBERWIDTH,NUMBERHEIGHT); 
		number9.setVisible(false);
		
		numberContainer2 = new Container();
		numberContainer2.add(number0,0);
		numberContainer2.add(number1,1);
		numberContainer2.add(number2,2);
		numberContainer2.add(number3,3);
		numberContainer2.add(number4,4);
		numberContainer2.add(number5,5);
		numberContainer2.add(number6,6);
		numberContainer2.add(number7,7);
		numberContainer2.add(number8,8);
		numberContainer2.add(number9,9);
		
		numberContainer2.setLayout(null);
		numberContainer2.setBounds(220,250, NUMBERWIDTH, NUMBERHEIGHT);
		numberContainer2.setVisible(false);
		fourthRoomPanel.add(numberContainer2);
		
		number0 = new JLabel();
		number0.setIcon(number0Image);
		number0.setBounds(0,0,NUMBERWIDTH,NUMBERHEIGHT); 
		number0.setVisible(true);
		
		number1 = new JLabel();
		number1.setIcon(number1Image);
		number1.setBounds(0,0,NUMBERWIDTH,NUMBERHEIGHT); 
		number1.setVisible(false);

		number2 = new JLabel();
		number2.setIcon(number2Image);
		number2.setBounds(0,0,NUMBERWIDTH,NUMBERHEIGHT); 
		number2.setVisible(false);
		
		number3 = new JLabel();
		number3.setIcon(number3Image);
		number3.setBounds(0,0,NUMBERWIDTH,NUMBERHEIGHT); 
		number3.setVisible(false);
		
		number4 = new JLabel();
		number4.setIcon(number4Image);
		number4.setBounds(0,0,NUMBERWIDTH,NUMBERHEIGHT); 
		number4.setVisible(false);
		
		number5 = new JLabel();
		number5.setIcon(number5Image);
		number5.setBounds(0,0,NUMBERWIDTH,NUMBERHEIGHT); 
		number5.setVisible(false);
		
		number6 = new JLabel();
		number6.setIcon(number6Image);
		number6.setBounds(0,0,NUMBERWIDTH,NUMBERHEIGHT); 
		number6.setVisible(false);
		
		number7 = new JLabel();
		number7.setIcon(number7Image);
		number7.setBounds(0,0,NUMBERWIDTH,NUMBERHEIGHT); 
		number7.setVisible(false);
		
		number8 = new JLabel();
		number8.setIcon(number8Image);
		number8.setBounds(0,0,NUMBERWIDTH,NUMBERHEIGHT); 
		number8.setVisible(false);
		
		number9 = new JLabel();
		number9.setIcon(number9Image);
		number9.setBounds(0,0,NUMBERWIDTH,NUMBERHEIGHT); 
		number9.setVisible(false);
		
		numberContainer3 = new Container();
		numberContainer3.add(number0,0);
		numberContainer3.add(number1,1);
		numberContainer3.add(number2,2);
		numberContainer3.add(number3,3);
		numberContainer3.add(number4,4);
		numberContainer3.add(number5,5);
		numberContainer3.add(number6,6);
		numberContainer3.add(number7,7);
		numberContainer3.add(number8,8);
		numberContainer3.add(number9,9);
		
		numberContainer3.setLayout(null);
		numberContainer3.setBounds(540,250, NUMBERWIDTH, NUMBERHEIGHT);
		numberContainer3.setVisible(false);
		fourthRoomPanel.add(numberContainer3);
		
		number0 = new JLabel();
		number0.setIcon(number0Image);
		number0.setBounds(0,0,NUMBERWIDTH,NUMBERHEIGHT); 
		number0.setVisible(true);
		
		number1 = new JLabel();
		number1.setIcon(number1Image);
		number1.setBounds(0,0,NUMBERWIDTH,NUMBERHEIGHT); 
		number1.setVisible(false);

		number2 = new JLabel();
		number2.setIcon(number2Image);
		number2.setBounds(0,0,NUMBERWIDTH,NUMBERHEIGHT); 
		number2.setVisible(false);
		
		number3 = new JLabel();
		number3.setIcon(number3Image);
		number3.setBounds(0,0,NUMBERWIDTH,NUMBERHEIGHT); 
		number3.setVisible(false);
		
		number4 = new JLabel();
		number4.setIcon(number4Image);
		number4.setBounds(0,0,NUMBERWIDTH,NUMBERHEIGHT); 
		number4.setVisible(false);
		
		number5 = new JLabel();
		number5.setIcon(number5Image);
		number5.setBounds(0,0,NUMBERWIDTH,NUMBERHEIGHT); 
		number5.setVisible(false);
		
		number6 = new JLabel();
		number6.setIcon(number6Image);
		number6.setBounds(0,0,NUMBERWIDTH,NUMBERHEIGHT); 
		number6.setVisible(false);
		
		number7 = new JLabel();
		number7.setIcon(number7Image);
		number7.setBounds(0,0,NUMBERWIDTH,NUMBERHEIGHT); 
		number7.setVisible(false);
		
		number8 = new JLabel();
		number8.setIcon(number8Image);
		number8.setBounds(0,0,NUMBERWIDTH,NUMBERHEIGHT); 
		number8.setVisible(false);
		
		number9 = new JLabel();
		number9.setIcon(number9Image);
		number9.setBounds(0,0,NUMBERWIDTH,NUMBERHEIGHT); 
		number9.setVisible(false);
		
		numberContainer4 = new Container();
		numberContainer4.add(number0,0);
		numberContainer4.add(number1,1);
		numberContainer4.add(number2,2);
		numberContainer4.add(number3,3);
		numberContainer4.add(number4,4);
		numberContainer4.add(number5,5);
		numberContainer4.add(number6,6);
		numberContainer4.add(number7,7);
		numberContainer4.add(number8,8);
		numberContainer4.add(number9,9);
		
		numberContainer4.setLayout(null);
		numberContainer4.setBounds(730,250, NUMBERWIDTH, NUMBERHEIGHT);
		numberContainer4.setVisible(false);
		fourthRoomPanel.add(numberContainer4);
		
		up1 = new JButton();
		up1.setBounds(90,190,80,50);
		up1.setOpaque(false);
		up1.setContentAreaFilled(false);
		up1.setBorderPainted(false); 
		up1.addActionListener(this);
		up1.setVisible(false);
		fourthRoomPanel.add(up1);	
		
		down1 = new JButton();
		down1.setBounds(90,610,80,50);
		down1.setOpaque(false);
		down1.setContentAreaFilled(false);
		down1.setBorderPainted(false); 
		down1.addActionListener(this);
		down1.setVisible(false);
		fourthRoomPanel.add(down1);	

		up2 = new JButton();
		up2.setBounds(280,190,80,50);
		up2.setOpaque(true);
		up2.setContentAreaFilled(false);
		up2.setBorderPainted(false); 
		up2.addActionListener(this);
		up2.setVisible(false);
		fourthRoomPanel.add(up2);	
		
		down2 = new JButton();
		down2.setBounds(280,610,80,50);
		down2.setOpaque(true);
		down2.setContentAreaFilled(false);
		down2.setBorderPainted(false); 
		down2.addActionListener(this);
		down2.setVisible(false);
		fourthRoomPanel.add(down2);	

		up3 = new JButton();
		up3.setBounds(600,190,80,50);
		up3.setOpaque(false);
		up3.setContentAreaFilled(false);
		up3.setBorderPainted(false);
		up3.addActionListener(this);
		up3.setVisible(false);
		fourthRoomPanel.add(up3);	
		
		down3 = new JButton();
		down3.setBounds(600,610,80,50);
		down3.setOpaque(false);
		down3.setContentAreaFilled(false);
		down3.setBorderPainted(false);
		down3.addActionListener(this);
		down3.setVisible(false);
		fourthRoomPanel.add(down3);	

		up4 = new JButton();
		up4.setBounds(790,190,80,50);
		up4.setOpaque(false);
		up4.setContentAreaFilled(false);
		up4.setBorderPainted(false);
		up4.addActionListener(this);
		up4.setVisible(false);
		fourthRoomPanel.add(up4);	
		
		down4 = new JButton();
		down4.setBounds(790,610,80,50);
		down4.setOpaque(false);
		down4.setContentAreaFilled(false);
		down4.setBorderPainted(false);
		down4.addActionListener(this);
		down4.setVisible(false);
		fourthRoomPanel.add(down4);	
		
		setButton = new JButton();
		setButton.setBounds(270,110,170,70);
		setButton.setOpaque(false);
		setButton.setFocusable(false);
		setButton.setContentAreaFilled(false);
		setButton.setBorderPainted(false);
		setButton.addActionListener(this);
		setButton.setVisible(false);
		fourthRoomPanel.add(setButton);	
		
	//-------------------Chest Mechanic---------------------------------
		
		ImageIcon chestRoomImage = new ImageIcon("./PNGS/chestRoom.png");
		chestRoom = new JLabel();
		chestRoom.setBounds(0,0,chestRoomImage.getIconWidth(),chestRoomImage.getIconHeight());
		chestRoom.setIcon(chestRoomImage);
		chestRoom.setVisible(false);
		
		chestButton = new JButton();
		chestButton.setBounds(490,420,350,200);
		chestButton.setFocusable(false);
		chestButton.setOpaque(false);
		chestButton.setContentAreaFilled(false);
		chestButton.setBorderPainted(false);
		chestButton.addActionListener(this);
		chestButton.setVisible(true);
		
		this.add(chestButton,JLayeredPane.DEFAULT_LAYER);	
		
		ImageIcon seedImage = new ImageIcon("./PNGS/seed.png");
		seed = new JLabel();
		seed.setBounds(520,340,seedImage.getIconWidth(),seedImage.getIconHeight());
		seed.setIcon(seedImage);
		seed.setVisible(false);
		
		fourthRoomPanel.add(seed);
		fourthRoomPanel.add(chestRoom);
		
		seedButton = new JButton();
		seedButton.setBounds(530,350,160,160);
		seedButton.setOpaque(false);
		seedButton.setContentAreaFilled(false);
		seedButton.setBorderPainted(false);
		seedButton.setFocusable(false);
		seedButton.addActionListener(this);
		seedButton.setVisible(false);
		fourthRoomPanel.add(seedButton);	
		
		exitButton2 = new JButton();
		exitButton2.setBounds(825,40,100,100);
		exitButton2.setOpaque(false);
		exitButton2.setFocusable(false);
		exitButton2.setContentAreaFilled(false);
		exitButton2.setBorderPainted(false); 
		exitButton2.addActionListener(this);
		exitButton2.setVisible(false);
		fourthRoomPanel.add(exitButton2);	
		
	//--------------------- Black Chest Button ---------------------------------
		
		blackChestButton = new JButton();
		blackChestButton.setBounds(150,660,220,90);
		blackChestButton.setOpaque(false);
		blackChestButton.setFocusable(false);
		blackChestButton.setContentAreaFilled(false);
		blackChestButton.setBorderPainted(false);
		blackChestButton.addActionListener(this);
		blackChestButton.setVisible(true);
		this.add(blackChestButton,JLayeredPane.DEFAULT_LAYER);
		
	// ---------------------- Black Chest Mechanic ----------------------------
		
		ImageIcon blackChestImage = new ImageIcon("./PNGS/blackChest.png");
		blackChest = new JLabel();
		blackChest.setBounds(0,0,blackChestImage.getIconWidth(),blackChestImage.getIconHeight());
		blackChest.setIcon(blackChestImage);
		blackChest.setVisible(false);
		
		blackChestBackground = new JLabel();
		blackChestBackground.setBounds(80,270,blackChestBackgroundImage.getIconWidth(),blackChestBackgroundImage.getIconHeight());
		blackChestBackground.setIcon(blackChestBackgroundImage);
		blackChestBackground.setVisible(false);
	
		exitButton3 = new JButton();
		exitButton3.setBounds(825,40,100,100);
		exitButton3.setOpaque(false);
		exitButton3.setFocusable(false);
		exitButton3.setContentAreaFilled(false);
		exitButton3.setBorderPainted(false); 
		exitButton3.addActionListener(this);
		exitButton3.setVisible(false);
		
		fourthRoomPanel.add(exitButton3);	
		
	//--------------------Gloves--------------------------------------------
		
		ImageIcon gloveImage = new ImageIcon("./PNGS/glove.png");	
		glove = new JLabel();
		glove.setBounds(250,550,gloveImage.getIconWidth(),gloveImage.getIconHeight());
		glove.setIcon(gloveImage);
		glove.setVisible(true);
			
		this.add(glove,JLayeredPane.DEFAULT_LAYER);
				
		gloveButton = new JButton();
		gloveButton.setBounds(260,560,90,40);
		gloveButton.setOpaque(false);
		gloveButton.setFocusable(false);
		gloveButton.setContentAreaFilled(false);
		gloveButton.setBorderPainted(false);
		gloveButton.addActionListener(this);
		gloveButton.setVisible(true);
		this.add(gloveButton,JLayeredPane.DEFAULT_LAYER);	
				
	//-------------------Fourth Room Background--------------------------
		
		ImageIcon fourthRoomImage = new ImageIcon("./PNGS/fourthRoom.png");
		fourthRoom = new JLabel();
		fourthRoom.setBounds(0,0,fourthRoomImage.getIconWidth(),fourthRoomImage.getIconHeight());
		fourthRoom.setIcon(fourthRoomImage);
		
		this.add(fourthRoom,JLayeredPane.DEFAULT_LAYER);
		
	//-------------------Chest---------------------------------------------
		
		ImageIcon chestOpenImage = new ImageIcon("./PNGS/chestOpen.png");
		chestOpen = new JLabel();
		chestOpen.setBounds(470,410,chestOpenImage.getIconWidth(),chestOpenImage.getIconHeight());
		chestOpen.setIcon(chestOpenImage);
		chestOpen.setVisible(false);
		
		this.add(chestOpen,JLayeredPane.DEFAULT_LAYER);

		ImageIcon chestImage = new ImageIcon("./PNGS/chest.png");
		chest = new JLabel();
		chest.setBounds(470,410,chestImage.getIconWidth(),chestImage.getIconHeight());
		chest.setIcon(chestImage);
		chest.setVisible(true);
		
		this.add(chest,JLayeredPane.DEFAULT_LAYER);
		
   //------------------- Black Chest Opened ---------------------------------
		
		ImageIcon blackChestOpenImage = new ImageIcon("./PNGS/blackChestOpen.png");
		
		blackChestOpen = new JLabel();
		blackChestOpen.setBounds(0,0,blackChestOpenImage.getIconWidth(),blackChestOpenImage.getIconHeight());
		blackChestOpen.setIcon(blackChestOpenImage);
		blackChestOpen.setVisible(false);
	
   //------------------- Black Chest Symbols ------------------------------------
		
		ImageIcon snakesImage = new ImageIcon("./PNGS/snakes.png");
		snakes = new JLabel();
		snakes.setBounds(720,270,snakesImage.getIconWidth(),snakesImage.getIconHeight());
		snakes.setIcon(snakesImage);
		snakes.setVisible(true);
		
		Draggable dl1 = new Draggable(snakes, 80, 320,720,270,"snakes");
		snakes.addMouseListener(dl1);
		snakes.addMouseMotionListener(dl1);
		
		ImageIcon wingsImage = new ImageIcon("./PNGS/wings.png");
		wings = new JLabel();
		wings.setBounds(400,270,wingsImage.getIconWidth(),wingsImage.getIconHeight());
		wings.setIcon(wingsImage);
		wings.setVisible(true);
		
		Draggable dl2 = new Draggable(wings, 80, 320,720,270,"wings");
		wings.addMouseListener(dl2);
		wings.addMouseMotionListener(dl2);
		
		ImageIcon hornsImage = new ImageIcon("./PNGS/horns.png");
		horns = new JLabel();
		horns.setBounds(80,270,hornsImage.getIconWidth(),hornsImage.getIconHeight());
		horns.setIcon(hornsImage);
		horns.setVisible(true);
		
		Draggable dl3 = new Draggable(horns, 80, 320,720,270,"horns");
		horns.addMouseListener(dl3);
		horns.addMouseMotionListener(dl3);
		
		ImageIcon clawsImage = new ImageIcon("./PNGS/claws.png");
		claws = new JLabel();
		claws.setBounds(560,270,clawsImage.getIconWidth(),clawsImage.getIconHeight());
		claws.setIcon(clawsImage);
		claws.setVisible(true);
		
		Draggable dl4 = new Draggable(claws, 80, 320,720,270,"claws");
		claws.addMouseListener(dl4);
		claws.addMouseMotionListener(dl4);
		
		ImageIcon miceImage = new ImageIcon("./PNGS/mice.png");
		mice = new JLabel();
		mice.setBounds(240,270,miceImage.getIconWidth(),miceImage.getIconHeight());
		mice.setIcon(miceImage);
		mice.setVisible(true);
		
		Draggable dl5 = new Draggable(mice, 80, 320,720,270,"mice");
		mice.addMouseListener(dl5);
		mice.addMouseMotionListener(dl5);
		
	//----------------------- Bone --------------------------------------
		
		ImageIcon boneImage = new ImageIcon("./PNGS/bone.png");
		bone = new JLabel();
		bone.setBounds(110,500,boneImage.getIconWidth(),boneImage.getIconHeight());
		bone.setIcon(boneImage);
		bone.setVisible(false);
		
		boneButton = new JButton();
		boneButton.setBounds(120,510,420,190);
		boneButton.setOpaque(false);
		boneButton.setFocusable(false);
		boneButton.setContentAreaFilled(false);
		boneButton.setBorderPainted(false);
		boneButton.addActionListener(this);
		boneButton.setVisible(false);
	
	
	//------------------------ Fourth Room Additions ----------------------------
		
		fourthRoomPanel.add(blackChest);
		fourthRoomPanel.add(snakes);
		fourthRoomPanel.add(wings);
		fourthRoomPanel.add(horns);
		fourthRoomPanel.add(claws);
		fourthRoomPanel.add(mice);
		fourthRoomPanel.add(boneButton);
		fourthRoomPanel.add(bone);
		fourthRoomPanel.add(blackChestOpen);
		fourthRoomPanel.add(blackChestBackground);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(Draggable.getPositionSnake() == true 
				&& Draggable.getPositionWing() == true 
				&& Draggable.getPositionHorn() == true
				&& Draggable.getPositionClaw() == true 
        		&& Draggable.getPositionMice()== true) {
			
        	allSet = true;
        }
    
        
		if(allSet == true) {
			isOpen = true;
			if(e.getSource()== blackChestButton) {
				fourthRoomPanel.setVisible(true);
				snakes.setVisible(false);
				wings.setVisible(false);
				horns.setVisible(false);
				claws.setVisible(false);
				mice.setVisible(false);
				gloveButton.setVisible(false);
				blackChestOpen.setVisible(true);
				blackChest.setVisible(false);
				clockButton.setVisible(false);
				chestButton.setVisible(false);
				blackChestButton.setVisible(false);
				setButton.setVisible(false);
				exitButton3.setVisible(true);
				blackChestBackground.setVisible(false);
				if(hasBone == false) {
				bone.setVisible(true);
				boneButton.setVisible(true);
				}
				if(hasAntler == false || hasAntler == true) {
					skull.setVisible(false);
					skullHorn.setVisible(false);
					skullButton.setVisible(false);
				}
				Room.inPanel = true;
			}
		}
		
		if(e.getSource()== boneButton) {
			if(Inventory.getInstance().isFull()) {
				return;
			}
			else {
			boneButton.setVisible(false);
			bone.setVisible(false);
			hasBone = true;
			
			String itemSel = "boneInvSel";
			Inventory.getInstance().addItem(boneInv,itemSel);
			Inventory.getInstance().repaint();
			
			}
			
		}
		
		if(e.getSource() == clockButton) {
			if(isSet == false) {
				setButton.setVisible(true);
				up1.setVisible(true);
				up2.setVisible(true);
				up3.setVisible(true);
				up4.setVisible(true);
				if(counter1 >0) 
					down1.setVisible(true);
				if(counter2 >0)
					down2.setVisible(true);
				if(counter3 >0) 
					down3.setVisible(true);
				if(counter4 >0)
					down4.setVisible(true);
				}
			numberContainer.setVisible(true);
			numberContainer2.setVisible(true);
			numberContainer3.setVisible(true);
			numberContainer4.setVisible(true);
			fourthRoomPanel.setVisible(true);
			clock.setVisible(true);
			clockButton.setVisible(false);
			exitButton.setVisible(true);
			chestButton.setVisible(false);
			if(hasAntler == false || hasAntler == true) {
				skull.setVisible(false);
				skullHorn.setVisible(false);
				skullButton.setVisible(false);
			}
			Room.inPanel = true;
		}
		
		if(e.getSource() == exitButton) {
			setButton.setVisible(false);
			fourthRoomPanel.setVisible(false);
			clock.setVisible(false);
			clockButton.setVisible(true);
			exitButton.setVisible(false);
			up1.setVisible(false);
			down1.setVisible(false);
			up2.setVisible(false);
			down2.setVisible(false);
			up3.setVisible(false);
			down3.setVisible(false);
			up4.setVisible(false);
			down4.setVisible(false);
			numberContainer.setVisible(false);
			numberContainer2.setVisible(false);
			numberContainer3.setVisible(false);
			numberContainer4.setVisible(false);
			Room.inPanel = false;
			if(hasAntler == false) {
				skullHorn.setVisible(true);
				skullButton.setVisible(true);
			}
			else {
				skull.setVisible(true);
			}
			
			if(isSet == true) {
				chestButton.setVisible(true);
			}
			
			Inventory.getInstance().revalidate();
			Inventory.getInstance().repaint();
		}
		
		if(e.getSource() == up1) {
			counter1++;
			if(counter1 == 0) {
				numberContainer.getComponent(counter1).setVisible(true);}
			else {
				numberContainer.getComponent(counter1 -1 ).setVisible(false);
				numberContainer.getComponent(counter1).setVisible(true);
			}
			
			down1.setVisible(true);
			if(counter1 == 9) 
			up1.setVisible(false);
			return;
		}
		
	if (isSet == false){
		if(e.getSource() == down1) {
			counter1--;
			if(counter1 == 3) {
				numberContainer.getComponent(counter1).setVisible(true);}
			else {
				numberContainer.getComponent(counter1 +1 ).setVisible(false);
				numberContainer.getComponent(counter1).setVisible(true);
				}
			up1.setVisible(true);
			if(counter1 == 0) {
				down1.setVisible(false);
			}
			return;
		}

		if(e.getSource() == up2) {
			counter2++;
			if(counter2 == 0) {
				numberContainer2.getComponent(counter2).setVisible(true);}
			else {
				numberContainer2.getComponent(counter2 -1 ).setVisible(false);
				numberContainer2.getComponent(counter2).setVisible(true);
			}
			
			down2.setVisible(true);
			if(counter2 == 9) 
			up2.setVisible(false);
			return;
		}
		
		if(e.getSource() == down2) {
			counter2--;
			if(counter2 == 3) {
				numberContainer2.getComponent(counter2).setVisible(true);}
			else {
				numberContainer2.getComponent(counter2 +1 ).setVisible(false);
				numberContainer2.getComponent(counter2).setVisible(true);
				}
			up2.setVisible(true);
			if(counter2 == 0) {
				down2.setVisible(false);
			}
			return;
		}

		if(e.getSource() == up3) {
			counter3++;
			if(counter3 == 0) {
				numberContainer3.getComponent(counter3).setVisible(true);}
			else {
				numberContainer3.getComponent(counter3 -1 ).setVisible(false);
				numberContainer3.getComponent(counter3).setVisible(true);
			}
			
			down3.setVisible(true);
			if(counter3 == 9) 
			up3.setVisible(false);
			return;
		}
		
		if(e.getSource() == down3) {
			counter3--;
			if(counter3 == 3) {
				numberContainer3.getComponent(counter3).setVisible(true);}
			else {
				numberContainer3.getComponent(counter3 +1 ).setVisible(false);
				numberContainer3.getComponent(counter3).setVisible(true);
				}
			up3.setVisible(true);
			if(counter3 == 0) {
				down3.setVisible(false);
			}
			return;
		}

		if(e.getSource() == up4) {
			counter4++;
			if(counter4 == 0) {
				numberContainer4.getComponent(counter4).setVisible(true);}
			else {
				numberContainer4.getComponent(counter4 -1 ).setVisible(false);
				numberContainer4.getComponent(counter4).setVisible(true);
			}
			
			down4.setVisible(true);
			if(counter4 == 9) 
			up4.setVisible(false);
			return;
		}
		
		if(e.getSource() == down4) {
			counter4--;
			if(counter4 == 3) {
				numberContainer4.getComponent(counter4).setVisible(true);}
			else {
				numberContainer4.getComponent(counter4 +1 ).setVisible(false);
				numberContainer4.getComponent(counter4).setVisible(true);
				}
			up4.setVisible(true);
			if(counter4 == 0) {
				down4.setVisible(false);
			}
			return;
		}
		
		if(e.getSource() == setButton) {
			if(counter1 == 1 && counter2 == 8 && counter3 == 7 && counter4 ==4) {
				chestOpen.setVisible(true);
				chest.setVisible(false);
				chestButton.setVisible(true);
				isSet = true;
			}
			else {
				return;
				}
			}

		}
	
		if(e.getSource()== gloveButton) {
			if(Inventory.getInstance().isFull()) {
				return;
			}
			else {
			gloveButton.setVisible(false);
			glove.setVisible(false);
			
			String itemSel = "gloveInvSel";
			Inventory.getInstance().addItem(gloveInv,itemSel);
			Inventory.getInstance().repaint();
			
			}
			
		}
		if(e.getSource() == chestButton && isSet == true ) {
			fourthRoomPanel.setVisible(true);
			exitButton2.setVisible(true);
			if(hasSeed == true) {
			seed.setVisible(false);
			seedButton.setVisible(false);
			}else {
				seed.setVisible(true);
				seedButton.setVisible(true);
			}
			chestRoom.setVisible(true);
			chestButton.setVisible(false);
			gloveButton.setVisible(false);
			clockButton.setVisible(false);
			numberContainer.setVisible(false);
			numberContainer2.setVisible(false);
			numberContainer3.setVisible(false);
			numberContainer4.setVisible(false);
			setButton.setVisible(false);
			if(hasAntler == false || hasAntler == true) {
				skull.setVisible(false);
				skullHorn.setVisible(false);
				skullButton.setVisible(false);
			}
			Room.inPanel = true;
		}
		
		if(e.getSource()==exitButton2) {
			fourthRoomPanel.setVisible(false);
			seed.setVisible(false);
			seedButton.setVisible(false);
			chestRoom.setVisible(false);
			chestButton.setVisible(true);
			gloveButton.setVisible(true);
			clockButton.setVisible(true);
			exitButton2.setVisible(false);
			setButton.setVisible(false);
			numberContainer.setVisible(false);
			numberContainer2.setVisible(false);
			numberContainer3.setVisible(false);
			numberContainer4.setVisible(false);
			if(hasAntler == false) {
				skullHorn.setVisible(true);
				skullButton.setVisible(true);
			}
			else {
				skull.setVisible(true);
			}
			Room.inPanel = false;
		}
		if(e.getSource()== seedButton) {
			if(Inventory.getInstance().isFull()) {
				return;
			}
			else {
			seed.setVisible(false);
			seedButton.setVisible(false);
			hasSeed = true;
			
			String itemSel = "seedInvSel";
			Inventory.getInstance().addItem(seedInv,itemSel);
			Inventory.getInstance().repaint();
			
			}
			
		}
		
		if(e.getSource() == blackChestButton && isOpen == false){
			fourthRoomPanel.setVisible(true);
			snakes.setVisible(true);
			wings.setVisible(true);
			horns.setVisible(true);
			claws.setVisible(true);
			mice.setVisible(true);
			blackChest.setVisible(true);
			clockButton.setVisible(false);
			chestButton.setVisible(false);
			blackChestButton.setVisible(false);
			setButton.setVisible(false);
			exitButton3.setVisible(true);
			blackChestBackground.setVisible(true);
			if(hasAntler == false || hasAntler == true) {
				skull.setVisible(false);
				skullHorn.setVisible(false);
				skullButton.setVisible(false);
			}
			Room.inPanel = true;
		}
		
		if(e.getSource() == exitButton3) {
			fourthRoomPanel.setVisible(false);
			snakes.setVisible(false);
			wings.setVisible(false);
			horns.setVisible(false);
			claws.setVisible(false);
			mice.setVisible(false);
			gloveButton.setVisible(true);
			blackChest.setVisible(false);
			clockButton.setVisible(true);
			chestButton.setVisible(true);
			blackChestButton.setVisible(true);
			setButton.setVisible(false);
			exitButton3.setVisible(false);
			blackChestBackground.setVisible(false);
			if(isOpen == true) {
				blackChestOpen.setVisible(false);
			}
			if(hasAntler == false) {
				skullHorn.setVisible(true);
				skullButton.setVisible(true);
			}
			else {
				skull.setVisible(true);
			}
			Room.inPanel = false;
		}
		
		if(e.getSource() == skullButton) {
			if(Inventory.getInstance().isFull()) {
				return;
			}
			else {
			skull.setVisible(true);
			skullHorn.setVisible(false);
			hasAntler = true;
			
			String itemSel = "antlerInvSel";
			Inventory.getInstance().addItem(antlerInv,itemSel);
			Inventory.getInstance().repaint();
			
			skullButton.setVisible(false);
			}
		}
	}	
}

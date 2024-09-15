import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class SecondRoom extends JLayeredPane implements ActionListener{

	private JLabel secondRoom,secondRoomDark,note,noteDark,firstLock,lock,rodAndLock,firstLockDark,lockDark,rodAndLockDark,firstLocker,
			firstLockerDark,waterBottle,waterBottleDark,waterBottleInv,secondLocker,tiara,tiaraInv,
			secondLockerDark,tiaraDark,secondLock,secondLockDark,secondLockAndKey,secondLockAndKeyDark,
			thirdLocker,thirdLockerDark,shovel,shovelDark,shovelInv,paintCanOpen,paintCanOpenDark,
			paint;
	
	private JButton lightButton,noteButton,exitButton,firstLockButton,exitButton2,unlockButton,firstLockerButton,waterBottleButton,
			tiaraButton,thirdLockerButton,secondLockerButton,exitButton3,exitButton4,thirdLockButton,unlockButton2,
			shovelButton,paintButton;
	
	private JPanel secondRoomPanel;
	
	private final int FRAMEHEIGHT,FRAMEWIDTH;
	
	private static boolean isDark = false;
	private static boolean isFirstLockerUnlocked = false;
	private static boolean hasBottle = false;
	private static boolean hasTiara = false;
	private static boolean hasShovel = false;
	private static boolean isThirdLockerUnlocked = false;
	private static boolean hasPainted = false;
	
	
	SecondRoom(){
		
	//----------------Inventory--------------------------
			
		this.add(Inventory.getInstance());
		revalidate();
		repaint();
		
		ImageIcon waterBottleInvImage = new ImageIcon("./PNGS/waterBottleInv.png");
		waterBottleInv = new JLabel();
		waterBottleInv.setIcon(waterBottleInvImage);
		waterBottleInv.setVisible(true);
		
		ImageIcon tiaraInvImage = new ImageIcon("./PNGS/tiaraInv.png");
		tiaraInv = new JLabel();
		tiaraInv.setIcon(tiaraInvImage);
		tiaraInv.setVisible(true);
		
		ImageIcon shovelInvImage = new ImageIcon("./PNGS/shovelInv.png");
		shovelInv = new JLabel();
		shovelInv.setIcon(shovelInvImage);
		shovelInv.setVisible(true);
	
		
	//----------------- Second Room Panel -----------------

		ImageIcon secondRoomDarkImage = new ImageIcon("./PNGS/secondRoomDark.png");
		FRAMEHEIGHT = secondRoomDarkImage.getIconHeight();
		FRAMEWIDTH = secondRoomDarkImage.getIconWidth();
		
		secondRoomPanel = new JPanel();
		secondRoomPanel.setLayout(null);
		secondRoomPanel.setBounds(0,0,FRAMEWIDTH,FRAMEHEIGHT);
		secondRoomPanel.setVisible(false);
		
		this.add(secondRoomPanel);
	
	//-------------Light & Dark Stuff------------------------	
	
		lightButton = new JButton();
		lightButton.setBounds(125,340,80,100);
		lightButton.setOpaque(false);
		lightButton.setFocusable(false);
		lightButton.setContentAreaFilled(false);
		lightButton.setBorderPainted(false); 
		lightButton.addActionListener(this);
		
		this.add(lightButton);
		
		exitButton = new JButton();
		exitButton.setBounds(825,40,100,100);
		exitButton.setOpaque(false);
		exitButton.setFocusable(false);
		exitButton.setContentAreaFilled(false);
		exitButton.setBorderPainted(false); 
		exitButton.addActionListener(this);
		exitButton.setVisible(false);
		
	//------------------ Note Button -------------------------
		
		noteButton = new JButton();
		noteButton.setBounds(360,100,140,60);
		noteButton.setOpaque(false);
		noteButton.setFocusable(false);
		noteButton.setContentAreaFilled(false);
		noteButton.setBorderPainted(false); 
		noteButton.addActionListener(this);
		
		this.add(noteButton);
		
	//------------------ First Lock Button -----------------------------

		firstLockButton = new JButton();
		firstLockButton.setBounds(350,450,100,100);
		firstLockButton.setOpaque(false);
		firstLockButton.setFocusable(false);
		firstLockButton.setContentAreaFilled(false);
		firstLockButton.setBorderPainted(false); 
		firstLockButton.addActionListener(this);
		firstLockButton.setVisible(true);
		
		this.add(firstLockButton);
		
		exitButton2 = new JButton();
		exitButton2.setBounds(825,40,100,100);
		exitButton2.setOpaque(false);
		exitButton2.setFocusable(false);
		exitButton2.setContentAreaFilled(false);
		exitButton2.setBorderPainted(false); 
		exitButton2.addActionListener(this);
		exitButton2.setVisible(false);
		
		
	//------------------ Second Lock Button -----------------------------

		secondLockerButton = new JButton();
		secondLockerButton.setBounds(550,450,100,100);
		secondLockerButton.setOpaque(false);
		secondLockerButton.setFocusable(false);
		secondLockerButton.setContentAreaFilled(false);
		secondLockerButton.setBorderPainted(false); 
		secondLockerButton.addActionListener(this);
		secondLockerButton.setVisible(true);
			
		this.add(secondLockerButton);
			
		exitButton3 = new JButton();
		exitButton3.setBounds(825,40,100,100);
		exitButton3.setOpaque(false);
		exitButton3.setFocusable(false);
		exitButton3.setContentAreaFilled(false);
		exitButton3.setBorderPainted(false); 
		exitButton3.addActionListener(this);
		exitButton3.setVisible(false);

	//-------------- Third Lock Button---------------------
		
		thirdLockButton = new JButton();
		thirdLockButton.setBounds(750,450,100,100);
		thirdLockButton.setOpaque(false);
		thirdLockButton.setFocusable(false);
		thirdLockButton.setContentAreaFilled(false);
		thirdLockButton.setBorderPainted(false); 
		thirdLockButton.addActionListener(this);
		thirdLockButton.setVisible(true);
		
		this.add(thirdLockButton);
		
		exitButton4 = new JButton();
		exitButton4.setBounds(825,40,100,100);
		exitButton4.setOpaque(false);
		exitButton4.setFocusable(false);
		exitButton4.setContentAreaFilled(false);
		exitButton4.setBorderPainted(false); 
		exitButton4.addActionListener(this);
		exitButton4.setVisible(false);
		
	//--------------------- Paint Button --------------------

		paintButton = new JButton();
		paintButton.setBounds(200,150,650,600);
		paintButton.setOpaque(false);
		paintButton.setFocusable(false);
		paintButton.setContentAreaFilled(false);
		paintButton.setBorderPainted(false); 		
		paintButton.addActionListener(this);
		paintButton.setVisible(true);
		
		this.add(paintButton);
		
	//---------------------- Paint Can --------------------------
		
		ImageIcon paintCanOpenImage = new ImageIcon("./PNGS/paintCanOpen.png");
		paintCanOpen = new JLabel();
		paintCanOpen.setBounds(30,670,paintCanOpenImage.getIconWidth(),paintCanOpenImage.getIconHeight());
		paintCanOpen.setIcon(paintCanOpenImage);
		paintCanOpen.setVisible(false);
		
		this.add(paintCanOpen);
		
		ImageIcon paintCanOpenDarkImage = new ImageIcon("./PNGS/paintCanOpenDark.png");
		paintCanOpenDark = new JLabel();
		paintCanOpenDark.setBounds(30,670,paintCanOpenDarkImage.getIconWidth(),paintCanOpenDarkImage.getIconHeight());
		paintCanOpenDark.setIcon(paintCanOpenDarkImage);
		paintCanOpenDark.setVisible(false);
	
	//--------------------- Paint -----------------------------
		
		ImageIcon paintImage = new ImageIcon("./PNGS/paint.png");
		paint = new JLabel();
		paint.setBounds(0,0,paintImage.getIconWidth(),paintImage.getIconHeight());
		paint.setIcon(paintImage);
		paint.setVisible(false);
		
	//--------------------- Unlock Button ----------------------------
		
		unlockButton = new JButton();
		unlockButton.setBounds(400,370,360,380);
		unlockButton.setOpaque(false);
		unlockButton.setFocusable(false);
		unlockButton.setContentAreaFilled(false);
		unlockButton.setBorderPainted(false); 
		unlockButton.addActionListener(this);
		unlockButton.setVisible(true);
		
		
	//-------------------- Unlock Button 2 ------------------------------
		
		unlockButton2 = new JButton();
		unlockButton2.setBounds(400,370,360,380);
		unlockButton2.setOpaque(false);
		unlockButton2.setFocusable(false);
		unlockButton2.setContentAreaFilled(false);
		unlockButton2.setBorderPainted(false); 
		unlockButton2.addActionListener(this);
		unlockButton2.setVisible(true);
		
	//-------------------- Note Mech --------------------------------------------
		
		ImageIcon noteImage = new ImageIcon("./PNGS/note.png");
		note = new JLabel();
		note.setBounds(0,0,FRAMEWIDTH,FRAMEHEIGHT);
		note.setIcon(noteImage);
		note.setVisible(false);
		
		ImageIcon noteDarkImage = new ImageIcon("./PNGS/noteDark.png");
		noteDark = new JLabel();
		noteDark.setBounds(0,0,FRAMEWIDTH,FRAMEHEIGHT);
		noteDark.setIcon(noteDarkImage);
		noteDark.setVisible(false);
	
	//----------------Second Room Background------------------
		
		ImageIcon secondRoomImage = new ImageIcon("./PNGS/secondRoom.png");
		secondRoom = new JLabel();
		secondRoom.setBounds(0,0,secondRoomImage.getIconWidth(),secondRoomImage.getIconHeight());
		secondRoom.setIcon(secondRoomImage);
		
		this.add(secondRoom,JLayeredPane.DEFAULT_LAYER);
		
		secondRoomDark = new JLabel();
		secondRoomDark.setBounds(0,0,FRAMEWIDTH,FRAMEHEIGHT);
		secondRoomDark.setIcon(secondRoomDarkImage);
		secondRoomDark.setVisible(false);
		
	//------------------First Locker Lock -------------------------------------
		
		ImageIcon firstLockImage = new ImageIcon("./PNGS/firstLock.png");
		firstLock = new JLabel();
		firstLock.setBounds(0,0,FRAMEWIDTH,FRAMEHEIGHT);
		firstLock.setIcon(firstLockImage);
		firstLock.setVisible(false);
		
		ImageIcon lockImage = new ImageIcon("./PNGS/lock.png");
		lock = new JLabel();
		lock.setBounds(390,260,lockImage.getIconWidth(),lockImage.getIconHeight());
		lock.setIcon(lockImage);
		lock.setVisible(false);
		
		ImageIcon rodAndLockImage = new ImageIcon("./PNGS/rodAndLock.png");
		rodAndLock = new JLabel();
		rodAndLock.setBounds(30,260,rodAndLockImage.getIconWidth(),rodAndLockImage.getIconHeight());
		rodAndLock.setIcon(rodAndLockImage);
		rodAndLock.setVisible(false);
		
		ImageIcon firstLockDarkImage = new ImageIcon("./PNGS/firstLockDark.png");
		firstLockDark = new JLabel();
		firstLockDark.setBounds(0,0,FRAMEWIDTH,FRAMEHEIGHT);
		firstLockDark.setIcon(firstLockDarkImage);
		firstLockDark.setVisible(false);
		
		ImageIcon lockDarkImage = new ImageIcon("./PNGS/lockDark.png");
		lockDark = new JLabel();
		lockDark.setBounds(390,260,lockDarkImage.getIconWidth(),lockDarkImage.getIconHeight());
		lockDark.setIcon(lockDarkImage);
		lockDark.setVisible(false);
		
		ImageIcon rodAndLockDarkImage = new ImageIcon("./PNGS/rodAndLockDark.png");
		rodAndLockDark = new JLabel();
		rodAndLockDark.setBounds(30,260,rodAndLockDarkImage.getIconWidth(),rodAndLockDarkImage.getIconHeight());
		rodAndLockDark.setIcon(rodAndLockDarkImage);
		rodAndLockDark.setVisible(false);
		
	//----------------- Third Locker Lock --------------------------------
		
		ImageIcon secondLockImage = new ImageIcon("./PNGS/secondLock.png");
		secondLock = new JLabel();
		secondLock.setBounds(400,270,secondLockImage.getIconWidth(),secondLockImage.getIconHeight());
		secondLock.setIcon(secondLockImage);
		secondLock.setVisible(false);
		
		ImageIcon secondLockAndKeyImage = new ImageIcon("./PNGS/secondLockAndKey.png");
		secondLockAndKey = new JLabel();
		secondLockAndKey.setBounds(180,270,secondLockAndKeyImage.getIconWidth(),secondLockAndKeyImage.getIconHeight());
		secondLockAndKey.setIcon(secondLockAndKeyImage);
		secondLockAndKey.setVisible(false);

		ImageIcon secondLockDarkImage = new ImageIcon("./PNGS/secondLockDark.png");
		secondLockDark = new JLabel();
		secondLockDark.setBounds(400,270,secondLockDarkImage.getIconWidth(),secondLockDarkImage.getIconHeight());
		secondLockDark.setIcon(secondLockDarkImage);
		secondLockDark.setVisible(false);
		
		ImageIcon secondLockAndKeyDarkImage = new ImageIcon("./PNGS/secondLockAndKeyDark.png");
		secondLockAndKeyDark = new JLabel();
		secondLockAndKeyDark.setBounds(180,270,secondLockAndKeyDarkImage.getIconWidth(),secondLockAndKeyDarkImage.getIconHeight());
		secondLockAndKeyDark.setIcon(secondLockAndKeyDarkImage);
		secondLockAndKeyDark.setVisible(false);
		
	//---------------------- First Locker Button -------------------------------------
		
		firstLockerButton = new JButton();
		firstLockerButton.setBounds(0,0,FRAMEWIDTH,FRAMEHEIGHT);
		firstLockerButton.setOpaque(false);
		firstLockerButton.setFocusable(false);
		firstLockerButton.setContentAreaFilled(false);
		firstLockerButton.setBorderPainted(false); 
		firstLockerButton.addActionListener(this);
		firstLockerButton.setVisible(false);

	//--------------------- Third Locker Button ------------------------------
		
		thirdLockerButton = new JButton();
		thirdLockerButton.setBounds(0,0,FRAMEWIDTH,FRAMEHEIGHT);
		thirdLockerButton.setOpaque(false);
		thirdLockerButton.setFocusable(false);
		thirdLockerButton.setContentAreaFilled(false);
		thirdLockerButton.setBorderPainted(false); 
		thirdLockerButton.addActionListener(this);
		thirdLockerButton.setVisible(false);
		
	//------------------------ First Locker ----------------------------------------
		
		ImageIcon firstLockerImage = new ImageIcon("./PNGS/firstLocker.png");
		firstLocker = new JLabel();
		firstLocker.setBounds(0,0,FRAMEWIDTH,FRAMEHEIGHT);
		firstLocker.setIcon(firstLockerImage);
		firstLocker.setVisible(false);
		
		ImageIcon firstLockerDarkImage = new ImageIcon("./PNGS/firstLockerDark.png");
		firstLockerDark = new JLabel();
		firstLockerDark.setBounds(0,0,FRAMEWIDTH,FRAMEHEIGHT);
		firstLockerDark.setIcon(firstLockerDarkImage);
		firstLockerDark.setVisible(false);

	//-------------------------- Second Locker -------------------------------------
		
		ImageIcon secondLockerImage = new ImageIcon("./PNGS/secondLocker.png");
		secondLocker = new JLabel();
		secondLocker.setBounds(0,0,FRAMEWIDTH,FRAMEHEIGHT);
		secondLocker.setIcon(secondLockerImage);
		secondLocker.setVisible(false);
		
		ImageIcon secondLockerDarkImage = new ImageIcon("./PNGS/secondLockerDark.png");
		secondLockerDark = new JLabel();
		secondLockerDark.setBounds(0,0,FRAMEWIDTH,FRAMEHEIGHT);
		secondLockerDark.setIcon(secondLockerDarkImage);
		secondLockerDark.setVisible(false);
		
	//------------------------------ Third Locker ------------------------------
		
		ImageIcon thirdLockerImage = new ImageIcon("./PNGS/thirdLocker.png");
		thirdLocker = new JLabel();
		thirdLocker.setBounds(0,0,FRAMEWIDTH,FRAMEHEIGHT);
		thirdLocker.setIcon(thirdLockerImage);
		thirdLocker.setVisible(false);
		
		ImageIcon thirdLockerDarkImage = new ImageIcon("./PNGS/thirdLockerDark.png");
		thirdLockerDark = new JLabel();
		thirdLockerDark.setBounds(0,0,FRAMEWIDTH,FRAMEHEIGHT);
		thirdLockerDark.setIcon(thirdLockerDarkImage);
		thirdLockerDark.setVisible(false);
		
	//------------------------- Water Bottle Button ---------------------------------
		
		waterBottleButton = new JButton();
		waterBottleButton.setBounds(210,310,200,410);
		waterBottleButton.setOpaque(false);
		waterBottleButton.setFocusable(false);
		waterBottleButton.setContentAreaFilled(false);
		waterBottleButton.setBorderPainted(false); 
		waterBottleButton.addActionListener(this);
		waterBottleButton.setVisible(false);
		
	//------------------------- Water Bottle ------------------------------------	
		
		ImageIcon waterBottleImage =  new ImageIcon("./PNGS/waterBottle.png");
		waterBottle = new JLabel();
		waterBottle.setBounds(200,300,waterBottleImage.getIconWidth(),waterBottleImage.getIconHeight());
		waterBottle.setIcon(waterBottleImage);
		waterBottle.setVisible(false);
		
		ImageIcon waterBottleDarkImage =  new ImageIcon("./PNGS/waterBottleDark.png");
		waterBottleDark = new JLabel();
		waterBottleDark.setBounds(200,300,waterBottleDarkImage.getIconWidth(),waterBottleDarkImage.getIconHeight());
		waterBottleDark.setIcon(waterBottleDarkImage);
		waterBottleDark.setVisible(false);
		
	//------------------- Tiara Button ----------------------------------
		
		tiaraButton = new JButton();
		tiaraButton.setBounds(220,460,520,300);
		tiaraButton.setOpaque(false);
		tiaraButton.setFocusable(false);
		tiaraButton.setContentAreaFilled(false);
		tiaraButton.setBorderPainted(false); 
		tiaraButton.addActionListener(this);
		tiaraButton.setVisible(false);
		
	//------------------------- Tiara ------------------------------------	
		
		ImageIcon tiaraImage =  new ImageIcon("./PNGS/tiara.png");
		tiara = new JLabel();
		tiara.setBounds(220,450,tiaraImage.getIconWidth(),tiaraImage.getIconHeight());
		tiara.setIcon(tiaraImage);
		tiara.setVisible(false);
		
		ImageIcon tiaraDarkImage =  new ImageIcon("./PNGS/tiaraDark.png");
		tiaraDark = new JLabel();
		tiaraDark.setBounds(220,450,tiaraDarkImage.getIconWidth(),tiaraDarkImage.getIconHeight());
		tiaraDark.setIcon(tiaraDarkImage);
		tiaraDark.setVisible(false);
		
	//------------------------ Shovel Button  -------------------
		
		shovelButton = new JButton();
		shovelButton.setBounds(610,10,200,710);
		shovelButton.setOpaque(false);
		shovelButton.setFocusable(false);
		shovelButton.setContentAreaFilled(false);
		shovelButton.setBorderPainted(false); 
		shovelButton.addActionListener(this);
		shovelButton.setVisible(false);
		
	//------------------------- Shovel ------------------------------------	
		
		ImageIcon shovelImage =  new ImageIcon("./PNGS/shovel.png");
		shovel = new JLabel();
		shovel.setBounds(610,10,shovelImage.getIconWidth(),shovelImage.getIconHeight());
		shovel.setIcon(shovelImage);
		shovel.setVisible(false);
		
		ImageIcon shovelDarkImage =  new ImageIcon("./PNGS/shovelDark.png");
		shovelDark = new JLabel();
		shovelDark.setBounds(610,10,shovelDarkImage.getIconWidth(),shovelDarkImage.getIconHeight());
		shovelDark.setIcon(shovelDarkImage);
		shovelDark.setVisible(false);
		
	//------------------------ Second Room Panel Addtions --------------------
		
		secondRoomPanel.add(firstLockerButton);
		secondRoomPanel.add(thirdLockerButton);
		secondRoomPanel.add(unlockButton);
		secondRoomPanel.add(unlockButton2);
		secondRoomPanel.add(waterBottleButton);
		secondRoomPanel.add(tiaraButton);
		secondRoomPanel.add(shovelButton);
		secondRoomPanel.add(exitButton);	
		secondRoomPanel.add(exitButton2);
		secondRoomPanel.add(exitButton3);
		secondRoomPanel.add(paintCanOpenDark);
		secondRoomPanel.add(noteDark);
		secondRoomPanel.add(note);
		secondRoomPanel.add(rodAndLock);
		secondRoomPanel.add(lock);
		secondRoomPanel.add(rodAndLockDark);
		secondRoomPanel.add(lockDark);
		secondRoomPanel.add(waterBottle);
		secondRoomPanel.add(waterBottleDark);
		secondRoomPanel.add(firstLockerDark);
		secondRoomPanel.add(firstLocker);
		secondRoomPanel.add(tiara);
		secondRoomPanel.add(tiaraDark);
		secondRoomPanel.add(secondLocker);
		secondRoomPanel.add(secondLockerDark);
		secondRoomPanel.add(exitButton4);
		secondRoomPanel.add(shovel);
		secondRoomPanel.add(shovelDark);
		secondRoomPanel.add(secondLock);
		secondRoomPanel.add(secondLockAndKey);
		secondRoomPanel.add(secondLockDark);
		secondRoomPanel.add(secondLockAndKeyDark);
		secondRoomPanel.add(thirdLocker);
		secondRoomPanel.add(thirdLockerDark);
		secondRoomPanel.add(firstLock);
		secondRoomPanel.add(firstLockDark);
		secondRoomPanel.add(paint);
		secondRoomPanel.add(secondRoomDark);

	}

	@Override //MADE BY AMY TRAN
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == lightButton && isDark == true) {
			secondRoomPanel.setVisible(false);
			secondRoomDark.setVisible(false);
			lightButton.setVisible(true);
			isDark = false;
			if(hasPainted == true) {
				paintCanOpen.setVisible(true);
				paintCanOpenDark.setVisible(false);
			}
			Room.inPanel = false;
		}
		else if(e.getSource() == lightButton ) {
			secondRoomPanel.setVisible(true);
			secondRoomDark.setVisible(true);
			lightButton.setVisible(true);
			isDark = true;
			paint.setVisible(false);
			if(hasPainted == true) {
				paintCanOpenDark.setVisible(true);
				paint.setVisible(true);
			}
			Room.inPanel = false;
		}
		
		if(e.getSource() == noteButton && isDark == true) {
			secondRoomPanel.setVisible(true);
			noteDark.setVisible(true);
			note.setVisible(false);
			noteButton.setVisible(false);
			exitButton.setVisible(true);
			lightButton.setVisible(false);
			firstLockButton.setVisible(false);
			secondLockerButton.setVisible(false);
			thirdLockButton.setVisible(false);
			paintButton.setVisible(false);
			paintCanOpenDark.setVisible(false);
			paint.setVisible(false);
			Room.inPanel = true;
		}
		else if(e.getSource() == noteButton) {
			noteButton.setVisible(false);
			secondRoomPanel.setVisible(true);
			note.setVisible(true);
			exitButton.setVisible(true);
			lightButton.setVisible(false);
			firstLockButton.setVisible(false);
			secondLockerButton.setVisible(false);
			thirdLockButton.setVisible(false);
			paintButton.setVisible(false);
			Room.inPanel = true;
		}
		
		if(e.getSource() == exitButton && isDark == true) {
			secondRoomPanel.setVisible(true);
			noteDark.setVisible(false);
			secondRoomDark.setVisible(true);
			noteButton.setVisible(true);
			exitButton.setVisible(false);
			lightButton.setVisible(true);
			firstLockButton.setVisible(true);
			secondLockerButton.setVisible(true);
			thirdLockButton.setVisible(true);
			if(hasPainted == true) {
				paintButton.setVisible(false);
				paint.setVisible(true);
				paintCanOpenDark.setVisible(true);
			}
			else {
			paintButton.setVisible(true);		
			}
			Room.inPanel = false;
			
		}
		else if(e.getSource() == exitButton) {
			secondRoomPanel.setVisible(false);
			note.setVisible(false);
			noteButton.setVisible(true);
			exitButton.setVisible(false);
			lightButton.setVisible(true);
			firstLockButton.setVisible(true);
			secondLockerButton.setVisible(true);
			thirdLockButton.setVisible(true);
			if(hasPainted == true) {
				paintButton.setVisible(false);
				paintCanOpen.setVisible(true);
			}
			else {
			paintButton.setVisible(true);
			}
			Room.inPanel = false;
		}
		
		if(e.getSource()== firstLockButton && isDark == true && isFirstLockerUnlocked == true) {
			secondRoomPanel.setVisible(true);
			firstLockerDark.setVisible(true);
			firstLockDark.setVisible(false);
			noteButton.setVisible(false);
			exitButton2.setVisible(true);
			lightButton.setVisible(false);
			firstLockButton.setVisible(false);
			secondLockerButton.setVisible(false);
			thirdLockButton.setVisible(false);
			if(hasBottle == false) {
				waterBottleDark.setVisible(true);
				waterBottleButton.setVisible(true);
			}
			paintButton.setVisible(false);
			paint.setVisible(false);
			paintCanOpenDark.setVisible(false);
			Room.inPanel = true;
		}
		
		else if(e.getSource()== firstLockButton && isFirstLockerUnlocked == true) { 
			secondRoomPanel.setVisible(true);
			firstLocker.setVisible(true);
			firstLock.setVisible(false);
			noteButton.setVisible(false);
			exitButton2.setVisible(true);
			lightButton.setVisible(false);
			firstLockButton.setVisible(false);
			secondLockerButton.setVisible(false);
			thirdLockButton.setVisible(false);
			if(hasBottle == false) {
				waterBottle.setVisible(true);
				waterBottleButton.setVisible(true);
			}
			paintButton.setVisible(false);
			paintCanOpen.setVisible(false);
			Room.inPanel = true;
		}
		else if(e.getSource()== firstLockButton && isDark == true) {
			secondRoomPanel.setVisible(true);
			firstLockDark.setVisible(true);
			noteButton.setVisible(false);
			exitButton2.setVisible(true);
			lightButton.setVisible(false);
			lockDark.setVisible(true);
			unlockButton.setVisible(true);
			secondLockerButton.setVisible(false);
			thirdLockButton.setVisible(false);
			paintButton.setVisible(false);
			paintCanOpenDark.setVisible(false);
			paint.setVisible(false);
			Room.inPanel = true;
		}
		
		else if(e.getSource() == firstLockButton) {
			secondRoomPanel.setVisible(true);
			firstLock.setVisible(true);
			noteButton.setVisible(false);
			exitButton2.setVisible(true);
			lightButton.setVisible(false);
			lock.setVisible(true);
			unlockButton.setVisible(true);
			secondLockerButton.setVisible(false);
			thirdLockButton.setVisible(false);
			paintButton.setVisible(false);
			paintCanOpen.setVisible(false);
			Room.inPanel = true;
		}
		
		if(e.getSource() == exitButton2 && isDark == true) {
			secondRoomPanel.setVisible(true);
			secondRoomDark.setVisible(true);
			firstLockDark.setVisible(false);
			lockDark.setVisible(false);
			noteButton.setVisible(true);
			exitButton2.setVisible(false);
			lightButton.setVisible(true);
			unlockButton.setVisible(false);
			firstLockButton.setVisible(true);
			exitButton2.setVisible(false);
			firstLockerDark.setVisible(false);
			waterBottleDark.setVisible(false);
			waterBottleButton.setVisible(false);
			secondLockerButton.setVisible(true);
			thirdLockButton.setVisible(true);
			if(hasPainted == true) {
				paintButton.setVisible(false);
				paint.setVisible(true);
				paintCanOpenDark.setVisible(true);
			}
			else {
			paintButton.setVisible(true);
			}
			Room.inPanel = false;
		}
		else if(e.getSource() == exitButton2) {
			secondRoomPanel.setVisible(false);
			firstLock.setVisible(false);
			lock.setVisible(false);
			noteButton.setVisible(true);
			exitButton2.setVisible(false);
			lightButton.setVisible(true);
			unlockButton.setVisible(false);
			firstLockButton.setVisible(true);
			exitButton2.setVisible(false);
			firstLocker.setVisible(false);
			waterBottle.setVisible(false);
			waterBottleButton.setVisible(false);
			secondLockerButton.setVisible(true);
			thirdLockButton.setVisible(true);
			if(hasPainted == true) {
				paintButton.setVisible(false);
				paintCanOpen.setVisible(true);
			}
			else {
			paintButton.setVisible(true);
			}
			Room.inPanel = false;
		}
		
		if(e.getSource()== firstLockerButton && isDark == true) {
			secondRoomPanel.setVisible(true);
			firstLockerDark.setVisible(true);
			firstLock.setVisible(false);
			noteButton.setVisible(false);
			lightButton.setVisible(false);
			lockDark.setVisible(false);
			rodAndLockDark.setVisible(false);
			secondLockerButton.setVisible(false);
			firstLockerButton.setVisible(false);
			if(hasBottle == false) {
				waterBottleDark.setVisible(true);
				waterBottleButton.setVisible(true);
			}
			paintButton.setVisible(false);
			paint.setVisible(false);
			paintCanOpenDark.setVisible(false);
			Room.inPanel = true;
		}
		else if(e.getSource()== firstLockerButton) {
			secondRoomPanel.setVisible(true);
			firstLocker.setVisible(true);
			firstLock.setVisible(false);
			noteButton.setVisible(false);
			lightButton.setVisible(false);
			lock.setVisible(false);
			rodAndLock.setVisible(false);
			secondLockerButton.setVisible(false);
			firstLockerButton.setVisible(false);
			if(hasBottle == false) {
				waterBottle.setVisible(true);
				waterBottleButton.setVisible(true);
			}
			paintButton.setVisible(false);
			paintCanOpen.setVisible(false);
			Room.inPanel = true;
		}
		

		if(e.getSource() == unlockButton) {
			if(Inventory.getInstance().isSelected()== "rodInvSel") {
				if(isDark == true) {
					rodAndLockDark.setVisible(true);
					lockDark.setVisible(false);
					unlockButton.setVisible(false);
				}
				else {
				rodAndLock.setVisible(true);
				unlockButton.setVisible(false);
				lock.setVisible(false);
				}
				
				Inventory.getInstance().deleteItem(Inventory.getInstance().isSelected());
				Inventory.getInstance().repaint();
				
				firstLockerButton.setVisible(true);
				unlockButton.setVisible(false);
				isFirstLockerUnlocked = true;
				
			}
			else {
				return;
			}
			Room.inPanel = true;
		}
		
		if(e.getSource()== thirdLockButton && isDark == true && isThirdLockerUnlocked == true) {
			secondRoomPanel.setVisible(true);
			secondLockDark.setVisible(false);
			firstLockDark.setVisible(true);
			noteButton.setVisible(false);
			exitButton4.setVisible(true);
			lightButton.setVisible(false);
			unlockButton2.setVisible(true);
			secondLockerButton.setVisible(false);
			firstLockerButton.setVisible(false);
			firstLocker.setVisible(false);
			secondLockerButton.setVisible(false);
			secondLocker.setVisible(false);
			thirdLockButton.setVisible(false);
			unlockButton.setVisible(false);
			thirdLocker.setVisible(false);	
			thirdLockerDark.setVisible(true);
			if(hasShovel == false) {
				shovelDark.setVisible(true);
				shovelButton.setVisible(true);
			}
			paintButton.setVisible(false);
			paint.setVisible(false);
			paintCanOpenDark.setVisible(false);
			Room.inPanel = true;
		}
		
		else if(e.getSource()== thirdLockButton && isThirdLockerUnlocked == true) { 
			secondRoomPanel.setVisible(true);
			firstLock.setVisible(false);
			noteButton.setVisible(false);
			exitButton4.setVisible(true);
			lightButton.setVisible(false);
			secondLock.setVisible(false);
			firstLockButton.setVisible(false);
			firstLocker.setVisible(false);
			secondLockerButton.setVisible(false);
			secondLocker.setVisible(false);
			unlockButton2.setVisible(true);
			thirdLockButton.setVisible(false);
			unlockButton.setVisible(false);
			thirdLockButton.setVisible(false);
			thirdLocker.setVisible(true);
			if(hasShovel == false) {
				shovel.setVisible(true);
				shovelButton.setVisible(true);
			}
			paintButton.setVisible(false);
			paintCanOpen.setVisible(false);
			Room.inPanel = true;
			
		}
		else if(e.getSource()== thirdLockButton && isDark == true) {
			secondRoomPanel.setVisible(true);
			secondLockDark.setVisible(true);
			firstLockDark.setVisible(true);
			noteButton.setVisible(false);
			exitButton4.setVisible(true);
			lightButton.setVisible(false);
			unlockButton2.setVisible(true);
			secondLockerButton.setVisible(false);
			firstLockerButton.setVisible(false);
			firstLocker.setVisible(false);
			secondLockerButton.setVisible(false);
			secondLocker.setVisible(false);
			thirdLockButton.setVisible(false);
			unlockButton.setVisible(false);
			thirdLocker.setVisible(false);		
			paintButton.setVisible(false);
			paint.setVisible(false);
			paintCanOpenDark.setVisible(false);
			Room.inPanel = true;
			}
		
		else if(e.getSource() == thirdLockButton) {
			secondRoomPanel.setVisible(true);
			firstLock.setVisible(true);
			noteButton.setVisible(false);
			exitButton4.setVisible(true);
			lightButton.setVisible(false);
			secondLock.setVisible(true);
			firstLockButton.setVisible(false);
			firstLocker.setVisible(false);
			secondLockerButton.setVisible(false);
			secondLocker.setVisible(false);
			unlockButton2.setVisible(true);
			thirdLockButton.setVisible(false);
			unlockButton.setVisible(false);
			thirdLockButton.setVisible(false);
			paintButton.setVisible(false);
			paintCanOpen.setVisible(false);
			Room.inPanel = true;
		}
		

		if(e.getSource() == exitButton4 && isDark == true) {
			secondRoomPanel.setVisible(true);
			secondLockDark.setVisible(false);
			firstLockDark.setVisible(false);
			noteButton.setVisible(true);
			exitButton4.setVisible(false);
			lightButton.setVisible(true);
			unlockButton2.setVisible(false);
			firstLockButton.setVisible(true);
			firstLocker.setVisible(false);
			shovelDark.setVisible(false);
			shovelButton.setVisible(false);
			secondLockerButton.setVisible(true);
			thirdLockButton.setVisible(true);
			thirdLockerDark.setVisible(false);
			if(hasPainted == true) {
				paintButton.setVisible(false);
				paint.setVisible(true);
				paintCanOpenDark.setVisible(true);
			}
			else {
			paintButton.setVisible(true);
			}
			Room.inPanel = false;

		}
		else if(e.getSource() == exitButton4) {
			secondRoomPanel.setVisible(false);
			secondLock.setVisible(false);
			firstLock.setVisible(false);
			noteButton.setVisible(true);
			exitButton4.setVisible(false);
			lightButton.setVisible(true);
			unlockButton2.setVisible(false);
			firstLockButton.setVisible(true);
			firstLocker.setVisible(false);
			shovel.setVisible(false);
			shovelButton.setVisible(false);
			secondLockerButton.setVisible(true);
			thirdLockButton.setVisible(true);
			thirdLocker.setVisible(false);
			if(hasPainted == true) {
				paintButton.setVisible(false);
				paintCanOpen.setVisible(true);
			}
			else {
			paintButton.setVisible(true);
			}
			Room.inPanel = false;
		}
		
		if(e.getSource()== thirdLockerButton && isDark == true) {
			secondRoomPanel.setVisible(true);
			thirdLockerDark.setVisible(true);
			secondLock.setVisible(false);
			noteButton.setVisible(false);
			lightButton.setVisible(false);
			secondLockAndKeyDark.setVisible(false);
			rodAndLock.setVisible(false);
			secondLockerButton.setVisible(false);
			firstLockerButton.setVisible(false);
			exitButton4.setVisible(true);
			thirdLockerButton.setVisible(false);
			if(hasShovel == false) {
				shovelDark.setVisible(true);
				shovelButton.setVisible(true);
			}
			paintButton.setVisible(false);
			paint.setVisible(false);
			paintCanOpenDark.setVisible(false);
			Room.inPanel = true;
		}
		else if(e.getSource()== thirdLockerButton) {
			secondRoomPanel.setVisible(true);
			thirdLocker.setVisible(true);
			secondLock.setVisible(false);
			noteButton.setVisible(false);
			lightButton.setVisible(false);
			secondLockAndKey.setVisible(false);
			rodAndLock.setVisible(false);
			secondLockerButton.setVisible(false);
			firstLockerButton.setVisible(false);
			thirdLockerButton.setVisible(false);
			exitButton4.setVisible(true);
			if(hasShovel == false) {
				shovel.setVisible(true);
				shovelButton.setVisible(true);
			}
			paintButton.setVisible(false);
			paintCanOpen.setVisible(false);
			Room.inPanel = true;
		}
		
		
		if(e.getSource() == unlockButton2) {
			if(Inventory.getInstance().isSelected()== "keyInvSel") {
				if(isDark == true) {
					firstLockerDark.setVisible(false);
					secondLockDark.setVisible(false);
					unlockButton2.setVisible(false);
					secondLockAndKeyDark.setVisible(true);
				}
				else {
					firstLocker.setVisible(false);
					secondLock.setVisible(false);
					unlockButton2.setVisible(false);
					secondLockAndKey.setVisible(true);
				}
				
				
				Inventory.getInstance().deleteItem(Inventory.getInstance().isSelected());
				Inventory.getInstance().repaint();
				
				firstLockerButton.setVisible(false);
				thirdLockerButton.setVisible(true);
				isThirdLockerUnlocked = true;
				unlockButton2.setVisible(false);
			}
			else {
				return;
			}
			Room.inPanel = true;
		}
		

		
		if(e.getSource()== waterBottleButton) {
			if(Inventory.getInstance().isFull()) {
				return;
			}
			else {
			hasBottle = true;
			waterBottleButton.setVisible(false);
			waterBottle.setVisible(false);
			waterBottleDark.setVisible(false);
			
			String itemSel = "waterBottleInvSel";
			Inventory.getInstance().addItem(waterBottleInv,itemSel);
			Inventory.getInstance().repaint();
			
			}
			
		}
		
		if(e.getSource()== secondLockerButton && isDark == true) {
			secondRoomPanel.setVisible(true);
			exitButton3.setVisible(true);
			firstLockDark.setVisible(false);
			lockDark.setVisible(false);
			noteButton.setVisible(false);
			lightButton.setVisible(false);
			secondLockerDark.setVisible(true);
			waterBottleDark.setVisible(false);
			waterBottleButton.setVisible(false);
			unlockButton.setVisible(false);
			firstLockButton.setVisible(true);
			firstLockerDark.setVisible(false);
			unlockButton2.setVisible(false);
			if(hasTiara == false) {
				tiaraButton.setVisible(true);
				tiaraDark.setVisible(true);
			}
			paintButton.setVisible(false);
			paintCanOpenDark.setVisible(false);
			paint.setVisible(false);
			Room.inPanel = true;
			
		}
		else if(e.getSource()== secondLockerButton) {
			secondRoomPanel.setVisible(true);
			exitButton3.setVisible(true);
			firstLock.setVisible(false);
			lock.setVisible(false);
			noteButton.setVisible(false);
			lightButton.setVisible(false);
			secondLocker.setVisible(true);
			waterBottle.setVisible(false);
			waterBottleButton.setVisible(false);
			unlockButton.setVisible(false);
			firstLockButton.setVisible(true);
			firstLocker.setVisible(false);
			unlockButton2.setVisible(false);
			if(hasTiara == false) {
				tiaraButton.setVisible(true);
				tiara.setVisible(true);
			}
			paintButton.setVisible(false);
			paintCanOpen.setVisible(false);
			Room.inPanel = true;
		}
		if(e.getSource()== exitButton3 && isDark == true) {
			secondRoomPanel.setVisible(true);
			exitButton3.setVisible(false);
			firstLockDark.setVisible(false);
			noteButton.setVisible(true);
			lightButton.setVisible(true);
			secondLockerDark.setVisible(false);
			tiaraButton.setVisible(false);
			tiaraDark.setVisible(false);
			paintButton.setVisible(true);
			if(hasPainted == true) {
				paintButton.setVisible(false);
				paint.setVisible(true);
				paintCanOpenDark.setVisible(true);
			}
			else {
			paintButton.setVisible(true);
			}
			Room.inPanel = false;
		}
		else if(e.getSource()== exitButton3) {
			secondRoomPanel.setVisible(false);
			exitButton3.setVisible(false);
			firstLock.setVisible(false);
			noteButton.setVisible(true);
			lightButton.setVisible(true);
			secondLocker.setVisible(false);
			tiaraButton.setVisible(false);
			tiara.setVisible(false);
			paintButton.setVisible(true);
			if(hasPainted == true) {
				paintButton.setVisible(false);
				paintCanOpen.setVisible(true);
			}
			else {
			paintButton.setVisible(true);
			}
			Room.inPanel = false;
		}
		
		if(e.getSource()== tiaraButton) {
			if(Inventory.getInstance().isFull()) {
				return;
			}
			else {
			hasTiara = true;
			tiaraButton.setVisible(false);
			tiara.setVisible(false);
			tiaraDark.setVisible(false);
			
			String itemSel = "tiaraInvSel";
			Inventory.getInstance().addItem(tiaraInv,itemSel);
			Inventory.getInstance().repaint();
			}
			
		}
		
		if(e.getSource()== shovelButton) {
			if(Inventory.getInstance().isFull()) {
				return;
			}
			else {
			hasShovel = true;
			shovelButton.setVisible(false);
			shovel.setVisible(false);
			shovelDark.setVisible(false);
			
			String itemSel = "shovelInvSel";
			Inventory.getInstance().addItem(shovelInv,itemSel);
			Inventory.getInstance().repaint();
			}
			
		}
		
		if(e.getSource() == paintButton) {
			if(Inventory.getInstance().isSelected()== "paintCanInvSel") {
				if(isDark == true) {
					paint.setVisible(true);
					paintCanOpenDark.setVisible(true);
				}
				else {
					paintCanOpen.setVisible(true);
				}
					hasPainted = true;
					paintButton.setVisible(false);
					Inventory.getInstance().deleteItem(Inventory.getInstance().isSelected());
					Inventory.getInstance().repaint();
				
			}
		}
	}
}

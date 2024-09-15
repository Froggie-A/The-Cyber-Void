import java.awt.*;
import java.awt.event.*;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;


public class FirstRoom extends JLayeredPane implements ActionListener {
	
	
	private ImageIcon clockImage;
	
	private Point clockImageCorner,prevPt;
	
	private JLabel firstRoom,lilliesPainting,roboSpeech,safeRoom,safeRoomRed,safeRoomGreen,safeRoomLights,unlockSafeRoom,engimaMachine,
			engimaMachineLights,tButton,iButton,mButton,eButton,heart,heartInv;
	
	private JLayeredPane firstRoomPanel,safePanel;
	
	private JButton roboChickenButton,exitButton, safeButton,exitButton2,exitButton3, unlockSafeButton, engimaMachineButton,exitButton4,
			heartButton;
	
	private Image safePaintingImage;
	
	private JButton button0,button1,button2,button3,button4,button5,button6,button7,button8,button9;

	private int button = -1;
	
	private final int FRAMEHEIGHT,FRAMEWIDTH;
	
	private static ArrayList<Integer> inputCode = new ArrayList <Integer>();
	private static ArrayList<Integer> safeCode = new ArrayList <Integer>();
	private static boolean hasFirst = false;
	private static boolean hasSecond = false;
	private static boolean hasThird = false;
	private static int buttonSecond = -1;
	private static int buttonThird = -1;
	 
	private static boolean isOpen = false;
	private static boolean isMoved = false;
	 

	static Timer timer = new Timer();
	static boolean isPressed = false;
	
	static boolean hasHeart = false;
	 
	FirstRoom() throws FileNotFoundException {
		
		
		this.add(Cipher.getInstance());
		Cipher.getInstance().displayEncryptedMessage(0);
		Cipher.getInstance().displayKey(0);

	//--------------- FrameWidth & FrameHeight-------------
		
		ImageIcon roboSpeechImage = new ImageIcon("./PNGS/roboSpeech.png");
		FRAMEHEIGHT = roboSpeechImage.getIconHeight();
		FRAMEWIDTH = roboSpeechImage.getIconWidth();

	//---------------- Inventory --------------------------
		
		this.add(Inventory.getInstance());
		revalidate();
		repaint();
		
		ImageIcon heartInvImage = new ImageIcon("./PNGS/heartInv.png");
		heartInv = new JLabel();
		heartInv.setIcon(heartInvImage);
		heartInv.setVisible(true);
		
	//---------------- First Room Panel --------------------------
		
		firstRoomPanel = new JLayeredPane();
		firstRoomPanel.setBounds(0,0,FRAMEWIDTH,FRAMEHEIGHT);
		firstRoomPanel.setOpaque(false);
		
		this.add(firstRoomPanel);
		
	//---------------- Robo Chicken Button ------------------------
		
		roboChickenButton = new JButton();
		roboChickenButton.setBounds(400,60,220,150);
		roboChickenButton.setVisible(true);
		roboChickenButton.setFocusable(false);
		roboChickenButton.setOpaque(false);
		roboChickenButton.setContentAreaFilled(false);
		roboChickenButton.setBorderPainted(false); 
		roboChickenButton.addActionListener(this);
		
		this.add(roboChickenButton);
		
	//---------------- Robo Chicken Dialog ------------------------
		
		roboSpeech = new JLabel();
		roboSpeech.setBounds(0,0,FRAMEWIDTH,FRAMEHEIGHT);
		roboSpeech.setIcon(roboSpeechImage);
		roboSpeech.setVisible(false);
	
		exitButton = new JButton();
		exitButton.setBounds(825,45,100,100);
		exitButton.setFocusable(false);
		exitButton.setOpaque(false);
		exitButton.setContentAreaFilled(false);
		exitButton.setBorderPainted(false); 
		exitButton.addActionListener(this);
		exitButton.setVisible(false);
		
	//------------------- Engima Machine Button -------------------------
		
		engimaMachineButton = new JButton();
		engimaMachineButton.setBounds(510,550,260,140);
		engimaMachineButton.setVisible(true);
		engimaMachineButton.setOpaque(false);
		engimaMachineButton.setContentAreaFilled(false);
		engimaMachineButton.setBorderPainted(false); 
		engimaMachineButton.addActionListener(this);
		
		this.add(engimaMachineButton);
		
	//-------------------- Engima Machine Mechanic --------------------------
		
		ImageIcon engimaMachineImage = new ImageIcon("./PNGS/engimaMachine.png");
		engimaMachine = new JLabel();
		engimaMachine.setBounds(0,0,FRAMEWIDTH,FRAMEHEIGHT);
		engimaMachine.setIcon(engimaMachineImage);
		engimaMachine.setVisible(false);
		
		ImageIcon tButtonImage = new ImageIcon("./PNGS/tButton.png");
		tButton = new JLabel();
		tButton.setBounds(430,290,tButtonImage.getIconWidth(),tButtonImage.getIconHeight());
		tButton.setIcon(tButtonImage);
		tButton.setVisible(false);	
		
		ImageIcon iButtonImage = new ImageIcon("./PNGS/iButton.png");
		iButton = new JLabel();
		iButton.setBounds(730,290,iButtonImage.getIconWidth(),iButtonImage.getIconHeight());
		iButton.setIcon(iButtonImage);
		iButton.setVisible(false);	
		
		ImageIcon mButtonImage = new ImageIcon("./PNGS/mButton.png");
		mButton = new JLabel();
		mButton.setBounds(720,550,mButtonImage.getIconWidth(),mButtonImage.getIconHeight());
		mButton.setIcon(mButtonImage);
		mButton.setVisible(false);	
		
		ImageIcon eButtonImage = new ImageIcon("./PNGS/eButton.png");
		eButton = new JLabel();
		eButton.setBounds(230,290,eButtonImage.getIconWidth(),eButtonImage.getIconHeight());
		eButton.setIcon(eButtonImage);
		eButton.setVisible(false);	
				
		ImageIcon engimaMachineLightsImage = new ImageIcon("./PNGS/engimaMachineLights.png");	
		engimaMachineLights = new JLabel();
		engimaMachineLights.setBounds(0,0,engimaMachineLightsImage.getIconWidth(),engimaMachineLightsImage.getIconHeight());
		engimaMachineLights.setIcon(engimaMachineLightsImage);
		engimaMachineLights.setVisible(false);
		
		exitButton4 = new JButton();
		exitButton4.setBounds(825,45,100,100);
		exitButton4.setOpaque(false);
		exitButton4.setFocusable(false);
		exitButton4.setContentAreaFilled(false);
		exitButton4.setBorderPainted(false); 
		exitButton4.addActionListener(this);
		exitButton4.setVisible(false);

	//--------------------Safe Room Button -------------------------

		safeButton = new JButton();
		safeButton.setBounds(670,180,150,180);
		safeButton.setOpaque(false);
		safeButton.setFocusable(false);
		safeButton.setContentAreaFilled(false);
		safeButton.setBorderPainted(false); 
		safeButton.addActionListener(this);
		safeButton.setVisible(false);
				
		this.add(safeButton);	
		
	//-------------------- Safe Room Mechanic -----------------------
		
		safePaintingImage = new ImageIcon("./PNGS/safePainting.png").getImage();
		
		ImageIcon safeRoomLightsImage = new ImageIcon("./PNGS/safeLights.png");
		safeRoomLights = new JLabel();
		safeRoomLights.setBounds(210,30,safeRoomLightsImage.getIconWidth(),safeRoomLightsImage.getIconHeight());
		safeRoomLights.setIcon(safeRoomLightsImage);
		safeRoomLights.setVisible(false);
		
		ImageIcon safeRoomRedImage = new ImageIcon("./PNGS/safeLightRed.png");
		safeRoomRed = new JLabel();
		safeRoomRed.setBounds(210,30,safeRoomRedImage.getIconWidth(),safeRoomRedImage.getIconHeight());
		safeRoomRed.setIcon(safeRoomRedImage);
		safeRoomRed.setVisible(false);
		
		ImageIcon safeRoomGreenImage = new ImageIcon("./PNGS/safeLightGreen.png");		
		safeRoomGreen = new JLabel();
		safeRoomGreen.setBounds(590,30,safeRoomGreenImage.getIconHeight(),safeRoomGreenImage.getIconHeight());
		safeRoomGreen.setIcon(safeRoomGreenImage);
		safeRoomGreen.setVisible(false);
	
		ImageIcon safeRoomImage = new ImageIcon("./PNGS/safeRoom.png");
		safeRoom = new JLabel();
		safeRoom.setBounds(0,0,FRAMEWIDTH,FRAMEHEIGHT);
		safeRoom.setIcon(safeRoomImage);
		safeRoom.setVisible(false);
				
		ImageIcon unlockSafeRoomImage = new ImageIcon("./PNGS/unlockSafeRoom.png");
		unlockSafeRoom = new JLabel();
		unlockSafeRoom.setBounds(0,0,FRAMEWIDTH,FRAMEHEIGHT);
		unlockSafeRoom.setIcon(unlockSafeRoomImage);
		unlockSafeRoom.setVisible(false);
		
		safePanel = new JLayeredPane();
		safePanel.setBounds(0,0,FRAMEWIDTH,FRAMEHEIGHT);
		safePanel.setOpaque(false);
		
		safePanel.add(safeRoom);
		safePanel.add(safeRoomRed);
		safePanel.add(safeRoomGreen);
		safePanel.add(safeRoomLights);
		safePanel.add(unlockSafeRoom);
		
		this.add(safePanel);
		
		exitButton2 = new JButton();
		exitButton2.setBounds(825,45,100,100);
		exitButton2.setOpaque(false);
		exitButton2.setFocusable(false);
		exitButton2.setContentAreaFilled(false);
		exitButton2.setBorderPainted(false); 
		exitButton2.addActionListener(this);
		exitButton2.setVisible(false);
		
		this.add(exitButton2);		
			
		unlockSafeButton = new JButton();
		unlockSafeButton.setBounds(0,0,FRAMEWIDTH,FRAMEHEIGHT);
		unlockSafeButton.setFocusable(false);
		unlockSafeButton.setOpaque(false);
		unlockSafeButton.setContentAreaFilled(false);
		unlockSafeButton.setBorderPainted(false); 
		unlockSafeButton.addActionListener(this);
		unlockSafeButton.setVisible(false);
		
		this.add(unlockSafeButton);		
		
		exitButton3 = new JButton();
		exitButton3.setBounds(825,45,100,100);
		exitButton3.setOpaque(false);
		exitButton3.setFocusable(false);
		exitButton3.setContentAreaFilled(false);
		exitButton3.setBorderPainted(false); 
		exitButton3.addActionListener(this);
		exitButton3.setVisible(false);
		
		this.add(exitButton3);
				
	//--------------Safe Buttons--------------------
		
		safeCode.add(8);
		safeCode.add(0);
		safeCode.add(3);
		
		button0 = new JButton();
		button1 = new JButton();
		button2 = new JButton();
		button3 = new JButton();
		button4 = new JButton();
		button5 = new JButton();
		button6 = new JButton();
		button7 = new JButton();
		button8 = new JButton();
		button9 = new JButton();
		
		button0.setBounds(375,670,210,140);
		button1.setBounds(145,190,210,140);
		button2.setBounds(375,190,210,140);
		button3.setBounds(605,190,210,140);
		button4.setBounds(145,350,210,140);
		button5.setBounds(375,350,210,140);
		button6.setBounds(605,350,210,140);
		button7.setBounds(145,510,210,140);
		button8.setBounds(375,510,210,140);
		button9.setBounds(605,510,210,140);
		
		button0.setOpaque(false);
		button0.setContentAreaFilled(false);
		button0.setBorderPainted(false); 
		
		button1.setOpaque(false);
		button1.setContentAreaFilled(false);
		button1.setBorderPainted(false); 
		
		button2.setOpaque(false);
		button2.setContentAreaFilled(false);
		button2.setBorderPainted(false); 
		
		button3.setOpaque(false);
		button3.setContentAreaFilled(false);
		button3.setBorderPainted(false); 
		
		button4.setOpaque(false);
		button4.setContentAreaFilled(false);
		button4.setBorderPainted(false); 
		
		button5.setOpaque(false);
		button5.setContentAreaFilled(false);
		button5.setBorderPainted(false); 
		
		button6.setOpaque(false);
		button6.setContentAreaFilled(false);
		button6.setBorderPainted(false); 

		button7.setOpaque(false);
		button7.setContentAreaFilled(false);
		button7.setBorderPainted(false); 
		
		button8.setOpaque(false);
		button8.setContentAreaFilled(false);
		button8.setBorderPainted(false); 
		
		button9.setOpaque(false);
		button9.setContentAreaFilled(false);
		button9.setBorderPainted(false); 
				
		button0.setVisible(false);
		button1.setVisible(false);
		button2.setVisible(false);
		button3.setVisible(false);
		button4.setVisible(false);
		button5.setVisible(false);
		button6.setVisible(false);
		button7.setVisible(false);
		button8.setVisible(false);
		button9.setVisible(false);
		
		button0.addActionListener(this);
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
		button5.addActionListener(this);
		button6.addActionListener(this);
		button7.addActionListener(this);
		button8.addActionListener(this);
		button9.addActionListener(this);
		
		this.add(button0);
		this.add(button1);	
		this.add(button2);
		this.add(button3);
		this.add(button4);
		this.add(button5);
		this.add(button6);
		this.add(button7);
		this.add(button8);
		this.add(button9);
				
	//-------------------- Heart ---------------------------------------
		
		ImageIcon heartImage = new ImageIcon("./PNGS/heart.png");		
		heart = new JLabel();
		heart.setBounds(90,660,heartImage.getIconWidth(),heartImage.getIconHeight());
		heart.setIcon(heartImage);
		heart.setVisible(true);
			
		this.add(heart,JLayeredPane.DEFAULT_LAYER);
						
		heartButton = new JButton();
		heartButton.setBounds(100,670,130,100);	
		heartButton.setOpaque(false);
		heartButton.setFocusable(false);
		heartButton.setContentAreaFilled(false);	
		heartButton.setBorderPainted(false); 
		heartButton.addActionListener(this);
		heartButton.setVisible(true);
		
		this.add(heartButton,JLayeredPane.DEFAULT_LAYER);	
					
	//----------------- First Room Panel Additions ------------------
		
		firstRoomPanel.add(roboSpeech);
		firstRoomPanel.add(exitButton);
		firstRoomPanel.add(engimaMachine);
		firstRoomPanel.add(tButton);
		firstRoomPanel.add(iButton);
		firstRoomPanel.add(mButton);
		firstRoomPanel.add(eButton);
		firstRoomPanel.add(engimaMachineLights);
		firstRoomPanel.add(exitButton4);	
		
	//----------------- First Room Background --------------------	
		
		this.setBounds(0,0,1214,886);
		
		ImageIcon firstRoomImage = new ImageIcon("./PNGS/firstRoom.png");
		firstRoom = new JLabel();
		firstRoom.setBounds(0,0,firstRoomImage.getIconWidth(),firstRoomImage.getIconHeight());
		firstRoom.setIcon(firstRoomImage);
		
		this.add(firstRoom);
	
	//---------------------Clock Mechanism------------------------
		
		clockImage = new ImageIcon("./PNGS/clocksPainting.png");
		
		ImageIcon lilliesPaintingImage = new ImageIcon("./PNGS/lilliesPainting.png");
		lilliesPainting = new JLabel();
		lilliesPainting.setIcon(lilliesPaintingImage);
		lilliesPainting.setBounds(90,360,lilliesPaintingImage.getIconWidth(),lilliesPaintingImage.getIconHeight());
		
		clockImageCorner = new Point(650,120);
		ClickListener clickListner = new ClickListener();
		DragListener dragListener = new DragListener();
		
		lilliesPainting.addMouseListener(clickListner);
		lilliesPainting.addMouseMotionListener(dragListener);
		
		this.add(lilliesPainting,JLayeredPane.DEFAULT_LAYER);

	
	}
	@Override //MADE BY AMY TRAN
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == roboChickenButton) {
			firstRoomPanel.setVisible(true);
			roboSpeech.setVisible(true);
			exitButton.setVisible(true);
			roboChickenButton.setVisible(false);
			engimaMachineButton.setVisible(false);
			safeButton.setVisible(false);
			try {
				Cipher.getInstance().displayEncryptedMessage(1);
			} catch (FileNotFoundException e1) {
				e1.printStackTrace();
			}
			Room.inPanel = true;
		}
		
		if(e.getSource() == exitButton) {
			firstRoomPanel.setVisible(false);
			exitButton.setVisible(false);
			roboSpeech.setVisible(false);
			roboChickenButton.setVisible(true);	
			engimaMachineButton.setVisible(true);
			Room.inPanel = false;
			try {
				Cipher.getInstance().displayEncryptedMessage(0);
			} catch (FileNotFoundException e1) {
				e1.printStackTrace();
			}
			if(isMoved == true) {
				safeButton.setVisible(true);
			}
			if(hasHeart == false) {
				heartButton.setVisible(true);
				heart.setVisible(true);
			}
		}
		
		if(e.getSource() == safeButton && isOpen == true) {
			safePanel.setVisible(true);
			unlockSafeRoom.setVisible(true);
			exitButton2.setVisible(false);
			button0.setVisible(false);
			button1.setVisible(false);
			button2.setVisible(false);
			button3.setVisible(false);
			button4.setVisible(false);
			button5.setVisible(false);
			button6.setVisible(false);
			button7.setVisible(false);
			button8.setVisible(false);
			button9.setVisible(false);
			safeRoomLights.setVisible(false);
			safeRoomRed.setVisible(false);
			safeRoomGreen.setVisible(false);
			exitButton3.setVisible(true);
			engimaMachineButton.setVisible(false);
			try {
				Cipher.getInstance().displayKey(1);
			} catch (FileNotFoundException e1) {
				e1.printStackTrace();
			}
			Room.inPanel = true;
		}
		else if(e.getSource() == safeButton) {
			safeRoom.setVisible(true);
			safePanel.setVisible(true);
			safeRoomLights.setVisible(true);
			unlockSafeRoom.setVisible(false);
			safeButton.setVisible(false);
			exitButton2.setVisible(true);
			button0.setVisible(true);
			button1.setVisible(true);
			button2.setVisible(true);
			button3.setVisible(true);
			button4.setVisible(true);
			button5.setVisible(true);
			button6.setVisible(true);
			button7.setVisible(true);
			button8.setVisible(true);
			button9.setVisible(true);
			roboChickenButton.setVisible(false);
			engimaMachineButton.setVisible(false);
			heartButton.setVisible(false);
			Room.inPanel = true;
			
			
		}
		if(e.getSource() == exitButton2) {
			exitButton2.setVisible(false);
			safePanel.setVisible(false);
			safeRoom.setVisible(false);
			safeRoomLights.setVisible(false);
			safeButton.setVisible(true);	
			button0.setVisible(false);
			button1.setVisible(false);
			button2.setVisible(false);
			button3.setVisible(false);
			button4.setVisible(false);
			button5.setVisible(false);
			button6.setVisible(false);
			button7.setVisible(false);
			button8.setVisible(false);
			button9.setVisible(false);
			roboChickenButton.setVisible(true);
			engimaMachineButton.setVisible(true);
			Room.inPanel = false;
			if(isMoved == true) {
				safeButton.setVisible(true);
			}
			if(hasHeart == false) {
				heartButton.setVisible(true);
				heart.setVisible(true);
			}
			try {
				Cipher.getInstance().displayKey(0);
			} catch (FileNotFoundException e1) {
				e1.printStackTrace();
			}
		}
	
	
	if(e.getSource() == unlockSafeButton) {
		safePanel.setVisible(true);
		unlockSafeRoom.setVisible(true);
		safeRoom.setVisible(false);
		exitButton2.setVisible(false);
		exitButton3.setVisible(true);
		button0.setVisible(false);
		button1.setVisible(false);
		button2.setVisible(false);
		button3.setVisible(false);
		button4.setVisible(false);
		button5.setVisible(false);
		button6.setVisible(false);
		button7.setVisible(false);
		button8.setVisible(false);
		button9.setVisible(false);
		safeRoomLights.setVisible(false);
		safeRoomGreen.setVisible(false);
		unlockSafeButton.setVisible(false);
		heartButton.setVisible(false);
		Room.inPanel = true;
		try {
			Cipher.getInstance().displayKey(1);
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
	}
	
	if(e.getSource() == exitButton3) {
		Room.inPanel = false;
		safePanel.setVisible(false);
		unlockSafeRoom.setVisible(false);
		if(isMoved == true) {
		safeButton.setVisible(true);
		}
		roboChickenButton.setVisible(true);
		unlockSafeButton.setVisible(false);
		engimaMachineButton.setVisible(true);
		if(hasHeart == false) {
			heartButton.setVisible(true);
			heart.setVisible(true);
		}
		try {
			Cipher.getInstance().displayKey(0);
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
		
	}
	
	if(e.getSource() == engimaMachineButton) {
		
		firstRoomPanel.setVisible(true);
		exitButton4.setVisible(true);
		engimaMachine.setVisible(true);
		engimaMachineLights.setVisible(true);
		roboChickenButton.setVisible(false);
		safeButton.setVisible(false);
		heartButton.setVisible(false);
		engimaMachineButton.setVisible(false);
		isPressed=false;
		Room.inPanel = true;
		
		
		TimerTask task = new TimerTask() {
			
			@Override
			public void run() {
				if(isPressed == true) {
					return;
				}
				//T-Button
					for(int j = 0; j<1 ;j++) {
						if(isPressed == true) {
							return;
						}
						tButton.setVisible(true);
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
						
							e.printStackTrace();
						}
						if(isPressed == true) {
							return;
						}
						
						tButton.setVisible(false);
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							
							e.printStackTrace();
						}
					}
				//I-Button
					for(int j = 0; j<8 ;j++) {
						if(isPressed == true) {
							return;
						}
						iButton.setVisible(true);
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
						
							e.printStackTrace();
						}
						if(isPressed == true) {
							return;
						}
						
						iButton.setVisible(false);
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							
							e.printStackTrace();
						}
					}
				//M-Button
					for(int j = 0; j<7 ;j++) {
						if(isPressed == true) {
							return;
						}
						mButton.setVisible(true);
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
						
							e.printStackTrace();
						}
						if(isPressed == true) {
							return;
						}
						
						mButton.setVisible(false);
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							
							e.printStackTrace();
						}
					}
					
				//E-Button
					for(int j = 0; j<4 ;j++) {
						if(isPressed == true) {
							return;
						}
						eButton.setVisible(true);
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
						
							e.printStackTrace();
						}
						if(isPressed == true) {
							return;
						}
						
						eButton.setVisible(false);
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							
							e.printStackTrace();
						}
					}
			
				}	
	
		};
		
			timer.scheduleAtFixedRate(task,1000,2000);
				
	}
	
	if(e.getSource() == exitButton4) {
		isPressed = true;
		tButton.setVisible(false);
		iButton.setVisible(false);
		mButton.setVisible(false);
		eButton.setVisible(false);
		exitButton4.setVisible(false);
		firstRoomPanel.setVisible(false);
		engimaMachine.setVisible(false);
		engimaMachineLights.setVisible(false);
		roboChickenButton.setVisible(true);
		engimaMachineButton.setVisible(true);
		Room.inPanel = false;
		if(isMoved == true) {
			safeButton.setVisible(true);
		}
		if(hasHeart == false) {
			heart.setVisible(true);
			heartButton.setVisible(true);
		}
		
	}
		
	if(e.getSource() == button0 || e.getSource() == button1 || e.getSource() == button1 || e.getSource() == button2
			|| e.getSource() == button3|| e.getSource() == button4|| e.getSource() == button5|| e.getSource() == button6
			|| e.getSource() == button7|| e.getSource() == button8|| e.getSource() == button9 && isOpen == false) {
		
			safeRoomRed.setVisible(false);
		
			if(inputCode.size() < 3 && hasThird == false ) {
				 if(hasFirst == false) {
						 if(e.getSource() == button0) {
							button = 0;
						 }
						 if(e.getSource() == button1) {
							 button = 1;
						 }
						 if(e.getSource() == button2) {
							 button = 2;
						 }
						 if(e.getSource() == button3) {
							 button = 3;
						 }
						 if(e.getSource() == button4) {
							 button = 4;
						 }
						 if(e.getSource() == button5) {
							 button = 5;
						 }
						 if(e.getSource() == button6) {
							 button = 6;
						 }
						 if(e.getSource() == button7) {
							 button = 7;
						 }
						 if(e.getSource() == button8) {
							 button = 8;
						 }
						 if(e.getSource() == button9) {
							 button = 9;
						 }
						 inputCode.add(button);
						 hasFirst = true;
						
					 }
				else if(hasFirst == true && hasSecond == false) {
						 if(e.getSource() == button0) {
								buttonSecond = 0;
						 }
						 if(e.getSource() == button1) {
								 buttonSecond = 1;
						 }
						 if(e.getSource() == button2) {
								 buttonSecond = 2;
						 }
						 if(e.getSource() == button3) {
								 buttonSecond = 3;
						 }
						 if(e.getSource() == button4) {
								 buttonSecond = 4;
						 }
						 if(e.getSource() == button5) {
								 buttonSecond = 5;
						 }
						 if(e.getSource() == button6) {
								 buttonSecond = 6;
						 }
						 if(e.getSource() == button7) {
								 buttonSecond = 7;
						 }
						 if(e.getSource() == button8) {
								 buttonSecond = 8;
						 }
						 if(e.getSource() == button9) {
								 buttonSecond = 9;
						 }
						 hasSecond = true;
						 inputCode.add(buttonSecond);
						
					 }
					
				 else if(hasFirst == true && hasSecond == true) {
						 if(e.getSource() == button0) {
								buttonThird = 0;
						 }
						 if(e.getSource() == button1) {
							 	buttonThird = 1;
						 }
						 if(e.getSource() == button2) {
							 	buttonThird = 2;
						 }
						 if(e.getSource() == button3) {
							 	buttonThird = 3;
						 }
						 if(e.getSource() == button4) {
							 	buttonThird = 4;
						 }
						 if(e.getSource() == button5) {
							 	buttonThird = 5;
						 }
						 if(e.getSource() == button6) {
							 	buttonThird = 6;
						 }
						 if(e.getSource() == button7) {
							 	buttonThird = 7;
						 }
						 if(e.getSource() == button8) {
							 	buttonThird = 8;
						 }
						 if(e.getSource() == button9) {
							 	buttonThird = 9;
						 } 
						hasThird = true;
					
					 	inputCode.add(buttonThird);
					 	
					 	 if(inputCode.equals(safeCode)){
					 		unlockSafeButton.setVisible(true);
					 		exitButton2.setVisible(false);
					 		try {
					 			safeRoomGreen.setVisible(true);
								Thread.sleep(200);
							} catch (InterruptedException e1) {
								e1.printStackTrace();
							}
					 		isOpen = true;
					 	
						 	}
					 	 else if(!inputCode.equals(safeCode)) {
							
					 		try {
					 			safeRoomRed.setVisible(true);
								Thread.sleep(200);
							} catch (InterruptedException e1) {
								e1.printStackTrace();
							}
					 	
							 inputCode.clear();
							 hasFirst = false;
							 hasSecond = false;
							 hasThird = false;
							
						 	}
					 	}	
					}
				}	
	
	
	
		if(e.getSource() == heartButton) {
			if(Inventory.getInstance().isFull()) {
				return;
			}
			else {
			heartButton.setVisible(false);
			heart.setVisible(false);
			hasHeart = true;
			
			String itemSel = "heartInvSel";
			Inventory.getInstance().addItem(heartInv,itemSel);
			Inventory.getInstance().repaint();
			
			}
			}
	
		}

	@Override
	public void paintComponent(Graphics g) {
		Inventory.getInstance().revalidate();
		Inventory.getInstance().repaint();
		super.paintComponent(g);
		
		g.drawImage(safePaintingImage,650,115,null);
		clockImage.paintIcon(this, g,(int) clockImageCorner.getX(),(int) clockImageCorner.getY());
	}
	
	private class ClickListener extends MouseAdapter {
		
		public void mousePressed(MouseEvent e) {
			prevPt = e.getPoint();
		}
	}
	
	private class DragListener extends MouseMotionAdapter {
		
		public void mouseDragged(MouseEvent e) {
			
			Point currentPt = e.getPoint();
			clockImageCorner.translate((int)(currentPt.getX()-prevPt.getX()),
								 (int)(currentPt.getY()-prevPt.getY()));
			
			prevPt = currentPt;
			repaint();
			
			if(clockImageCorner.getY() > 360 || clockImageCorner.getY()<-50 ||
				clockImageCorner.getX()<490 || clockImageCorner.getX() > 800) {
				safeButton.setVisible(true);
				isMoved = true;
			}
		}
	}
}

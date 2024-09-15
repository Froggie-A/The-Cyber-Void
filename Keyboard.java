import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;

public class Keyboard extends JLayeredPane implements ActionListener{
	
	private ArrayList<String> messageTyped = new ArrayList<String>();
	private ArrayList<String> message = new ArrayList<String>();
	private boolean isSame = false;
	JButton button,doneButton,backspaceButton;
	JButton A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T,U,V,W,X,Y,Z;
	private Container letters = new Container();
	private static volatile Keyboard instance;
	private int x = 0;
	private int x2 = 0;
	
	private JLabel endRoom,shark1,shark2,shark3,shark4,shark5;
	
	static Timer timer = new Timer();
	
	Keyboard(){

		this.add(Inventory.getInstance());
		revalidate();
		repaint();	
		
		message.add("L");
		message.add("I");
		message.add("T");
		message.add("T");
		message.add("L");
		message.add("E");
		message.add("W");
		message.add("O");
		message.add("L");
		message.add("F");
		message.add("W");
		message.add("A");
		message.add("L");
		message.add("K");
		message.add("E");
		message.add("R");
		message.add("S");
		
		doneButton = new JButton();
		doneButton.setBounds(30,280,200,90);
		doneButton.setVisible(true);
		doneButton.setFocusable(false);
		doneButton.setOpaque(false);
		doneButton.setContentAreaFilled(false);
		doneButton.setBorderPainted(false); 
		doneButton.addActionListener(this);
		this.add(doneButton);
		
		backspaceButton = new JButton();
		backspaceButton.setBounds(730,280,200,90);
		backspaceButton.setVisible(true);
		backspaceButton.setFocusable(false);
		backspaceButton.setOpaque(false);
		backspaceButton.setContentAreaFilled(false);
		backspaceButton.setBorderPainted(false); 
		backspaceButton.addActionListener(this);
		this.add(backspaceButton);
		
		
		Q = new JButton();
		Q.setBounds(40,400,70,110);
		Q.setVisible(true);
		Q.setOpaque(false);
		Q.setFocusable(false);
		Q.setContentAreaFilled(false);
		Q.setBorderPainted(false); 
		Q.addActionListener(this);
		this.add(Q);
		
		W = new JButton();
		W.setBounds(130,400,70,110);
		W.setVisible(true);
		W.setOpaque(false);
		W.setFocusable(false);
		W.setContentAreaFilled(false);
		W.setBorderPainted(false); 
		W.addActionListener(this);
		this.add(W);
		
		E = new JButton();
		E.setBounds(220,400,70,110);
		E.setVisible(true);
		E.setOpaque(false);
		E.setFocusable(false);
		E.setContentAreaFilled(false);
		E.setBorderPainted(false); 
		E.addActionListener(this);
		this.add(E);
		
		R = new JButton();
		R.setBounds(310,400,70,110);
		R.setVisible(true);
		R.setOpaque(false);
		R.setFocusable(false);
		R.setContentAreaFilled(false);
		R.setBorderPainted(false); 
		R.addActionListener(this);
		this.add(R);
		
		T = new JButton();
		T.setBounds(400,400,70,110);
		T.setVisible(true);
		T.setOpaque(false);
		T.setFocusable(false);
		T.setContentAreaFilled(false);
		T.setBorderPainted(false); 
		T.addActionListener(this);
		this.add(T);
		
		Y = new JButton();
		Y.setBounds(490,400,70,110);
		Y.setVisible(true);
		Y.setOpaque(false);
		Y.setFocusable(false);
		Y.setContentAreaFilled(false);
		Y.setBorderPainted(false); 
		Y.addActionListener(this);
		this.add(Y);
		
		U = new JButton();
		U.setBounds(580,400,70,110);
		U.setVisible(true);
		U.setOpaque(false);
		U.setFocusable(false);
		U.setContentAreaFilled(false);
		U.setBorderPainted(false); 
		U.addActionListener(this);
		this.add(U);
		
		I = new JButton();
		I.setBounds(670,400,70,110);
		I.setVisible(true);
		I.setOpaque(false);
		I.setFocusable(false);
		I.setContentAreaFilled(false);
		I.setBorderPainted(false); 
		I.addActionListener(this);
		this.add(I);
		
		O = new JButton();
		O.setBounds(760,400,70,110);
		O.setVisible(true);
		O.setOpaque(false);
		O.setFocusable(false);
		O.setContentAreaFilled(false);
		O.setBorderPainted(false); 
		O.addActionListener(this);
		this.add(O);
		
		P = new JButton();
		P.setBounds(850,400,70,110);
		P.setVisible(true);
		P.setOpaque(false);
		P.setFocusable(false);
		P.setContentAreaFilled(false);
		P.setBorderPainted(false); 
		P.addActionListener(this);
		this.add(P);
		
		A = new JButton();
		A.setBounds(80,540,70,110);
		A.setVisible(true);
		A.setOpaque(false);
		A.setFocusable(false);
		A.setContentAreaFilled(false);
		A.setBorderPainted(false); 
		A.addActionListener(this);
		this.add(A);
		
		S = new JButton();
		S.setBounds(170,540,70,110);
		S.setVisible(true);
		S.setOpaque(false);
		S.setFocusable(false);
		S.setContentAreaFilled(false);
		S.setBorderPainted(false); 
		S.addActionListener(this);
		this.add(S);
		
		D = new JButton();
		D.setBounds(260,540,70,110);
		D.setVisible(true);
		D.setOpaque(false);
		D.setFocusable(false);
		D.setContentAreaFilled(false);
		D.setBorderPainted(false); 
		D.addActionListener(this);
		this.add(D);
		
		F = new JButton();
		F.setBounds(350,540,70,110);
		F.setVisible(true);
		F.setOpaque(false);
		F.setFocusable(false);
		F.setContentAreaFilled(false);
		F.setBorderPainted(false); 
		F.addActionListener(this);
		this.add(F);
		
		G = new JButton();
		G.setBounds(440,540,70,110);
		G.setVisible(true);
		G.setOpaque(false);
		G.setFocusable(false);
		G.setContentAreaFilled(false);
		G.setBorderPainted(false); 
		G.addActionListener(this);
		this.add(G);
		
		H = new JButton();
		H.setBounds(530,540,70,110);
		H.setVisible(true);
		H.setOpaque(false);
		H.setFocusable(false);
		H.setContentAreaFilled(false);
		H.setBorderPainted(false); 
		H.addActionListener(this);
		this.add(H);
		
		J = new JButton();
		J.setBounds(620,540,70,110);
		J.setVisible(true);
		J.setOpaque(false);
		J.setFocusable(false);
		J.setContentAreaFilled(false);
		J.setBorderPainted(false); 
		J.addActionListener(this);
		this.add(J);
		
		K = new JButton();
		K.setBounds(710,540,70,110);
		K.setVisible(true);
		K.setOpaque(false);
		K.setFocusable(false);
		K.setContentAreaFilled(false);
		K.setBorderPainted(false); 
		K.addActionListener(this);
		this.add(K);
		
		L = new JButton();
		L.setBounds(800,540,70,110);
		L.setVisible(true);
		L.setOpaque(false);
		L.setFocusable(false);
		L.setContentAreaFilled(false);
		L.setBorderPainted(false); 
		L.addActionListener(this);
		this.add(L);
		
		Z = new JButton();
		Z.setBounds(180,680,70,110);
		Z.setVisible(true);
		Z.setOpaque(false);
		Z.setFocusable(false);
		Z.setContentAreaFilled(false);
		Z.setBorderPainted(false); 
		Z.addActionListener(this);
		this.add(Z);
		
		X = new JButton();
		X.setBounds(270,680,70,110);
		X.setVisible(true);
		X.setOpaque(false);
		X.setFocusable(false);
		X.setContentAreaFilled(false);
		X.setBorderPainted(false); 
		X.addActionListener(this);
		this.add(X);
		
		C = new JButton();
		C.setBounds(360,680,70,110);
		C.setVisible(true);
		C.setOpaque(false);
		C.setFocusable(false);
		C.setContentAreaFilled(false);
		C.setBorderPainted(false); 
		C.addActionListener(this);
		this.add(C);
		
		V = new JButton();
		V.setBounds(450,680,70,110);
		V.setVisible(true);
		V.setOpaque(false);
		V.setFocusable(false);
		V.setContentAreaFilled(false);
		V.setBorderPainted(false); 
		V.addActionListener(this);
		this.add(V);
		
		B = new JButton();
		B.setBounds(540,680,70,110);
		B.setVisible(true);
		B.setOpaque(false);
		B.setFocusable(false);
		B.setContentAreaFilled(false);
		B.setBorderPainted(false); 
		B.addActionListener(this);
		this.add(B);
		
		N = new JButton();
		N.setBounds(630,680,70,110);
		N.setVisible(true);
		N.setOpaque(false);
		N.setFocusable(false);
		N.setContentAreaFilled(false);
		N.setBorderPainted(false); 
		N.addActionListener(this);
		this.add(N);
		
		M = new JButton();
		M.setBounds(720,680,70,110);
		M.setVisible(true);
		M.setOpaque(false);
		M.setFocusable(false);
		M.setContentAreaFilled(false);
		M.setBorderPainted(false); 
		M.addActionListener(this);
		this.add(M);

		ImageIcon endRoomImage = new ImageIcon("./PNGS/end.png");
		endRoom = new JLabel();
		endRoom.setBounds(0,0,endRoomImage.getIconWidth(),endRoomImage.getIconHeight());
		endRoom.setIcon(endRoomImage);
		endRoom.setVisible(false);
		
		
		ImageIcon shark1Image = new ImageIcon("./PNGS/shark1.png");
		shark1 = new JLabel();
		shark1.setBounds(710,200,shark1Image.getIconWidth(),shark1Image.getIconHeight());
		shark1.setIcon(shark1Image);
		shark1.setVisible(false);
		this.add(shark1);
		
		ImageIcon shark2Image = new ImageIcon("./PNGS/shark2.png");
		shark2 = new JLabel();
		shark2.setBounds(710,240,shark2Image.getIconWidth(),shark2Image.getIconHeight());
		shark2.setIcon(shark2Image);
		shark2.setVisible(false);
		this.add(shark2);

		ImageIcon shark3Image = new ImageIcon("./PNGS/shark3.png");
		shark3 = new JLabel();
		shark3.setBounds(710,240,shark3Image.getIconWidth(),shark3Image.getIconHeight());
		shark3.setIcon(shark3Image);
		shark3.setVisible(false);
		this.add(shark3);
	
		ImageIcon shark4Image = new ImageIcon("./PNGS/shark4.png");
		shark4 = new JLabel();
		shark4.setBounds(710,240,shark4Image.getIconWidth(),shark4Image.getIconHeight());
		shark4.setIcon(shark4Image);
		shark4.setVisible(false);
		this.add(shark4);

		ImageIcon shark5Image = new ImageIcon("./PNGS/shark5.png");
		shark5 = new JLabel();
		shark5.setBounds(710,200,shark5Image.getIconWidth(),shark5Image.getIconHeight());
		shark5.setIcon(shark5Image);
		shark5.setVisible(false);
		this.add(shark5);
		
		letters.setBounds(0,0,1200,850);
		letters.setLayout(null);
		letters.setVisible(true);
	
		this.add(endRoom);
		this.add(letters);
		this.setBounds(0,0,1200,850);
		this.setLayout(null);
		this.setVisible(true);
	}

	public void addLetter(String letter) {	
		if(messageTyped.size()<=16) {
			if(messageTyped.size() <=5) {
				JLabel label = new JLabel();
				label.setIcon(new ImageIcon("./PNGS/code"+letter+".png"));
				label.setBounds(280 + x,55,100,100);
				label.setVisible(true);
				letters.add(label);
				letters.revalidate();
				letters.repaint();
				messageTyped.add(letter);
				x = 70 + x;
			}
			else if(x >= 5) {
				JLabel label = new JLabel();
				label.setIcon(new ImageIcon("./PNGS/code"+letter+".png"));
				label.setBounds(100 + x2,145,100,100);
				label.setVisible(true);
				letters.add(label);
				letters.revalidate();
				letters.repaint();
				messageTyped.add(letter);
				x2 = 70 + x2;		
	
			}
		}
	}
	
	public static Keyboard getInstance() {
		Keyboard result = instance;
		if(result == null) {
			synchronized (Keyboard.class) {
				result = instance;
				if(result == null) {
					instance = result = new Keyboard();
				}
			}
		}
		return result;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()== doneButton) {
			if(message.equals(messageTyped)) {
				isSame = true;
				Room.inPanel = true;
				letters.setVisible(false);
				endRoom.setVisible(true);
				TimerTask task = new TimerTask() {
					
					@Override
					public void run() {
				
								shark1.setVisible(true);
								try {
									Thread.sleep(200);
								} catch (InterruptedException e) {
								
									e.printStackTrace();
								}
								shark1.setVisible(false);
								shark2.setVisible(true);
								try {
									Thread.sleep(200);
								} catch (InterruptedException e) {
									e.printStackTrace();
								}
								shark2.setVisible(false);
								shark3.setVisible(true);
								try {
									Thread.sleep(200);
								} catch (InterruptedException e) {
								
									e.printStackTrace();
								}
								shark3.setVisible(false);
								shark4.setVisible(true);
								try {
									Thread.sleep(200);
								} catch (InterruptedException e) {
									e.printStackTrace();
								}
								shark4.setVisible(false);
								shark5.setVisible(true);
								try {
									Thread.sleep(200);
								} catch (InterruptedException e) {
								
									e.printStackTrace();
								}
								
								shark5.setVisible(false);
								shark4.setVisible(true);
								try {
									Thread.sleep(200);
								} catch (InterruptedException e) {
								
									e.printStackTrace();
								}
								shark4.setVisible(false);
								shark3.setVisible(true);
								try {
									Thread.sleep(200);
								} catch (InterruptedException e) {
								
									e.printStackTrace();
								}
								shark3.setVisible(false);
					}
				};
					timer.scheduleAtFixedRate(task,200,200);
				}
		}

		if(e.getSource()== backspaceButton) {
			if(messageTyped.size() <= 0  ) {
				return;
			}
			else {
				messageTyped.remove(messageTyped.size()-1);
				letters.remove(messageTyped.size());
				letters.revalidate();
				letters.repaint();
				
				if(messageTyped.size() <=5) {
					x = x -70;
				}
				else if(messageTyped.size() >=5)
					x2 = x2 - 70;
			}
		}
			
		if(e.getSource() == A) {
			addLetter("A");
			}
		if(e.getSource() == B) {
			addLetter("B");
			}
		if(e.getSource() == C) {
			addLetter("C");
			}
		if(e.getSource() == D) {
			addLetter("D");
			}
		if(e.getSource() == E) {
			addLetter("E");
			}
		if(e.getSource() == F) {
			addLetter("F");
			}
		if(e.getSource() == G) {
			addLetter("G");
			}
		if(e.getSource() == H) {
			addLetter("H");
			}
		if(e.getSource() == I) {
			addLetter("I");
			}
		if(e.getSource() == J) {
			addLetter("J");
			}
		if(e.getSource() == K) {
			addLetter("K");
			}
		if(e.getSource() == L) {
			addLetter("L");
			}
		if(e.getSource() == M) {
			addLetter("M");
			}
		if(e.getSource() == N) {
			addLetter("N");
			}
		if(e.getSource() == O) {
			addLetter("O");
			}
		if(e.getSource() == P) {
			addLetter("P");
			}
		if(e.getSource() == Q) {
			addLetter("Q");
			}
		if(e.getSource() == R) {
			addLetter("R");
			}
		if(e.getSource() == S) {
			addLetter("S");
			}
		if(e.getSource() == T) {
			addLetter("T");
			}
		if(e.getSource() == U) {
			addLetter("U");
			}
		if(e.getSource() == V) {
			addLetter("V");
			}
		if(e.getSource() == W) {
			addLetter("W");
			}
		if(e.getSource() == X) {
			addLetter("X");
			}
		if(e.getSource() == Y) {
			addLetter("Y");
			}
		if(e.getSource() == Z) {
			addLetter("Z");
			}
		}	
}
		
	
	



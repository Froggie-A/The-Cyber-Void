import java.awt.Component;
import java.awt.Container;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Inventory extends Container implements MouseListener {

	private boolean isSelected = false;
	private static volatile Inventory instance;

	private boolean hasClicked = false;
	private String itemInvSel;
	private static String itemDel = null;

	JLabel null1,null2,null3,null4;
	
	private Inventory()throws ArrayIndexOutOfBoundsException{

		ImageIcon inventoryImage = new ImageIcon("./PNGS/inventory.png");
	
		this.setBounds(950,0,inventoryImage.getIconWidth(),inventoryImage.getIconHeight());
		this.setLayout(null);
		this.setVisible(true);
		
		null1 = new JLabel();
		null2 = new JLabel();
		null3 = new JLabel();
		null4 = new JLabel();
		
		
		this.addNull(null1, "null");
		this.addNull(null2, "null");
		this.addNull(null3, "null");
		this.addNull(null4, "null");
		
	}
	
	public static Inventory getInstance() {
		Inventory result = instance;
		if(result == null) {
			synchronized (Inventory.class) {
				result = instance;
				if(result == null) {
					instance = result = new Inventory();
				}
			}
		}
		return result;
	}
	 
	
	public void addItem(Component item,String nameSel) {
		if(this.getComponent(0).getName()== "null") {
				item.setBounds(50,45,160,160);
				item.addMouseListener(this);
				item.setName(nameSel);
				this.remove(0);
				this.add(item,0);
			}
		
		else if(this.getComponent(1).getName() == "null") {
				item.setBounds(50,245,160,160);
				item.addMouseListener(this);
				item.setName(nameSel);
				this.remove(1);
				this.add(item,1);
			}
		else if(this.getComponent(2).getName() == "null") {		
				item.setBounds(50,445,160,160);
				item.addMouseListener(this);
				item.setName(nameSel);
				this.remove(2);
				this.add(item,2);	
			}
		
		else if(this.getComponent(3).getName()=="null") {
				item.setBounds(50,645,160,160);
				item.addMouseListener(this);
				item.setName(nameSel);
				this.remove(3);
				this.add(item,3);
			}
		
	}
	
	public void addNull(Component item, String nameSel) {
		if(this.isNull(0) == true) {
			item.setBounds(50,45,160,160);
			item.addMouseListener(this);
			item.setName(nameSel);
			this.add(item);
		}
		
		else if(this.isNull(1) == true){
			item.setBounds(50,245,160,160);
			item.addMouseListener(this);
			item.setName(nameSel);
			this.add(item);
		}
	
		else if(this.isNull(2) == true) {
			item.setBounds(50,445,160,160);
			item.addMouseListener(this);
			item.setName(nameSel);
			this.add(item);
		}
		else if(this.isNull(3) == true) {
			item.setBounds(50,645,160,160);
			item.addMouseListener(this);
			item.setName(nameSel);
			this.add(item);
		}
	}
	
	public void deleteItem(String itemName) {
	
		for(int i = 0; i < 4;i++) {
			try {
			if(itemName == this.getComponent(i).getName()) {
				this.remove(i);
				isSelected = false;
				itemInvSel = null;
				itemDel = null;
				hasClicked = false;
				JLabel nullPlaceholder = new JLabel();
				nullPlaceholder.setName("null");
				this.add(nullPlaceholder,i);
				}
			}catch(Exception e) {
			}
		}
	}

	public String isSelected() {
		if(isSelected == true) {
			return itemInvSel;
		}
		return null;
	}
	
	public boolean isNull(int number) {
		try {
		if(this.getComponent(number).getName()== "null") {
			return true;
		}
		return false;
		} catch (Exception e) {
		}
		return true;
	}

	
	public boolean isFull() {
		for(int i =0;i<4;i++) {
			if(this.getComponent(i).getName() == "null"){
				return false;
			}
		}
		return true;
	}


	@Override
	public void mouseClicked(MouseEvent e) {
		if(hasClicked == true) {
			if(e.getSource()==e.getComponent() && e.getComponent().getName() == itemDel) {
				String item = e.getComponent().getName();
				String originalItem = item.replace("Sel","");
				String itemName = "./PNGS/"+originalItem+".png";
				ImageIcon itemSel = new ImageIcon(itemName);
				JLabel label = (JLabel) e.getComponent();
				label.setIcon(itemSel);
				isSelected = false;
				itemInvSel = null;
				itemDel=null;
				hasClicked = false;
			}
		}
		else {
			if(e.getSource()== e.getComponent()&& isSelected == false) {
				String itemName = "./PNGS/"+e.getComponent().getName()+".png";
				ImageIcon itemSel = new ImageIcon(itemName);
				JLabel label = (JLabel) e.getComponent();
				label.setIcon(itemSel);
				isSelected = true;
				itemInvSel = e.getComponent().getName();
				hasClicked = true;
				itemDel = e.getComponent().getName();
			}
		}
	}
	
	@Override
	public void mousePressed(MouseEvent e) {}

	@Override
	public void mouseReleased(MouseEvent e) {}

	@Override
	public void mouseEntered(MouseEvent e) {}

	@Override
	public void mouseExited(MouseEvent e) {}
}

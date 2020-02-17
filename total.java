package OrderSc;

import java.awt.FlowLayout;
import java.awt.Panel;
import java.util.HashSet;
import java.util.Iterator;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class total extends JFrame{
	HashSet info =new HashSet();
	Iterator it=OrderSc1.info.iterator();
	Buttons b;
	
	
	public total() {
	this.setTitle("결제창");
	this.setLayout(new FlowLayout());
	this.setSize(300, 300);;
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	this.setVisible(true);
	
	JLabel count3= new JLabel();
	
	
		Buttons b=(Buttons) it.next();
		count3.setText("주문목록: "+b);
		
	
	
	

	this.add(count3);
	
	

		
	
	
	
	
	
	
	
	
	
	}
	
	
	
	
	
	public static void main(String[] args) {
		total totalPrice=new total();

	}

}

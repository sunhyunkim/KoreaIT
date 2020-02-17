package OrderSc;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashSet;
import java.util.Iterator;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class ItemSelect extends JFrame{
	
	
	public /* static */ Iterator it=OrderSc1.info.iterator();
	Panel RBPanel=new Panel();
	int num=0;
	
	public ItemSelect() {
		this.setTitle("상세주문");
		this.setLayout(new FlowLayout(FlowLayout.CENTER, 150, 30));
		this.setSize(800, 400);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
		
		JRadioButton rb1=new JRadioButton("Hot");
		JRadioButton rb2=new JRadioButton("Cold");
		
		rb1.setBackground(Color.green);
		
		JRadioButton Rb1=new JRadioButton("Tall");
		JRadioButton Rb2=new JRadioButton("Grande");
		JRadioButton Rb3=new JRadioButton("Venti");
		
		ButtonGroup group1= new ButtonGroup();
		ButtonGroup group2= new ButtonGroup();
		
		group1.add(rb1); group1.add(rb2); 
		group2.add(Rb1); group2.add(Rb2); group2.add(Rb3);
		
		JLabel count= new JLabel();
		
		RBPanel.add(rb1); RBPanel.add(rb2);
		RBPanel.add(Rb1); RBPanel.add(Rb2); RBPanel.add(Rb3);
		RBPanel.add(count);
		
		Button upButton=new Button("▲");
		Button downButton=new Button("▼");
		
		RBPanel.add(upButton);
		RBPanel.add(downButton);
		
		
		
	
		
		upButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				num++;
				count.setText("수량: "+num);	
		
									
				}
			
			});
							
				downButton.addActionListener(new ActionListener() {
						
					@Override
					public void actionPerformed(ActionEvent e) {
						num--;
						count.setText("수량: "+num);
						if(num<1) {
						num=0;
						count.setText("수량: "+num);
						}
					}	
							
					
				});
				
				
				
				JLabel count2= new JLabel();
				while(it.hasNext()) {
					Buttons b=(Buttons) it.next();
					count2.setText("주문정보: "+b.name+", "+b.price);
				
				}
				
					RBPanel.add(count2);
				
				Button bag= new Button("장바구니");
				RBPanel.add(bag);
			
				bag.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						new OrderSc1();		
					}
					});


				
				Button Order=new Button("주문하기");
				Order.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						
						new total();		
					}
					});
				RBPanel.add(Order);
				
				this.add(RBPanel);
	}


	public static void main(String[] args) {
	ItemSelect choice=new ItemSelect();
		
}

}

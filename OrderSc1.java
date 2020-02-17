package OrderSc;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashSet;
import java.util.Iterator;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class OrderSc1 extends JFrame{
	
	
	public static HashSet info =new HashSet();
	
	
	public OrderSc1() {
		this.setTitle("주문");
		this.setLayout(new BorderLayout());
		this.getContentPane().setBackground(Color.GREEN);
		this.setBounds(30, 30, 600,300);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	
		//책갈피 
	
		JPanel p1=new JPanel();
		JPanel p2=new JPanel();
		
		p1.setSize(300,600);
		p2.setSize(300, 600);
		
		JTabbedPane JTP1=new JTabbedPane(JTabbedPane.LEFT);
		
		JTP1.setBackground(Color.WHITE);
		JTP1.setBounds(50, 50, 200, 200);
		p1.setBackground(Color.white);
		p2.setBackground(Color.white);
		
		
		
		JTP1.add("음료", p1);
		JTP1.add("디저트", p2);
	
		
		this.add(JTP1, BorderLayout.CENTER);
		
	
		

		//주문메뉴판
		
		
		
		Button Button1=new Button("1");
		Button1.setPreferredSize(new Dimension(80, 80));
		p1.add(Button1);
		
		Button1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				info.add(new Buttons("아메리카노", 3000));
				System.out.println(info);
				new ItemSelect();		
			}
			});
				
				
		Button Button2=new Button("2");
		Button2.setPreferredSize(new Dimension(80, 80));
		p1.add(Button2);
		Button2.addActionListener(new ActionListener() {
					
			@Override
			public void actionPerformed(ActionEvent e) {
				info.add(new Buttons("카페라떼", 3500));
				System.out.println(info);
			 new ItemSelect();		
//			 System.out.println(info);
				}
				});
				
				
				
				
				
				Button Button3=new Button("3");
				Button3.setPreferredSize(new Dimension(80, 80));
				p1.add(Button3);
				Button3.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						info.add(new Buttons("카페모카", 4000));
						System.out.println(info);
						new ItemSelect();		
					}
					});
				
				
				
				
				
				Button Button4=new Button("4");
				Button4.setPreferredSize(new Dimension(80, 80));
				p1.add(Button4);
				
				Button Button5=new Button("5");
				Button5.setPreferredSize(new Dimension(80, 80));
				p2.add(Button5);
				
				Button Button6=new Button("6");
				Button6.setPreferredSize(new Dimension(80, 80));
				p2.add(Button6);
				
				Button Button7=new Button("7");
				Button7.setPreferredSize(new Dimension(80, 80));
				p2.add(Button7);
		
		
		
		
		//주문, 삭제 창
				Panel EtcPanel=new Panel(new GridLayout(3, 1));
				Button OrderButton=new Button("주문");
				OrderButton.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
					
						new total();		
					}
					});
				Button DeleteButton=new Button("삭제");
				
				EtcPanel.add(OrderButton);
				EtcPanel.add(DeleteButton);
				
				this.add(EtcPanel, BorderLayout.EAST);
		
		
		
			
		
		
		
		
		
		//담기, 주문, 삭제 버튼
		
		
						
						
			OrderButton.addActionListener(new ActionListener() {
							
				@Override
				public void actionPerformed(ActionEvent e) {
					new total();
								
				}
			});
						
		
				
				
		
		
		

		
		
		
		this.setVisible(true);
	
	
}

	


	public static void main(String[] args) {
		OrderSc1 Order=new OrderSc1();
		
}
}

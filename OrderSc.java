package orderScreen;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Panel;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTabbedPane;

public class OrderSc extends JFrame{
	
	int num=0;
	public OrderSc() {
		this.setTitle("주문");
		this.setLayout(new BorderLayout());
		this.setBounds(30, 30, 600,300);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	
		//책갈피 
		JPanel p1=new JPanel();
		JPanel p2=new JPanel();
		
		p1.setSize(300,600);
		p2.setSize(300, 600);
		
		JTabbedPane JTP1=new JTabbedPane(JTabbedPane.LEFT);
		
		
		JTP1.setBounds(50, 50, 200, 200);
		
		
		
		
		JTP1.add("음료", p1);
		JTP1.add("디저트", p2);
	
		
		this.add(JTP1, BorderLayout.CENTER);
		
	
		
		
		//주문메뉴판
		
		
		Button Button1=new Button("1");
		Button1.setPreferredSize(new Dimension(80, 80));
		p1.add(Button1);
		
		Button Button2=new Button("2");
		Button2.setPreferredSize(new Dimension(80, 80));
		p1.add(Button2);
		
		Button Button3=new Button("3");
		Button3.setPreferredSize(new Dimension(80, 80));
		p1.add(Button3);
		
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
		
		
		
		
		
		
		//라디오 버튼 메뉴
		Panel RBPanel=new Panel();
		JRadioButton rb1=new JRadioButton("Hot");
		JRadioButton rb2=new JRadioButton("Cold");
		
		JRadioButton Rb1=new JRadioButton("Tall");
		JRadioButton Rb2=new JRadioButton("Grande");
		JRadioButton Rb3=new JRadioButton("Venti");
		
		ButtonGroup group1= new ButtonGroup();
		ButtonGroup group2= new ButtonGroup();
		
		group1.add(rb1); group1.add(rb2); 
		group2.add(Rb1); group2.add(Rb2); group2.add(Rb3);
		
		JLabel count=new JLabel("수량: ", num);
		
		RBPanel.add(rb1); RBPanel.add(rb2);
		RBPanel.add(Rb1); RBPanel.add(Rb2); RBPanel.add(Rb3);
		RBPanel.add(count);
		
		this.add(RBPanel, BorderLayout.SOUTH);
		
		
		//담기, 주문, 삭제 창
		Panel EtcPanel=new Panel(new GridLayout(3, 1));
		Button InputButton=new Button("담기");
		Button OrderButton=new Button("주문");
		Button DeleteButton=new Button("삭제");
		
		EtcPanel.add(InputButton);
		EtcPanel.add(OrderButton);
		EtcPanel.add(DeleteButton);
		
		this.add(EtcPanel, BorderLayout.EAST);

		
		
		this.setVisible(true);
	
	
}

	public static void main(String[] args) {
		OrderSc Order=new OrderSc();
}
}

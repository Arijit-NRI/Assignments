
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MyCalculator implements ActionListener{
	
	JFrame f;
	JTextField t;
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,b_add,b_sub,b_mult,b_div,b_equals,b_del,b_clr,b_dec;
	static double a=0,b=0,result=0;
	static int operator;
	
	public MyCalculator()
	{
		f=new JFrame("My Calculator");
		f.setVisible(true);
		f.setLayout(null);
		f.setBounds(20,20,300,350);
		f.setResizable(false);
		
		Font fo=new Font("Arial",Font.BOLD,20);
		t=new JTextField();
		t.setFont(fo);
		t.setBackground(Color.BLACK);
		t.setForeground(Color.BLUE);
		t.setBounds(40,40,200,50);
		f.add(t);
		
		b1=new JButton("1");
		b2=new JButton("2");
		b3=new JButton("3");
		b4=new JButton("4");
		b5=new JButton("5");
		b6=new JButton("6");
		b7=new JButton("7");
		b8=new JButton("8");
		b9=new JButton("9");
		b0=new JButton("0");
		b_add=new JButton("+");
		b_sub=new JButton("-");
		b_mult=new JButton("*");
		b_div=new JButton("/");
		b_equals=new JButton("=");
		b_del=new JButton("DEL");
		b_clr=new JButton("CLR");
		b_dec=new JButton(".");
		
		
		b7.setBounds(40,100,50,40);
		b8.setBounds(90,100,50,40);
		b9.setBounds(140,100,50,40);
		b_div.setBounds(190,100,50,40);
		
		b4.setBounds(40,140,50,40);
		b5.setBounds(90,140,50,40);
		b6.setBounds(140,140,50,40);
		b_mult.setBounds(190,140,50,40);
		
		b1.setBounds(40,180,50,40);
		b2.setBounds(90,180,50,40);
		b3.setBounds(140,180,50,40);
		b_sub.setBounds(190,180,50,40);
		
		b0.setBounds(40,220,50,40);
		b_dec.setBounds(90,220,50,40);
		b_add.setBounds(140,220,50,40);
		b_equals.setBounds(190,220,50,40);
		
		b_del.setBounds(50,260,100,40);
		b_clr.setBounds(140,260,100,40);
		
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		b0.addActionListener(this);
		b_add.addActionListener(this);
		b_sub.addActionListener(this);
		b_div.addActionListener(this);
		b_mult.addActionListener(this);
		b_clr.addActionListener(this);
		b_equals.addActionListener(this);
		b_del.addActionListener(this);
		b_dec.addActionListener(this);
		
		
		
		f.add(b1); f.add(b2); f.add(b3); f.add(b4);
		f.add(b5); f.add(b6); f.add(b7); f.add(b8);
		f.add(b9); f.add(b0); f.add(b_add); f.add(b_sub);
		f.add(b_mult); f.add(b_div); f.add(b_equals); f.add(b_clr);
		f.add(b_del); f.add(b_dec);
		
	}
	

	public static void main(String[] args) {
		new MyCalculator();
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==b1)
		{
			t.setText(t.getText().concat("1"));
		}
		if(e.getSource()==b2)
		{
			t.setText(t.getText().concat("2"));
		}
		if(e.getSource()==b3)
		{
			t.setText(t.getText().concat("3"));
		}
		if(e.getSource()==b4)
		{
			t.setText(t.getText().concat("4"));
		}
		if(e.getSource()==b5)
		{
			t.setText(t.getText().concat("5"));
		}
		if(e.getSource()==b6)
		{
			t.setText(t.getText().concat("6"));
		}
		if(e.getSource()==b7)
		{
			t.setText(t.getText().concat("7"));
		}
		if(e.getSource()==b8)
		{
			t.setText(t.getText().concat("8"));
		}
		if(e.getSource()==b9)
		{
			t.setText(t.getText().concat("9"));
		}
		if(e.getSource()==b0)
		{
			t.setText(t.getText().concat("0"));
		}
		if(e.getSource()==b_dec)
		{
			if(t.getText().contains(".")==false && t.getText().equals("")!=true )
			{
				if(t.getText().charAt(t.getText().length()-1) != '+' 
				|| t.getText().charAt(t.getText().length()-1) != '-'
				|| t.getText().charAt(t.getText().length()-1) != '*'
				|| t.getText().charAt(t.getText().length()-1) != '/')
				t.setText(t.getText().concat("."));
			}
		}
		if(e.getSource()==b_clr)
		{
			t.setText("");
		}
		if(e.getSource()==b_del)
		{
			if(!t.getText().equals(""))
				t.setText(t.getText().toString().substring(0,t.getText().toString().length()-1));		
		}
		if(e.getSource()==b_add)
		{
			if(t.getText().contains("+")==false && t.getText().contains("-")==false 
				&& t.getText().contains(".")==false && t.getText().contains("/")==false)
			{
				t.setText(t.getText().concat("+"));
			}
		}
		if(e.getSource()==b_sub)
		{
			if(t.getText().contains("+")==false && t.getText().contains("-")==false 
				&& t.getText().contains(".")==false && t.getText().contains("/")==false)
			{
				t.setText(t.getText().concat("-"));
			}
		}
		if(e.getSource()==b_div)
		{
			if(t.getText().contains("+")==false && t.getText().contains("-")==false 
				&& t.getText().contains(".")==false && t.getText().contains("/")==false)
			{
				t.setText(t.getText().concat("/"));
			}
		}
		if(e.getSource()==b_mult)
		{
			if(t.getText().contains("+")==false && t.getText().contains("-")==false 
				&& t.getText().contains(".")==false && t.getText().contains("/")==false)
			{
				t.setText(t.getText().concat("*"));
			}
		}
		if(e.getSource()==b_equals)
		{
			if(t.getText().contains("+")==true || t.getText().contains("-")==true 
				|| t.getText().contains("*")==true || t.getText().contains("/")==true)
			{
				int index=-1;
				index=Math.max(index, t.getText().indexOf("+"));
				index=Math.max(index, t.getText().indexOf("-"));
				index=Math.max(index, t.getText().indexOf("*"));
				index=Math.max(index, t.getText().indexOf("/"));
				
				if(index < t.getText().length()-1 && t.getText().charAt(t.getText().length()-1)!='.')
				{
					a=Double.parseDouble( t.getText().substring(0,index) );
					b=Double.parseDouble( t.getText().substring(index+1, t.getText().length() ) );
					if(t.getText().charAt(index)=='+')
					{
						result=a+b;
					}
					else if(t.getText().charAt(index)=='-'){
						result=a-b;
					}
					else if(t.getText().charAt(index)=='*'){
						result=a*b;
					}
					else if(t.getText().charAt(index)=='/'){
						result=a/b;
					}
					
					t.setText(  Double.toString(result) );
					a=0; b=0; result=0;
					
				}
			}
		}
		
	}

}

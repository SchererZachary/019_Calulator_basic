package calulator;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class CalcRunner implements ActionListener {

	JFrame frame;
	JTextField textField;
	JButton num1, num2, num3, num4, num5, num6, num7, num8, num9, num0,
			bdivide, bmult, bsub, badd, bdec, bequal, bBack, bclr,
			bsquare,bcube, bsqrt, blog10, bsinD, bsinR, bcosD, bcosR,
			bhex, boct, bBin, bln;
	
	static double x, y, trigx;
	static int a;
	static double result;
	static String newx;
	
	static int operator=0;
	
	CalcRunner() {
		frame = new JFrame();
		textField = new JTextField();
		num1 = new JButton("1");
		num2 = new JButton("2");
		num3 = new JButton("3");
		num4 = new JButton("4");
		num5 = new JButton("5");
		num6 = new JButton("6");
		num7 = new JButton("7");
		num8 = new JButton("8");
		num9 = new JButton("9");
		num0 = new JButton("0");
		bdivide = new JButton("/");
		bmult = new JButton("*");
		bsub = new JButton("-");
		badd = new JButton("+");
		bdec = new JButton(".");
		bequal = new JButton("=");
		bBack = new JButton("<--");
		bclr = new JButton("Clear");
		bsquare = new JButton("X^2");
		bcube = new JButton("X^3");
		bsqrt = new JButton("X^0.5");
		blog10 = new JButton("log10");
		bsinD = new JButton("sin(deg)");
		bsinR = new JButton("sin(rad)");
		bcosD = new JButton("cos(deg)");
		bcosR = new JButton("cos(rad)");
		bhex = new JButton("to hex");
		boct = new JButton("to oct");
		bBin = new JButton("to bin");
		bln = new JButton("ln()");
		
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setSize(700, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.setTitle("Scientific Calulator");
		
		
		textField.setBounds(60,40,570,30);
		num7.setBounds(40,100,50,40);
		num8.setBounds(110,100,50,40);
		num9.setBounds(180,100,50,40);
		bdivide.setBounds(250,100,50,40);
		blog10.setBounds(340, 100,90, 40);
		bln.setBounds(450, 100, 90, 40);
		bsinD.setBounds(560, 100, 100, 40);
		
		num4.setBounds(40,150,50,40);
		num5.setBounds(110,150,50,40);
		num6.setBounds(180,150,50,40);
		bmult.setBounds(250, 150, 50, 40);
		bsqrt.setBounds(340, 150, 90, 40);
		bhex.setBounds(450, 150, 90, 40);
		bsinR.setBounds(560, 150, 100, 40);
		
		num1.setBounds(40,200,50,40);
		num2.setBounds(110, 200, 50,40);
		num3.setBounds(180,200,50,40);
		bsub.setBounds(250,200,50,40);
		bsquare.setBounds(340,200,90,40);
		boct.setBounds(450, 200, 90, 40);
		bcosD.setBounds(560, 200, 100, 40);
		
		bdec.setBounds(110,250,50,40);
		num0.setBounds(40,250,50,40);
		bequal.setBounds(180,250, 50, 40);
		badd.setBounds(250,250,50,40);
		bcube.setBounds(340,250,90,40);
		bBin.setBounds(450, 250, 90, 40);
		bcosR.setBounds(560, 250, 100, 40);
		
		bclr.setBounds(50, 300, 240, 40);
		bBack.setBounds(350,300,290,40);
		
		frame.add(textField);
		frame.add(num7);
		frame.add(num8);
		frame.add(num9);
		frame.add(bdivide);
		frame.add(num4);
		frame.add(num5);
		frame.add(num6);
		frame.add(bmult);
		frame.add(num1);
		frame.add(num2);
		frame.add(num3);
		frame.add(bsub);
		frame.add(bclr);
		frame.add(num0);
		frame.add(bequal);
		frame.add(bBack);
		frame.add(bdec);
		frame.add(badd);
		frame.add(blog10);
		frame.add(bsqrt);
		frame.add(bsquare);
		frame.add(bcube);
		frame.add(bln);
		frame.add(bhex);
		frame.add(boct);
		frame.add(bBin);
		frame.add(bsinD);
		frame.add(bsinR);
		frame.add(bcosD);
		frame.add(bcosR);
		
		num0.addActionListener(this);
		num1.addActionListener(this);
		num2.addActionListener(this);
		num3.addActionListener(this);
		num4.addActionListener(this);
		num5.addActionListener(this);
		num6.addActionListener(this);
		num7.addActionListener(this);
		num8.addActionListener(this);
		num9.addActionListener(this);
		bdivide.addActionListener(this);
		bmult.addActionListener(this);
		bsub.addActionListener(this);
		badd.addActionListener(this);
		bequal.addActionListener(this);
		bclr.addActionListener(this);
		bBack.addActionListener(this);
		bdec.addActionListener(this);
		blog10.addActionListener(this);
		bsqrt.addActionListener(this);
		bsquare.addActionListener(this);
		bcube.addActionListener(this);
		bsinD.addActionListener(this);
		bsinR.addActionListener(this);
		bcosD.addActionListener(this);
		bcosR.addActionListener(this);
		bhex.addActionListener(this);
		boct.addActionListener(this);
		bBin.addActionListener(this);
		bln.addActionListener(this);
		
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==num1) {
			textField.setText(textField.getText() +"1");
		}
		if(e.getSource()==num2) {
			textField.setText(textField.getText() +"2");
		}
		if(e.getSource()==num3) {
			textField.setText(textField.getText() +"3");
		}
		if(e.getSource()==num4) {
			textField.setText(textField.getText() +"4");
		}
		if(e.getSource()==num5) {
			textField.setText(textField.getText() +"5");
		}
		if(e.getSource()==num6) {
			textField.setText(textField.getText() +"6");
		}
		if(e.getSource()==num7) {
			textField.setText(textField.getText() +"7");
		}
		if(e.getSource()==num8) {
			textField.setText(textField.getText() +"8");
		}
		if(e.getSource()==num9) {
			textField.setText(textField.getText() +"9");
		}
		if(e.getSource()==num0) {
			textField.setText(textField.getText() + "0");
		}
		if(e.getSource()==bdec) {
			textField.setText(textField.getText() + ".");
		}
		if(e.getSource()==badd) {
			x=Double.parseDouble(textField.getText());
			operator = 1;
			textField.setText("");
		}
		if(e.getSource()==bsub) {
			x=Double.parseDouble(textField.getText());
			operator = 2;
			textField.setText("");
		}
		if(e.getSource()==bdivide) {
			x=Double.parseDouble(textField.getText());
			operator = 3;
			textField.setText("");
		}
		if (e.getSource()==bmult) {
			x=Double.parseDouble(textField.getText());
			operator = 4;
			textField.setText("");
		}
		if (e.getSource()==blog10) {
			x=Double.parseDouble(textField.getText());
			result = Math.log10(x);
			textField.setText("" + result);
		}
		if (e.getSource()==bsqrt) {
			x=Double.parseDouble(textField.getText());
			result = Math.sqrt(x);
			textField.setText("" + result);
		}
		if (e.getSource()==bsquare) {
			x=Double.parseDouble(textField.getText());
			result= Math.pow(x, 2);
			textField.setText("" + result);
		}
		if (e.getSource()==bcube) {
			x=Double.parseDouble(textField.getText());
			result = Math.pow(x, 3);
			textField.setText("" + result);
		}
		if (e.getSource()==bln) {
			x=Double.parseDouble(textField.getText());
			result= Math.log(x);
			textField.setText(""+result);
		}
		if (e.getSource()==bsinD) {
			x=Double.parseDouble(textField.getText());
			trigx= x*(Math.PI/180);
			result = Math.sin(trigx);
			textField.setText(""+result);
		}
		if (e.getSource()==bsinR) {
			x=Double.parseDouble(textField.getText());
			result = Math.sin(x);
			textField.setText(""+result);
		}
		if (e.getSource()==bcosD) {
			x=Double.parseDouble(textField.getText());
			trigx= x*(Math.PI/180);
			result= Math.cos(trigx);
			textField.setText(""+result);
		}
		if (e.getSource()==bcosR) {
			x=Double.parseDouble(textField.getText());
			result = Math.cos(x);
			textField.setText(""+result);
		}
		if(e.getSource()==bequal) {
			y = Double.parseDouble(textField.getText());
			switch(operator) {
				case 1: {
					result = x + y;
					break;
				}
				case 2: {
					result = x-y;
					break;
				}
				case 3: {
					result = x/y;
					break;
				}
				case 4: {
					result = x*y;
					break;
				}
			}
			textField.setText("" + result);
		}
		if(e.getSource()==bhex) {
			a=Integer.parseInt(textField.getText());
			newx = Integer.toHexString(a);
			textField.setText(""+ newx);
		}
		if(e.getSource()==boct) {
			a = Integer.parseInt(textField.getText());
			newx = Integer.toOctalString(a);
			textField.setText(""+ newx);
		}
		if(e.getSource()==bBin) {
			a = Integer.parseInt(textField.getText());
			newx = Integer.toBinaryString(a);
			textField.setText(""+newx);
		}
		if(e.getSource()==bclr) {
			textField.setText("");
		}
		if (e.getSource()==bBack) {
			String s=textField.getText();
			textField.setText("");
			for(int i=0;i<s.length()-1;i++) {
				textField.setText(textField.getText()+s.charAt(i));
			}
		}
	}
	
	public static void main(String...s) {
		//double mathText = Math.pow(10.0, 2.0);
		//System.out.println("10^2 = "+ mathText);
		//mathText = Math.sqrt(25.0);
		//System.out.println(mathText);
		//mathText = Math.pow(25.0, 0.5);
		//System.out.println("Math.pow method for sqrt(20) = "+ mathText);
		//mathText = Math.pow(25.0, 2.5);
		//System.out.println("Math.pow method for sqrt(20) = "+ mathText);
		
		//mathText= Math.log10(5.0);
		//System.out.println(mathText);
		
		new CalcRunner();
	}
	
}

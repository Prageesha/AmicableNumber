import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
public class AmicableNumbersMain extends JApplet implements ActionListener{
	JLabel lbl1;
	JTextField input;
	JLabel lbl2;
	JButton result;
	JTextField output;
	
	public void init(){
		Container conpane=getContentPane();
		conpane.setLayout(new FlowLayout());
		
		lbl1=new JLabel("Enter the upper bound to find Amicable numbers less than that");
		conpane.add(lbl1);
		
		input=new JTextField("",10);
		conpane.add(input);
		
		result=new JButton("Show Result");
	    result.addActionListener(this);
	    conpane.add(result);
	    
		lbl2=new JLabel("click the button to find the Amicable numbers");
		conpane.add(lbl2);
	    
		output=new JTextField("",40);
		conpane.add(output);
	}
	public void actionPerformed(ActionEvent e){
		int a=Integer.parseInt(input.getText());
		AmicableNumbers s=new AmicableNumbers(a);
		String s1=s.Amicable();
		
		output.setText(s1);
	}
}

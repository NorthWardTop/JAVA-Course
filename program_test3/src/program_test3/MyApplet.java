package program_test3;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class MyApplet extends Applet implements ActionListener
{	
	//System.out.println("小程序初始化...");
	TextField name=new TextField(30);
	TextField pw=new TextField(30);
	TextField pw2=new TextField(30);
	Label lb1=new Label("name");
	Label lb2=new Label("passwd");
	Label lb3=new Label("passwd2");
	
	//实现接口函数
	public void actionPerformed(ActionEvent arg0) {
		pw2.setText(pw.getText());
	}
	
	public void init()
	{
		pw.setEchoChar('*');
		pw.addActionListener(this);
		this.add(name);
		this.add(pw);
		this.add(pw2);
		this.add(lb1);
		this.add(lb2);
		this.add(lb3);
	}


}

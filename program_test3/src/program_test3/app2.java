package program_test3;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class app2 extends Applet{
	TextField name = new TextField(30);
	TextField pw = new TextField(30);
	TextField pw2 = new TextField(30);
	Label la1 = new Label("�û���");
	Label la2 = new Label("����");
	Label la3 = new Label("��ʾ����");
	Button btOK=new Button("ȷ��!");
	Button btCancel = new Button("ȡ��!!");
	
	
	//��������������
	class ShowPassWd implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			pw2.setText(pw.getText());
		}
	}
	
	public void init()
	{
	//	this.setLayout(new FlowLayout());
		this.add(la1);
		name.setBackground(new Color(255,255,0));
		this.add(name);
		this.add(la2);
		pw.setEchoChar('$');
		this.add(pw);
		this.add(la3);
		this.add(pw2);
		//��Ӽ�����
		pw.addActionListener(new ShowPassWd());
		this.add(btOK);
		this.add(btCancel);
		btOK.addActionListener(this);
		
		
		
	}
}

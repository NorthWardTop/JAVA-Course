import java.text.DateFormat;
import java.util.Date;

import javax.xml.crypto.Data;


public class Person {
	private String name;
	private String birthday;
	private char sex;//m f

	public Person(String name, String birthday, char sex)
	{
		this.name = name;
		this.birthday = birthday;
		this.sex = sex;
	}
	
	public void showInfo()
	{
		System.out.print("����:"+name);
		System.out.print("��������:"+birthday);
		System.out.print("�Ա�:"+sex);
	}
	
	public static void main(String args[])
	{
		Person person= new Person("sas", "1999-20-20-20", 'f');
		person.showInfo();
		
	}

}

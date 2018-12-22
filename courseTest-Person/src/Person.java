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
		System.out.print("姓名:"+name);
		System.out.print("出生日期:"+birthday);
		System.out.print("性别:"+sex);
	}
	
	public static void main(String args[])
	{
		Person person= new Person("sas", "1999-20-20-20", 'f');
		person.showInfo();
		
	}

}

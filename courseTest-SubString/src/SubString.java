
public class SubString
{
	//�ж�str2��str1���Ӵ�
	static void isSubString(String str1,String str2)
	{
		char[] prev=new char[64];
		char[] next=new char[64];
		boolean flg=false;
		for(int i=0;i<str1.length();++i)
		{
			for(int j=i;j<str2.length();++j)
			{
				if(str1.charAt(i)!=str2.charAt(j))//��ǰ�ַ�������
				{
					if(flg)
					{//���Ѿ������Ӵ�,����next
						next[i]=str1.charAt(i);
						break;
					}
					else
					{//û�������Ӵ�,����prev
						prev[i]=str1.charAt(i);//������,����ǰ���ַ�����prev
						break;
					}
				}
				else	//��ǰ�ַ�����
				{
					//��С���±�ѭ���������һ��ʱ,˵���Ѿ�Ѱ�ҽ���
					if(j==str2.length()-1)
					{
						System.out.println("�ҵ���!\nǰ��:"+prev[0]+"����:"+next[0]);
						flg=true;
						break;
					}
				}
			}
		}
		
	}
	
	public static void main(String args[])
	{
		String str1="addActionListener";
		String str2="Action";
		isSubString(str1, str2);
	}
}

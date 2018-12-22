
public class SubString
{
	//判断str2是str1的子串
	static void isSubString(String str1,String str2)
	{
		char[] prev=new char[64];
		char[] next=new char[64];
		boolean flg=false;
		for(int i=0;i<str1.length();++i)
		{
			for(int j=i;j<str2.length();++j)
			{
				if(str1.charAt(i)!=str2.charAt(j))//当前字符不符合
				{
					if(flg)
					{//当已经找完子串,放入next
						next[i]=str1.charAt(i);
						break;
					}
					else
					{//没有找完子串,放入prev
						prev[i]=str1.charAt(i);//不符合,将当前大串字符放入prev
						break;
					}
				}
				else	//当前字符符合
				{
					//当小串下标循环到了最后一个时,说明已经寻找结束
					if(j==str2.length()-1)
					{
						System.out.println("找到了!\n前串:"+prev[0]+"后串是:"+next[0]);
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

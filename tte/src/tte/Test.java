package tte;

//import java.io.*;

public class Test
{
	public static void main(String[] args) {
		//test1();
		
//		test2();
		
		// test3();
		
//		System.out.print(test5(100));
		
		
	}
	
	static void test1()
	{
		int size = 5;
		for(int i = 0; i<size; i++)
		{
			for(int j = i; j>=0; j--)
			{
				System.out.print(i+"\t");
				
			}
			System.out.print('\n');
			
		}
	}
	
	static void test2()
	{
		int m;
		int a[] = new int[10];
		String aa="15865488654895649";
		//System.out.print(aa.charAt(0));
		for(int i=0;i<aa.length();i++)
		{
			String str = String.valueOf(aa.charAt(i));
			int index = Integer.parseInt(str);
			a[index]++;
		}
		for(int i=0;i<10;i++)
		{
			System.out.print(i+"have"+a[i]+"number\n");
		}
	}
	
	static void test3()
	{
		String[] strs = {"pen", "pencil", "paper"};
		String[] moreStrs = {"computer", "eraser"};
		String[] result = new String[strs.length+moreStrs.length];//5
		
		for(int i=0; i<result.length; )
		{
			for(int j=0; j<strs.length; ++j)
			{
				result[i++] = strs[j];
			}
			for(int j=0; j<moreStrs.length; ++j)
			{
				result[i++] = moreStrs[j];
			}
		}
		
		for(int i=0; i<result.length; ++i)
		{
			System.out.print(result[i]+"\t");
		}
	}
	
	static void test4() //throws IOException
	{
		//��ʼ��
		int m, n;
		int aa[] = new int[6];
		int bb[] = new int[6];
		int cc[] = new int[12];
		for(int i=0; i<6; i++)
		{
			m=(int) (100*Math.random());
			aa[i]=m;
			n=(int) (100*Math.random());
			bb[i]=n;
			System.out.println(aa[i]+"	"+bb[i]);			
		}
		
		//�ϲ�����
		for(int i=0;i<cc.length;)
		{
			for(int j=0; j<aa.length;++j,++i)
				cc[i]=aa[j];
			for(int k=0; k<bb.length;++k,++i)
				cc[i]=bb[k];
		}
		
		//��ɲ�������
		for (int i = 1; i < cc.length; i++) {
            int currentNumber = cc[i];
            int j = i - 1;	//�ӵ�ǰ���ֵ�ǰһ������(�����е����һ��)��ʼ�Ƚ�
            while (j >= 0 && cc[j] > currentNumber) {	//��ǰһһ�Ƚ�ֱ����һ����, ��j���ڵ�ǰ����ǰ��
                cc[j + 1] = cc[j];	
                j--;
            }
            cc[j + 1] = currentNumber;
        }
		
		for(int i=0;i<cc.length;++i)
		{
			System.out.println(cc[i]+"    ");
		}
	}
	
	static int test5(int n)
	{
		return n==1?1:(n+test5(n-1));
	}
	
	
	
	
}


















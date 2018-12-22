package program_test3;

public class program {
	public static void main(String args[])
	{
//		System.out.print(strAdd("33","66"));
		
		scoreConv(818);
	}
	
	static int strAdd(String str1, String str2)
	{
		int a = Integer.parseInt(str1);
		int b = Integer.parseInt(str2);
		return (a+b);
	}
	
	static void scoreConv(int score)
	{
		if(score >= 90 && score <= 100)
			System.out.print('A');
		else if(score >= 75 && score <= 89)
			System.out.print('B');
		else if(score >= 60 && score <= 74)
			System.out.print('C');
		else if(score >= 0 && score <= 60)
			System.out.print('D');
		else 
			System.out.print("arg error!");
	}
	
//	static void equalDiff()
//	{
//		int a1, d, sum = 0;
//		d = (150-135)/10;
//		for(int i = 0; i< 10; i+=2)
//		{
//			sum+=1;
//		}
//	}
	
	
}

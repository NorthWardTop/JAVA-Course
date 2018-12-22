
public class Rect 
{
	private float high;
	private float wide;
	
	public Rect()	//默认构造
	{
		this.high=0;
		this.wide=0;
	}
	public Rect(float high)//正方形
	{
		this.high=high;
		this.wide=high;
	}
	public Rect(float high, float wide)//长方形
	{
		this.high=high;
		this.wide=wide;
	}
	
	public float showEdge()
	{
		System.out.println("周长:"+(high+wide)*2);
		return (high+wide)*2;
	}
	public float showArea()	
	{
		System.out.println("面积:"+high*wide);
		return high*wide;
	}
	
	public static void main(String args[])
	{
		Rect rt1=new Rect();
		rt1.showEdge();
		rt1.showArea();
		
		Rect rt2=new Rect(2);
		rt2.showEdge();
		rt2.showArea();
		
		Rect rt3=new Rect(2,3);
		rt3.showEdge();
		rt3.showArea();
	}
	
	
}

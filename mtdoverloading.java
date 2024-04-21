package polymopphism;

public class mtdoverloading 
{
	public void  SHOW()
	{
		System.out.println("no parameter");
	}
	
	public void  SHOW(int x)
	{
		System.out.println("one parameter");
	}
	
	public void SHOW(int x, int y)
	{
		System.out.println("two parameter");
	}
	
}

class test
{
	public static void main(String  [] args) {
		
		mtdoverloading c = new mtdoverloading();
		c.SHOW();
		c.SHOW(30);
		c.SHOW(20,30);
		
			
	}
}

package privateconstructor;

public class A {
	int a;
	double b;
	String s;
	A()
	{
		a=10;
		b=35.7;
	     s="yuvraj";
	}
	     
	   public void display()
	     {
	    	 System.out.println(a);
	    	 System.out.println(b);
	    	 System.out.println(s);
	     }
	}

class test
{
	public static void main(String [] args)
	{

	A a = new A();
	a.display();
	}
}



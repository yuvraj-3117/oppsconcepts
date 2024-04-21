package AbstractMehthod;

                                   //incomplete, mtd is abstract so class is mendnatory is abstract
abstract class programming         //konsi programing hme nhi pta isliye abstact lga denge
{
	
public abstract void devlopers();    //konsi languge ka devloper toh abstract
	public abstract void ranks();                        //abstract mtd me ;semicolon lgega
}
 abstract class python extends programming
{
	@Override
	public void  devlopers()
	
	{
	
	System.out.println("tim berners lee");	
	}}
	
	class ruby extends python
	{
		@Override
		public void  ranks()
		{
			System.out.println("4th");		
		}
	}
	
	
class test
	{

public static void main(String [] args)
{
	ruby r = new ruby();
	r.devlopers();
	r.ranks();
}}
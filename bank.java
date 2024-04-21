package Abstractclass;

 abstract class bank 
 {
	public  abstract void rateofintrest();
}

class sbi extends bank     //isme abstract isliye nhi likha qki hme pta he ki dog kaa sound he
{  @Override                      //or hmne perent ko extend bhi kr liya
public void rateofintrest() //hme pta he ki dog ki mtd he isliye Abstract nhi likha
{
System.out.println("rate of intrest of sbi is "+"10%");
}
}

class bankofindia extends bank
{  
@Override
public void rateofintrest()
{
System.out.println("rate of intrest pf bankofindia is "+"20%");
}
}
class test1 {
public static void main(String [] args) 
{
bank d = new sbi();
bank l = new bankofindia();
d.rateofintrest();l.rateofintrest();



	}

}

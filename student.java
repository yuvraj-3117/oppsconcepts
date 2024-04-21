package parametrizconstructor;

public class student {
	int rollno;
	String name;//global variable
	
	student(int rollno , String name)//instant vareable
	{
		this.rollno=rollno;//instace or local variaible same so using this keyword;
		this.name= name;
	}
		
	public void show()
		 {
			 
			System.out.println(rollno+" "+name);
		}


	}

class test
{
	public static void main(String [] args) {
		student s = new student(123,"yuvraj");//initiolize value at a time of object creatrion
		s.show();
	}
}
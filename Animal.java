package hierarchicalInheritance;//one parent class and multiple child classes
                                //but fist child extend its parent and 
public class Animal            //second child extend also its grendparent
{
	 
	void eat()
	{
	System.out.println("eating...");
	 
	
			}  
		}  

		class Dog extends Animal
		{  
		void bark()
		{
			
	System.out.println("barking...");
		}  
	}  
		
		class Cat extends Animal
		{  
		void meow(){
			System.out.println("meowing...");
		}  
		}  
		class TestInheritance3
		{  
		public static void main(String args[]){  
		Cat c=new Cat();  
		c.meow();  
	     c.eat();  
		//c.bark();//C.T.Error  
	     
	     Dog d = new Dog();
	     d.bark();
		}}  




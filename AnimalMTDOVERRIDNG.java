package polymopphism;

public class AnimalMTDOVERRIDNG {

		  public void animalSound() {
		    System.out.println("The animal makes a sound");
		  }
		}

		class Pig extends AnimalMTDOVERRIDNG {
		  public void animalSound() {
		    System.out.println("The pig says: wee wee");
		  }
		}

		class Dog extends AnimalMTDOVERRIDNG {
		  public void animalSound() {
		    System.out.println("The dog says: bow wow");
		  }
		}

		class Main {
		  public static void main(String[] args) {
		    AnimalMTDOVERRIDNG myAnimal = new AnimalMTDOVERRIDNG();  // Create a Animal object
		    AnimalMTDOVERRIDNG myPig = new Pig();  // Create a Pig object
		    AnimalMTDOVERRIDNG myDog = new Dog();  // Create a Dog object
		    myAnimal.animalSound();
		    myPig.animalSound();
		    myDog.animalSound();
		    
		  }
		}







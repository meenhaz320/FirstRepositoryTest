package primitivesAndReferences;

public class Dog {
	
	String name;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Dog dog1 = new Dog();
	dog1.bark();
	dog1.name = "Bart";
	
	Dog[] myDogs = new Dog[3];
	
	myDogs[0] = new Dog();
	myDogs[1] = new Dog();
	myDogs[2] = dog1;
	
	myDogs[0].name = "Freddy";
	myDogs[1].name = "Marge";
	
	System.out.println("Dog 3's last name is "+myDogs[2].name);
	
	int x = 0;
	while(x < myDogs.length) {
		myDogs[x].bark();
		x++;
	}
	
	
	}
	public void bark() {
		System.out.println(name+ " says Woof");
	}

}

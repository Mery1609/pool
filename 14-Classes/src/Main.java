
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog dog1=new Dog();
		dog1.name="Bubbly";
		dog1.age=5;
		dog1.breed="Poodle";
		dog1.color="white";
		
		System.out.println(dog1.name+":"+dog1.age+":"+dog1.breed+":"+dog1.color);
		
		dog1.bark();
		dog1.eat();
		dog1.wagTail();
		
		System.out.println("------------");
		
		Dog2 dog=new Dog2();
		
//		dog.name="Bubbly";
//		dog.age=5;
//		dog.breed="Poodle";
//		dog.color="white";
		
		System.out.println(dog.name+":"+dog.age+":"+dog.breed+":"+dog.color);
		
		
		Dog2 dog2=new Dog2("Rusty",7,"Shepherd","Black");
		System.out.println(dog2.name+":"+dog2.age+":"+dog2.breed+":"+dog2.color);
		

	}

}

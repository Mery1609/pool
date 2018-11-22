
public class task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dog dog2=new Dog();
		
		dog2.name="Micky";
		dog2.age=7;
		dog2.breed="german shepherd";
		dog2.color="dark brown";
		
System.out.println(dog2.name+":"+dog2.age+":"+dog2.breed+":"+dog2.color);
		
		dog2.bark();
		dog2.eat();
		dog2.wagTail();
		
		
		Dog dog3=new Dog();
		
		dog3.age=3;
		dog3.name="Alaja";
		dog3.breed="Kangal";
		dog3.color="Black and white";
		
System.out.println(dog3.name+":"+dog3.age+":"+dog3.breed+":"+dog3.color);
		
		dog3.bark();
		dog3.eat();
		dog3.wagTail();
		
		
		
		
	}

}

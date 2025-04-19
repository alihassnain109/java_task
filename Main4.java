class Animal{
	String name;
	int age;

	Animal(String name, int age){
	this.name=name;
	this.age=age;
	}
}
class Dog extends Animal{
Dog(String name, int age){
	super(name,age);
}
public void display(){
	System.out.println("Dog name :"+name+"\n age :"+age);
}
}
class Cat extends Animal{
	Cat(String name, int age){
	super(name,age);
	}
	public void display(){
	System.out.println("cat name :"+name+" \n Age  :"+age);
}
}
public class Main4{
	public static void main (String[]args){
		Dog d=new Dog("Dampy",17);
		Cat cat =new Cat("meow", 3);
		
		d.display();
		cat.display();
	}
}

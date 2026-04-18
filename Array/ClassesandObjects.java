package Array;

public class ClassesandObjects {
	String name;
	int id;
	public static void main(String[] args) {
		ClassesandObjects s1=new ClassesandObjects();
		ClassesandObjects s2=s1;
		System.out.println(s1==s2);
		Phone p1=new Phone();
		Book b1;

	}
}
class Phone{
	Phone(){
		System.out.print("Object of Phone created");
	}
	
}
class Book{
	Book(){
		System.out.println("Object of book created");
	}
}
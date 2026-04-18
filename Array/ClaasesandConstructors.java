package Array;

public class ClaasesandConstructors {
 public static void main(String[] args) {
	Book b1=new Book();
	Book2 b2=new Book2("White Nights","Fydoor",2000);
	Book3 b3=new Book3();
	Book1 b4=new Book1("White Nights","Fydoor",2000);
}
}

class Student{
	
}
class Book1{
	String title;
	String author;
	double price;
	Book1(String t , String a,double p){
		title=t;
		author=a;
		price=p;
	}
}
//this keyword
class Book2{
	String title;
	String author;
	double price;
	Book2(String title,String author,double price){
		this.title=title;
		this.author=author;
		this.price=price;
	}
}
//Constructor chaining
class Book3{
	String title;
	String author;
	double price;
	Book3(){
		
	}
	Book3(String title){
		this();
		this.title=title;
	}
	Book3(String title,String author){
		this(title);
		this.author=author;
	}
	Book3(String title,String author,double price){
		this.title=title;
		this.author=author;
		this.price=price;
	}
}
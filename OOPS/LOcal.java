package OOPS;
import java.time.LocalDateTime;
public class LOcal {
	String name;
	int id;
	{
		System.out.println(LocalDateTime.now());
	}
	LOcal(){
		
	}
	LOcal(String name){
		this.name=name;
		System.out.println(name);
	}
	LOcal(String name,int id){
		this.name=name;
		this.id=id;
	}
	public static void main(String[] args) {
		LOcal s=new LOcal();
		LOcal s1=new LOcal("Dev");
		LOcal s2=new LOcal("dev",20);
	}
}

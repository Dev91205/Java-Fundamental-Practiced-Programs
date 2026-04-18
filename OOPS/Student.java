package OOPS;

public class Student {
	 private String name;
	 private int marks;
	 private int age;
	 private long phn;
	 private String roll;
	 private String gmail;
	 public String getname() {
		 return name;
	 }
	 public int getmarks() {
		 return marks;
	 }
	 public int getage() {
		 return age;
	 }
	 public long getphn() {
		 return phn;
	 }
	 public String getroll() {
		 return roll;
	 }
	 public String getgmail() {
		 return gmail;
	 }
	 public void setname(String name) {
		 this.name=name;
	 }
	 public void setmarks(int marks) {
		 this.marks=marks;
	 }
	 public void setage(int age) {
		 this.age=age;
	 }
	 public void setroll(String roll) {
		 this.roll=roll;
	 }
	 public void setphn(long phn) {
		 if(phn<1000000000) {
			 System.out.println("Enter valid phone number");
			 return ;
		 }
		 this.phn=phn;
	 }
	 public void setgmail(String gmail) {
		 this.gmail=gmail;
	 }
}

package OOPS;

public class ine_to_many {
 Sim [] sims=new Sim[2];
 int count=0;
 public void insertSim(Sim sim) {
	 if(count<2) {
		 sims[count]=sim;
		 count++;
	 }else {
		 System.out.println("Slots are filled");
	 }
 }
}

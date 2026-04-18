package OOPS;

public class ElectricityBill {
	private int unitsConsumed;
	private double charge;

	public int getUnitsConsumed() {
		return unitsConsumed;
	}

	public double getCharge() {
		return charge;
	}

	public void setUnitsConsumed(int unitsConsumed) {
		if(unitsConsumed < 0) {
			System.out.println("Invalid units");
			return;
		}
		this.unitsConsumed = unitsConsumed;
	}

	public void setCharge(double charge) {
		if(charge < 0) {
			System.out.println("Invalid charge");
			return;
		}
		this.charge = charge;
	}

	public double getBill() {
		return unitsConsumed * charge;
	}
}

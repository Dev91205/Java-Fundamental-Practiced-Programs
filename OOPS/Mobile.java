package OOPS;

public class Mobile {
	private String imeiNumber;
	private int batteryPercentage;
	private String password;

	public String getImeiNumber() {
		return imeiNumber;
	}

	public int getBatteryPercentage() {
		return batteryPercentage;
	}

	public String getPassword() {
		return password;
	}

	public void setImeiNumber(String imeiNumber) {
		if(imeiNumber.length() != 15) {
			System.out.println("Invalid IMEI number");
			return;
		}
		this.imeiNumber = imeiNumber;
	}

	public void setBatteryPercentage(int batteryPercentage) {
		if(batteryPercentage < 0 || batteryPercentage > 100) {
			System.out.println("Invalid battery percentage");
			return;
		}
		this.batteryPercentage = batteryPercentage;
	}

	public void setPassword(String password) {
		if(password.length() < 6) {
			System.out.println("Weak password");
			return;
		}
		this.password = password;
	}
}

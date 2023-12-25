package practice.parking.example04.inheritanceVer;

public class ElectricCar extends Car {

	private int battery;

	public ElectricCar(String name, String color, int battery) {

		super(name, color);
		this.battery = battery;
	}

	public int getBattery() {
		return battery;
	}

	public void setBattery(int battery) {
		this.battery = battery;
	}

	public void showInfo() {

		if (battery == 100) {

			System.out.println("-------------------------");
			System.out.println("電気自動車" + getName() + "の詳細情報");
			System.out.println("名前 : " + getName());
			System.out.println("色 : " + getColor());

		} else {

			super.showInfo();

		}
		System.out.println("残りバッテリー : " + battery);
	}

	public void batteryCharger(int batteryVolume) {

		battery += batteryVolume;

		System.out.println("-------------------------");
		System.out.println("バッテリーを" + batteryVolume + "充電しました");
	}

}

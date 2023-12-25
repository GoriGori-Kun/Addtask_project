package practice.parking.example04.instanceVer;

public class ElectricCar {

	private String name;
	private String color;
	private int battery;

	public ElectricCar(String name, String color, int battery) {
		this.name = name;
		this.color = color;
		this.battery = battery;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getBattery() {
		return battery;
	}

	public void setBattery(int battery) {
		this.battery = battery;
	}

	public void showInfo() {

		System.out.println("-------------------------");
		if (battery == 100) {

			System.out.println("電気自動車" + name + "の詳細情報");

		} else {

			System.out.println(name + "の詳細情報");
		}

		System.out.println("名前 : " + name);
		System.out.println("色 : " + color);
		System.out.println("残りバッテリー : " + battery);
	}

	public void batteryCharger(int batteryVolum) {
		battery += batteryVolum;

		System.out.println("-------------------------");
		System.out.println("バッテリーを" + batteryVolum + "充電しました");
	}

}
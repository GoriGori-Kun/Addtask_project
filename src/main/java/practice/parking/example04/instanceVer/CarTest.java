package practice.parking.example04.instanceVer;

public class CarTest {

	public static void main(String[] args) {

		Car car = new Car("プリウス", "白");

		ElectricCar electricCar = new ElectricCar("プリウスPHV", "黒", 100);

		car.showInfo();

		electricCar.showInfo();

		electricCar.batteryCharger(50);

		electricCar.showInfo();
	}
}

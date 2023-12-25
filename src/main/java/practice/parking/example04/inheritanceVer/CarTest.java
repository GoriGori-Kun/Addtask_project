package practice.parking.example04.inheritanceVer;

public class CarTest {

	public static void main(String[] args) {

		Car car = new Car("プリウス", "白");

		ElectricCar electricalCar = new ElectricCar("プリウスPHV", "黒", 100);

		car.showInfo();

		electricalCar.showInfo();

		electricalCar.batteryCharger(50);

		electricalCar.showInfo();
	}
}
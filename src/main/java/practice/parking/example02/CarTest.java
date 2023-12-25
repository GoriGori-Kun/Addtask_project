package practice.parking.example02;

public class CarTest {

	public static void main(String[] args) {

		Car car = new Car();

		car.setName("プリウス");
		car.setColor("白");

		System.out.println(car.getName() + "の詳細情報");
		System.out.println("名前 : " + car.getName());
		System.out.println("色 : " + car.getColor());

	}

}

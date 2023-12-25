package practice.parking.example03;

public class Car {

	private String name;
	private String color;

	public Car(String name, String color) {
		this.name = name;
		this.color = color;
	}

	public void showinfo() {

		System.out.println(name + "の詳細情報");
		System.out.println("名前 : " + name);
		System.out.println("色 : " + color);

	}

}

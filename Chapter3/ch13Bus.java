package ch13;

public class ch13Bus {

	int busNumber;
	int passengerCount;
	int money;
	
	public ch13Bus(int busNumber) {
		this.busNumber = busNumber;
	}
	
	public void take(int money) {
		this.money = money;
		passengerCount++;
	}
	
	public void showBusInfo() {
		System.out.println(busNumber + "번의 승객은" + passengerCount + "명 이고, 수입은 " + money + "원 입니다." );
	}
}

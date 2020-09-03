package cooperation;

public class Bus {

	int busNumber;
	int passengerCount;
	int money; 
	
	// 무조건 버스 넘버가 있어야하므로 인수로 지정 
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}
	
	// 승객을 태우면 
	public void take(int money) {
		passengerCount++;
		this.money += money; 
	}
	
	// 출력  
	public void showInfo() {
		System.out.println("버스 " + busNumber + "번의 승객은 " + passengerCount + "명이고, 수입은 " + money + "입니다.");
		
	}
}

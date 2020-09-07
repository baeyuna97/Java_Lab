package cooperation;

public class Bus {
	// 필요한 변수 생성 
	int busNumber;
	int passengerCount;
	int money; 
	
	// 무조건 버스 넘버가 있어야하므로 인수로 지정 
	public Bus(int busNumber) {
		// 입력받은 버스번호를 해당 클래스의 버스번호 변수로 입력 
		// 변수명이 겹치므로 this. 붙여준다. 
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

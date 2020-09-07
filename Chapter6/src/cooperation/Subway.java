package cooperation;

public class Subway {
	// 필요한 변수 생성 
	int lineNumber;
	int passengerCount;
	int money; 
	
	// 무조건 버스 넘버가 있어야하므로 인수로 지정 
	public Subway(int lineNumber) {
		this.lineNumber = lineNumber;
	}
	
	// 승객을 태우면 
	public void take(int money) {
		passengerCount++;
		this.money += money; 
	}
	
	// 출력  
	public void showInfo() {
		System.out.println("지하철 " + lineNumber + "호선의 승객은 " + passengerCount + "명이고, 수입은 " + money + "입니다.");
		
	}
}

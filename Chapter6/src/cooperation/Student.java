package cooperation;

public class Student {
	
	// 학생 정보 설정 
	String studentName;
	int grade;
	int money;
	
	// 학생 정보  받게끔 매개변수 설정
	// 변수명이 같으므로 this. 꼭 지정 
	public Student(String studentName, int money) {
		this.studentName = studentName;
		this.money = money;
	}
	
	// 객체의 협업 
	
	// 버스에 대한 정보 넘어와야함 
	// 매개변수로 받음 
	public void takeBus(Bus bus) {
		bus.take(1000);
		money -= 1000;
		
	}
	
	public void takeSubway(Subway subway) {
		subway.take(1500);
		money -= 1500;
		
	}
	
	// 정보를 보여주는 매소드 생성 
	public void showInfo() {
		System.out.println(studentName + "님의 남은 돈은" + money + "입니다."); 
	}
}

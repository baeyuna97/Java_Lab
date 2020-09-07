package thiss;

class BirthDay{
	int day;
	int month;
	int year;
	
	// 연도 지정 메서드 
	public void setYear(int year) {
		// this -> 생성된 인스턴스 자신 가르킴 
		this.year = year;
	}
	
	public void printThis() {
		System.out.println(this);
	}
}


public class ThisExample {
	public static void main(String[] args) {
		// 클래스 생성 
		BirthDay bDay = new BirthDay();
		// 연도 지정 
		bDay.setYear(2000);
		// 연도 출력 
		System.out.println(bDay);
		// 연도 출력 메소드 
		bDay.printThis();
	}
}

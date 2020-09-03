package hiding;

// 하나의 파일안에 클래스 여러개도 가능 
class BirthDay {

	// infomation hiding 
	private int day;
	private int month;
	private int year;
	public int getDay() {
		return day;
	}
	
	// 무결성이 침범될 수 있으니 
	// private 가려두고 
	// public 함수 생성하여 사용 
	public void setDay(int day) {
		if(month == 2) {
			if(day <1 || day >28) {
				System.out.println("날짜 오류입니다.");
			}
		}
		else {
			this.day = day;
		}
	}
	
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	
	public int getYear() {
		return year;
	}
//	public void setYear(int year) {
//		this.year = year;
//	} 
	
	// get만 있고 set이 없으면 read only
	// 읽어올 순 있지만, 변경될 순 없다. 
	
}

//private는 데이터가 숨겨져서 한 개의 클래스에서만 가능 
 
// public class는 파일 이름과 같아야함 
public class BirthDayTest{
	
	public static void main(String[] args) {
		
		BirthDay day = new BirthDay();
//		day.month = 2;
//		day.year = 2018;
//		day.day = 30; 
		
		day.setDay(30);
		day.setMonth(2);
		day.setYear(2020);
	}
	
}
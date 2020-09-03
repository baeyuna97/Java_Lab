package thisex;

class Birthday{
	int day;
	int month;
	int year;
	
	public void setYear(int year) {
		// 변수명이 같은경우 this.변수명 으로 사용 
		this.year = year;
		
	}
	
	public void printThis() {
		System.out.println(this); 
	}
}

public class ThisExample {

	public static void main(String[] args) {
		
		Birthday b1 = new Birthday();
		Birthday b2 = new Birthday();
		
		System.out.println(b1);
		b1.printThis();
		
	}

}

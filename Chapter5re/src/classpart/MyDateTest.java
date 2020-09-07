package classpart;

public class MyDateTest {

	public static void main(String[] args) {

		MyDate date = new MyDate();
		// 잘못된 정보 
		date.month = 2;
		date.day = 31;
		date.year = 2020; 
	}

}

package reference;

public class StudentTest {
	
	public static void main(String[] args) {
		
		Student studnetJames = new Student(100, "James");
		studnetJames.setKorea("국어 ", 100);
		studnetJames.setMath("수학 ", 100);
		
		Student studnetTomas = new Student(101, "Tomas");
		studnetTomas.setKorea("국어 ", 80);
		studnetTomas.setMath("수학 ", 60);
		
		studnetJames.showStudentInfo();
		studnetTomas.showStudentInfo(); 
		
	}

}

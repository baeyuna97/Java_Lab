package cooperation;

public class TakeTrans {

	public static void main(String[] args) {
		
		// 두 학생 각각의 클래스 만들고 
		Student james = new Student("James", 5000);
		Student tomas = new Student("Tomas", 100000); 
		
		// 버스 객체 만들고 
		Bus bus100 = new Bus(100);
		// james가 버스 타는 매소드에 태움 
		// 승객수 계산 , 돈 계산 
		james.takeBus(bus100); 
		james.showInfo();
		bus100.showInfo(); 
		
		Subway subwayGreen= new Subway(2);
		tomas.takeSubway(subwayGreen);
		tomas.showInfo();
		subwayGreen.showInfo(); 
	}
}

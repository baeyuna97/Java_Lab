package person;

public class PersonTest {

	public static void main(String[] args) {
		
		Person person1 = new Person();
		person1.Age = 40;
		person1.Name = "James";
		person1.married = true;
		person1.child = 3;
		
		System.out.println(person1.getAge());
		System.out.println(person1.getName());
		System.out.println(person1.isMarried());
		System.out.println(person1.getChild());
	}

}

package assignment;

public class OperationEx3 {

	public static void main(String[] args) {
		int num1 = 10;
		int i = 2;
		
		boolean value = ( ((num1 = num1 + 10)<10) && ((i = i+2)> 10) ); 
		System.out.println(value);
		System.out.println(num1);
		// false므로 뒤에는 연산하지 않음   
		System.out.println(i);
		
		boolean value2 = ( ((num1 = num1 + 10) > 10) && ((i = i+2)> 10) ); 
		System.out.println(value2);
		System.out.println(num1);
		System.out.println(i);
	}

}

package collection.arraylist;

import java.util.ArrayList;

class MyStack{
	private ArrayList<String> arrayStack = new ArrayList<String>();
	
	public void push(String data) {
		// 스택의 맨 뒤에 요소 추가 
		arrayStack.add(data);
	}
	
	public String pop() {
		// 유효한 자료의 개수 
		int len = arrayStack.size();
		if(len == 0) {
			System.out.println("스택이 비어있습니다. ");
			return null;
		}
		// 맨 뒤의 자료 제거 
		return(arrayStack.remove(len-1));
	}
}


public class StackTest {
	public static void main(String[] args) {
		MyStack stack = new MyStack();
		stack.push("A");
		stack.push("B");
		stack.push("C");
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
	}

}

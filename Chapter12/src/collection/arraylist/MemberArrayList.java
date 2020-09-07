package collection.arraylist;

import java.util.ArrayList;
import collection.Member;

// List 인터페이스 : 객체를 순서에 따라 저장하고 유지 -> 순차 자료 구조 
public class MemberArrayList {
	// ArrayList 선언 
	private ArrayList<Member> arrayList;

	// member형으로 선언한 ArrayList 생성 
	public MemberArrayList() {
		arrayList = new ArrayList<Member>();
	
	}
	
	// 회원 추가하는 메서드 
	public void addMember(Member member) {
		arrayList.add(member);
	}
	
	public boolean removeMember(int memberId) {
		for(int i = 0; i < arrayList.size(); i++) {
			// 순차적으로 회원id 가져옴  
			Member member = arrayList.get(i);
			int tempId = member.getMemberId();
			if (tempId == memberId) {
				arrayList.remove(i);
				return true;
			}
		}
		// 반복문 끝날때까지 해당 아이디를 못찾은 경우 
		System.out.println(memberId + "가 존재하지 않습니다. ");
		return false;
	}
	
	// 전체 회원 출력 
	public void showAllMember() {
		for(Member member : arrayList) {
			System.out.println(member);
		}
		System.out.println();
	}
}


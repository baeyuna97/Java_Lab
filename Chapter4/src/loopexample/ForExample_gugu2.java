package loopexample;

public class ForExample_gugu2 {

	public static void main(String[] args) {
		int dan = 2;
		int times = 1;
		
		while(dan <= 9) {
			// 홀수단 패스하고 다음 dan으로 넘어가 
			if ((dan%2)!=0) {
				dan++;
				continue;
			}
			times = 1;
			while(times<=9) {
				System.out.println(dan + "X" + times + "=" + dan*times);
				times++;
			}
			dan++;
		}
	}

}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 두개의 정수를 입력받아 큰수와 작은수를 비교하여 출력하는 프로그램을 구현하시오.
 * 
 * <입력형식>
 * 첫번째수 =
 * 두번째수 = 
 * 세번째수 =
 * 
 * <출력형식>
 * 큰수 = 
 * 작은수 =
 * 
 * <처리조건>
 * 1. 음수가 입력되면 다시 입력받는다.
 * 2. 2가지 이상 동일한 수를 입력하면 에러메시지를 출력하고 프로그램을 종료한다.
 *    => 같은거 입력 ㄴㄴ
 *   
 * 
 * */


public class Exam_12 {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader (new InputStreamReader(System.in));		
		
		int num1;
		int num2;
		int num3;
		int big = 0;
		int small = 0;
		
		
		do {
			System.out.print("첫번째 수를 입력하세요 > ");
		 	num1 = Integer.parseInt(in.readLine());
		} while (num1 < 0);
	
		do { 
			System.out.print("두번째 수를 입력하세요 > ");
			num2 = Integer.parseInt(in.readLine());
		} while (num2 < 0);
		
		do {
			System.out.print("세번째 수를 입력하세요 > ");
			num3 = Integer.parseInt(in.readLine());
		} while (num3 < 0);
		
		if (num1 == num2 || num1 == num3 || num2 == num3 ) {
			System.out.println("같은거 입력 ㄴㄴ");
			return;
			
		}  else if (num1 > num2 && num2 > num3) {
			big = num1;
			small = num3;
		} else if (num1 > num3 && num3 > num2) {
			big = num1;
			small = num2;
		} else if (num2 > num1 && num1 > num3) {
			big = num2;
			small = num3;
		} else if (num2 > num3 && num3 > num1) {
			big = num2;
			small = num1;
		} else if (num3 > num2 && num2 > num1) {
			big = num3;
			small = num1;
		} else if (num3 > num1 && num1 > num2) {
			big = num3;
			small = num2;
		}
		
		System.out.println("큰수 = " + big);
		System.out.println("작은수 = " + small);
	}

}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 하나의 수를 입력받아 그 수를 제곱하는 프로그램을 작성하시오. 
 * 
 * 예시
 * 
 * 	입력 : 3 
 * 	출력 : 9
 * 
 * */

public class Exam_10 {
	public static void main (String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int number; //선언
		
		
		System.out.print("숫자를 입력하세요 > "); 
		
		number = Integer.parseInt(in.readLine()); //입력
		
		// result = number * number; 처리 
		
		// 	System.out.println("입력하신 숫자는" + (number*number) + "입니다."); // 출력

		System.out.println("입력하신 숫자는" + (number*number) + "입니다."); // 처리 및 출력
	}
}

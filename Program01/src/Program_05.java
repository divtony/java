import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 369 게임을 구현하시오.
 * 1 ~ 99 사이의 정수를 키보드로 입력받고, 1부터 입력받은 수까지 반복하여 출력하는 작업을 수행하다가,
 * 해당 숫자가 3, 6, 9 중 하나가 있으면 "박수짝"을 출력하고, 두개가 있으면 "박수짝짝"을 출력하도록 구현하시오.
 * 
 * <입력>
 * 정수 = 60
 * 
 * <출력>
 * 1
 * 2
 * 박수짝
 * 4
 * 
 * 
 * 
 * 5
 * 박수짝
 * 7
 * ...
 * 32
 * 박수짝짝
 * */


public class Program_05 {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int num;
		
		do {
			System.out.print("정수 = ");
			num = Integer.parseInt(in.readLine());
		} while(num < 1 || num > 99);
	
		for (int i = 1; i < num+1; i++) {
			
			if (i == 3 || i == 6 || i ==9) {
				System.out.println("박수짝");
			} else if (i/10 == 3 && (i%10 == 3 || i%10 == 6 || i%10 == 9)) {
				System.out.println("박수짝짝");
			} else if (i/10 == 3) {
				System.out.println("박수짝");
			} else if (i/10 == 6 && (i%10 == 3 || i%10 == 6 || i%10 == 9)) {
				System.out.println("박수짝짝");
			} else if (i/10 == 6) {
				System.out.println("박수짝");
			} else if (i/10 == 9 && (i%10 == 3 || i%10 == 6 || i%10 == 9)) {
				System.out.println("박수짝짝");
			} else if (i/10 == 9) {
				System.out.println("박수짝");
			} else if (i%10 == 3 || i%10 == 6 || i%10 == 9) {
				System.out.println("박수짝");
			} else {
				System.out.println(i);
			}
		}
		
	
	}
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 성적 처리 프로그램
 * 국어, 영어, 수학점술를 입력받아 총점과 평균을 계산하여 출력하는 프로그램을 작성하시오.
 * 
 * <입력방식>
 * 국어 =
 * 영어 =
 * 수학 =
 * 
 * <출력방식>
 * 총점 =
 * 평균 =
 * 학점 =
 * 
 * <처리조건>
 * 1. 프로그램에 사용될 변수의 자료형과 초기값은 입출력형식을 이용하여 구현할 것.
 * 2. 0 ~ 100 사이의 수를 사용자가 입력하지 않은 경우 해당 입력을 다시 받을 것.
 * 3. 평균은 소숫점 이하 둘째자리까지 표현할 것.
 * 4. 학점은 아래의 기준대로 출력하며 switch ~ case 문을 활용할 것.
 * 
 *   90점 이상 A
 *   80점 이상 B
 *   70점 이상 C
 *   60점 이상 D
 *   59점 미만 F
 *    
 * 
 * */



public class Program_01 {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int kor;
		int eng;
		int math;
		int sum;
		float avg;
		int gradeavg;
		char grade;
		
		do {	
			System.out.print("국어 = ");
			kor = Integer.parseInt(in.readLine());
		} while(kor < 0 || kor > 100);
	
		do {
			System.out.print("영어 = ");
			eng = Integer.parseInt(in.readLine());
		} while(eng < 0 || eng > 100);
		
		do {
			System.out.print("수학 = ");
			math = Integer.parseInt(in.readLine());
		} while(math < 0 || math > 100);
		
		sum = kor + eng + math;
		avg = sum / 3.0f;
		gradeavg = sum / 3;

		if (gradeavg >= 90) {
			gradeavg = 1;
		} else if (gradeavg >= 80 && gradeavg < 90) {
			gradeavg = 2;
		} else if (gradeavg >= 70 && gradeavg < 80) {
			gradeavg = 3;
		} else if (gradeavg >= 60 && gradeavg < 70) {
			gradeavg = 4;
		} else {
			gradeavg = 5;
		}
		
		switch(gradeavg) {
		case 1 : {
			grade = 'A';
			System.out.println("총점 = " + sum);
			System.out.printf("평균 = %.2f", avg);
			System.out.println();
			System.out.println("학점 = " + grade);
			break;
		}
		case 2 : {
			grade = 'B';
			System.out.println("총점 = " + sum);
			System.out.printf("평균 = %.2f", avg);
			System.out.println();
			System.out.println("학점 = " + grade);
			break;
		}
		case 3 : {
			grade = 'C';
			System.out.println("총점 = " + sum);
			System.out.printf("평균 = %.2f", avg);
			System.out.println();
			System.out.println("학점 = " + grade);
			break;
		}
		case 4 : {
			grade = 'D';
			System.out.println("총점 = " + sum);
			System.out.printf("평균 = %.2f", avg);
			System.out.println();
			System.out.println("학점 = " + grade);
			break;
		}
		case 5 : {
			grade = 'F';
			System.out.println("총점 = " + sum);
			System.out.printf("평균 = %.2f", avg);
			System.out.println();
			System.out.println("학점 = " + grade);
			break;
		}
		}
		
		

		
		
	}
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 계산기 프로그램
 * 두개의 정수와 하나의 연산자를 입력받아 계산을 수행한 후 결과를 출력하는 프로그램을 구현하시오.
 * 
 * <입력형식>
 * 첫번째수 =
 * 연산자(+, -, *, /, %) =
 * 두번째수 =
 * 
 * <출력형식>
 * 10 * 3 = 30
 * 
 * <처리조건>
 * 1. 입출력형식을 이용하여 변수와 자료형을 알맞게 선언할 것.
 * 2. 주어진 연산기호이외의 값이 들어오면 다시 입력받도록 구현할 것.
 * 3. 연산자가 '/'이고 두번째수가 0이 들어오면 두번째 수를 다시 입력받도록 구현할 것.
 * 
 * 
 * */
public class Program_02 {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int num1;
		int num2;
		int result=0;
		char op;
		
		System.out.print("첫번째 수 = ");
		num1 = Integer.parseInt(in.readLine());
		
		do {
			System.out.print("연산자(+,-,*,/,%) = ");
			op = in.readLine().charAt(0);	
		} while(op != '+' && op != '-' && op != '*' && op != '/' && op != '%');
		
	
		do {
			System.out.print("두번째 수 = ");
			num2 = Integer.parseInt(in.readLine());
		} while(op == '/' && num2 == 0);
		
		switch (op) {
		case '+' : {
			result = num1 + num2;
			break;
		} 
		case '-' : {
			result = num1 - num2;
			break;
		}
		case '*' : {
			result = num1 * num2;
			break;
		} 
		case '/' : {
			result = num1 / num2;
			break;
		}
		case '%' : {
			result = num1 % num2;
			break;
		}
		}
		
		System.out.println(num1 + " " + op + " " + num2 + " = " + result);
	

		}
	}

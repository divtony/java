/*
 * Boxing, UnBoxing
 * 
 * Boxing(박싱)은 원시타입을 참조타입으로 변환시키는 것 
 * UnBoxing(언박싱)은 참조타입을 원시타입으로 변환시키는 것
 * 
 * 특징
 * 1. 원시타입은 null을 담을 수 없지만, 참조타입은 가능하다.
 * 2. 제네릭 타입에서 사용이 가능하다.
 * 
 * */

public class Exam_05 {
	public static void main(String[] args) {
		int a = 1;
		Integer b = 1;
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println(b instanceof Integer); // 자료형을 확인해서 맞으면 true 틀리면 false
		
		// int c = null;
		Integer d = null;
		
		System.out.println(d);
		
		int e = 2;
		Integer f = e; // 자동 변환 Auto Boxing
		
		System.out.println(f);
		
		
		Integer g = 4;
		int h = g; // 자동 변환 Auto UnBoxing
		
		System.out.println(h);
		
		// 원시타입 → 참조타입
		// boolean → Boolean
		// char → Char
		// byte → Byte
		// short → Short
		// int → Integer
		// float → Float
		// double → Double
	}
}

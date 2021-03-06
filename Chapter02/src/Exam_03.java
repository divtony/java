/*
 * 형 변환 (캐스팅)
 * 자료형 변환의 줄임말
 * 기본형 내 혹은 참조형 내 다른 자료형간의 변환 
 * 
 * 업 캐스팅 / 다운 캐스팅
 * 
 * 자료형의 크기를 부등호로 순서지어 나열해보면
 * byte < short < int < long < float < double 
 * 
 * */
public class Exam_03 {
	public static void main(String[] args) {
		float ff = 1;
		System.out.println(ff); //1.0
		
		int ii = (int)ff; //형 변환
		
		System.out.println(ii); //1
		
		int x = 130;
		long y = x; //promotion (자동형 변환)
		byte z = (byte)x; //형 변환 했지만 자료의 손실이 발생함
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		byte c =  65;
		short d = c; // 자동형 변환
		char e = (char)c; //A 아스키 코드로 변환
		
		System.out.println(e); 
		
		long f = 100L;
		float g = f; // 자동형 변환 (업캐스팅)

		System.out.println(g); //실수부가 생김
		
		float h = 3.14f;
		
		long i = (long)h; // 다운 캐스팅
		
		System.out.println(i); // 자료의 손실이 발생(실수부 손실)
		
	}
}

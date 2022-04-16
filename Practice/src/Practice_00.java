
public class Practice_00 {
	public static void main (String[] args) {

		float a = 1;
		
		System.out.println(a);
		
		int b = (int)a; // 다운 캐스팅 자료 손실
		
		System.out.println(b);
		
		int x = 130;
		long y = x; //자동형 변환 (업 캐스팅)
		
		System.out.println(y);
		
		byte z = (byte)y; //다운 캐스팅
		
		System.out.println(z);
		
		byte c = 65;
		short d = c; //자동형 변환 (업 캐스팅)
		char e = (char)d;
		
		System.out.println(d);
		System.out.println(e); 
		
		long f = 100L;
		float g = f; //자동형 변환(업 캐스팅)
		
		System.out.println(g);
		
		float h = 3.14f;
		
		long i = (long)h; // 다운 캐스팅(자료의 손실 발생
		
		System.out.println(i);
		
	}
	}

/* 여러 줄 주석 처리
 * 여러 줄 주석
 */


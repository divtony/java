import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 성적관리 프로그램
 * 
 * <메뉴 화면>
 * ==== Grade Menu ====
 * 1. 국어
 * 2. 수학
 * 3. 영어
 * 4. 총점
 * 5. 평균
 * 6. 학점
 * 7. 작업종료
 * ====================
 * 선택 = 
 * 
 * <국어, 수학, 영어 선택시>
 * 과목1(국어) 점수 = 
 * 과목1(국어) 성적 입력 완료!
 * 
 * <총점 선택시>
 * 성적합계는 xxx점 입니다.
 * (국어, 수학, 영어) 성적을 입력해주세요.
 * => 입력하지 않은 과목을 표기한다.
 * 
 * <평균 선택시>
 * 성적평균은 xx.xx점 입니다.
 *  (국어, 수학, 영어) 성적을 입력해주세요.
 * => 입력하지 않은 과목을 표기한다.
 * 
 * <학점 선택시>
 * 학점은 X입니다.
 * (국어, 수학, 영어) 성적을 입력해주세요.
 * => 입력하지 않은 과목을 표기한다.
 * 
 * 학점 범위
 * 	95점 이상 A+
 *  90점 이상 A
 *  85점 이상 B+
 *  80점 이상 B
 *  75점 이상 C+
 *  70점 이상 C
 *  65점 이상 D+
 *  60점 이상 D
 *  59점 이하 F
 * 
 * <작업종료 선택시>
 * 성적관리 프로그램을 종료합니다.
 * 
 * <처리조건>
 * 1. 국어, 수학, 영어 성적을 입력받을시 0~100점 사이의 값이 아닌경우 다시 입력받는다.
 * 2. 평균은 소숫점 두번째 자리까지 표현한다.
 * 3. 메뉴에서 작업종료를 입력하기 전까지는 메뉴를 계속반복하여 출력한다.
 * */
public class Program_07 {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader (new InputStreamReader(System.in));
		int kor = 0;
		int math = 0;
		int eng = 0;
		int sum = 0;
		float avg;
		int grade;
		
		while(true) {
			System.out.println("==== Grade Menu ====");
			System.out.println("1. 국어");
			System.out.println("2. 수학");
			System.out.println("3. 영어");
			System.out.println("4. 총점");
			System.out.println("5. 평균");
			System.out.println("6. 학점");
			System.out.println("7. 작업종료");
			System.out.print("선택 = ");
			int menu = Integer.parseInt(in.readLine());
			
			
		
			
			switch(menu) {
		
			case 1: {
				do {
					System.out.print("국어 점수 = ");
					kor = Integer.parseInt(in.readLine());
				} while (kor < 0 || kor > 100 );
				kor+= 0;
				System.out.println("성적 입력 완료!");
				break;
			} 
			case 2: { 
				do {
					System.out.print("수학 점수 = ");
					math = Integer.parseInt(in.readLine());
				} while (math < 0 || math > 100 );
				math += 0;
				System.out.println("성적 입력 완료!");
				break;
				
			}
			 case 3: { 
				do {
					System.out.print("영어 점수 = ");
					eng = Integer.parseInt(in.readLine());
				} while (eng < 0 || eng > 100 );
				eng += 0;
				System.out.println("성적 입력 완료!");
				break;
			
			} case 4 : {
			
				if (kor <= 0 && math <= 0 && eng <=0)  {
					System.out.println("점수를 입력해주세요.");
		
				} else if (kor <= 0) {
					System.out.println("국어 점수를 입력해주세요.");
			
				} else if (math <= 0) {
					System.out.println("수학 점수를 입력해주세요.");
				
				} else if (eng <= 0) {
					System.out.println("영어 점수를 입력해주세요.");
		
				}
				else { 
					sum = kor + math + eng;
					System.out.println("성적 합계는 " + sum + "점 입니다.");	
				}
				break;
				}
			case 5 : {
				if (kor <= 0 && math <= 0 && eng <=0)  {
					System.out.println("점수를 입력해주세요.");
		
				} else if (kor <= 0) {
					System.out.println("국어 점수를 입력해주세요.");
			
				} else if (math <= 0) {
					System.out.println("수학 점수를 입력해주세요.");
				
				} else if (eng <= 0) {
					System.out.println("영어 점수를 입력해주세요.");
		
				}
				else { 
					sum = kor + math + eng;
					avg = sum / 3.0f;
					System.out.printf("성적 평균은 %.2f" + "점 입니다.", avg);
					System.out.println();
			} break;
				}
				
			case 6: {
				if (kor <= 0 && math <= 0 && eng <=0)  {
					System.out.println("점수를 입력해주세요.");
		
				} else if (kor <= 0) {
					System.out.println("국어 점수를 입력해주세요.");
			
				} else if (math <= 0) {
					System.out.println("수학 점수를 입력해주세요.");
				
				} else if (eng <= 0) {
					System.out.println("영어 점수를 입력해주세요.");
		
				}
				else { 
					sum = kor + math + eng;
					grade = sum / 3;
					
					if (grade >= 95) {
						System.out.println("학점은 A+ 입니다.");
					} else if (grade >= 90 && grade < 95) {
						System.out.println("학점은 A 입니다.");
					}  else if (grade >= 85 && grade < 90) {
						System.out.println("학점은 B+ 입니다.");
					} else if (grade >= 80 && grade < 85) {
						System.out.println("학점은 B 입니다.");
					}  else if (grade >= 75 && grade < 80) {
						System.out.println("학점은 C+ 입니다.");
					} else if (grade >= 70 && grade < 75) {
						System.out.println("학점은 C 입니다.");
					} else if (grade >= 65 && grade < 70) {
						System.out.println("학점은 D+ 입니다.");
					} else if (grade >= 60 && grade < 65) {
						System.out.println("학점은 D 입니다.");
					} else {
						System.out.println("학점은 F 입니다.");
					}
			} break;
			}
			
			case 7: {
					System.out.println("프로그램을 종료합니다.");
					System.exit(0);
					break;
			}
	
		}
		
}

}
}
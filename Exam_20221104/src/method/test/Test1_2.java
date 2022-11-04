package method.test;

import java.util.Scanner;
/*
 * 우편번호를 검색하는 메소드 작성
 */
public class Test1_2 {
	static String[] 지역번호 = {"02", "051", "053", "032", "062", "042", "052", 
			"044", "031", "033", "043", "041", "063", "061", "054", "055", "064"};

	static String[] 지역명 = {"서울", "부산", "대구", "인천", "광주", "대전", "울산", 
			"세종", "경기", "강원", "충북", "충남", "전북", "전남", "경북", "경남", "제주"};
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("지역 입력");
		
		String 입력 = sc.nextLine();
		번호(입력);
		
	}

	static void 번호(String 입력) {
		if(입력.contains("서울")) {
			System.out.println("지역은 " + 입력 + " 지역번호는 " + 지역번호[0]);
		}
		else if(입력.contains("부산")) {
			System.out.println("지역은 " + 입력 + " 지역번호는 " + 지역번호[1]);
		}
		else if(입력.contains("대구")) {
			System.out.println("지역은 " + 입력 + " 지역번호는 " + 지역번호[2]);
		}
		else if(입력.contains("인천")) {
			System.out.println("지역은 " + 입력 + " 지역번호는 " + 지역번호[3]);
		}
		else if(입력.contains("광주")) {
			System.out.println("지역은 " + 입력 + " 지역번호는 " + 지역번호[4]);
		}
		else if(입력.contains("대전")) {
			System.out.println("지역은 " + 입력 + " 지역번호는 " + 지역번호[5]);
		}
		else if(입력.contains("울산")) {
			System.out.println("지역은 " + 입력 + " 지역번호는 " + 지역번호[6]);
		}
		else if(입력.contains("세종")) {
			System.out.println("지역은 " + 입력 + " 지역번호는 " + 지역번호[7]);
		}
		else if(입력.contains("경기")) {
			System.out.println("지역은 " + 입력 + " 지역번호는 " + 지역번호[8]);
		}
		else if(입력.contains("강원")) {
			System.out.println("지역은 " + 입력 + " 지역번호는 " + 지역번호[9]);
		}
		else if(입력.contains("충북")) {
			System.out.println("지역은 " + 입력 + " 지역번호는 " + 지역번호[10]);
		}
		else if(입력.contains("충남")) {
			System.out.println("지역은 " + 입력 + " 지역번호는 " + 지역번호[11]);
		}
		else if(입력.contains("전북")) {
			System.out.println("지역은 " + 입력 + " 지역번호는 " + 지역번호[12]);
		}
		else if(입력.contains("전남")) {
			System.out.println("지역은 " + 입력 + " 지역번호는 " + 지역번호[13]);
		}
		else if(입력.contains("경북")) {
			System.out.println("지역은 " + 입력 + " 지역번호는 " + 지역번호[14]);
		}
		else if(입력.contains("경남")) {
			System.out.println("지역은 " + 입력 + " 지역번호는 " + 지역번호[15]);
		}
		else if(입력.contains("제주")) {
			System.out.println("지역은 " + 입력 + " 지역번호는 " + 지역번호[16]);
		}
	}
}

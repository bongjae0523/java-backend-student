package com.ezen.ex01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		NAVERVIBETest nv = new NAVERVIBETest();
		
		nv.NAVERVIBEInitialization(); //초기화
		nv.NAVERVIBE(); //인설트

		System.out.println("멜론차트입니다.");
		
		loop:
		while(true) {
			
			System.out.println("1. Top100   2.My list   0.close");
			int number=sc.nextInt();
			
			if(number == 1) {
				
				System.out.println("Top100 입니다.");
				while(true) {
				
					System.out.println("1.조회   2.특정조회   3.랜덤 추천   0.커밋");
					
					int num = sc.nextInt();
					
					if(num == 1) {
						nv.NAVERVIBES(); //조회
						System.out.println("조회 되었습니다.");
					}
					
					else if(num ==2) {
						System.out.println("* artist만 입력 가능합니다. * ");
						System.out.println("이름 입력: ");
						sc.nextLine();
						String name = sc.nextLine();
						nv.NAVERVIBEL(name); //특정 조회
						System.out.println("특정 조회 되었습니다.");
					}
					
					else if(num ==3) {
						System.out.println("몇 곡 뽑아드릴까요?");
						int num1 = sc.nextInt();;
						nv.NAVERVIBER(num1); //랜덤 추천
						System.out.println("랜덤 출력 되었습니다.");
						
						while(true) {
							System.out.println("맘에 드는 곡이 있다면 저장할까요?");
							System.out.println("1번: 저장   2번: 저장안해");
							
							int no = sc.nextInt();
							if(no == 1) {
								System.out.println("Top 몇 번 저장할까요?");
								int no1 = sc.nextInt();;
								nv.NAVERVIBEI2(no1);
							}
							else if(no == 2) {
								break;
							}
						}
					}
					
					else if(num ==0) {
						nv.NAVERVIBEC(); //커밋
						System.out.println("커밋 되었습니다.");
						break;
					}
				}
			}
			
			else if(number == 2) {
				while(true) {
					
					System.out.println("My list입니다.");
					System.out.println("1.조회   2.제거   3.수정   4.특정조회   5.랜덤   6.노래추가   0.커밋");
					int num = sc.nextInt();
					
					if(num ==1) {
						
						nv.NAVERVIBES2();
						System.out.println("조회 되었습니다.");
						
					}
					else if(num ==2) {
						System.out.println("* artist만 입력 가능합니다. * ");
						System.out.println("이름 입력: ");
						sc.nextLine();
						String name = sc.nextLine();
						nv.NAVERVIBED2(name); //제거
						System.out.println("제거 되었습니다.");
					}
					
					else if(num ==3) {
						System.out.println("* artist만 변경 가능합니다. * ");
						System.out.println("수정내용");
						sc.nextLine();
						String name1 = sc.nextLine();
						System.out.println("수정할 artist");
						String name2 = sc.nextLine();
						
						nv.NAVERVIBEU2(name1,name2); //수정
						System.out.println("수정 되었습니다.");
					}
					
					else if(num ==4) {
						System.out.println("* artist만 입력 가능합니다. * ");
						System.out.println("이름 입력: ");
						sc.nextLine();
						String name = sc.nextLine();
						nv.NAVERVIBEL2(name); //특정 조회
						System.out.println("특정 조회 되었습니다.");
					}
					
					else if(num ==5) {
						System.out.println("몇 곡 뽑아드릴까요?");
						int num1 = sc.nextInt();;
						nv.NAVERVIBER2(num1); //랜덤 추천
						System.out.println("랜덤 출력 되었습니다.");
					}

					else if(num ==6) {
						System.out.println("추가하시오");
						System.out.println("1번은 노래 제목");
						System.out.println("2번은 가수 이름");
						System.out.println("3번은 앨범명");
						System.out.print("1번: ");
						sc.nextLine();
						String name1 = sc.nextLine();;
						System.out.print("2번: ");
						String name2 = sc.nextLine();;
						System.out.print("3번: ");
						String name3 = sc.nextLine();;
						nv.NAVERVIBEI(name1,name2,name3); //랜덤 추천
						System.out.println("추되었습니다.");
					}
					
					
					else if(num ==0) {
						nv.NAVERVIBEC(); //커밋
						System.out.println("커밋 되었습니다.");
						break;
					}
				}
			}
			
			else if(number ==0) {
				break loop;
			}
		}	
		
		
		
		
		System.out.println("안녕히 가세요. 여러분~");
		
	}

}

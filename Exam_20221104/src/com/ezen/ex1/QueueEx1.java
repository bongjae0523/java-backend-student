package com.ezen.ex1;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;
import java.util.Scanner;
/*
 * p.611 예제 11-11
 */
public class QueueEx1 {

	static Queue q = new LinkedList();
	static final int MAX_SIZE = 5; // Queue에 최대 5개까지만 저장되도록 한다.
	
	
	public static void main(String[] args) {

		System.out.println("help를 입력하면 도움말을 볼 수 있습니다.");
		
		while(true) {
			System.out.print(">>");
			try {
				// 화면으로부터 라인단위로 입력받는다.
				Scanner s = new Scanner(System.in);
				String input = s.nextLine().trim(); //.trim() 쓸데없는 공백제거
				
				if("".equals(input)) continue; // 엔터치면 continue로 다시 while 시작.
				
				if(input.equalsIgnoreCase("q")) {
					System.exit(0);
				}
				else if(input.equalsIgnoreCase("help")){ //equalsIgnoreCase 대소문자 구분없이 비교함.
					System.out.println("help - 도움말을 보여줍니다.");
					System.out.println("q 또는 Q - 프로그램을 종료합니다.");
					System.out.println("history - 최근에 입력한 명령어를 " + MAX_SIZE + "개 보여줍니다.");
				}	
				else if(input.equalsIgnoreCase("history")) {
					int i = 0;
					//입력받은 명령어를 저장하고,
					save(input);
					
					// LinkedList의 내용을 보여준다.
					LinkedList tmp = (LinkedList)q;
					ListIterator it = tmp.listIterator(); //.listIterator() 배열안에 있는것을 읽어준다.
					
					while(it.hasNext()) // .hasNext() 다음요소가 있으면 true를 반환.
						System.out.println(++i+"."+it.next()); //.next() 반환한다.
					
//					for(int j = 0 ; j<5; ) {
//						System.out.println(++j + "." + q.poll());
//					}
				}
				else {
					save(input);
					System.out.println(input);
				} //if(input.equalsIgnoreCase("q")){
			}catch(Exception e) {
					System.out.println("입력 오류입니다.");
			}
		} //while(true)
	} //main()

	public static void save(String input) {
		//queue에 저장한다.
		if(!"".equals(input))
			q.offer(input);
		
		// queue의 최대크기를 넘으면 제일 처음 입력된 것을 삭제한다.
		if(q.size() > MAX_SIZE) // size()는 Collection 인터페이스에 정의
			q.remove();
	}
}

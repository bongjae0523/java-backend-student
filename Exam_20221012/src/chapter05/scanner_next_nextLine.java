package chapter05;

import java.util.*;

public class scanner_next_nextLine {
	public static void main(String[] args) {

	    Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String age = sc.next();
        System.out.println(name);
        System.out.println(age);
     
        sc.close();
    }
}

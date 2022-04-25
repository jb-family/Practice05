package com.javaex.ex07;

import java.util.Scanner;

public class FriendApp {

    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	
    	Friend jws = new Friend();
    	Friend ihr = new Friend();
    	Friend yjs = new Friend();
    	
        Friend[] friendArray = new Friend[3];
        
        friendArray[0] = jws;
        friendArray[1] = ihr;
        friendArray[2] = yjs;
        
        String num;
        //친구정보 3명 입력 로직 --> 반복문 사용
        System.out.println("친구를 3명 등록해 주세요");
       
         
        	
	        	 
        	 	for(int j = 0; j < friendArray.length; j++) {
					System.out.print("이름 :");
					num = sc.nextLine();
					friendArray[j].setName(num);
					System.out.print("핸드폰 :");
					num = sc.nextLine();
					friendArray[j].setHp(num);
					System.out.print("학교 :");
        	 		num = sc.nextLine();
        	 		friendArray[j].setSchool(num);
        	 		
        	 	}
        	 	System.out.println("=====================");
        	 

        
        // 친구정보 출력
        for (int i = 0; i < friendArray.length; i++) {
            //친구정보 출력 메소드 호출
        	friendArray[i].showInfo();
        }

        sc.close();
    }

}

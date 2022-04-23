package com.javaex.ex05;

public class Print {
    
	//필드
	int val;
	boolean result;
	double num;
	String name;
	
	//생성자
	
	public Print() {
		
	}
	//메소드 - gs
	
	//메소드 - 일반
	
	
	//메소드 오버로딩 - 메소드의 이름이같다.
	// 메소드 오버로딩은 매개변수의 타입과 개수 그리고 순서가 달라야 사용이 가능하다.)

    public void printer(int val){
    	System.out.println(val);
    }
    //메소드  3개 를 작성하세요
    public void printer(boolean result) {
    	System.out.println(result);
    }
    
    public void printer(double num) {
    	System.out.println(num);
    }
    
    public void printer(String name) {
    	System.out.println(name);
    }
    
}

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
	
	
	// ppt51번보고 오류에서 자동생성되는걸로 풀었음
	// 왜나온건지는 모르겠음. 
	// int앞에는 int작성하면 오류 void로 왜 사용해야하는지?
	// 다른 printer 클래스들은 앞에 자료형 넣어야하고
	// 왜 return을 넣어야하는지??
	
    public void printer(int val){
    	System.out.println(val);
    }
	//아직 안배워서 못푼다.
    //메소드  3개 를 작성하세요
    public boolean printer(boolean result) {
    	System.out.println(result);
		return result;
    }
    
    public double printer(double num) {
    	System.out.println(num);
    	return num;
    }
    
    public String printer(String name) {
    	System.out.println(name);
    	return name;
    }
    
}

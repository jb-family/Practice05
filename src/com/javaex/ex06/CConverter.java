package com.javaex.ex06;

public class CConverter {
	
	
	
    // static 메소드는 인스턴스를 생성하지 않아도 static 메소드를 사용할 수 있다. 
	// ex) CConverter a = new CConverter(); <- new 연산자를 이용한 것을 말함
	// static 메소드는 static을 이용한 메소드들끼리 변수의 값을 공유할 수 있다.
	// 그래서 CConverterApp에서 new연산자 없이 바로 CConverter.toDoller(10000000)입력하면
	// toDoller의 메소드가 실행될 수 있는 것이다.
    
    public static double rate;
    
    public static void setRate(double rate){
        CConverter.rate = rate;
    }
    
    public static double toDoller(double won){
        return won / rate;
    }

    public static double toKWR(double dollar){
        return dollar * rate;
    }
    

    
    
    
}

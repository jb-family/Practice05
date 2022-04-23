package com.javaex.ex01;

public class MemberApp {

	public static void main(String[] args) {
		
		Member jws = new Member();
		Member yjs = new Member();
		Member ihr = new Member();
		
		jws.setName("정우성");
		jws.setId("jws");
		jws.setPoint(50000);
		
		yjs.setName("유재석");
		yjs.setId("yjs");
		yjs.setPoint(30000);
		
		ihr.setName("이효리");
		ihr.setId("ihr");
		ihr.setPoint(40000);
		
		
		jws.showinfo();
		yjs.showinfo();
		ihr.showinfo();
		
	}

}

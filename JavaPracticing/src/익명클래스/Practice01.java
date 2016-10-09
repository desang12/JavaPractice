package 익명클래스;

class InnerEx6 {
	Object iv = new Object() { void method() {} }; //익명 클래스
	static Object cv = new Object() { void method() {} }; //익명 클래스
	
	void myMethod() {
		Object lv = new Object() { void method(){} }; // 익명 클래스
	}
}

/**
위 예제를 컴파일하면 4개의 클래스 파일이 생성된다.
InnerEx6.class
InnerEx6$1.class 익명클래스
InnerEx6$2.class 익명클래스
InnerEx6$3.class 익명클래스

익명클래스는 이름이 없기 때문에
외부 클래스명$숫자.class 형식으로 클래스파일명이 결정된다.
*/


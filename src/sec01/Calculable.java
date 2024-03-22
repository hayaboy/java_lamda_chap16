package sec01;



@FunctionalInterface //선택사항이지만, 컴파일 과정에서 추상메서드가 하나인지 검사하므로 정확한 함수형 인터페이스를 작성할 수 있게 도와주는 역할
public interface Calculable {
	
	//상
	
	//추
	
	
	//인터페이스의 익명 구현 객체를 람다식으로 표현하려면 인터페이스가 단 하나의 추상 메서드만 가져야 함
	abstract void calculate(int x, int y);
	
	//디
	
	//정
	
	
	//abstract void calculate2(int a, int b);
	

}

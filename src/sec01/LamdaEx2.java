package sec01;

public class LamdaEx2 {
	
	static void action(Calculable calculable) {
//		System.out.println("hi");
		
		int x=10;
		int y=4;
		
		calculable.calculate(x, y);
		
	}

	public static void main(String[] args) {
		
		
		//	//인터페이스의 익명 구현 객체를 람다식으로 표현하려면 인터페이스가 단 하나의 추상 메서드만 가져야 함
		action(
				
				(x,y) -> {
					int result=x+y;
					System.out.println(result);
				}
				);

	}

}

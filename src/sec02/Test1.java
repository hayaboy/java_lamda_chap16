package sec02;

public class Test1 {

	public static void main(String[] args) {
		
		Person kim=new Person();
		
		//1) 익명 구현 객체
//		kim.useComputer(new Calculable() {
//
//			@Override
//			public double calc(double x, double y) {
//				
//				return x+y;
//			}
//			
//		});
		
		
		//2) 람다식
//		kim.useComputer(
//				(a,b)->{
//					return a+b;
//				}
//				);
		
		//3) 메서드 참조
		// 메소드 참조는 말 그대로 메소드를 참조해서 매개변수의 정보 및 리턴 타입을 알아내 람다식에서
//		불필요한 매개변수를 제거하는 것 목적
		// 정적 메소드 참조
		kim.useComputer(Computer::add);
//		
//		
		Computer com1=new Computer();
//		
//		// 인스턴스 메소드 참조
//		
//		
		kim.useComputer(com1::add2);
		
	}

}

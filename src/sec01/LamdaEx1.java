package sec01;

public class LamdaEx1 {
	
	static void action(Calculable calculable) {
		//System.out.println("hi");
		int x=11;
		int y=4;
		
		calculable.calculate(x, y);
	}

	public static void main(String[] args) {
		
		action(new Calculable() {

			@Override
			public void calculate(int x, int y) {
				
				System.out.println(x+y);
				
			}

//			@Override
//			public void calculate2(int a, int b) {
//				// TODO Auto-generated method stub
//				
//			}
			
		});

	}

}

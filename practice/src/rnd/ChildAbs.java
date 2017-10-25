package rnd;

public abstract class ChildAbs extends AbstractDemo {
	
	public void x() {
		System.out.println("This is child X");
	}
	
	public void a() {
		System.out.println();
	}
	
	public static void main(String[] args) {
		AbstractDemo obj = new AbstractDemo() {

			@Override
			public void c() {
				// TODO Auto-generated method stub
				
			}
		};
		
	}

}

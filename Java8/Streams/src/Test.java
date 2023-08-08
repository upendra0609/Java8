
public class Test {

	public static void main(String[] args) {
		
		Runnable r = Interuf :: m1;
		
		Thread t = new Thread(r);
		t.start();
	}

}


class Interuf{
	public static void m1() {
		System.out.println("Hiiii");
	}
}
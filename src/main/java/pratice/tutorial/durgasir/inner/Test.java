package pratice.tutorial.durgasir.inner;

class Popcorn {
	public void taste() {
		System.out.println("Salty");
	}
}
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Popcorn p = new Popcorn() {
			public void taste() {
				System.out.println("Spicy");
			}
		};
		p.taste();
		Popcorn p1 = new Popcorn();
		p1.taste();
		Popcorn p2 = new Popcorn() {
			public void taste() {
				System.out.println("Sweet");
			}
		};
		p2.taste();
		System.out.println(p.getClass().getName());
		System.out.println(p1.getClass().getName());
		System.out.println(p2.getClass().getName());
		
	}

}

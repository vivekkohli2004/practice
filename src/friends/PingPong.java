package friends;

public class PingPong {

	public static void main(String[] a) {
		Thread t = new Thread(() -> PingPong.pong());
		t.run();
		// t.start();

		System.out.println("Ping");
	}

	private static void pong() {
		System.out.println("Pong");
	}
}

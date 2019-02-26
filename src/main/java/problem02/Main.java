package problem02;

public class Main {

	public static void main(String[] args) {
		BaseService base = new MyService();

		base.service("낮");
		base.service("오후");
		base.service("밤");
	}
}
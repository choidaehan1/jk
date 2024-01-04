package sec02.exam01;

public class MethodEx {

	static void main(String[] args) {
		method();
		int ret = method2(300, 400);
		System.out.println(ret);

	}

	public static int method2(int x, int y) {
		return x + y;

	}

	static void method() {
		System.out.println("메서드(함수)method()");
	}

}

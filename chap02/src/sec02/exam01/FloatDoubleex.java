package sec02.exam01;

public class FloatDoubleex {
	
	public static void main (String[] ar) {
		float num1 = 123.45654623456446465465463265465f;
		double num2 = 123.45454534324234324324324324324;
		
		System.out.println(num1);
		System.out.println(num2);
		double var = 0.1 ;
		for(int i = 0; i < 1000; i++) {
			var += 0.1;
		}
		System.out.println(var);
	}
	

}

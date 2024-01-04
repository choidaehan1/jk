package sec02.exam01;

public class Type {

	public static void main(String[] args) {
		String str3 = "3.14";
		double value = Double.parseDouble(str3);
		
		
		
		
		
		
		String str2 = ""+ 10 + 2; //문자열로 만들기
		System.out.println(str2);// 연산 일어난다 
		int num1 = Integer.parseInt(str2);//정수로만들기
		
		
		
		
		
		String str = 10 + 2 + "";
		String str1 = String.valueOf(10+2);
		
		
		
		
		
		
		
		byte value1 = 10; 
		int value2 =100 ; 
		byte sum = (byte) (value1 + value2);
		
		
		int intValue = 10;
		double doubleValue = 5.5;
		int result = (int) (intValue + doubleValue) ;
		System.out.println(result);
		
		 
		
		
		
		
		
		
		byte var1 = 100;
		int var2 = var1 ;
		long var3 = 1000000000L;
		float var4 = var3 ;
		
		var1=(byte) var2;
		System.out.println(var1);

	}

}

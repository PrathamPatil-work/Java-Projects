package com.a;

public class A {
public static void main(String[] args) {
		//	Boxing 
		int a = 10; // Primitive
		Integer b = Integer.valueOf(a); // Object // static function
					//className.method_name();
		//	Un-boxing
		Integer d =20;
		int r = d.intValue();
		//      obj.methodName();
		//		Non static functions doesn't have parameters.
		//		String Conversion
		
		//		Boxing 
		int ab = 3;
		String jk = Integer.toString(ab); //static function with toString
		
		//		Static Functions Like Integer are parameterized fucntions
		//		Un-boxing
		
		String gh ="100";
		int kl = Integer.parseInt(gh);
		
		//	Byte
		byte ac =3;
		String hj = Byte.toString(ac);
		
		Integer hc = 23;
		String kp = hc.toString();
		
		String mo = "10";
		Integer po = Integer.parseInt(mo);
		
		mo = "20";
}
}

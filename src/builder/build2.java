package builder;

public class build2 {
	
  void printObj(builder build) {
	  System.out.println("invoke");
	  System.out.println( build.getA() +" : "+build.getB() +" : "+build.getC());
  }
  
   int sum (int a, int b) {
	   return a+b;
   }
   String sum (String a, String b) {
	   return a+b;
   }
}

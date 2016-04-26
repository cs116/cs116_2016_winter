public class Foo {

   public static void main(String[] args) {
      int a = bar(19, 36);
      a = baz(a);
	  shabam(a % 2);
	  System.out.println(a);
   }

   public static int bar(int n1, int n2) {
      int x;
      int a = 17;
      if (n1 > n2) x = n2;
      else x = n1;
      return x;
   }
   
   public static int baz(int n1) {
      int a = 33;
      return 0;
   }
   
   public static void shabam(int a) {
      a = 55;
   }
}

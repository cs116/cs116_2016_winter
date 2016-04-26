    public class Test {
      public static void main(String[] args) {
        A a1 = new A();
        System.out.print(a1.j);
        A a2 = new A();
        System.out.print(" " + a2.j);
      }
    }

    class A {
      int i = 1;
      static int j = 1;
      A() {
        i++;
        j++;
      }
    }
      

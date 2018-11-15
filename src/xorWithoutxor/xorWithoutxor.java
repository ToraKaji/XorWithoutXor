package xorWithoutxor;

public class xorWithoutxor {
  //000001010
  //000000101
  
  public static void main(String[] args) {
    xor(10,5);
  }
  static int xor(int a, int b){

    System.out.println((a|b)&~(a&b));
    return  (a|b)&~(a&b);
  }
}

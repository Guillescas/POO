public class ex01 {
  static int k;
  static int f(int x) {
  return ( x * x );
  }
  static int g(int x) {
  return ( 2 * x - k );
  }
  public static void main(String[] args) {
  k = 10;
  int a = f( 5 ); System.out.println( a );
  int b = g( 5 ); System.out.println( b );
  int c = f( g( 3 ) ); System.out.println( c );
  int d = g( f( 3 ) ); System.out.println( d );
  }
}
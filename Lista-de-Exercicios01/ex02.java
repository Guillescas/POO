public class ex02 {
  static int k = 64;

  static int f(int x) {
    int r = 0;
    if (x < k)
      r = k - x;
    else {
      k = k / 2;
      r = x - k;
    }
    return r;
  }

  static int g(int x, int y) {
    int r = 0;
    while (x < y && k > 1) {
      x = x + k;
      k = k / 2;
      r++;
    }
    return r;
  }

  static int h(int x) {
    int r = 2;
    for (int i = 0; i < x; i++) {
      r = r * 2;
      r--;
    }
    return r;
  }

  static int m(int x) {
    int r = 0;
    int k = x % 4;
    switch (k) {
      case 0:
        r = 7;
        break;
      case 1:
        r = 11;
        break;
      case 2:
        r = 13;
        break;
      case 3:
        r = 17;
        break;
    }
    return r;
  }

  public static void main(String[] args) {
    int a = f(100);
    System.out.println(a);
    int b = g(2, 40);
    System.out.println(b);
    int c = h(5);
    System.out.println(c);
    int d = m(10);
    System.out.println(d);
  }
}
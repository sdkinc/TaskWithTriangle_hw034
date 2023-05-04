public class Triangle {

  private final int a;
  private final int b;
  private final int c;

  public Triangle(int a, int b, int c) {
    this.a = checkOneSide(a);
    this.b = checkOneSide(b);
    this.c = checkOneSide(c);
    if (!checkSides(a, b, c)) {
      String message = "Sides are unreal, sum of two some sides must be great as third side";
      throw new IllegalArgumentException(message);
    }
  }

  public int getA() {
    return a;
  }

  public int getB() {
    return b;
  }

  public int getC() {
    return c;
  }

  private int checkOneSide(int side) {
    if (side < 0) {
      throw new IllegalArgumentException("Side doesn't be negative: " + side);
    } else {
      return side;
    }
  }

  public static boolean checkSides(int a, int b, int c) {
    return ((a + b) > c && (a + c) > b && (b + c) > a);
  }

}

public class Demo{
  public static void main (String[] args) {
    if (args.length == 0) {
      printLoop(5);
    } else {
      printLoop(Integer.parseInt(args[0]));
    }
  }
  public static void printLoop(int a) {
    for (int i = 1; i <= a; i++) {
      for (int j = 0; j < a - i + 1; j++) {
        System.out.print(i);
      }
      System.out.println();
    }
  }
}

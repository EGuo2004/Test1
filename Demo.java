import java.util.Random;
public class Demo{
  public static void main (String[] args) {
    if (args.length == 0) {
      printLoop(5);
    } else {
      printLoop(Integer.parseInt(args[0]));
    }
    System.out.println(arrDeepToString(create2DArray(Integer.parseInt(args[0]),Integer.parseInt(args[1]),Integer.parseInt(args[2]))));
    System.out.println(arrDeepToString(create2DArrayRandomized(Integer.parseInt(args[0]),Integer.parseInt(args[1]),Integer.parseInt(args[2]))));
  }
  public static void printLoop(int a) {
    for (int i = 1; i <= a; i++) {
      for (int j = 0; j < a - i + 1; j++) {
        System.out.print(i);
      }
      System.out.println();
    }
  }

  public String arrToString(int[] arr) {
    String output = "";
    for (int i = 0; i < arr.length; i++) {
       if (i == 0) {
         output = Integer.toString(arr[i]);
       } else {
         output += ", " + Integer.toString(arr[i]);
       }
     }
     return "{" + output + "}";
  }

  public static String arrDeepToString(int[][] arr) {
    String str = "{";
    for (int i = 0; i < arr.length; i++) {
      if (i !=0) {
        str += "\n";
      }
      str += "{";
      for (int j = 0; j < arr[i].length; j++) {
        if (j != 0) {
          str += ", ";
        }
        str += arr[i][j];
      }
      str += "}";
    }
    return str + "}";
  }

  public static int [][] create2DArray (int rows, int cols, int maxVal) {
    Random rnd = new Random();
    int[][] arr = new int[rows][cols];
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        arr[i][j] = rnd.nextInt(maxVal + 1);
      }
    }
    return arr;
  }
  public static int [][] create2DArrayRandomized(int rows, int cols, int maxVal) {
    Random rnd = new Random();
    int [][] arr = new int[rows][];
    for (int i = 0; i < rows; i++) {
      arr[i]= new int[rnd.nextInt(cols + 1)];
      for (int j = 0; j < arr[i].length; j++) {
        arr[i][j]= rnd.nextInt(maxVal + 1);
      }
    }
    return arr;
  }
}

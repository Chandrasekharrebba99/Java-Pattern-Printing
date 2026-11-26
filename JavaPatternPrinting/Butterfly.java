import java.util.*;

class main{
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int n=sc.nextInt();
      sc.close();
      if (n <= 0) {
          return;
      }
      for(int i=1;i<=n;i++){
          printRow(n, i);
      }
      for(int i=n-1;i>=1;i--){
          printRow(n, i);
      }
    }

    private static void printRow(int size, int wingWidth) {
        String wing = "* ".repeat(wingWidth);
        String gap = "  ".repeat(2 * (size - wingWidth));
        System.out.println(wing + gap + wing);
    }
}

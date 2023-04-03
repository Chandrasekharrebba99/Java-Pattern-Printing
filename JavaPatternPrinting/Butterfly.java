import java.util.*;

class main{
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      String zeros="",ones="";
      int n=sc.nextInt();
      for(int i=1;i<=n;i++){
          System.out.println("* ".repeat(i)+"  ".repeat((n-i)*2)+"* ".repeat(i));
      }
      System.out.println("* ".repeat(n*2));
       for(int i=1;i<=n;i++){
          System.out.println("* ".repeat((n-i))+"  ".repeat((i)*2)+"* ".repeat((n-i)));
      }
      sc.close();
    }
}
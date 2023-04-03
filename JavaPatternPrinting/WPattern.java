import java.util.*;

class main{
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      String zeros="",ones="";
      int n=sc.nextInt();
      
      System.out.println("* ".repeat(n*2-1));
       for(int i=1;i<=n;i++){
          System.out.println(" ".repeat(i)+"* ".repeat((n-i))+"  ".repeat((i-1))+"* ".repeat((n-i)));
      }
      sc.close();
    }
}
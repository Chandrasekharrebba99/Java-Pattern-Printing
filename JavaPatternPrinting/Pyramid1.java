import java.util.*;

class main{
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      String zeros="",ones="";
      int n=sc.nextInt();
      for(int i=1;i<=n;i++){
          System.out.println(". ".repeat(n-i)+"0 ".repeat(2*i-1)+". ".repeat(n-i));
      }
      sc.close();
    }
}
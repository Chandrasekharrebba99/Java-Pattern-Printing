import java.util.*;
class main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        for (int i = 1;i<num+1;i++){
          for (int j=1;j<=i;j++){
              System.out.print(j+" ");
        }
        System.out.println();
       
        }
    }
}
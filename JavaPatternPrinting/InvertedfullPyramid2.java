import java.util.*;
class main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt()+2;

         for(int i=1;i<num+1;i++){
             String spa =" ".repeat(i-1);
             System.out.print(spa);
             for(int j=1;j<num-i;j++){
                 System.out.print(j+" ");
             }
             System.out.println();
        }
      
        
    }
}
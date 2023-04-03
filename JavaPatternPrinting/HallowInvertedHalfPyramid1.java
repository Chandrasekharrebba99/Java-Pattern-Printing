import java.util.*;
class main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i=1;i<=num;i++){
            System.out.print(i+" ");
        }
        System.out.println();
        for (int i = 1;i<num;i++){
            for(int j =1;j<=num-i;j++){
                if((j==1) ||(j==(num-i))){
                    System.out.print(j+" ");
                }else{
                     System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
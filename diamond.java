import java.util.*;
class diamond{
    public static void main(String[] args) {
        System.err.println("Welcomm..");
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter a number :");
        int a=scan.nextInt();
        System.out.println("Given number is : "+a);
        scan.close();
        int f=0,l=0;
        if(a%2!=0){
            f=a/2+1;
            l=a/2+1;
            for(int i=1;i<=a;i++){
                for(int j=1;j<=a;j++){
                    if(f<=j && l>=j){
                        System.out.print("* ");
                    }
                   else{
                       System.out.print("  ");
                   }
               }
               System.out.println();
               if(a/2+1>i){
                f-=1;
                l+=1;
               }
               else{
                f+=1;
                l-=1;
               }
            }
        }
        else{
            f=a/2;
            l=a/2+1;
            for(int i=1;i<=a;i++){
                for(int j=1;j<=a;j++){
                    if(f<=j && l>=j){
                        System.out.print("* ");
                    }
                   else{
                       System.out.print("  ");
                   }
               }
               System.out.println();
               if(a/2>i){
                f-=1;
                l+=1;
               }
               else if( i==a/2 ){
                f=1;
                l=a;
               }
               else{
                f+=1;
                l-=1;
               }
            }
        }
    }
}
import java.util.Scanner;

public class MarkTheAnswer{
    public static void main(String args[])
    {
        int N,X;
        Scanner scanner=new Scanner(System.in);
        N=scanner.nextInt();
        X=scanner.nextInt();
        int [] M=new int[N];
        for(int i=0;i<N;i++){
            M[i]=scanner.nextInt();
        }

        int C=0,D=0;
        for(int i=0;i<N;i++){
            if(M[i]>X && D==0)
            {
            
                D++;
            }
            else if(M[i]>X && D!=0)
            break;
            else
            C++;
        }
        System.out.println(C);

        scanner.close();
    }
}
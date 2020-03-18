import java.util.Scanner;

public class LongQueue{
    public static void main(String args[]){

        int N;
        Scanner scanner = new Scanner(System.in);
        N= scanner.nextInt();
        int [] H= new int [N];

        for(int i=0;i<N;i++){
            H[i]=scanner.nextInt();
        }
        int count=1;
        for(int i=1;i<N;i++){
            if(H[i]>=H[i-1]){
                continue;
            }
            else
            count++;
        }

        System.out.println(count);

    scanner.close();
}
}
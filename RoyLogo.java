
import java.util.Scanner;

public class RoyLogo {

    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        int T;
        
        T=scanner.nextInt();
        for(int t=0;t<T;t++)
        {
            int N;
            boolean flag=true;
            
            N=scanner.nextInt();
            scanner.nextLine();
        
            String str[]=new String[N];
            
            for(int i=0;i<N;i++)
            {

                str[i]=scanner.nextLine();
                if(str[i].length()==N)
                {
                    continue;
                }
                else
                break;
            }
            char [][] ch= new char [N][N];
            for(int i=0; i<N; i++){
                for(int j=0;j<N;j++){
                    ch[i][j]= str[i].charAt(j);
                }

            }


                
                    for(int i=0;i<N;i++)
                    {
                        for(int j=0;j<N/2;j++)
                        {
                            if(ch[i][j]!=ch[i][N-j-1])
                            {
                                flag=false;
                                break;
                                
                            }
                            
                            
                        }
                    if(flag==false)
                    break;
                    
                    }
                    if(flag==false)
                    {
                        
                    System.out.println("NO");
                    
                    continue;
                    }
                
                for(int i=0;i<N/2;i++){
                    for(int j=0;j<N;j++){
                        
                        if((ch[i][j]!=ch[N-i-1][j])){

                            flag=false;
                            break;
                        }
                        
                        
                    }
                    if(flag==false)
                    break;
                }
                
                if(flag == false){
                    System.out.println("NO");
                }
                else
                System.out.println("YES");
                
                
            
            

            
        }
        
        scanner.close();

    }
}
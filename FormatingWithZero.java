import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++)
            {
                String s1=sc.next();
                int x=sc.nextInt();
                //Complete this line
                
                if(x==0)
                {
                    System.out.print(s1);
                    for(int j = s1.length(); j <15; j++)
                    {
                        System.out.print(" ");
                    }
                    System.out.println("00"+x);
                }
                else if(x>0 && x<100)
                {
                    System.out.print(s1);
                    for(int j = s1.length(); j <15; j++)
                    {
                        System.out.print(" ");
                        
                    }
                    System.out.println("0"+x);
                    
                }
                else
                {
                    System.out.print(s1);
                    for(int j = s1.length(); j <15; j++)
                    {
                        System.out.print(" ");
                    }
                    System.out.println(x);
                }
                
                
                
            }
            System.out.println("================================");

    }
}




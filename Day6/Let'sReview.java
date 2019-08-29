import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int j=0;j<T;j++)
        {
           String S = sc.next();
           char[] C = S.toCharArray();
            for(int i=0;i<S.length();i++)
            {
                if(i==0)
                {
                    System.out.print(C[i]);
                }
                else
                {
                    if(i%2==0)
                        {
                            System.out.print(C[i]);
                        }
                }
            }
                System.out.print(" ");
            for(int i=1;i<S.length();i++)
            {
                if(i%2!=0)
                {
                    System.out.print(C[i]);
                }
            }
            System.out.print("\n");
        }
    }
}

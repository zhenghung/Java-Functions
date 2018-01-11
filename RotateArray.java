import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class RotateArray {

    public static void main(String[] args) {
        int n = 5;
        int k = 4;
        int a[] = {1, 2, 3, 4, 5};
        // Scanner in = new Scanner(System.in);
        // int n = in.nextInt();
        // int k = in.nextInt();
        // int a[] = new int[n];

        // for(int a_i=0; a_i < n; a_i++){
        //     a[a_i] = in.nextInt();
        // }
        int out[] = new int[n];
        for(int i=0; i<n; i++){
            int s = i+k;
            if(s>=n){
                s= s-n;
            }
            out[i] = a[s];
        }
        for(int i=0; i<n;i++){
            System.out.print(out[i]);
            System.out.print(' ');
        }
        
    }

    
    
        
}

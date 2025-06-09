package Silver;

import java.io.IOException;
import java.util.*;

public class S2 {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        int[] arr = new int[n+1];
        for(int i = 1; i <= n; i ++){
            arr[i] = sc.nextInt();
        }
        int[] acc = new int[n + 1];
        for(int i = 1; i <= n ; i ++){
            acc[i] = acc[i-1] ^ arr[i];
        }


        int result = 0;
        for(int i = 0 ; i < q; i ++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            result ^= (acc[b] ^ acc[a - 1]);
        }
        System.out.println(result);
    }
}

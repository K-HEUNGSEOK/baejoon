import java.io.FileInputStream;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
   
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] a = new int[n];
        for(int i = 0 ; i < n ; i ++){
            a[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int [] b = new int[m];
        for(int i = 0 ; i < m ; i ++){
            b[i] = sc.nextInt();
        }
        StringBuilder sb = new StringBuilder();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i < n ; i ++){
            map.put(a[i], map.getOrDefault(a[i], 0) + 1);
        }
        for(int i = 0 ; i < m ; i ++){
            sb.append(map.containsKey(b[i]) ? "1\n" : "0\n");
        }

        System.out.println(sb);
    }
    }

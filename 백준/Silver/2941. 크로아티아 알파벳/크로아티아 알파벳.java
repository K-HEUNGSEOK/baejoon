import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Array;
import java.security.spec.RSAOtherPrimeInfo;
import java.util.Arrays;
import java.util.Scanner;
import java.util.*;

public class Main {
    static String[] target = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
    public static void main(String[] args) throws IOException {
   
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        print(str);
    }
    static void print(String str){
        int cnt = 0;

        for(int i = 0 ; i < str.length(); i ++){
            boolean check = false;
            if (i + 2 < str.length()){
                String sub1 = str.substring(i , i + 3);
                if (sub1.equals("dz=")){
                    i+=2;
                    cnt ++;
                    continue;
                }
            }

            if (i + 1 < str.length()){
                String sub2 = str.substring(i,i+2);
                for (String s : target) {
                    if (sub2.equals(s)){
                        cnt ++;
                        i+=1;
                        check = true;
                        break;
                    }
                }
            }
            if (check) continue;

            cnt ++;
        }
        System.out.println(cnt);

    }

}
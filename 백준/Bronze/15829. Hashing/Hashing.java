import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
       
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char [] arr = sc.next().toCharArray();
        int result = getHashNumber(arr);
        System.out.println(result);
    }

    private static int getHashNumber(char[] arr) {
        int sum = 0 ;
        for(int i = 0 ; i < arr.length; i ++){
            sum += (int) (alphabetNumber(arr[i]) * Math.pow(31,i));
        }
        return sum % 1234567891;
    }

    private static int alphabetNumber(char c){
        char[] arr = {'a','b','c','d','e','f','g','h','i','j','k','l'
        ,'m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

        for(int i = 0 ; i < arr.length; i ++){
            if (arr[i] == c){
                return  i + 1;
            }
        }
        return 0;
    }
}


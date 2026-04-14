import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        int sum = 0;
        int min = 0;
        for(int i=n; i<=m; i++) {
            if(func(i)) {
                sum += i;
                if(min == 0) min = i;
            }
        }
        StringBuilder sb = new StringBuilder();
        if(min > 0) {
            sb.append(sum).append("\n").append(min);
        } else {
            sb.append(-1);
        }
        System.out.print(sb.toString());
    }
    
    public static boolean func(int a) {
        if(a < 2) return false;
        if(a == 2) return true;
        
        for(int i=2; i<=a; i++) {
            if(a % Math.sqrt(i) == 0) {
                return false;
            }
        }
        return true;
    }
}
import java.util.*;
public class LargestNumberFormedFromArray {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i] = scan.nextInt();
        }
        Arrays.sort(a);
        String s = "";
        for(int i=a.length-1;i>=0;i--){
            s+=a[i];
        }
        System.out.println(Integer.parseInt(s));
        
    }
}

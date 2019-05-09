import java.util.*;
public class ArrayNumberMatchedWithIndex {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int a[] = new int[n];
		String s = "";
		for(int i=0;i<n;i++){
			a[i] = scan.nextInt();
			if(a[i]==i){
				s+=a[i]+" ";
			}
		}
		System.out.println(s);
		
	}

}

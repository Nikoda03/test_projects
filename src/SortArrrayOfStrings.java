import java.util.Arrays;
import java.util.Scanner;


public class SortArrrayOfStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String [] Array = new String[n];
		
		for (int i = 0; i < Array.length; i++) {

			Array[i]=in.next();
		}
		
		Arrays.sort(Array);
		
		for (int i = 0; i < n; i++) {
			System.out.println(Array[i]);
		}
	}
}	



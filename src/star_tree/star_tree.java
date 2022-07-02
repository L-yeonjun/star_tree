package star_tree;
import java.util.*;
public class star_tree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int []line;
		
		System.out.println("line input : ");
		int linenum = sc.nextInt();
		
		line = new int[linenum];
		
		for(int i = 1; i <= linenum; i++) {
			
			for(int k = linenum - i; k > 0; k--) {
				System.out.printf(" ");
			}
			
			for(int j = 1; j <= i * 2 - 1; j++) {
				System.out.printf("*");
			}

			System.out.println("");

		}
		
	}

}

import java.util.ArrayList;
import java.util.Scanner;

/*
Link to problem: https://www.hackerrank.com/challenges/java-list
*/

public class List {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n > 0 || n < 4000) {
			ArrayList<Integer> list = new ArrayList<Integer>();
			for(int i = 0; i < n; i++) {
				int l = Integer.parseInt(sc.next());
				list.add(l);
			}
			int q = sc.nextInt();
			if (q > 0 || q < 4000) {
				String query = null;
				for(int j = 0; j < q; j++) {
					query = sc.next();
					if(query.equals("Insert")) {
					int x = sc.nextInt();
					int y = sc.nextInt();
					list.add(x, y);
					} else if (query.equals("Delete")) {
						int del = sc.nextInt();
						list.remove(del);
					}
				}
				for(int z = 0; z < list.size(); z++) {
					System.out.print(list.get(z) + " ");
				}
			}
		}
	sc.close();
	}
}

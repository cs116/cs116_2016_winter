import java.util.Scanner; public class SumCount {
	public static void main(String[] args) {
		int sum = 0;
		int count = 1;
		int arr[] = new int[21];
		do {
			arr[count] = 0;
			if (count % 2 == 0) {sum = sum + count; arr[count] = sum;}
			System.out.println(sum);
			System.out.println(count);
			count = count + 1;
		} while (count <= 20);
		System.out.println(sum);
		System.out.println(count);
		for (int i=0; i < count-1; i++) System.out.print(arr[i] + " ");
		System.out.println();
		System.out.println(arr[6]);
	}
}

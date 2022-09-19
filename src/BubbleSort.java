import java.util.*;
public class BubbleSort {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int[] list = new int[a];
		for(int i = 0; i < a; i++) {
			list[i] = s.nextInt();
		}
		int temp = 0;
		for(int i = 0; i < a; i++) {
			for(int j = 0; j < a-1-i; j++) {
				if(list[j] > list[j+1]) {
					temp = list[j];
					list[j] = list[j+1];
					list[j+1] = temp;
					
				}
			}
		}
		System.out.print("Sorted List: ");
		for(int i = 0; i < a; i++) {
			System.out.print(list[i]+" ");
		}
	}

}
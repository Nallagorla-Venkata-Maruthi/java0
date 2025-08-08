package wd;
import java.util.Arrays;
public class LambdaArray {
	public static void main(String[] args) {
		Integer[] numbers= {5, 2, 8, 1, 9};
		Arrays.sort(numbers,(a,b)->a-b);
		System.out.println("Ascending Order");
		for (int num:numbers) {
            System.out.print(num+" ");
        }
		Arrays.sort(numbers,(a,b)->b-a);
		System.out.println("\nDescending order:");
        for (int num:numbers) {
            System.out.print(num +" ");
	}
	}    
}



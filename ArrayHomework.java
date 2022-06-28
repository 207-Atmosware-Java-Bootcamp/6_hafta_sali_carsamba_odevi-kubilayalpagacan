import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class ArrayHomework {

	public static void main(String[] args) {
		
		int[] firstArray=creatingArray();
		int[] secondArray=cloneArrayFunc(firstArray);
		totalAndAvg(secondArray);
		odd(secondArray);
		even(secondArray);
		searching(secondArray);
		repatingNumbers(secondArray);
		withoutRepatingNumbers(secondArray);
	}
	
	public static int[] creatingArray() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Array size giriniz: ");
		int size=scan.nextInt();
		int[] myArray=new int[size];
		Random rnd=new Random();
		for (int i = 0; i < myArray.length; i++) {
			myArray[i]+=rnd.nextInt(10);
		}
		return myArray;
	}
	public static int[] cloneArrayFunc(int[] array) {
		int[] cloneArray= array.clone();
		Arrays.sort(cloneArray);
		for (int i : cloneArray) {
			System.out.print(i+ " ");
		}
		System.out.println("\nEn kucuk sayi: "+ cloneArray[0]);
		System.out.println("En buyuk sayi: "+ cloneArray[cloneArray.length-1]);
		return cloneArray;
	}
	public static void totalAndAvg(int[] array) {
		float total=0;
		float avg=0;
		for (int item:array) {
			total+=item;
		}
		System.out.println(total);
		avg=total/array.length;
		System.out.println(avg);
	}
	public static void odd(int[] array) {
		int countOdd=0;
		int totalOdd = 0;
		for(int i:array) {
			if (i%2==1) {
				countOdd++;
				totalOdd+=i;
			}
		}
		System.out.println("Tek sayilarin adedi: "+ countOdd);
		System.out.println("Tek sayilarin toplami: "+ totalOdd);
	}
	public static void even(int[] array) {
		int countEven=0;
		int totalEven = 0;
		for(int i:array) {
			if (i%2==0) {
				countEven++;
				totalEven+=i;
			}
		}
		System.out.println("Cift sayilarin adedi: "+ countEven);
		System.out.println("Cift sayilarin toplami: "+ totalEven);
	}
	public static void searching(int[] array) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Aramak istediginiz sayiyi giriniz.");
		int number=scan.nextInt();
		int position= Arrays.binarySearch(array, number);
		
		if (position>0) {
			System.out.println(number+" is in the array!");
		}
		else {
			System.out.println(number+" is not in the array!");
		}
	}
	public static void repatingNumbers(int[] array) {
		int[] repatingNumbers= {};
		System.out.println("Repating Numbers are: ");
		for (int i = 0; i < array.length; i++) {
			for (int j = i+1; j < array.length; j++) {
				if (array[i]==array[j]) {
					System.out.print(array[j]+ " ");
					
				}
			}
		}
	}
	public static void withoutRepatingNumbers(int[] array) {
		Set<Integer> arraySet = new HashSet<Integer>();
		
		for(int item:array) {
			arraySet.add(item);
		}
		System.out.println("\nWithout Repating Numbers\n"+arraySet);
	}
	

}

package com.bridgelabz.utility;


import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utility {
	Scanner sc = new Scanner(System.in);// do need to mention in every methods
	// since it is global call.

	// ------------------------------------------------------------------------------------------
	// To get a String as an input
	public String getString() {

		System.out.println("enter the input");
		return sc.nextLine();

	}

	// ---------------------------------------------------------------------------------------------
	// To get a integer as an input
	public int inputInteger() {
		System.out.println("enter the input");
		return sc.nextInt();

	}

	// ------------------------------------------------------------------------------------------
	// To get a double as an input
	public Double inputDouble() {
		System.out.println("enter the input");
		return sc.nextDouble();
	}

	// --------------------------------------------------------------------------------------------
	// To get a array as an input
	public int[] inputArray() {
		int n = sc.nextInt();
		int arr[] = new int[n];
		return arr;
	}

	// --------------------------------------------------------------------------------------------
	// To find the leap year
	public boolean isLeapYear(int year) {
		if ((year % 4 == 0) && ((year % 100 == 0) && (year % 400 == 0)))
			return true;
		else
			return false;
	}

	// -----------------------------------------------------------------------------------------------
	// To check given two elements are anagram or not
	public boolean anag(String s1, String s2) {
		char[] s1Array = s1.toCharArray();
		char[] s2Array = s2.toCharArray();

		Arrays.sort(s1Array);
		Arrays.sort(s2Array);
		boolean status = Arrays.equals(s1Array, s2Array);
		return status;
	}
	/*88575439534573453*/// To check given two elements are anagram or not
		public char[] anag1(String s1, String s2) {
			char[] s1Array = s1.toCharArray();
			char[] s2Array = s2.toCharArray();

			Arrays.sort(s1Array);
			Arrays.sort(s2Array);
			boolean status = Arrays.equals(s1Array, s2Array);
			return s1Array;
		}
	// ---------------------------------------------------------------------------------------------
	// Take number of random number to generate as input and return array of random
	// number
	public int[] getRandomArray(int number) {
		Random randomGenerator = new Random();
		int array[] = new int[number];
		for (int i = 0; i < number; i++) {
			array[i] = randomGenerator.nextInt();
		}
		return array;
	}

	// ----------------------------------------------------------------------------------------------
	// To swap the given strings
	public static String swap(String a, int i, int j) {
		char temp;
		char[] charArray = a.toCharArray();
		temp = charArray[i];
		charArray[i] = charArray[j];
		charArray[j] = temp;
		return String.valueOf(charArray);
	}

	// ----------------------------------------------------------------------------------------------
	// To find the power of a given number
	public int power(int n) {
		System.out.println("Power of 2^" + n + " is: " + (Math.pow(2, n)));
		System.out.println();
		return n;
	}

	// --------------------------------------------------------------------------------------------
	// To sort the array elements using insertion sort
	public String[] insertionSort(String[] a) {
		String temp;
		for (int i = 1; i < a.length; i++) {
			temp = a[i];
			int j = 0;
			for (j = i; j > 0; j--)
				if (temp.compareTo(a[j - 1]) < 0)
					a[j] = a[j - 1];
				else
					break;
			a[j] = temp;
		}

		return a;
	}

	// -------------------------------------------------------------------------------------------
	// Binary Search for integer
	public int binarySearch(int[] ar, int key) {
		int start = 0;
		int end = ar.length - 1;
		while (start <= end) {
			int mid = (start + end) / 2;
			if (key == ar[mid]) {
				return mid;
			} else if (key < ar[mid]) {
				end = mid - 1;
			} else {
				start = mid + 1;

			}
		}
		return -1;
	}

	// --------------------------------------------------------------------------------------------
	// Binary Search for String
	public <T extends Comparable> int binarySearchString(T[] names, T key) {
		int first = 0;
		int last = names.length - 1;
		int mid;
		while (first <= last) {
			mid = (first + last) / 2;
			if (key == names[mid])
			{
				return mid;
			}
			else if (key.compareTo(names[mid]) >0)
				first = mid + 1;
			else  
				last = mid - 1;
			
		}
		System.out.println("element not found");
		return -1;
		
	}

	// ------------------------------------------------------------------------------------------
	// Bubble Sort for Integer
	public int[] bubbleSort(int a[]) {
		int temp;
		for (int i = 0; i < a.length; i++) {
			for (int j = 1; j < (a.length - i); j++) {
				// if numbers[j-1] > numbers[j], swap the elements
				if (a[j - 1] > a[j]) {
					temp = a[j - 1];
					a[j - 1] = a[j];
					a[j] = temp;
				}
			}
		}
		return a;
	}

	// --------------------------------------------------------------------------------------------
	// Bubble Sort for String
	public <T extends Comparable> T[] bubbleSortString(T a[]) {
		T temp;
		for (int i = 0; i < a.length; i++) {
			for (int j = 1; j < (a.length - i); j++) {
				// if numbers[j-1] > numbers[j], swap the elements
				if (a[j - 1].compareTo(a[j]) < 0) {
					temp = a[j - 1];
					a[j - 1] = a[j];
					a[j] = temp;
				}
			}
		}
		return a;
	}

	// --------------------------------------------------------------------------------------------------
	// Insertion sort for integer
	public int[] insertionSort(int a[]) {
		int temp;
		for (int i = 1; i < a.length; i++) {
			for (int j = i; j > 0; j--) {
				if ((a[j] - a[j - 1]) < 0) {
					temp = a[j];
					a[j] = a[j - 1];
					a[j - 1] = temp;
				} else
					break;
			}
		}
		return a;
	}

	// -----------------------------------------------------------------------------------------------------------
	// Insertion sort for String
	public <T extends Comparable> T[] insertionSortString(T a[]) {
		T temp;
		for (int i = 1; i < a.length; i++) {
			for (int j = i; j > 0; j--) {
				if (a[j].compareTo(a[j - 1]) < 0) {
					temp = a[j];
					a[j] = a[j - 1];
					a[j - 1] = temp;
				} else
					break;
			}
		}
		return a;
	}

	// -------------------------------------------------------------------------------------------------
	// merge sort to sort the elements.
	private int[] array1;
	private int[] tempMergArr;
	private int length;
	private int[] array;

	public int[] mergesort(int[] inputArr) {
		this.array1 = inputArr;
		this.length = inputArr.length;
		this.tempMergArr = new int[length];
		doMergeSort(0, length - 1);
		return inputArr;
	}

	public void doMergeSort(int lowerIndex, int higherIndex) {

		if (lowerIndex < higherIndex) {
			int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
			// Below step sorts the left side of the array
			doMergeSort(lowerIndex, middle);
			// Below step sorts the right side of the array
			doMergeSort(middle + 1, higherIndex);
			// Now merge both sides
			mergeParts(lowerIndex, middle, higherIndex);
		}
	}

	public void mergeParts(int lowerIndex, int middle, int higherIndex) {

		for (int i = lowerIndex; i <= higherIndex; i++) {
			tempMergArr[i] = array1[i];
		}
		int i = lowerIndex;
		int j = middle + 1;
		int k = lowerIndex;
		while (i <= middle && j <= higherIndex) {
			if (tempMergArr[i] <= tempMergArr[j]) {
				array1[k] = tempMergArr[i];
				i++;
			} else {
				array1[k] = tempMergArr[j];
				j++;
			}
			k++;
		}
		while (i <= middle) {
			array1[k] = tempMergArr[i];
			k++;
			i++;
		}

	}
	
	
	
	// -------------------------------------------------------------------------------------------------

	// Function take String in dd/mm/yyyy format and return Date Object
	public Date printDate(String date) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
		try {
			return (Date) sdf.parse(date);
		} catch (ParseException pe) {
			return null;
		}
	}

	// ------------------------------------------------------------------------------------------
	// Binary to Decimal Conversion
	public static int BinaryToDecimal(int binaryNumber) {
		int decimal = 0;
		int p = 0;
		while (true) {
			if (binaryNumber == 0) {
				break;
			} else {
				int temp = binaryNumber % 10;
				decimal += temp * Math.pow(2, p);
				binaryNumber = binaryNumber / 10;
				p++;
			}
		}
		return decimal;
	}

	// --------------------------------------------------------------------
	// Decimal to binary Conversion
	public static int binary(int num) {
		int i = 0;
		int bin[] = new int[100];
		bin[0] = 0;
		while (num > 0) {
			bin[i++] = num % 2;
			num = num / 2;
		}
		for (int j = i - 1; j >= 0; j--) {
			System.out.print(bin[j]);
		}
		return 0;

	}
}

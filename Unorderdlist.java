/**
 * 
 */
package com.bridgelabz.DataStructure;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import com.bridgelabz.utility.Utility;

/**
 * Created By:Medini P.D
 * Date:- 19/05/2018
 * Purpose:
 */
public class Unorderdlist {
	
	 	public static void main(String[] args) throws IOException {
	 		Utility u=new Utility();
	 		LinkedList list = new LinkedList();
	 		int count = 0;
	 		String wordnew = null;
	 		File f = new File("/home/bridgelabz/Documents/medini/string.txt");
	 		FileReader fr = null;
	 		BufferedReader br = null;
	 		String word = "";
	 		try {
	 			fr = new FileReader(f);
	 			br = new BufferedReader(fr);
	 			word = br.readLine();
	 			while (word != null) {
	 				String[] str = word.split(" , ,");
	 				count++;
	 				for (int i = 0; i < str.length; i++) {
	 					list.add(str[i]);
	 				}
	 				break;
	 			}

	 		} catch (IOException e) {
	 			e.printStackTrace();
	 		}
	 		System.out.println("searching elements in list");
	 		list.display();
	 		System.out.println(list.size());
	 		System.out.println("Enter the word to be searched in list");
	 		wordnew = u.getString();
	 		System.out.println(wordnew);
	 		int c = list.search(wordnew);
	 		System.out.println(c);
	 		if (c < list.size() && c >= 0) {
	 			list.remove(c);

	 			list.display();
	 			System.out.println(list.size());
	 		} else {
	 			list.add(wordnew);
	 			list.display();
	 			System.out.println(list.size());
	 			FileWriter fileWriter = new FileWriter(f);
	 			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
	 			String str1 = word + "," + wordnew;
	 			bufferedWriter.write(str1);
	 			;
	 			bufferedWriter.close();
	 			System.out.println("The word is added to the file and list successfully");

	 		}
	 }
}

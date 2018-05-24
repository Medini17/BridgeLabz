/**
 * 
 */
package com.bridgelabz.DataStructure;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import com.bridgelabz.task.Node;
import com.bridgelabz.utility.Utility;

/**
 * Created By:Medini P.D
 * Date:- 19/05/2018
 * Purpose:
 */
public class UnorderedList {
	static Node start;
	Utility  u1=new Utility();
	ListUtility lu=new ListUtility();

	public UnorderedList()
	{
		try
		{
			start=lu.readFile(start);
			System.out.print("Enter the word to search :");
			String word1=u1.getString();
			//Search the word
			start=lu.searchData(start,word1);
			String word2=" ";

			while(start!=null)
			{
				word2=word2+start.data;
				word2=word2+" ";
				start=start.nextNode;
			}
			//  u1.writeToFile(start);
			lu.writeDataToFile(word2);
		}
		catch(NullPointerException n)
		{
			System.out.println(n);
		}
	}  		//End of method
	public void writeDataToFile(String nWord)
	{
		try{
			File fi=new File("/home/bridgelabz/Documents/medini/amd.txt");
	      	fi.createNewFile();
	      	FileWriter fw=new FileWriter(fi);
	        fw.write(nWord);
	        fw.close();
		}
		catch(IOException e){
		}
	}

	public static void main(String[] args) throws IOException
	{
		UnorderedList ul=new UnorderedList();

        FileReader fr=new FileReader("/home/bridgelabz/Documents/medini/amd.txt");    
        int i=0;    
        while((i=fr.read())!=-1) 
        {
        System.out.print((char)i);
        }
        fr.close();   
		}
	}



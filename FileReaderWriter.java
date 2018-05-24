/**
 * 
 */
package com.bridgelabz.DataStructure;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

import com.bridgelabz.utility.Utility;


/**
 * Created By:Medini P.D
 * Date:- 19/05/2018
 * Purpose:
  */    
  
public class FileReaderWriter
{
public static void main(String[] args) throws Exception {     
	Utility u=new Utility();
    FileWriter writer = new FileWriter("/home/bridgelabz/Documents/medini/amd.txt");  
    BufferedWriter buffer = new BufferedWriter(writer);  
    buffer.write(u.getString());  
    buffer.close();  
    System.out.println("Success"); 
    
    
         FileReader fr=new FileReader("/home/bridgelabz/Documents/medini/amd.txt");    
         int i=0;    
         while((i=fr.read())!=-1) 
         {
         System.out.print((char)i);
         }
         fr.close();    
   }    
}    
package com.Files;

import java.io.BufferedReader;
import java.io.FileReader;

public class Bufferedreader {
	public static void main(String[] args)throws Exception{
		
		FileReader fr=new  FileReader("f:\\Filewriter.txt");
		BufferedReader br=new BufferedReader(fr);
		
		String line=br.readLine(); //read next line from the file and returns it
		
		while(line!=null)
		{
			System.out.println(line);
			line=br.readLine();
		}
	
	br.close();
	}

}

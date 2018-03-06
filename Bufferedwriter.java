package com.Files;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class Bufferedwriter {
	
	public static void main(String[] args) throws Exception {
	
		//File f=new File("D:filewriter.txt")  ;
		FileWriter fw=new  FileWriter("f:\\filewriter.txt");
		//BufferedWriter bw=new BufferedWriter(new FileWriter("D:\\filewriter.txt"));
		BufferedWriter bw=new BufferedWriter(fw);

		
		bw.write(97);
		bw.newLine();
		bw.write("fchethan");
		bw.newLine();
		char[]ch={'g','h'};
		bw.write(ch);
		bw.flush();
		bw.close();
		
		
	}

}

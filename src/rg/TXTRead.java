package rg;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class TXTRead {
	static String[] arr;
	public TXTRead(String file) throws IOException{
		FileReader fileToRead = new FileReader(file);
		BufferedReader bf = new BufferedReader(fileToRead);
		
		int numLines = JojoGame.readLines(JojoGame.fileKey);
		arr = new String[numLines];
		for(int i = 0; i <numLines;i++){
			arr[i] = bf.readLine();
		}
		bf.close();
	}
	public String[] getArr(){
		return arr;
	}
}

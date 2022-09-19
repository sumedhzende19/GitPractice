package study.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Names {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		boolean append = false;
        FileOutputStream fout = new FileOutputStream("D:\\COPJAVA\\names.txt",append);
		PrintWriter pw = new PrintWriter(fout);
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("Enter the Name");
			String input=sc.nextLine();
			char[] charArray=input.toCharArray();
			for(int i=0;i<charArray.length;i++)
			{
				charArray[i]=Character.toLowerCase(charArray[i]);
				if(i==0)
				{
					charArray[0]=Character.toUpperCase(charArray[0]);
				}
				if(charArray[i]==' ')
				{
					i++;
					charArray[i]=Character.toUpperCase(charArray[i]);
				}
			}
			
			input=String.valueOf(charArray);
			if(input.equalsIgnoreCase("Quit") ) break;
			pw.println(input);
			pw.flush();	
		}
		pw.close();
		
	}
}

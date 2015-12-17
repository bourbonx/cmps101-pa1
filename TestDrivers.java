import java.io.*;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
public class TestDrivers{
	
   public static void main(String[] args){
        File text = new File("Input");
        //Creating Scanner instance to read File in Java
        try{
        Scanner scan = new Scanner(text);
        UIMS hash_table = new UIMS();
        while(scan.hasNext()){
          String line = scan.nextLine();
          hash_table.add(line);
        }
		int sum = 0;
       PrintStream out = new PrintStream(new FileOutputStream("Output.txt"));
        for(int k=0; k < hash_table.table.length; k++){
			out.println(k+ " SIZE: " + hash_table.table[k].size() + " - " +hash_table.table[k] + "\n");
			sum += hash_table.table[k].size();
        }
		out.println("SUM : " +sum);	
        out.close();
        }
        catch(FileNotFoundException e) {
        }
   }
}
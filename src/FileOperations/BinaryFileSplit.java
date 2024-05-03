package FileOperations;

import java.io.*;
import java.util.*;

public class BinaryFileSplit {

    public static void main(String[] args) throws IOException {
     
        FileReader fr = new FileReader("C:\\test1\\binaryfile.txt");
        BufferedReader br = new BufferedReader(fr);
        String s;
        List<String> eightBits = new ArrayList<String>();
        List<String> sixteenBits = new ArrayList<String>();
        while ((s = br.readLine()) != null) {
            String[] array = s.split("\\s+");
            for (String item : array) {
                if (item.length() == 8)
                    eightBits.add(item);
                else if (item.length() == 16)
                    sixteenBits.add(item);
            }
        }
        br.close();
        
        File outputFile8 = new File("c:\\test1\\8bitbinary.txt");
        FileWriter writer8 = new FileWriter(outputFile8);
        BufferedWriter bw8 = new BufferedWriter(writer8);
        for (String item : eightBits) {
            bw8.write(item); 
            bw8.newLine(); 
        }
        bw8.close();
        
        //Reading 8 Bits from 8bitbinary.txt
        System.out.println("8 Bits Digits:");
        FileReader fr8 = new FileReader("c:\\test1\\8bitbinary.txt");
        BufferedReader br8 = new BufferedReader(fr8);
        String s8;
        while ((s8 = br8.readLine()) != null)
            System.out.println(s8);
        br8.close();
        
        File outputFile16 = new File("c:\\test1\\16bitbinary.txt");
        FileWriter writer16 = new FileWriter(outputFile16);
        BufferedWriter bw16 = new BufferedWriter(writer16);
        for (String item : sixteenBits) {
            bw16.write(item); 
            bw16.newLine(); 
        }
        bw16.close();
        
        //Reading 16 Bits from 16bitbinary.txt
        System.out.println("\n16 Bits Digits:");
        FileReader fr16 = new FileReader("c:\\test1\\16bitbinary.txt");
        BufferedReader br16 = new BufferedReader(fr16);
        String s16;
        while ((s16 = br16.readLine()) != null)
            System.out.println(s16);
        br16.close();
    }
}
package FileOperations;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class BinaryFileReader {
    public static void main(String[] args) throws IOException {
        // Create a File object for the input file
        File inputFile = new File("C:\\test1\\binaryfile.txt");
        // Create a BufferedReader object to read the file
        BufferedReader reader = new BufferedReader(new FileReader(inputFile));
        // Create a StringBuffer object to store the binary digits
        StringBuffer binaryDigits = new StringBuffer();
        // Read the file line by line
        String line;
        while ((line = reader.readLine()) != null) {
            // Add the binary digits to the StringBuffer
            binaryDigits.append(line);
        }
        // Close the file
        reader.close();
        // Split the binary digits into 16-bit and 8-bit groups
        String[] groups = binaryDigits.toString().split("(?<=\\G.{16})");
        // Create a File object for the 16-bit output file
        File outputFile16 = new File("c:\\test1\\16bitbinary.txt");
        // Create a FileWriter object to write to the file
        FileWriter writer16 = new FileWriter(outputFile16);
        // Write the 16-bit groups to the file
        for (String group : groups) {
            writer16.write(group + "\n");
        }
        // Close the file
        writer16.close();
        // Create a File object for the 8-bit output file
        File outputFile8 = new File("c:\\test1\\8bitbinary.txt");
        // Create a FileWriter object to write to the file
        FileWriter writer8 = new FileWriter(outputFile8);
        // Write the 8-bit groups to the file
        for (int i = 0; i < groups.length; i += 2) {
            writer8.write(groups[i]+ "\n");
        }
        // Close the file
        writer8.close();
        // Read the 16-bit output file
        BufferedReader reader16 = new BufferedReader(new FileReader(outputFile16));
        // Read the file line by line
        String line16;
        while ((line16 = reader16.readLine()) != null) {
            // Print the line to the console
            System.out.println(line16);
        }
        // Close the file
        reader16.close();
        // Read the 8-bit output file
        BufferedReader reader8 = new BufferedReader(new FileReader(outputFile8));
        // Read the file line by line
        String line8;
        while ((line8 = reader8.readLine()) != null) {
            // Print the line to the console
            System.out.println(line8);
        }
        // Close the file
        reader8.close();
    }
}
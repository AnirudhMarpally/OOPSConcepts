package FileOperations;


import java.io.*;

class ReadBinary {
	
    public static void main(String[] args) throws IOException{
        
		//Declare Variables
        //String fileName = "binaryfile.txt";
        File fileName = new File("C:\\test1\\binaryfile.txt");
        String outputFile8bit = "8bitbinary.txt";
        String outputFile16bit = "16bitbinary.txt";
        String line;
        int count;
        int bufferSize = 16;

        //Create streams
        FileReader fileReader = new FileReader(fileName);
        BufferedReader br = new BufferedReader(fileReader);
        FileWriter fileWriter8bit = new FileWriter(outputFile8bit);
        FileWriter fileWriter16bit = new FileWriter(outputFile16bit);
		
		//Read the file line by line and store appropriate digits in the respective files
        while ((line = br.readLine()) != null) {
            count = 0;  
            for (int i = 0; i < line.length(); i += 2) {
                count++;
				//If 8 bits is present
                if (count <= bufferSize/2){
                    fileWriter8bit.write(line.charAt(i));
                    fileWriter8bit.write(line.charAt(i+1));
                }
				//Else if 16 bits is present
                else{
                    fileWriter16bit.write(line.charAt(i));
                    fileWriter16bit.write(line.charAt(i+1));
			    }
		    }
            fileWriter8bit.write("\n");
            fileWriter16bit.write("\n");
        }
		//Close streams
        br.close();
        fileWriter8bit.close();
        fileWriter16bit.close();
		
		//Create BufferedReader objects for corresponding output files
        BufferedReader br8bit = new BufferedReader(new FileReader(outputFile8bit));
        BufferedReader br16bit = new BufferedReader(new FileReader(outputFile16bit));
		
		//READ & PRINT 8BIT FILE
        System.out.println("8 Bit Digits");
        while((line = br8bit.readLine()) != null) {
            System.out.println(line);
        }
		//READ & PRINT 16BIT FILE
        System.out.println("\n16 Bit Digits");
        while((line = br16bit.readLine()) != null) {
            System.out.println(line);
        }
		//Close Streams
        br8bit.close();
        br16bit.close();
    }
}
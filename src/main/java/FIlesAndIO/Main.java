package FIlesAndIO;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {


    public static void main(String[] args) throws IOException {

        final String fileName = "filename.txt";


        try
        {
            File file = new File(fileName);
            if (file.createNewFile())
            {
                System.out.println("File Created " + file.getName());
                FileWriter fileWriter=new FileWriter(file);
                fileWriter.write("Writing in file from java file");
                fileWriter.close();
                System.out.println("\nSuccessfully wrote in file");

                System.out.println("\nReading from file\n");
                FileReader fileReader=new FileReader(file);
                int i;
                while ((i=fileReader.read())!=-1)
                {
                    System.out.print((char)i);
                }
                fileReader.close();

                if (file.delete())
                {
                    System.out.println("\nDelete the file: " + file.getName());
                }
                else
                {
                    System.out.println("\nFailed to delete the file.");
                }


            }
            else{
                System.out.println("File already exists.");
            }
        }catch (Throwable throwable)
        {
            throwable.getMessage();
        }






    }

}

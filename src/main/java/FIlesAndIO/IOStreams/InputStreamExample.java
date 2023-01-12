package FIlesAndIO.IOStreams;

import java.io.*;

public class InputStreamExample {

    public static void main(String[] args){
        File file=new File("FileInput.txt");
        write(file);
        read(file);
    }


    public  static void write(File file) {
        String data = "This is a line of text inside the file.";

        try {


            OutputStream outputStream = new FileOutputStream(file);

            byte[] bytes = data.getBytes();

            outputStream.write(bytes);

            System.out.println("Successfully Wrote inside file");

            outputStream.close();
        }catch(IOException exception)
        {
            System.out.println(exception.getMessage());
        }

    }

    public static void read(File file)
    {


        try {

            InputStream inputStream=new FileInputStream(file);
            byte[] bytes=new byte[inputStream.available()];

            inputStream.read(bytes);

            System.out.println("Reading data from file.");

            System.out.println(new String(bytes));


        }catch (IOException exception)
        {
            System.out.println(exception.getMessage());
        }

    }


}

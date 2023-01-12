package FIlesAndIO.IOStreams;

import java.io.*;

public class FileInputAndOutputStream {

    public static void main(String[] args) throws IOException {
        File file=new File("FileInputStream.txt");
        try {
            write(file);
            read(file);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    private static void write(File file) throws IOException {

        String data = "This is a line of text inside the file.";

        FileOutputStream outputStream=new FileOutputStream(file,true);

        outputStream.write(data.getBytes());

        System.out.println("Successfully Wrote inside file");

        outputStream.close();


    }

    private static void read(File file) throws IOException {

        FileInputStream inputStream=new FileInputStream(file);

        byte[] bytes=new byte[inputStream.available()];

        System.out.println("Reading from file");
        inputStream.read(bytes);
        System.out.println(new String(bytes));


    }

}

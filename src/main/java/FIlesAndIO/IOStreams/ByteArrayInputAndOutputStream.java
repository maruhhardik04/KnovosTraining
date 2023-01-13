package FIlesAndIO.IOStreams;


import java.io.*;

public class ByteArrayInputAndOutputStream {


    public static void main(String[] args) {


        try {
            write();
            read();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static void  read() throws IOException {
        byte[] bytes={'A','B','C','D','E'};

        ByteArrayInputStream inputStream=new ByteArrayInputStream(bytes);
        int data;
        while ((data=inputStream.read())!=-1)
        {
            System.out.print((char)data+",");
        }
        inputStream.close();
    }

    public static void write() throws IOException {


        ByteArrayOutputStream outputStream=new ByteArrayOutputStream();

        for (int i=65;i<80;i++)
        {
            outputStream.write(i);
        }

        System.out.println("Output stream: " + outputStream.toString());

        outputStream.close();



    }


}

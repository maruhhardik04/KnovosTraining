package FIlesAndIO.IOStreams;

import java.io.*;

public class ObjectInputAndOutputStream {

    public static void main(String[] args) {



        Employee employee=new Employee(1,"Rushi",10000);

        FileInputStream fileInputStream ;
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream outputStream;
        ObjectInputStream inputStream;
        try {


            fileOutputStream = new FileOutputStream("ObjectData.txt");
            outputStream = new ObjectOutputStream(fileOutputStream);

            outputStream.writeObject(employee);

            fileOutputStream.close();
            outputStream.close();


            fileInputStream = new FileInputStream("ObjectData.txt");
            inputStream =new ObjectInputStream(fileInputStream);

            Employee employee1=(Employee) inputStream.readObject();
            System.out.println(employee1);

        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }


    }

}

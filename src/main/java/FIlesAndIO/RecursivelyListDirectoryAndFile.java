package FIlesAndIO;

import java.io.File;
import java.util.Objects;


public class RecursivelyListDirectoryAndFile {


    public static void main(String[] args) {

        File file=new File("D://Programs");
        File[] filesName;

        filesName=file.listFiles();

        if(filesName != null)
        {
            getFiles(filesName);
        }




    }

    public static void getFiles(File[] files)
    {
        for(File file:files)
        {
            if (file.isDirectory())
            {
                System.out.println();

                System.out.println(file);
                getFiles(file.listFiles());

                System.out.println();
            }
            else{
                System.out.println(file);
            }
        }
    }

}

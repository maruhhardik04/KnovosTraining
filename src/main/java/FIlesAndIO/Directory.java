package FIlesAndIO;

import java.io.File;

public class Directory {




    public static void main(String[] args) {

        final String folderName = "Demo";

        File file=new File(folderName);

        fileCreate(file);
        fileDelete(file);

    }

    public static void fileCreate(File file)
    {

        if (file.mkdir())
        {
            System.out.println("Folder created.");
        }
        else
        {
            System.out.println("Something is wrong..");
        }

    }

    public static void fileDelete(File file)
    {

        if (file.delete())
        {
            System.out.println("Folder Deleted.");
        }
        else
        {
            System.out.println("Something is wrong..");

        }

    }

}

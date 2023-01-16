package Multithreading;

class MultiThredThing implements Runnable
{

    @Override
    public void run() {
        System.out.println("Thread running using runnable interface.");
    }
}

public class UsingRunnableInterface {

    public static void main(String[] args) {

        MultiThredThing multiThread=new MultiThredThing();

        Thread thread=new Thread(multiThread);
        thread.start();

    }

}

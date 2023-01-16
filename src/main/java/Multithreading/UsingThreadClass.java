package Multithreading;


class MultiThread extends Thread{
    @Override
    public void run() {
        super.run();
        System.out.println("Thread is running...");
    }
}


public class UsingThreadClass {

    public static void main(String[] args) {

        MultiThread thread=new MultiThread();
        thread.start();

    }
}

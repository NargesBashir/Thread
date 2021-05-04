package sample;

public class Berrypicking {
    public static class MyRunnable implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 11; ++i)
            System.out.println(i + " berries picked");


    try {
        //For at sætte på pause bruges ThreadSleep
        Thread.sleep(3000);

    } catch (InterruptedException e) {
        e.printStackTrace();
    }
        System.out.println("Total berries picked is 10");
    }

    public static void main(String[] args){
        Thread thread = new Thread(new MyRunnable());
       thread.start();

    }
    }
}




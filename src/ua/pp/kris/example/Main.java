package ua.pp.kris.example;

public class Main {

    public static void main(String[] args) {
        TickTock tickTock = new TickTock();
        MyThread mt1 = new MyThread("Tick", tickTock);
        MyThread mt2 = new MyThread("Tock", tickTock);

        try{
            mt1.thread.join();
            mt2.thread.join();
        } catch (InterruptedException exc){
            System.out.println("Stopping main thread");
        }
    }
}

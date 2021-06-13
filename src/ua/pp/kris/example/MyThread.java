package ua.pp.kris.example;

 class MyThread implements Runnable {

    Thread thread;
    TickTock tickTock;


     public MyThread(String name, TickTock tickTock) {
         thread = new Thread(this, name);
         this.tickTock = tickTock;
         thread.start();
         sleep();
     }

     public void run() {
        if(thread.getName().compareTo("Tick")==0) {
            for (int i = 0; i < 5; i++) {
                tickTock.tick(true);
                sleep();
            }
            tickTock.tick(false);
        } else {
            for (int i = 0; i < 5; i++) {
                tickTock.tock(true);
                sleep();
            }
            tickTock.tock(false);
        }
    }

    private void sleep(){
        try{
            Thread.sleep(500);
        } catch (InterruptedException exc){
            System.out.println(exc);
        }
    }
}

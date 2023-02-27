class MyThread extends  Thread{
    @Override
    public void run(){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("In Thread: "+Thread.currentThread().getName());
    }
}

public class ThreadCreation1 {
    public static void main(String[] args) {
        MyThread t=new MyThread();
        t.setName("Worker Thread");
        t.start();

        System.out.println("In Thread "+Thread.currentThread().getName());
    }
}

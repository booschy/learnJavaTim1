package fundamentals.threads;

public class MyThread extends Thread {


    @Override
    public void run() {

        System.out.println("<<< start MyThread " + getId());

        // MainThreadTest.printThreadInfo();
        for(int i = 10; i < 50; i += 10){
            System.out.println(getName() + ": " + i);
        }

        System.out.println("end MyThread " + getId() + " >>>");
    }
}

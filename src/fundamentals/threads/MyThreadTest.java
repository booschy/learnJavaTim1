package fundamentals.threads;

public class MyThreadTest {

    public static void main(String[] args) {

        System.out.println("<<< start main thread");
        MainThreadTest.printThreadInfo();


        MyThread myThread1 = new MyThread();
        MyThread myThread2 = new MyThread();

        myThread1.start();
        myThread2.start();

        System.out.println("end main thread >>>");
    }

}

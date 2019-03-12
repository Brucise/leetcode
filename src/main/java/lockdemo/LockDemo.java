package lockdemo;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author: chenhuang
 * @date: 2019/2/28
 * @description:
 */
public class LockDemo extends Thread{
    public static Lock lock = new ReentrantLock();
    public static int i = 0;

    public LockDemo(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int j = 0; j < 10000000; j++) {
//            lock.lock();
            try {
                System.out.println(this.getName() + " " + i);
                i++;
            } finally {
//                lock.unlock();
            }
        }
    }
    public static void main(String[] args) throws InterruptedException{
        LockDemo test1 = new LockDemo("thread1");
        LockDemo test2 = new LockDemo("thread2");

        test1.start();
        test2.start();
        test1.join();
        test2.join();
        System.out.println(i);
    }

}

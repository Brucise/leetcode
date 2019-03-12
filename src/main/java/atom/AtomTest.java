package atom;


import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author: chenhuang
 * @date: 2019/3/1
 * @description:
 */
public class AtomTest {
    private AtomicInteger atomicInteger = new AtomicInteger();

    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());
        AtomTest atomTest = new AtomTest();
        atomTest.atomicInteger.getAndIncrement();
    }
}

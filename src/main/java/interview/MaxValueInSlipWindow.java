package interview;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ArrayList;

/**
 * @author: chenhuang
 * @date: 2019/3/19
 * @description:
 */
public class MaxValueInSlipWindow {
    public static void main(String[] args) {
        MaxValueInSlipWindow window = new MaxValueInSlipWindow();
        int[] nums = {2, 3, 4, 2, 6, 2, 5, 1};
        int size = 3;
        window.maxInWindows(nums, size);
    }

    public ArrayList<Integer> maxInWindows(int[] num, int size) {
        if (num == null || num.length == 0 || size <= 0 || num.length < size) {
            return new ArrayList<Integer>();
        }
        ArrayList<Integer> list = new ArrayList();

        LinkedList<Integer> linked = new LinkedList<>();
        LinkedList<Integer> help = new LinkedList<>();
        for (int i = 0; i < num.length; i++) {
            linked.addLast(num[i]);
            if (help.isEmpty()) {
                help.addLast(num[i]);
            } else {
                Iterator<Integer> iterator = help.descendingIterator();
                while (iterator.hasNext()) {
                    if (iterator.next() < num[i]) {
                        iterator.remove();
                    }
                }
                help.addLast(num[i]);
            }
            if (linked.size() > size) {
                if (linked.peekFirst().equals(help.peekFirst())) {
                    help.removeFirst();
                }
                linked.removeFirst();
            }
            if (linked.size() == size) {
                list.add(help.peek());
            }

        }
        return list;
    }

}

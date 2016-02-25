import java.util.TreeSet;

public class SingleNumber {

    public int singleNumber(int[] A) {
        int len = A.length;
        TreeSet<Integer> occur = new TreeSet<Integer>();
        for (int i=0; i<len; i++) {
            if (occur.contains(A[i])) {
                occur.remove((Integer) A[i]);
            } else {
                occur.add(A[i]);
            }
        }
        return occur.last();
    }

    public void run() {
        long startTime = System.currentTimeMillis();
        int[] a = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1};
        System.out.println(singleNumber(a));
        long endTime   = System.currentTimeMillis();
        long totalTime = endTime - startTime;
        System.out.println(totalTime + "ms");
    }

    public static void main(String[] args) {
        SingleNumber s = new SingleNumber();
        s.run();
    }
}
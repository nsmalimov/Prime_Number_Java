/**
 * Created with IntelliJ IDEA.
 */
public class prime_number {
    public static void main(String[] args) {
        int n, count;
        n = 25;
        for (int k = 1; k < n; k++) {
            count = 0;
            for (int i = 1; i< n; i++) {
                if ((k % i) == 0) {
                    count++;
                }
            }
             if (count == 2) {
                 System.out.println(k+" ");
             }
        }
    }
}



// Lab task 03
public class Sum {
    void calculate(int n) {

        int sum = 0;
        for (int i = 0; i < n; i++) {

            sum = sum + i;
        }
        System.out.println(sum);
    }
}
class Main1 {
    public static void main(String[] args) {

        Sum s = new Sum();

        s.calculate(10);
    }
}

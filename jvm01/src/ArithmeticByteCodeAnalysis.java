public class ArithmeticByteCodeAnalysis {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i < 5) {
                int a = 1;
                int b = 2;
                int c = (a + b) * 5;
                int d = 2;
                int e = (c / d) % 3;
                int res = e;
                System.out.println(res);
            } else {
                System.out.println("nothing.");
            }

        }
    }

}

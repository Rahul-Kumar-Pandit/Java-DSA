package JavaArray;

public class SubArray {
    public static void printSubArray(int a[]) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            int start = i;
            for (int j = i; j < a.length; j++) {
                int end = j;
                for (int k = start; k <= end; k++) {
                    System.out.print(a[k] + " ");
                }
                sum = 0;
                for (int x = start; x <= end; x++) {
                    sum = sum + a[x];
                }
                System.out.print(" = " + sum);
                System.out.println();
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int a[] = { 4, 5, 0, -2, -3, 1 };
        printSubArray(a);
    }
}
public class Exercise {
    public static void main(String[] args) {
        /* Exercise 1*/
        drawTriangle(10);

        /* Exercise2 */
        int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6};
        System.out.println(max(numbers));
    }

    //Exercise 1: Drawing a Triangle
    public static void drawTriangle(int N){
        int row = 0;
        while (row < N) {
             int col = 0;
             while (col <= row) {
                 System.out.print('*');
                 col = col + 1;
             }
            System.out.println();
            row = row + 1;
         }
    }

    // Exercise 2:Returns the maximum value from m.
    public static int max(int[] m) {
        int maxValue = m[0];  //每一个数都轮流和第一个数比较
        for (int i = 0; i < m.length; i++) {
            if (m[i] > maxValue) {
                maxValue = m[i];
            }
        }
        return maxValue;
    }
}



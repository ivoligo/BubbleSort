public class BubbleSort {
    public static void main(String[] args) {

        int[] array = new int[10];
        fillingArray(array);

        for (int i = 0; i < array.length; i++) {

            for (int j = 1; j < array.length - i; j++) {

                if (array[j - 1] > array[j]) {
                    int temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        printResult(array);
    }

    private static void fillingArray(int[] array) {

        for (int i = 0; i < array.length; i++) {

            array[i] = (int) (Math.random() * 100);
        }
    }

    private static void printResult(int[] array) {

        for (int i = 0; i < array.length; i++) {

            System.out.print(array[i] + " ");
        }
    }
}
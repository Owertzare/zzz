public class Pract_2 {
    public static void displayArray(int[] array) {
        for (int num : array) {
            System.out.println(num);
        }
    }

    public static void main(String[] args) {
        int[] numbers = {6, 123, 51};
        displayArray(numbers);
    }
}

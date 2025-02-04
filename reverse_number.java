public class reverse_number {
    public static void main(String[] args) {
        int num = 12345;
        int reversed_num = 0;
        while (num != 0) {
            reversed_num = reversed_num * 10 + num % 10;
            num /= 10;
        }
        System.out.println("Reversed Number: " + reversed_num);
    }
}

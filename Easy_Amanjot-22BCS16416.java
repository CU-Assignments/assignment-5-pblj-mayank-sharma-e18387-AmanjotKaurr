// EasyLevelSum.java
import java.util.*;

public class EasyLevelSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter numbers separated by spaces: ");
        String input = scanner.nextLine();

        String[] numbers = input.split(" ");
        ArrayList<Integer> numberList = new ArrayList<>();

        for (String num : numbers) {
            // Autoboxing
            numberList.add(Integer.parseInt(num));
        }

        int sum = 0;
        for (Integer num : numberList) {
            // Unboxing
            sum += num;
        }

        System.out.println("Sum of numbers: " + sum);
        scanner.close();
    }
}

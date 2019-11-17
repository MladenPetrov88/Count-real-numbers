import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        Map<String, Integer> numbersCount = new TreeMap<>();

        for (int i = 0; i < input.length; i++) {
            if (!numbersCount.containsKey(input[i])) {
                numbersCount.put(input[i], 1);
            } else {
                numbersCount.put(input[i], numbersCount.get(input[i]) + 1);
            }
        }

        for (Map.Entry<String, Integer> stringIntegerEntry : numbersCount.entrySet()) {
            System.out.printf("%s -> %d%n", stringIntegerEntry.getKey(), stringIntegerEntry.getValue());
        }


    }
}

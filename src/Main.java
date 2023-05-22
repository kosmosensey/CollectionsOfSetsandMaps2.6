import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        oddPrint(nums);
        System.out.println(" ");
        evenPrint(nums);
        List<String> words = List.of("apple", "banana", "apple", "orange", "banana", "pear");
        System.out.println(" ");
        printUniqueWords(words);
        System.out.println(" ");
        countWordOccurrences(words);
    }

    public static void printUniqueWords(List<String> words) {
        Set<String> uniqueWords = new HashSet<>(words);
        System.out.println(uniqueWords);
    }

    public static void oddPrint(List<Integer> nums) {
        for (Integer num : nums) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
            }
        }
    }

    public static void evenPrint(List<Integer> nums) {
        Set<Integer> set = new TreeSet<>(nums);
        for (Integer num : set) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
    }

    public static void countWordOccurrences(List<String> words) {
        Map<String, Integer> wordCounts = new HashMap<>();
        for (String word : words) {
            if (wordCounts.containsKey(word)) {
                Integer count = wordCounts.get(word) + 1;
                wordCounts.put(word, count);
            } else {
                wordCounts.put(word, 1);
            }
        }
        System.out.println(wordCounts.values());
    }
}
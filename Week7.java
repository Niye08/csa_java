import java.util.Random;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Week7 {
    static Random random = new Random();

    public static void test() {
        System.out.println(task1("abbc", "dog cat cat fish"));
        System.out.println(task2(new int[] { 1, 2, 2, 3, 0 }));
        for (int i = 0; i < 5; i++) {
            int target = random.nextInt(15) - 3;
            System.out.println("target:" + target + "\tresult" + task3(new int[] { 0, 4,
                    5, 6, 8 }, target));
        }

    }

    public static void main(String[] args) {
        // task1.example
        System.out.println(task1("abbc", "dog cat cat fish"));
        // task2.example
        int[] numbers = { 2, 3, 1, 0, 2, 5, 3 };
        int number = task2(numbers);
        System.out.println(number);
        // task3.example
        int[] example1 = { 0, 3, 5, 6, 8, 9 };
        int target1 = 5;
        int index1 = task3(example1, target1);
        System.out.println(index1);
        int[] example2 = { 0, 3, 5, 6, 8, 9 };
        int target2 = 7;
        int index2 = task3(example2, target2);
        System.out.println(index2);

    }

    public static boolean task1(String pattern, String str) {
        // 第一题代码
        boolean res = true;
        String[] words = str.split(" "); // 将str按空格分割成单词数组

        if (pattern.length() != words.length) {
            return false;
        }

        Map<Character, String> charToWordMap = new HashMap<>(); // 字符到单词的映射
        Map<String, Character> wordToCharMap = new HashMap<>(); // 单词到字符的映射

        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String word = words[i];

            if (charToWordMap.containsKey(c)) {
                // 如果字符已经存在于映射表中，检查映射的单词是否一致
                if (!charToWordMap.get(c).equals(word)) {
                    res = false;
                    break;
                }
            } else if (wordToCharMap.containsKey(word)) {
                // 如果单词已经存在于映射表中，检查映射的字符是否一致
                if (wordToCharMap.get(word) != c) {
                    res = false;
                    break;
                }
            } else {
                // 如果字符和单词都不存在于映射表中，建立映射关系
                charToWordMap.put(c, word);
                wordToCharMap.put(word, c);
            }
        }
        return res;
    }

    public static int task2(int[] nums) {
        // 第二题代码
        int res = 0;
        Map<Integer, Integer> numberOfNumbers = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (numberOfNumbers.containsKey(nums[i])) {
                res = nums[i];
                break;
            } else {
                numberOfNumbers.put(nums[i], 1);
            }
        }
        return res;
    }

    public static int task3(int[] nums, int target) {
        // 第三题代码
        // Java 内置的二分查找功能可以通过 Arrays.binarySearch() 方法实现。
        // 注意：这里返回的是 -(插入点) - 1，插入点指的是第一个大于此键的元素的索引，如果此键大于所有元素，则为数组长度。
        // 这种设计允许调用者使用返回的负值来推断如果元素存在，它应该被插入的位置
        int index = Arrays.binarySearch(nums, target);
        return index;
    }
}
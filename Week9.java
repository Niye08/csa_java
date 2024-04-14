import java.util.Random;
import java.util.Stack;

public class Week9 {
    static Random random = new Random();

public static printArr(int[]nums){
System.out.println(Arrays.toString(nums));
}

    public static void test() {
        int[] nums1 = new int[random.nextInt(20) + 1];
        for (int i = 0; i < nums1.length; i++)
            nums1[i] = random.nextInt(30) - 10;
        printArr(nums1);
        printArr(task1(nums1));
        System.out.println("======================");
        int[] nums2 = new int[random.nextInt(20) + 1];
        for (int i = 0; i < nums2.length; i++)
            nums2[i] = random.nextInt(3);
        printArr(nums2);
        task2(nums2);
        printArr(nums2);
    }

    public static void main(String[] args) {
        int[] nums1 = { 73, 74, 75, 71, 69, 72, 76, 73 };
        int[] res = new int[nums1.length];
        res = task1(nums1);
        for (int i = 0; i < nums1.length; i++) {
            System.out.print(res[i] + " ");
        }
        System.out.println();
        int[] nums2 = { 2, 0, 2, 1, 1, 0 };
        task2(nums2);
    }

    // 第一题代码
    public static int[] task1(int[] nums) // task1思路：单调栈（进出各一次，所以时间复杂度为O(N)(及时去掉无用数据，保证栈中数据有序)
    {
        int n = nums.length;
        int[] res = new int[n]; // 结果数组，初始化为0
        Stack<Integer> stack = new Stack<>(); // 单调递减栈，存储元素索引
        // 遍历数组，建立每个元素的下一个更大值关系
        for (int i = 0; i < n; i++) {
            // 当栈不为空且当前元素大于栈顶元素时，栈顶元素找到了下一个更大值
            while (!stack.isEmpty() && nums[i] > nums[stack.peek()]) {
                int index = stack.pop(); // 弹出栈顶索引
                res[index] = i - index; // 更新结果数组
            }
            stack.push(i); // 将当前元素索引入栈
        }

        // 处理栈中剩余的元素，它们没有下一个更大值
        while (!stack.isEmpty()) {
            res[stack.pop()] = 0;
        }

        return res;
    }

    // 第二题代码
    public static void task2(int[] nums) // task2 思路：统计数组中0，1，2个数，新生成一个数组
    {
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                count0++;
            } else if (nums[i] == 1) {
                count1++;
            } else if (nums[i] == 2) {
                count2++;
            } else {
                System.out.println("error!you create a wrong nums array!");
                break;
            }
        }

        for (int i = 0; i < count0; i++) {
            System.out.print("0,");
        }
        for (int i = 0; i < count1; i++) {
            System.out.print("1,");
        }
        for (int i = 0; i < count2 - 1; i++) {
            System.out.print("2,");
        }
        System.out.print("2");
    }
}
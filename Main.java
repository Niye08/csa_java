public class Main {
    public static boolean judge(String s1, String s2)// s2<s1,判断s2是否是s1的子序列
    {
        boolean flag = true;
        int i = 0;
        for (int j = 0; (j < s1.length()) && (i < s2.length()); j++)// 遍历整个s1
        {
            if (s2.charAt(i) == s1.charAt(j)) {
                i++;
            }
        }
        if (i != s2.length()) {
            flag = false;
            i = 0;
        }
        return flag;
    }

    public static void main(String[] args) {
        String S = "abcde";
        String[] words = { "a", "bb", "acd", "ace" };
        int count = 0;
        for (String word : words) {
            if (judge(S, word)) {
                count++;
            }
        }
        System.out.println("有" + count + "个是S的子序列");
    }
}
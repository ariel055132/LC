package leetcode.editor.en;

// $P412_FizzBuzz

import java.util.ArrayList;
import java.util.List;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution412 {
    public List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<String>();
        for (int i = 1; i <= n; i++) {
            boolean divisibleBy3 = false;
            boolean divisibleBy5 = false;
            if (i % 3 == 0) {
                divisibleBy3 = true;
            }
            if (i % 5 == 0) {
                divisibleBy5 = true;
            }

            if (divisibleBy3 && divisibleBy5) {
                result.add("FizzBuzz");
            } else if (divisibleBy3) {
                result.add("Fizz");
            } else if (divisibleBy5) {
                result.add("Buzz");
            } else {
                result.add(Integer.toString(i));
            }
        }
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

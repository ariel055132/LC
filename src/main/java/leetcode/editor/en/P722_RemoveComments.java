package leetcode.editor.en;

// $P722_RemoveComments

import java.util.ArrayList;
import java.util.List;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution722 {
    // Two types of comments, // and /* */
    public List<String> removeComments(String[] source) {
        List<String> result = new ArrayList<>();
        StringBuilder stringBuilder = new StringBuilder();
        boolean continueRead = false;
        for (String str : source) {
            for (int i = 0; i < str.length(); i++) {
                if (continueRead) {
                    // See "*/", skip all the words between "/*" and "*/"
                    if (str.charAt(i) == '*' && i < str.length()-1 && str.charAt(i+1) == '/') {
                        continueRead = false;
                        i++;
                    }
                } else {
                    // See "//", stop reading the current line, add the characters we have seen to the result
                    if (str.charAt(i) == '/' && i < str.length()-1 && str.charAt(i+1) == '/') {
                        break;
                    } // See "/*", start the multiline comment mode, keep going on ignoring characters until we see '*/'
                    else if (str.charAt(i) == '/' && i < str.length()-1 && str.charAt(i+1) == '*') {
                        continueRead = true;
                        i++;
                    } // not comment, add the word to stringBuilder
                    else {
                        stringBuilder.append(str.charAt(i));
                    }
                }
            }
            // add the characters that is not inside the comment
            if (!continueRead && stringBuilder.length() > 0) {
                result.add(stringBuilder.toString());
                stringBuilder = new StringBuilder();
            }
        }
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

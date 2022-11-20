package leetcode.editor.en;

// $P28_FindTheIndexOfTheFirstOccurrenceInAString

//leetcode submit region begin(Prohibit modification and deletion)
class Solution28 {
    public int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }

    public int strStr2(String haystack, String needle) {
        if(haystack.length()<needle.length()) return -1;
        char n=needle.charAt(0);
        for(int i=0; i<haystack.length(); i++){
            if(haystack.charAt(i)==n){
                if(i+needle.length()<=haystack.length()){
                    if(haystack.substring(i,i+needle.length()).equals(needle)){
                        return i;
                    }
                }
            }
        }
        return -1;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

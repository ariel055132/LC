package leetcode.editor.en;

// $P1108_DefangingAnIPAddress

//leetcode submit region begin(Prohibit modification and deletion)
class Solution1108 {
    public String defangIPaddr(String address) {
        StringBuilder stringBuilder = new StringBuilder();
        char[] addr = address.toCharArray();
        for (int i = 0; i < addr.length; i++) {
            if (addr[i] != '.') {
                stringBuilder.append(addr[i]);
            } else {
                stringBuilder.append("[.]");
            }
        }
        return stringBuilder.toString();
    }
}
//leetcode submit region end(Prohibit modification and deletion)

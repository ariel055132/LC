package leetcode.editor.en;

// $P2225_FindPlayersWithZeroOrOneLosses

import java.util.*;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution2225 {
    public List<List<Integer>> findWinners(int[][] matches) {
        // List of all players that have not lost any matches
        List<Integer> list0 = new ArrayList<>();
        // List of all players that have lost exactly one match
        List<Integer> list1 = new ArrayList<>();

        List<List<Integer>> result = new ArrayList<>();
        Map<Integer, Integer> loss = new TreeMap<>();
        Set<Integer> win = new TreeSet<>();

        // Count the lossing time of individual players
        for (int i = 0; i < matches.length; i++) {
            if (loss.containsKey(matches[i][1])) {
                int lossCount = loss.get(matches[i][1]);
                loss.put(matches[i][1], ++lossCount);
            } else {
                loss.put(matches[i][1], 1);
            }
        }

        // deal with all players that have not lost any matches
        for (int i = 0; i < matches.length; i++) {
            if (!loss.containsKey(matches[i][0])) {
                win.add(matches[i][0]);
            }
        }
        list0 = new ArrayList<>(win);

        // deal with all players that have lost exactly one match
        for (Map.Entry<Integer, Integer> entry : loss.entrySet()) {
            if (entry.getValue() == 1) {
                list1.add(entry.getKey());
            }
        }
        result.add(list0);
        result.add(list1);
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

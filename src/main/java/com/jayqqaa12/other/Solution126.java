package com.jayqqaa12.other;

import java.util.*;

public class Solution126 {
    public List<List<String>> findLadders(String beginWord, String endWord, Set<String> wordList) {
        HashMap<String, ArrayList<String>> h = new HashMap();
        Set<String> set1 = new HashSet(), set2 = new HashSet();
        set1.add(beginWord);
        set2.add(endWord);
        BFS(set1, set2, wordList, h, true);

        List<List<String>> ans = new ArrayList();
        List<String> cur = new ArrayList();
        cur.add(beginWord);
        DFS(beginWord, endWord, h, cur, ans);
        return ans;
    }

    private void BFS(Set<String> set1, Set<String> set2, Set<String> wordList, HashMap<String, ArrayList<String>> h, boolean forward) {
        if (set1.size() > set2.size()) {
            BFS(set2, set1, wordList, h, !forward);
            return;
        }
        wordList.removeAll(set1);
        wordList.removeAll(set2);
        boolean connected = false;
        Set<String> set3 = new HashSet();

        for (String s : set1) {
            char[] c = s.toCharArray();
            for (int i = 0, len = c.length; i < len; i++) {
                char ch = c[i];
                for (char x = 'a'; x <= 'z'; x++)
                    if (x != ch) {
                        c[i] = x;
                        String cand = new String(c);
                        if (set2.contains(cand) || (!connected && wordList.contains(cand))) {
                            if (set2.contains(cand))
                                connected = true;
                            else
                                set3.add(cand);

                            String cand1 = forward ? cand : s;
                            String s1 = forward ? s : cand;
                            ArrayList<String> cur = h.containsKey(s1) ? h.get(s1) : new ArrayList();
                            cur.add(cand1);
                            h.put(s1, cur);
                        }
                    }
                c[i] = ch;
            }
        }
        if (!connected && !set3.isEmpty())
            BFS(set3, set2, wordList, h, forward);
    }

    private void DFS(String str, String ed, HashMap<String, ArrayList<String>> h, List<String> cur, List<List<String>> ans) {
        if (str.equals(ed)) {
            ans.add(new ArrayList(cur));
            return;
        }

        if (!h.containsKey(str)) return;
        List<String> next = h.get(str);
        for (String i : next) {
            cur.add(i);
            DFS(i, ed, h, cur, ans);
            cur.remove(cur.size() - 1);
        }
    }
}
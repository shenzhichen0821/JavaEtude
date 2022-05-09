package org.simon.leetcode.hard;

import java.util.LinkedList;

public class Regular10 {
    /**
     * 给你一个字符串s和一个字符规律p，请你来实现一个支持 '.'和'*'的正则表达式匹配。
     *
     * '.' 匹配任意单个字符
     * '*' 匹配零个或多个前面的那一个元素
     * 所谓匹配，是要涵盖整个字符串s的，而不是部分字符串。
     *
     * 示例 1：
     * 输入：s = "aa", p = "a"
     * 输出：false
     * 解释："a" 无法匹配 "aa" 整个字符串。
     *
     * 示例 2:
     * 输入：s = "aa", p = "a*"
     * 输出：true
     * 解释：因为 '*' 代表可以匹配零个或多个前面的那一个元素, 在这里前面的元素就是 'a'。因此，字符串 "aa" 可被视为 'a' 重复了一次。
     *
     * 示例3：
     * 输入：s = "ab", p = ".*"
     * 输出：true
     * 解释：".*" 表示可匹配零个或多个（'*'）任意字符（'.'）。
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode.cn/problems/regular-expression-matching
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */
    public boolean isMatch(String s, String p) {
        return subMatch(s.toCharArray(), parseConfig(p), 0, 0);
    }

    public boolean subMatch(char[] origin, String[] config, int strCursor, int confCursor) {
        while(confCursor < config.length) {
            String currConf = config[confCursor];
            if (strCursor >= origin.length) {
                if (currConf.endsWith("*")) {
                    confCursor++;
                    continue;
                }
                break;
            } else {
                confCursor++;
            }

            if (currConf.endsWith("*")) {
                // ".*"
                if (currConf.charAt(0) == '.') {
                    while (strCursor < origin.length) {
                        if (subMatch(origin, config, strCursor, confCursor)) {
                            return true;
                        } else {
                            strCursor++;
                        }
                    }
                }
                // "{'a'-'z'}*"
                else {
                    int matchCount = matchStarCount(origin, strCursor, currConf.charAt(0));
                    int startIndex = strCursor;
                    while (strCursor < startIndex + matchCount) {
                        if (subMatch(origin, config, strCursor, confCursor)) {
                            return true;
                        } else {
                            strCursor++;
                        }
                    }
                }
            }
            // "."
            else if (currConf.equals(".")) {
                strCursor++;
            }
            // {'a'-'z'}
            else {
                if (!matchFull(origin, strCursor, currConf)) {
                    return false;
                } else {
                    strCursor += currConf.length();
                }
            }
        }
        return strCursor == origin.length && confCursor == config.length;
    }

    public int matchStarCount(char[] origin, int strCursor, char ref) {
        int result = 0;
        for (int i = strCursor; i < origin.length; i++) {
            if (origin[i] == ref) {
                result++;
            } else {
                break;
            }
        }
        return result;
    }

    public boolean matchFull(char[] origin, int strCursor, String conf) {
        if (origin.length - strCursor < conf.length()) {
            return false;
        }

        String ref = "";
        for (int i = 0; i < conf.length(); i++) {
            ref += origin[strCursor + i];
        }
        return conf.equals(ref);
    }
    public String[] parseConfig(String regex) {
        LinkedList<String> config = new LinkedList<>();

        int cursor = regex.length() - 1;
        while(cursor >= 0) {
            char curr = regex.charAt(cursor);
            if (curr == '*') {
                config.addFirst(regex.charAt(cursor - 1) + "*");
                cursor -= 2;
            } else if (curr == '.') {
                config.addFirst(".");
                cursor -= 1;
            } else {
                if (cursor == 0) {
                    config.addFirst(regex.charAt(0) + "");
                    break;
                }

                int letterEndCursor = cursor;
                cursor--;
                while (true) {
                    char subCurr = regex.charAt(cursor);
                    if (subCurr != '*' && subCurr != '.') {
                        cursor--;
                        if (cursor < 0) {
                            config.addFirst(regex.substring(0, letterEndCursor + 1));
                            break;
                        }
                    } else {
                        config.addFirst(regex.substring(cursor + 1, letterEndCursor + 1));
                        break;
                    }
                }
            }
        }
        String[] result = new String[config.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = config.pop();
        }
        return result;
    }
}

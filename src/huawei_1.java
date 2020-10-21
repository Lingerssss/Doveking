/*

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class main {
    private static final String DEFAULT_REPLACEMENT = "敏感词";
    private TrieNode rootNode = new TrieNode();

    private class TrieNode {

        private boolean end = false;

        private Map<Character, TrieNode> subNodes = new HashMap<Character, TrieNode>();

        void addSubNode(Character key, TrieNode node) {
            subNodes.put(key, node);
        }

        TrieNode getSubNode(Character key) {
            return subNodes.get(key);
        }

        boolean isKeywordEnd() {
            return end;
        }

        void setKeywordEnd(boolean end) {
            this.end = end;
        }
    }

    //


    public String filter(String text) {
        if (text.trim().length() == 0) {
            return text;
        }
        String replacement = DEFAULT_REPLACEMENT;
        StringBuilder result = new StringBuilder();
        TrieNode tempNode = rootNode;
        int begin = 0;
        int position = 0;

        while (position < text.length()) {
            char c = text.charAt(position);

            if (isSymbol(c)) {
                if (tempNode == rootNode) {
                    result.append(c);
                    ++begin;
                }
                ++position;
                continue;
            }

            tempNode = tempNode.getSubNode(c);

            if (tempNode == null) {
                result.append(text.charAt(begin));
                position = begin + 1;
                begin = position;
                tempNode = rootNode;
            } else if (tempNode.isKeywordEnd()) {
                result.append(replacement);
                position = position + 1;
                begin = position;
                tempNode = rootNode;
            } else {
                ++position;
            }
        }

        result.append(text.substring(begin));

        return result.toString();
    }


    private void addWord(String lineTxt) {
        TrieNode tempNode = rootNode;

        for (int i = 0; i < lineTxt.length(); ++i) {
            Character c = lineTxt.charAt(i);
            if (isSymbol(c)) {
                continue;
            }
            TrieNode node = tempNode.getSubNode(c);

            if (node == null) {
                node = new TrieNode();
                tempNode.addSubNode(c, node);
            }
            tempNode = node;
            if (i == lineTxt.length() - 1) {
                tempNode.setKeywordEnd(true);
            }
        }
    }

    public static void main(String[] argv) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.next();
        String str1_content = scanner.next();
        Main s = new Main();
        s.addWord("str1");
        System.out.print(s.filter("str2"));
    }
}
*/

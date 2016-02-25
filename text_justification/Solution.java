import java.util.*;

public class Solution {
  public static void main(String[] args) {
    String[] input = {"This", "is", "an", "example", "of", "text", "justification."};
    print(input, 16);
    String[] input2 = {""};
    print(input2, 0);
    String[] input3 = {"a", "b", "c", "d", "e"};
    print(input3, 1);
    String[] input4 = {"Listen", "to", "many,", "speak", "to", "a", "few."};
    print(input4, 6);
  }

  private static void print(String[] input, int w) {
    Solution s = new Solution();
    StringBuilder output = new StringBuilder("[\n");
    for (String str : s.fullJustify(input, w)) output.append("   \"" + str + "\"\n");
    output.append("]");
    System.out.println(output.toString());
  }

  public List<String> fullJustify(String[] words, int maxWidth) {
    ArrayList<String> out = new ArrayList<>();
    StringBuilder sb = new StringBuilder();
    for (String s : words) {
      if (sb.length() + s.length() > maxWidth) {
        justify(sb, maxWidth);
        out.add(sb.toString());
        sb.setLength(0);
      }
      sb.append(s + " ");
    }
    sb.setLength(sb.length() - 1);
    while (sb.length() < maxWidth) sb.append(" ");
    out.add(sb.toString());
    return out;
  }

  private void justify(StringBuilder s, int maxWidth) {
    if (s.length() == maxWidth + 1)
      return;
    s.setLength(s.length() - 1);
    while (true)
      for (int i = 0; i < s.length() - 1; i++) {
        if (s.charAt(i) == ' ') {
          s.replace(i, i + 1, "  ");
          i += 1;
          if (s.length() >= maxWidth)
            return;
        }
        s.append(" ");
        if (s.length() >= maxWidth)
          return;
      }
  }
}

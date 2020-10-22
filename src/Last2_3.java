public class Last2_3 {
  public int last2(String str) {
    int count = 0;
    int len = str.length();

    for (int i = 0; i < str.length() - 2; i++) {
      String end = str.substring(len - 2);
      if (str.substring(i, i + 2).equals(end)) {
        count++;
      }
    }
    return count;
  }
}

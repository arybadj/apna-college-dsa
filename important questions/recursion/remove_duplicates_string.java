import java.util.*;

public class remove_duplicates_string {
    public static void find(String str, int i, StringBuilder newstr, boolean map[]) {
        // base case
        if (i == str.length()) {
            System.out.println(newstr);
            return;
        }
        // kaam
        char currch = str.charAt(i);
        if (map[currch - 'a']) {
            // current character is duplicate
            find(str, i + 1, newstr, map);
        } else {
            map[currch - 'a'] = true;
            find(str, i + 1, new StringBuilder(newstr).append(currch), map);
        }
    }

    public static void main(String[] args) {
        String str = "appnnacollege";
        find(str, 0, new StringBuilder(""), new boolean[26]);
    }
}

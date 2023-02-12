package Assignment;

public class Problem1 {
    public static void moveHash(char[] str, int len) {
        StringBuilder newstr = new StringBuilder();
        for (int i = 0; i < str.length; i++) {
            if (str[i]=='#') {
                newstr.append(str[i]);
            }
        }
        for (int i = 0; i < str.length; i++) {
            if (str[i]!='#') {
                newstr.append(str[i]);
            }
        }
        System.out.println(newstr);
    }
    public static void main(String[] args) {
        char str [] ={'M','o','v','e','#','h','a','s','h','#','t','o','#','f','r','o','n','t'};
        int n = str.length;
        moveHash(str,n);

    }
}

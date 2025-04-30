import java.util.Arrays;

public class sortstrings {
    public static void main(String[] args) {
        String[] strings = {"Banana", "Apple", "Orange", "Mango", "Pineapple"};
        Arrays.sort(strings);
        for (String str : strings) {
            System.out.println(str);
        }
    }
}


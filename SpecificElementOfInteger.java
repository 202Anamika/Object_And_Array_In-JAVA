
public class SpecificElementOfInteger {
    public static void main(String[] args) {
        int num[] = {12, 13, 14, 15, 16, 17, 18, 19, 10, 11};
        int index = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] == 16) {
                index =i;
            }

        }
        System.out.println("Index="+index);
    }
}


import java.util.*;

class Solution {
    public int solution(String str1, String str2) {
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        ArrayList<String> arr1 = new ArrayList<>();
        ArrayList<String> arr2 = new ArrayList<>();

        for (int i = 0; i < str1.length() - 1; i++) {
            char a = str1.charAt(i);
            char b = str1.charAt(i + 1);

            if (Character.isLetter(a) && Character.isLetter(b)) {
                arr1.add(a + "" + b);
            }
        }

        for (int i = 0; i < str2.length() - 1; i++) {
            char a = str2.charAt(i);
            char b = str2.charAt(i + 1);

            if (Character.isLetter(a) && Character.isLetter(b)) {
                arr2.add(a + "" + b);
            }
        }
        ArrayList<String> intersection = new ArrayList<>();
        ArrayList<String> union = new ArrayList<>();

        for(String s : arr1) {
            if(arr2.contains(s)) {
                intersection.add(s);
                arr2.remove(s);
            }
            union.add(s);
        }

        union.addAll(arr2);
        
        double result = 0;

        if(union.size()==0){
            result = 1;
        }else {
            result = (double) intersection.size() / (double) union.size();
        }


        return (int) (result * 65536);
    }
}
public class IsSubSeq {
    
    public static boolean isSubSequence(String s ,String t){
        int i =0;
        int j=0;

        while(i < s.length() && j <t.length()){
            if(s.charAt(i) == t.charAt(j)){
                i++;
            }
            j++;
        }
        return i == s.length();
    }

    public static void main(String[] args) {
        String s = "abc";
        String t = "ahgbd";
        System.out.println(isSubSequence(s, t));
    }
}

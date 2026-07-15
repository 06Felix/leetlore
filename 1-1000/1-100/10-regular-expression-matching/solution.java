import java.util.regex.*;
class Solution {
    public boolean isMatch(String s, String p) {
        p = p.replaceAll("[*]+","*");
        try{
            return Pattern.matches(p,s) ? true : false;
        }
        catch(Exception e){
            return false;
        }
    }
}

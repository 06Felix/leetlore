import java.util.regex.*;
class Solution {
    public String validIPAddress(String queryIP) {
        if(Pattern.matches("^((([0-9a-fA-F]){1,4})\\:){7}([0-9a-fA-F]){1,4}$", queryIP))
            return "IPv6";
        if(Pattern.matches("^(([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])\\.){3}([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])$", queryIP))
            return "IPv4";
        return "Neither";
    }
}

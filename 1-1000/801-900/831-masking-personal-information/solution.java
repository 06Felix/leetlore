class Solution {
    private String maskPhone(String phone) {
        StringBuilder sb = new StringBuilder();
        char[] arr = phone.toCharArray();
        int i = arr.length - 1;
        int numCount = 0;
        for (; i >= 0 && numCount < 11; --i) {
            if (!Character.isDigit(arr[i]))
                continue;
            if (numCount >= 4)
                sb.append('*');
            else
                sb.append(arr[i]);
            numCount++;
            if (numCount == 4 || numCount == 7)
                sb.append("-");
        }
        if (numCount == 11) {
            i += 2;
            sb.deleteCharAt(10);
            sb.append('-');
            while (i-- > 0)
                if(Character.isDigit(arr[i]))
                    sb.append('*');
            sb.append('+');
        }
        return sb.reverse().toString();
    }

    private String maskEmail(String email, int idx) {
        StringBuilder sb = new StringBuilder();
        sb.append(email.charAt(0))
            .append("*****")
            .append(email.charAt(idx - 1))
            .append(email.substring(idx));
        return sb.toString().toLowerCase();
    }

    public String maskPII(String s) {
        int atIdx = s.indexOf("@");
        if (atIdx == -1)
            return maskPhone(s);
        return maskEmail(s, atIdx);
    }
}

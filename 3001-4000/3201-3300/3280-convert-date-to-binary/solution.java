class Solution {
    public String convertDateToBinary(String date) {
        StringBuilder ans = new StringBuilder();
        ans.append(Integer.toBinaryString(Integer.parseInt(date.substring(0, 4))));
        ans.append("-");
        ans.append(Integer.toBinaryString(Integer.parseInt(date.substring(5, 7))));
        ans.append("-");
        ans.append(Integer.toBinaryString(Integer.parseInt(date.substring(8))));
        return ans.toString();
    }
}

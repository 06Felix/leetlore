class Solution {
    private static final Map<String, String> MONTH_MAP = Map.ofEntries(
        Map.entry("Jan", "01"),
        Map.entry("Feb", "02"),
        Map.entry("Mar", "03"),
        Map.entry("Apr", "04"),
        Map.entry("May", "05"),
        Map.entry("Jun", "06"),
        Map.entry("Jul", "07"),
        Map.entry("Aug", "08"),
        Map.entry("Sep", "09"),
        Map.entry("Oct", "10"),
        Map.entry("Nov", "11"),
        Map.entry("Dec", "12")
    );

    public String reformatDate(String date) {
        String dd;
        if (Character.isAlphabetic(date.charAt(1))) {
            dd = "0" + date.charAt(0);
            date = "0" + date;
        }
        else
            dd = date.substring(0, 2);
        String mm = MONTH_MAP.get(date.substring(5, 8));
        String yyyy = date.substring(9, 13);
        return new StringBuilder().append(yyyy)
            .append('-')
            .append(mm)
            .append('-')
            .append(dd)
            .toString();
    }
}

class Solution {
    public String[] findOcurrences(String text, String first, String second) {
        List<String> ans = new ArrayList<>();
        String[] arr = text.split(" ");
        for(int i = 0 ; i < arr.length - 2 ; i++)
            if(first.equals(arr[i]) && second.equals(arr[i + 1]))
                ans.add(arr[i + 2]);
        return ans.toArray(new String[0]);
    }
}

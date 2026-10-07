class Solution {
    public boolean checkIfExist(int[] arr) {
        Set<Integer> m = new HashSet<>();
        for(int x : arr){
            if(m.contains(x * 2) || x % 2 == 0 && m.contains(x / 2))
                return true;
            m.add(x);
        }
        return false;
    }
}

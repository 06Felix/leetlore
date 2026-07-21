class Solution {

    public boolean isValidSerialization(String preorder) {
        String[] arr = preorder.split(",");
        int d = 1;
        for(String n : arr){
            d--;
            if(d < 0)
                return false;
            if(!n.equals("#"))
                d += 2;
        }
        return d == 0;
    }
}

class Solution {
    public boolean isPathCrossing(String path) {
        ArrayList<String> l = new ArrayList<>();
        l.add("0,0");
        int x = 0,y = 0;
        for(int i=0;i<path.length();i++){
            switch(path.charAt(i)){
                case 'N':
                    y+=1;
                    break;
                case 'S':
                    y-=1;
                    break;
                case 'E':
                    x+=1;
                    break;
                case 'W':
                    x-=1;
                    break;
                default:
                    break;
            }
            if(l.contains(x+","+y))
                return true;
            l.add(x+","+y);
        }
        return false;
    }
}

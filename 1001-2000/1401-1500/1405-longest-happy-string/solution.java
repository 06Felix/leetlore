class Solution {
    private boolean isG(int a, int b, int c){
        return a >= b && a >= c;
    }
    public String longestDiverseString(int a, int b, int c) {
        StringBuilder sb = new StringBuilder();
        int n = a + b + c;
        int cA = 0, cB = 0, cC = 0;
        for(int i = 0; i < n; i++) {
            if ((isG(a, b, c) && cA != 2) || ((cB == 2 || cC == 2) && a > 0))  {
                sb.append("a");
                a--;
                cA++;
                cB = 0;
                cC = 0;  
            }
            else if ((isG(b, a, c) && cB != 2) || ((cA == 2 || cC == 2) && b > 0)) {
                sb.append("b");
                b--;
                cB++;
                cA = 0;
                cC = 0;
            }
            else if ((isG(c, a, b) && cC != 2) || ((cA == 2 || cB == 2) && c > 0)) {
                sb.append("c");
                c--;
                cC++;
                cA = 0;
                cB = 0;  
            }
            else
                break;
        }
        return sb.toString();
    }
}

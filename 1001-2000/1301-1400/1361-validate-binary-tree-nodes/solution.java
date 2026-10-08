class Solution {
    public boolean validateBinaryTreeNodes(int n, int[] lC, int[] rC) {
        int[] in = new int[n];
        int rt = -1;
        for(int x : lC)
            if(x != -1 && ++in[x] == 2)
                return false;
        for(int x : rC)
            if(x != -1 && ++in[x] == 2)
                return false;
        for(int i = 0 ; i < n ; i++)
            if(in[i] == 0){
                if(rt == -1)
                    rt = i;
                else
                    return false;
            }
        if(rt == -1)
            return false;
        return count(rt, lC, rC) == n;
    }
    private int count(int rt, int[] lC, int[] rC){
        if(rt == -1)
            return 0;
        return 1 + count(lC[rt], lC, rC) + count(rC[rt], lC, rC);
    }
}

// public class MergeKSortedArrays {
//     private static class HeapNode
//         implements Comparable<HeapNode> {
//         int x;
//         int y;
//         int value;

//         HeapNode(int x, int y, int value)
//         {
//             this.x = x;
//             this.y = y;
//             this.value = value;
//         }
//     }
//     public static ArrayList<Integer>
//     mergeKArrays(int[][] arr, int K)
//     {
//         ArrayList<Integer> result
//             = new ArrayList<Integer>();
//         PriorityQueue<HeapNode> heap = new PriorityQueue<>((a, b) -> a.value - b.value);
//         for (int i = 0; i < arr.length; i++) {
//             heap.add(new HeapNode(i, 0, arr[i][0]));
//         }

//         HeapNode curr = null;
//         while (!heap.isEmpty()) {
//             curr = heap.poll();
//             result.add(curr.value);
//             if (curr.y < (arr[curr.x].length - 1)) {
//                 heap.add(
//                     new HeapNode(curr.x, curr.y + 1,
//                                  arr[curr.x][curr.y + 1]));
//             }
//         }

//         return result;
//     }

//     public static void main(String[] args)
//     {

//         int[][] arr = { { 2, 6, 12 },
//                             { 1, 9 },
//                             { 23, 34, 90, 2000 } };
//         System.out.println(
//             MergeKSortedArrays.mergeKArrays(arr, arr.length)
//                 .toString());
//     }
// }

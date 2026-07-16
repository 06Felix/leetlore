class Solution {
    public int earliestSecondToMarkIndices(int[] arr, int[] changeIndices) {
        for (int i = 0; i < changeIndices.length; i++) {
            changeIndices[i]--;
        }
        if (!canMarkAll(arr, changeIndices, changeIndices.length - 1)) {
            return -1;
        }
        int lo = 0, hi = changeIndices.length - 1;
        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            if (canMarkAll(arr, changeIndices, mid)) {
                hi = mid;
            } else {
                lo = mid + 1;
            }
        }
        return hi + 1;
    }

    private boolean canMarkAll(int[] arr, int[] indices, int last) {
        boolean[] marked = new boolean[arr.length];
        int markedCnt = 0;
        int dec = 0;
        for (int i = last; i >= 0; i--) {
            int idx = indices[i];
            if (marked[idx]) {
                if (dec > 0) {
                    dec--;
                }
            } else {
                marked[idx] = true;
                markedCnt++;
                dec += arr[idx];
            }
        }
        return dec == 0 && markedCnt == arr.length;

    }


}

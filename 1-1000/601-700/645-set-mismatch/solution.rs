impl Solution {
    pub fn find_error_nums(nums: Vec<i32>) -> Vec<i32> {
        let mut count = vec![0; nums.len()];
        let mut res = vec![0, 0];
        let mut actSum = 0;
        let mut dup = 0;
        let n = nums.len() as i32;
        for num in nums{
            count[(num-1) as usize] +=1;
            actSum += num;
            if count[(num-1) as usize] == 2{
                dup = num;
            }
        }
        let expectedSum = n * (n+1) /2;
        vec![dup, expectedSum - (actSum - dup)]
    }
}

impl Solution {
    pub fn longest_monotonic_subarray(nums: Vec<i32>) -> i32 {
        let n = nums.len();
        let mut res = 1;

        for i in 0..n - 1 {
            let mut cur_len = 1;
            for j in i + 1..n {
                if nums[j] == nums[j - 1]
                    || (nums[i] < nums[i + 1]) != (nums[j - 1] < nums[j])
                {
                    break;
                }
                cur_len += 1;
            }
            res = res.max(cur_len);
        }

        res
    }
}

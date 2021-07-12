class TwoSum {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        for(ai in nums.indices){

            for (bi in nums.indices){
                var a = nums[ai]
                var  b = nums[bi];

                if (ai != bi && a+b==target){
                    return intArrayOf(ai, bi)
                }
            }
        }
        return intArrayOf(0);
    }
}
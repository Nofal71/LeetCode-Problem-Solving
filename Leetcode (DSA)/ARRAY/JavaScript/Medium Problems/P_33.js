/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number}
 */

let search = (nums, target) => {
    let pvoit = findPviot(nums);
    if (pvoit == -1) {
        return binarySearch(nums, target, 0, nums.length - 1)
    }
    if (nums[pvoit] == target) return pvoit
    if (target >= nums[0]) return binarySearch(nums, target, 0, pvoit - 1);
    else return binarySearch(nums, target, pvoit + 1, nums.length - 1)
}
let findPivot = (nums) => {
    let start = 0, end = nums.length - 1;
    while (start <= end) {
        let mid = Math.floor((start + end) / 2);
        if (mid > 0 && nums[mid] < nums[mid - 1]) {
            return mid;
        }
        if (mid < nums.length - 1 && nums[mid] > nums[mid + 1]) {
            return mid + 1;
        }
        if (nums[mid] >= nums[start]) {
            start = mid + 1;
        } else {
            end = mid - 1;
        }
    }
    return -1;
};
let binarySearch = (arr, target, start, end) => {
    while (start <= end) {
        let mid = Math.floor(start + (end - start) / 2)
        if (arr[mid] < target) {
            start = mid + 1
        } else if (target < arr[mid]) {
            end = mid - 1
        } else {
            return mid
        }
    }
    return -1
}

let nums = [2, 3, 4, 5, 6, 1], target = 2;
console.log(search(nums, target));

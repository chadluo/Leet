#include <assert.h>
#include <stdbool.h>

int searchInsert(int* nums, int numsSize, int target) {
    int l = 0, r = numsSize - 1, m = (l + r) / 2;
    if (target <= nums[l])
        return l;
    if (target > nums[r])
        return r + 1;
    while (true) {
        if (nums[m] == target)
            return m;
        else if (l == r || l + 1 == r)
            return r;
        else if (nums[m] < target) {
            l = m;
            m = (l + r) / 2;
        } else {
            r = m;
            m = (l + 2) / 2;
        }
        continue;
    }
}

int main(int argc, char const *argv[]) {
    assert(searchInsert((int[]){1,3,5,6},4,5) == 2);
    assert(searchInsert((int[]){1,3,5,6},4,2) == 1);
    assert(searchInsert((int[]){1,3,5,6},4,7) == 4);
    assert(searchInsert((int[]){1,3,5,6},4,0) == 0);
    assert(searchInsert((int[]){1,3,5},3,1) == 0);
    assert(searchInsert((int[]){1},1,2) == 1);
    assert(searchInsert((int[]){1},1,1) == 0);
    return 0;
}

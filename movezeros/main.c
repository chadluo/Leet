#include <stdio.h>

void swap(int* arr, int front, int end) {
  int tmp = arr[front];
  arr[front] = arr[end];
  arr[end] = tmp;
}

void moveZeroes(int* nums, int numsSize) {
  int i = 0, j = 0;
  while (i < numsSize) {
    if (nums[i] == 0) {
      j = i;
      while (nums[j] == 0 && j < numsSize) j++;
      if (j == numsSize) return;
      swap(nums, i, j);
    }
    i++;
  }
}

int main() {
  int a[] = {0, 1, 0, 3, 12};
  for (int i = 0; i < 5; i++) printf("%d ", a[i]);
  puts("");
  moveZeroes(a, 5);
  for (int i = 0; i < 5; i++) printf("%d ", a[i]);
  puts("");
  return 0;
}

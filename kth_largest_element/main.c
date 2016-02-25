#include <stdio.h>
#include <stdlib.h>
#include <limits.h>

void swap(int* a, int* b) {
  int tmp = *a;
  *a = *b;
  *b = tmp;
}

void resort(int* arr, int arrSize) {
  int flag = arr[arrSize - 1];
  for (int i = arrSize - 1; i >= 0; i--) {
    if (flag < arr[i]) {
      for (int j = arrSize - 1; j > i + 1; j--) swap(arr + j - 1, arr + j);
      arr[i + 1] = flag;
      return;
    }
  }
  for (int j = arrSize - 1; j > 0; j--) swap(arr + j - 1, arr + j);
}

int findKthLargest(int* nums, int numsSize, int k) {
  int* arr = calloc(k, sizeof(int));
  arr[numsSize - 1] = INT_MIN;
  for (int i = 0; i < numsSize; i++) {
    if (nums[i] < arr[k - 1]) continue;
    arr[k - 1] = nums[i];
    resort(arr, k);
  }
  int result = arr[k - 1];
  free(arr);
  return result;
}

int main() {
  // int arr[] = {3, 2, 1, 5, 6, 4};
  // printf("%d\n", findKthLargest(arr, 6, 2));
  // int arr2[] = {-1, -1};
  // printf("%d\n", findKthLargest(arr2, 2, 2));
  int arr[] = {7, 6, 5, 4, 3, 2, 1};
  printf("%d\n", findKthLargest(arr, 7, 2));
  return 0;
}

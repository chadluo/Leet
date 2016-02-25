#include <stdio.h>

int romanToInt(char* s) {
  int result = 0;
  for (int i = 0; s[i] != '\0'; i++) {
    if (s[i] == 'C' && s[i + 1] == 'M') {
      result += 900;
      i += 1;
    } else if (s[i] == 'C' && s[i + 1] == 'D') {
      result += 400;
      i += 1;
    } else if (s[i] == 'X' && s[i + 1] == 'C') {
      result += 90;
      i += 1;
    } else if (s[i] == 'X' && s[i + 1] == 'L') {
      result += 40;
      i += 1;
    } else if (s[i] == 'I' && s[i + 1] == 'X') {
      result += 9;
      i += 1;
    } else if (s[i] == 'I' && s[i + 1] == 'V') {
      result += 4;
      i += 1;
    } else if (s[i] == 'M')
      result += 1000;
    else if (s[i] == 'D')
      result += 500;
    else if (s[i] == 'C')
      result += 100;
    else if (s[i] == 'L')
      result += 50;
    else if (s[i] == 'X')
      result += 10;
    else if (s[i] == 'V')
      result += 5;
    else if (s[i] == 'I')
      result += 1;
  }
  return result;
}

int main(int argc, char const* argv[]) {
  printf("%d\n", romanToInt("CMXII"));
  printf("%d\n", romanToInt("MMXIV"));
  printf("%d\n", romanToInt("DCCCXC"));
  return 0;
}

#include <stdio.h>
#include <stdbool.h>
#include <ctype.h>

bool isNumber(char* s) {
  while (isspace(*s)) s++;
  if (!isdigit(*s)) return false;
  while (isdigit(*s)) s++;
  if (*s == '.' || *s == 'e' || *s == 'E') s++;
  putchar(*s);
  return true;
}

int main(int argc, char const* argv[]) {
  puts(isNumber("0") ? "true" : "false");
  puts(isNumber(" 0.1 ") ? "true" : "false");
  puts(isNumber("abc") ? "true" : "false");
  puts(isNumber("1 a") ? "true" : "false");
  puts(isNumber("2e10") ? "true" : "false");
  return 0;
}

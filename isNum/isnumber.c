#include <stdio.h>
#include <stdbool.h>
#include <ctype.h>

#define SPACE 0

bool isNumber(char* s) {
    char c = s[0];
    int state = SPACE;
    while (c != '\0') {
        switch(c) {
            case ' ':
                continue;
            case '0':
        }
    }
}

int main(void) {
    printf("%d\n", isNumber("0"));
    printf("%d\n", isNumber(" 0.1 "));
    printf("%d\n", isNumber("abc"));
    printf("%d\n", isNumber("1 a"));
    printf("%d\n", isNumber("2e10"));
    return 0;
}

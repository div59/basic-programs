#include <stdio.h>
#include <string.h>

int main() {
    char src[] = "Hello";
    char dest[20];

    strcpy(dest, src);
    printf("Copied string using strcpy(): %s\n", dest);

    char src2[] = "Helkjhlloiuy, World";
    char dest2[20];

    strncpy(dest2, src2, 5);
    dest2[5] = '\0';
    printf("Copied string using strncpy(): %s\n", dest2);

    if (strcmp(src, dest) == 0) {
        printf("Strings are equal.\n");
    } else {
        printf("Strings are not equal.\n");
    }

    if (strncmp(src, dest, 3) == 0) {
        printf("First 3 characters of strings are equal.\n");
    } else {
        printf("First 3 characters of strings are not equal.\n");
    }

    printf("Length of src: %lu\n", strlen(src));

    char str1[20] = "Hello";
    char str2[] = ", World!";

    strcat(str1, str2);
    printf("Concatenated string using strcat(): %s\n", str1);

    char str3[20] = "Hello";
    char str4[] = ", World!";

    strncat(str3, str4, 3);
    printf("Concatenated string using strncat(): %s\n", str3);

    char *ptr1 = strchr(src, 'l');
    printf("First occurrence of 'l' in src: %s\n", ptr1);

    char *ptr2 = strrchr(src, 'l');
    printf("Last occurrence of 'l' in src: %s\n", ptr2);

    char *ptr3 = strstr(src, "ll");
    printf("First occurrence of 'll' in src: %s\n", ptr3);

    return 0;
}

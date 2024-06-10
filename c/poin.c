#include <stdio.h>

int main()
{
    int c[]={4,5,6,78};
    int* p;
     p=&c[0];
    printf("%d\n",*(p+3)); //4th index element
   

    return 0;
}

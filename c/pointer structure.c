//using pointers
#include <stdio.h>
struct box{
    int a[5];
};
 
 
void take(struct box* no){
    int i;
    for(i=0;i<5;i++){
        scanf("%d",&(no->a[i]));
    }
}
void print(struct box * no){
    int i=0;
    for(i=0;i<5;i++){
        printf("%d ",no->a[i]);
        
    }
}


int main()
{
    struct box s;
    take(&s);
    print(&s);

    return 0;
}

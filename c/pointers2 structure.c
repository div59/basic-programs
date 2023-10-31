//using pointers
#include <stdio.h>
struct box{
    int a[5];
};
 
 
void take(struct box* s){
    int i;
    for(i=0;i<5;i++){
        scanf("%d",&s->a[i]);//when you pass the struct box object s to the take function, 
        //you are passing it by value. 
        //This means that the take function receives a
        //copy of the original s object, and any modifications 
        //made inside the take function are made to the copy, not the original object.
        //To modify the original object inside the take function, you need to pass a pointer to the struct box
    }
}
void print(struct box s){
    int i=0;
    for(i=0;i<5;i++){
        printf("%d ",s.a[i]);
        
    }
}


int main()
{
    struct box s;
    take(&s);
    print(s);

    return 0;
}

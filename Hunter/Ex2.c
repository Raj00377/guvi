#include<stdio.h>
#include<stdlib.h>
int cmpfunc (const void * a, const void * b) {
   return ( *(int*)a - *(int*)b );
}

int main()
{
   int number,i;
   scanf("%d",&number);
   int arr[number];
   for(i=0;i<number;i++)
    scanf("%d",&arr[i]);
   qsort(arr, 5, sizeof(int), cmpfunc);
   for(i=number-1;i>=0;i--)
    printf("%d",arr[i]);
    return 0;
   
}

#include<stdio.h>
#include<stdlib.h>

int main()
{
   int number,i,flag=0;
   scanf("%d",&number);
   int arr[number];
   int a[10]={0};
   for(i=0;i<number;i++)
    scanf("%d",&arr[i]);
   for(i=0;i<number;i++)
    a[arr[i]]++;
   for(i=0;i<number;i++)
    if(a[i]>1){
     printf("%d ",i);
     flag=1;
    }
   if(flag==0)
    printf("unique");
    return 0;
   
}

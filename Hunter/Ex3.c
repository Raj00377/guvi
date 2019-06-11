#include<stdio.h>
#include<stdlib.h>
int main()
{
   int number,i,flag=0;
   scanf("%d",&number);
   int arr[number];
   for(i=0;i<number;i++)
    scanf("%d",&arr[i]);
   for(i=0;i<number;i++)
    if(arr[i]==i){
     printf("%d ",i);
     flag=1;
    }
   if(flag==0)
      printf("-1");
    return 0;
   
}

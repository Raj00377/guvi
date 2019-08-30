#include <stdio.h> 
int main(void) 
{ 
    int N,M,ramScore=0,sitaScore=0;
    scanf("%d %d",&N,&M);
    //int arr[N][M];
    int score;
        for(int j=0;j<M;j++){
            scanf("%d",&score);
            if(score==1)
             sitaScore++;
            else if(score==0)
             ramScore++;
        }
    printf("RAM: %d\nSITA: %d",ramScore,sitaScore);
    return 0;
} 

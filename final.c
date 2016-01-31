/*SET-2 S.KEERTHI S1ECEA R.NO(53)*/

#define MACRO "Error"
#include<stdio.h>
struct BOOK
{
   int bid;
   char title;
   char author;
   float price;    
}typedef struct bk;
void search(int *bk,float maxprice);
void display(int *bk,int bk.bid);
int main()
{
   int i;
   float m1;
   int b[i];
   bk b[i];
   for(i=1;i<=10;i++)
{
   printf("enter the details:id,title,author,price");
   scanf("%d%s%s%f",&bk.bid,bk.title,bk.author,&bk.price);
}
   printf("maximium price is: ");
   scanf("%f",m1);
   search(b[i],m1);
   display(b[i],bk.bid);
   return 0;
}
void search(int *bk, float maxprice)
{ 
   int i,n;
   int b[i];
   bk b[i];
   for(i=1;i<=10;i++)
   float n;
   printf("enter the price: ");
   scanf("%f",&n); 
      if(n<=maxprice)
{
   i=n;
   b[i]=b[n];
   printf("%d%s%s%f",&bk.bid,bk.title,bk.author,&bk.price);
}
   else
   printf(MACRO);
   return;
}
void display(int *bk,int bk.bid);
{
   int k;
   printf("enter the id: ");
   scanf("%d",&k);
   if(k==bk.bid)
{
   printf("%d%s%s%f",&bk.bid,bk.title,bk.author,&bk.price);
}
   return;
}


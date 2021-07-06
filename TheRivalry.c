/*
You are the gym teacher in the school. There are n students in the row. And there are
two rivalling students among them. The first one is in position a, the second in position b.
Positions are numbered from 1 to n from left to right. Since they are rivals, you want to
maximize the distance between them. If students are in positions p and s respectively, then 
distance between them is |p−s|.

You can do the following operation at most x times: choose two adjacent (neighbouring) students 
and swap them. Calculate the maximum distance between two rivalling students after at most x swaps.

Input Format:
The first line contains one integer t — the number of test cases.
The only line of each test case contains four integers n, x, a and b — the number of students 
in the row, the number of swaps which you can do, and positions of first and second rivaling 
students respectively.

Constraints:
(1≤t≤100) (2≤n≤100, 0≤x≤100, 1≤a,b≤n, a≠b)

Output Format:
For each test case print one integer — the maximum distance between two rivaling 
students which you can obtain.

In the first test case you can swap students in positions 3 and 4. And then the
distance between the rivals is equal to |4−2|=2.

Sample Input 0:
2
5 1 3 2
100 33 100 1

Sample Output 0
2
99

Sample Input 1
1
6 0 2 3

Sample Output 1
1
*/

#include <stdio.h>
void swap(int *a,int *b){
    int temp;
    temp = *a;
    *a = *b;
    *b = temp;
}

int main() {
    int n,a,b,c,d;
    scanf("%d",&n);
   
    while(n--){
        scanf("%d %d %d %d", &a, &b, &c, &d);
        if(c>d)
            swap(&c,&d);
        if(d-c+1+b >=a)
        {
            printf("%d\n",a-1);

        }
        else if(b==0){
            printf("%d\n", d-c);

        }else{
            printf("%d\n", d-c+b);
        }
    }
    return 0;
}

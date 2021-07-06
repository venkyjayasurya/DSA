/* Bob is preparing to pass IQ test. The most frequent task in this test is to find out which one of the given n numbers differs from the others. 
Bob observed that one number usually differs from the others in evenness. Help Bob — to check his answers, he needs a program that among the given n 
numbers finds one that is different in evenness.

Input Format

The first line contains integer n — amount of numbers in the task. The second line contains n space-separated natural numbers, 
not exceeding 100. It is guaranteed, that exactly one of these numbers differs from the others in evenness.

Constraints
(3 ≤ n ≤ 100)

Output Format

Output index of number that differs from the others in evenness. Numbers are numbered from 1 in the input order.

Sample Input 0:

5
2 4 7 8 10

Sample Output 0:
3

Sample Input 1:
4
1 2 1 1

Sample Output 1:
2
*/

#include<stdio.h>

int main()
{
    int n;
    int a[105];
    while(~scanf("%d",&n))
    {
        int ans1=0,ans2=0;
        int pos1,pos2;
        for(int i=1;i<=n;i++)
        {
            scanf("%d",&a[i]);
            if(a[i]%2==0)
            {
                ans1++;
                pos1=i;
            }
            else
            {
                ans2++;
                pos2=i;
            }
        }
        if(ans1>ans2)
        {
            printf("%d\n",pos2);
        }
        else
        {
            printf("%d\n",pos1);
        }
    }
    return 0;
}

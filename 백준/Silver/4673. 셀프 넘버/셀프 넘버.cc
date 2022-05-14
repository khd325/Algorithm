#include <iostream>
using namespace std;

void selfnumber(int a[],int n)
{
	int sum = n;
	while (n > 0)
	{
		sum += n % 10;
		n /= 10;
	}

	if (sum <= 10000)
	{
		a[sum]++;
		selfnumber(a,sum);
	}

}
int main()
{
	int a[10001] = { 0, };

	for (int i = 1; i <= 10000; i++)
		selfnumber(a, i);

	for (int i = 1; i <= 10000; i++)
		if (a[i] == 0)
			cout << i << "\n";
	
}
#include <iostream>
using namespace std;

int main()
{
	int n;
	cin >> n;
	int* a;
	a = new int[n];
	int k;

	for (int i = 0; i < n; i++)
	{
		cin >> k;
		a[i] = k;
	}

	int max=a[0], min=a[0];
	for (int i = 0; i < n; i++)
	{
		if (max <= a[i])
			max = a[i];
		if (min >= a[i])
			min = a[i];
	}
	cout << min << " " << max << endl;
	
	delete a;
	
}
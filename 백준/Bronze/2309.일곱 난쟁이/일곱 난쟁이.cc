#include <bits/stdc++.h>
using namespace std;

int arr[9], res[7], sum;

int main() {
	for (int i = 0; i < 9; i++) {
		cin >> arr[i];
	}
	sort(arr, arr+9);
	
	do {
		sum = 0;
		for (int i = 0; i < 7; i++) {
			sum += arr[i];
		}
		if (sum == 100) {
			for (int i = 0; i < 7; i++) {
				res[i] = arr[i];
			}
			break;
		}
	} while(next_permutation(arr, arr+9));
	
	for (int a : res) cout << a << "\n";
	return 0;
}
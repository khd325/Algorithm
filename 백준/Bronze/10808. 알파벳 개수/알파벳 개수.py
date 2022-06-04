import sys

alphabet = sys.stdin.readline().rstrip()

a = [0] * 26


for i in alphabet:
    a[ord(i) - ord('a')] += 1

print(*a)
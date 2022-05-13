import sys

data = sys.stdin.read()

alpha = [0] * 26

for i in data:
    if i.isalpha():
        alpha[ord(i) - ord('a')] += 1

for i in range(26):
    if alpha[i] == max(alpha):
        print(chr(ord('a') + i), end='')

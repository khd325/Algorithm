import sys
from collections import Counter


data = sys.stdin.readline().rstrip()

data = data.upper()


cnt = Counter(data).most_common()

cnt.sort(key= lambda x: x[1],reverse=True)

if len(cnt) > 1 and cnt[0][1] == cnt[1][1]:
    print("?")
else:
    print(cnt[0][0])
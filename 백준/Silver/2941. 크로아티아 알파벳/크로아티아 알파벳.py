import sys

data = sys.stdin.readline().rstrip()

li = ["c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="]

for alpha in li:
    if alpha in data:
        data = data.replace(alpha,"A")

print(len(data))



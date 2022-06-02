import sys
import math
h, w, n, m = map(int, sys.stdin.readline().split())

width = math.ceil(w / (m + 1))
height = math.ceil(h / (n+1))

print(width*height)

import sys

x, y, w, h = map(int, sys.stdin.readline().split())

width = min(x,w-x)
height = min(y,h-y)

print(min(width,height))

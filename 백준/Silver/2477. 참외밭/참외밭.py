import sys

n = int(sys.stdin.readline())

array = []

max_width = 0
max_height = 0
max_widthidx = 0
max_heightidx = 0

short_width = 0
short_height = 0

for _ in range(6):
    d, length = map(int, sys.stdin.readline().split())

    array.append((d, length))

for idx, temp in enumerate(array):
    if temp[0] == 2 or temp[0] == 1:
        if max_width < temp[1]:
            max_widthidx = idx
            max_width = temp[1]

    else:
        if max_height < temp[1]:
            max_heightidx = idx
            max_height = temp[1]

short_height = abs(array[(max_widthidx - 1) % 6][1] - array[(max_widthidx+1)%6][1])
short_width = abs(array[(max_heightidx-1)%6][1] - array[(max_heightidx+1)%6][1])

print(((max_width*max_height) - (short_height*short_width))*n)

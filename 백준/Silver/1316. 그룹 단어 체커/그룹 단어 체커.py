import sys

n = int(sys.stdin.readline())

count = 0

for _ in range(n):
    counting = [-1] * 26
    word = sys.stdin.readline().rstrip()
    pre_alpha = word[0]
    counting[ord(pre_alpha)-ord('a')] = 0
    flag = True

    for i in word[1:]:
        cur_idx = ord(i) - ord('a')
        cur_alpha = i
        if counting[cur_idx] == -1:
            counting[cur_idx] = 0
            pre_alpha = cur_alpha

        else:
            if cur_alpha == pre_alpha:
                continue
            else:
                flag = False
                break
    if flag:
        count += 1

print(count)
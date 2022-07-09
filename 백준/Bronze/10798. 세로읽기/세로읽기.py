import sys

board = [[''] * 15 for _ in range(5)]

for i in range(5):
    word = sys.stdin.readline().rstrip()

    for w in range(len(word)):
        board[i][w] = word[w]


result = ''

for i in range(15):
    for j in range(5):
        if board[j][i] != '':
            result += board[j][i]

print(result)
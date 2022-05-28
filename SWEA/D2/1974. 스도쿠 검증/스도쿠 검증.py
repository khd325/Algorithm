T = int(input())

for t in range(1, T + 1):
    sudoku = []

    for _ in range(9):
        sudoku.append(list(map(int, input().split())))

    flag = True
    # 가로
    for i in range(9):
        check = [False] * 10
        if not flag:
            break
        for num in sudoku[i]:
            if not check[num]:
                check[num] = True
            else:
                flag = False
                break

    # 세로

    for i in range(9):
        check = [False] * 10
        if not flag:
            break
        for j in range(9):
            if not check[sudoku[j][i]]:
                check[sudoku[j][i]] = True
            else:
                flag = False
                break

    for i in range(0,9,3):
        if not flag:
            break
        for j in range(0,9,3):
            if not flag:
                break
            check = [False] * 10
            for k in range(3):
                if not flag:
                    break
                for l in range(3):
                    # print(sudoku[i+k][j+l],end=' ')
                    if not check[sudoku[i+k][j+l]]:
                        check[sudoku[i+k][j+l]] = True
                    else:
                        flag = False
                        break
                # print()
    result = 1 if flag else 0
    print(f"#{t} {result}")

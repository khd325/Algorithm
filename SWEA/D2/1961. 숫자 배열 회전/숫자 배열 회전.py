T = int(input())


def rotate_90_degree(a, n):
    temp = [[0] * n for _ in range(n)]
    for i in range(n):
        for j in range(n):
            temp[i][j] = a[n - j - 1][i]

    return temp


for t in range(1, T + 1):
    n = int(input())

    graph = []
    for _ in range(n):
        graph.append(list(map(int, input().split())))

    rotate_one = rotate_90_degree(graph, n)
    rotate_two = rotate_90_degree(rotate_one, n)
    rotate_three = rotate_90_degree(rotate_two, n)

    print("#{}".format(t))
    for i in range(n):
        print("".join(map(str, rotate_one[i])), end=" ")
        print("".join(map(str, rotate_two[i])), end=" ")
        print("".join(map(str, rotate_three[i])), end=" ")

        print()
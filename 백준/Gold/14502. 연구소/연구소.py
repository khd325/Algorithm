import copy
from itertools import combinations
import sys
n, m = map(int,sys.stdin.readline().split())

graph = []

for i in range(n):
    graph.append(list(map(int,sys.stdin.readline().split())))

def dfs(x,y):
    graph_[x][y] = 2

    for i in range(4):
        nx = x + dx[i]
        ny = y + dy[i]

        if nx < 0 or nx >= n or ny < 0 or ny >= m:
            continue
        if graph_[nx][ny] != 0:
            continue
        else:
            dfs(nx,ny)

dx = [-1,1,0,0]
dy = [0,0,-1,1]


virus = []
zeros = []

for i in range(n):
    for j in range(m):
        if graph[i][j] == 2:
            virus.append([i,j])
        elif graph[i][j] == 0:
            zeros.append([i,j])
            
            
zeros_combi = combinations(zeros,3)


safety_zone_list = []

for combi in zeros_combi:
    graph_ = copy.deepcopy(graph)
    
    graph_[combi[0][0]][combi[0][1]] = 1
    graph_[combi[1][0]][combi[1][1]] = 1
    graph_[combi[2][0]][combi[2][1]] = 1
    
    for vi in virus:
        dfs(vi[0],vi[1])
        
    safety_zone = 0
    
    for row in range(n):
        for col in range(m):
            if graph_[row][col] == 0:
                safety_zone += 1
                
    safety_zone_list.append(safety_zone)
    
print(max(safety_zone_list))
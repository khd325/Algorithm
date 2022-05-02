a,b,c = map(int,input().split())

cnt = 0
if b > c or b == c :
    print(-1)
    exit(0)
else:
    
    cnt = int(a/(c-b)) + 1
print(cnt)
import sys
input = sys.stdin.readline

n = int(input())
likes = [ int(input()) for _ in range(n)]

if sum(likes)*2 >= n:
    print("Junhee is cute!")
else:
    print("Junhee is not cute!")
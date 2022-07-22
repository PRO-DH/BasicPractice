# 소수구하기
n = int(input("N 입력 : "))
b = 0
for i in range(2,n) :
    if n % i == 0 :
        b += 1
if b > 0 :
    print("소수가 아니다.")
elif b == 0 :
    print("소수이다.")

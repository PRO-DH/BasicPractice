n = 0
while True:
    print("----Menu----\n1. 콜라 / 300\n2. 사이다 / 300\n3. 커피 / 200\n4. 돈넣기\n5. 잔돈 반환\n6. 종료\n--------------")
    print(f"현재 금액 : {n}")
    menu = int(input("메뉴 선택 : "))
    print()
    if menu == 4 :                  # 처음 돈 넣기
        n += int(input("돈을 넣어주세요 : "))
        print()
    elif menu == 1 :               # 콜라
        if n - 300 >= 0 :        # 돈이 많은 경우
            n -= 300
            print("콜라 맛있게 드세요!")            
        else :                   # 돈이 부족한 경우
            print("금액이 부족합니다.")
    elif menu == 2 :               # 사이다
        if n - 300 >= 0 :        # 돈이 많은 경우
            n -= 300
            print("사이다 맛있게 드세요!")            
        else :                   # 돈이 부족한 경우
            print("금액이 부족합니다.") 
    elif menu == 3 :               # 커피
        if n - 200 >= 0 :        # 돈이 많은 경우
            n -= 200
            print("커피 맛있게 드세요!")            
        else :                   # 돈이 부족한 경우
            print("금액이 부족합니다.")
    elif menu == 5 :            # 잔돈 반환
        print("잔돈이 반환됩니다.")
        break
    elif menu == 6:
        break
    print()

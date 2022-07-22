while True :
    while True :
        print("="*30)
        print("1, Easy")
        print("2, Normal")
        print("3, Hard")
        print("="*30)

        level = input("난이도 설정 > ")

        if level == "1" :
            com = random.randint(1,9)
        elif level == "2" :
            com = random.randint(10,99)
        elif level == "3" :
            com = random.randint(100,999)
        else:
            print("입력오류!")
            continue
        break
    cnt = 0
    while True:
            user = input("GUESS ...")
            cnt += 1
            if user.isnumeric():
                user = int(user)
                if user > com:
                    print("DOWN!")
                elif com > user:
                    print("UP!")
                else:
                    print(f"CORRECT! {cnt}번만에 맞춤!")
                    break
            else:
                print("숫자만 입력바람!")
    again = input("계속하시겠습니까? yes(1) no(0)")
    if again == "0" :
        print("수고하셨습니다.")
        break

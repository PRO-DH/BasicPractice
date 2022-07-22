while True :
    # 게임 안내단
    print()
    print()
    print("인디언포커에 오신것을 환영합니다 !\n\nContinue : (Enter...)")
    input()
    os.system("cls")
    print()
    print()
    print("""룰을 설명해 드리겠습니다.
    각자 1~13까지 중 하나의 카드를 낼 수 있으며
    숫자가 큰 사람은 100점을 획득합니다.
    단, 무승부일 시 0점을 획득합니다.\n\nContinue : (Enter...)""")
    input()
    os.system("cls")
    # 본게임단
    li1 = [1,2,3,4,5,6,7,8,9,10,11,12,13]
    li2 = [1,2,3,4,5,6,7,8,9,10,11,12,13]
    li11 = []
    li22 = []
    k = 1
    scorea = 0
    scoreb = 0
    while True :
        print(f"\n\n====={k}회=====")
        input("\n게임을 시작 하려면 : (Enter...)")
        os.system("cls")
        # 카드 고르는 단계
        print()
        print()
        print("낼 수 있는 카드 :", li1)
        print()
        a = int(input("1번 선수 낼 카드를 고르세요 : "))
        os.system("cls")
        print()
        print()
        print("낼 수 있는 카드 ", li2)
        print()
        b = int(input("2번 선수 낼 카드를 고르세요 : "))
        os.system("cls")
        # 만약 카드가 전에 골랐던 카드라면
        if a in li11 or b in li22 :
            print()
            print()
            print("골랐던 카드입니다. 다시 고르세요 ")
        # 만약 아직 고르지 않은 카드라면
        else :
            # 고른 카드는 li에서 지우기 / 고른카드들 따로 담기
            a1 = li1.index(a)
            b1 = li2.index(b)
            a2 = li1.pop(a1)
            b2 = li2.pop(b1)
            li11.append(a2)
            li22.append(b2)
            print()
            print()
            # 승패 결정하기
            if a > b :
                print("A의 승리")
                scorea +=100
            elif b > a :
                print("B의 승리")
                scoreb +=100
            elif a == b:
                print("무승부입니다.")
            print()
            print(f"점수는 A : {scorea}  vs  B : {scoreb} 입니다.")
            print()
            input("\nContinue : (Enter...)")
            k += 1
            os.system("cls")
        # 게임 종료 시점
        if li1 == [] :
            print()
            print()
            print("게임이 종료되었습니다.")
            print()
            # 총 승패 가르기
            if scorea > scoreb :
                print(f"{scorea}점 대 {scoreb}점으로 A의 승리입니다.")
            elif scorea < scoreb :
                print(f"{scorea}점 대 {scoreb}점으로 B의 승리입니다.")
            else :
                print("무승부입니다.")
            break
    # 게임을 다시 할지 묻는 코드
    os.system("cls")
    again = input("계속하시겠습니까? (Y/N) : ")
    if again == "N":
        break
    else :
        os.system("cls")
        for i in range(3,0,-1):
            print(f"{i}초 후 게임이 재개됩니다.")
            time.sleep(1)
            os.system("cls")

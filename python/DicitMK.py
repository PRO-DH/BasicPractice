# 단어장 만들어서 파일에 저장 -> 파일을 읽어와서 단어장 수정 가능하게 하는 단어장 만들기 연습.
import os
from time import sleep as sl
d = {}

if os.path.isfile("단어장.txt"):
    f = open("단어장.txt", "r", encoding="utf-8")
    for i in f.read().split():
        A = i.split(",") # ['apple', '사과']
        d[A[0]] = A[1]
    f.close()

st = """==============================
1. 단어목록보기
2. 단어검색
3. 단어추가
4. 단어수정
5. 단어삭제
6. 프로그램 종료
=============================="""

while True:
    print(st)
    user = input("메뉴선택 : ")

    if user == "1":
        for i in d:
            print(i, end=" ")


    elif user == "2":
        word = input("단어검색 : ")
        if word in d:
            print(f"{word} 의 뜻은 '{d[word]}' 입니다!")
        else:
            print("사전에 등록되어 있지 않습니다!")


    elif user == "3":
        word = input("추가할 단어검색 : ")
        if word in d:
            print("이미 등록된 단어입니다!")
        else:
            mean = input(f"{word} 의 뜻을 입력하세요 : ")
            d[word] = mean


    elif user == "4":
        word = input("수정할 단어검색 : ")
        if word in d:
            mean = input(f"{word} 의 뜻을 입력하세요 : ")
            d[word] = mean
        else:
            print("사전에 등록되어 있지 않는 단어입니다!")


    elif user == "5":
        word = input("삭제할 단어검색 : ")
        if word in d:
            del d[word]
        else:
            print("사전에 등록되어 있지 않는 단어입니다!")

    elif user == "6":

        g = open("단어장.txt", "w", encoding="utf-8")
        for i in d:
            g.write(f"{i},{d[i]}\n")
        g.close()

        print("너 서운해 :(")
        break
    else:
        print("입력오류!!")

    sl(0.7)
    os.system("cls")




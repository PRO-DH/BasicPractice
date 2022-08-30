-----------------------------Day1----------------------------------------------------


-- SQL : 데이터베이스 질의 언어이다.

-- SELECT : 검색 (보여주는 것)
-- WHERE : 조건
-- * : 모든 것
-- UPDATE : 수정
-- DELETE : 삭제
-- INSERT : 추가
-- COMMIT : 저장하기

-- 테이블 만들기
-- CREATE TABLE [테이블명]
-- ( [컬럼명] [데이터타입] [기본값설정-생략가능] [NULL허용여부설정 - 생략가능], ... );

CREATE TABLE ITMember (
id varchar2(10) primary key, -- 무결성 제약조건(유일한 키)
pw varchar2(10) not null, -- NULL 값을 허용안함
name nvarchar2(10) not null,
age number(3),
phone char(13) -- 010-1111-2222
);

commit;

SELECT * FROM TAB;
-- 해당 데이터 상의 모든 테이블 목록이 출력된다.

-- 데이터 추가하기
-- INSERT INTO [테이블명] (컬럼명1, 컬럼명2, ....) VALUES (컬럼1의데이터1, 컬럼2의 데이터2,...);
-- 컬럼명을 생략할 수 있는데 생략 시 컬럼순서대로 컬럼값을 넣어주면 된다.
-- 오라클 데이터베이스는 문자컬럼의 값은 작은 따옴표를 쓴다.

insert into ITMember(id, pw, name, age, phone) values('hong', '1234', '홍길동', 20, '010-1111-2222');

commit;

INSERT INTO ITMember values('sung', '5678', '성춘향', 21, '010-2222-3333');
INSERT INTO ITMember values('lee', '5555', '이순신', 25, '010-1234-5678');

COMMIT;

-- 데이터 전체 조회하기
SELECT * FROM ITMember;

-- 조건에 맞게 조회하기
-- SELECT [컬럼명] FROM [테이블명] WHERE [조건]
SELECT id, name FROM ITMember WHERE id = 'sung';

-- 데이터 수정하기
-- UPDATE [테이블명] SET [컬럼명] = [변경할 값] WHERE [조건]
UPDATE ITMember SET phone = '010-6666-7777' WHERE id = 'lee';

COMMIT;

SELECT * FROM ITMember;

-- 데이터 삭제하기
-- DELETE FROM [테이블명] WHERE [조건]

DELETE FROM ITMember WHERE id = 'hong';

ROLLBACK;

SELECT * FROM ITMember;

-- DROP : 테이블 구조자체를 삭제
-- DROP TABLE [테이블명]
DROP TABLE ITMember;

select * from TAB;

-- Member 테이블 만들기
-- 아이디, 비밀번호, 이름, 나이, 핸드폰번호
-- Member 테이블에 데이터 넣기 - 5개
-- SELECT 문을 사용해서 데이터 조회하기 - 조건
-- UPDATE 문을 사용해서 데이터 수정하기
-- DELETE 문을 사용해서 데이터 삭제하기
-- DROP 명령어를 사용해서 테이블 구조 삭제하기

create table department(
departmentCode number(3) primary key,
departmentName nvarchar2(10) not null,
departmentNumber char(13)
);

insert into department values(111, '컴퓨터학과', '02-111-2222');
insert into department values(222, '요리학과', '02-333-4444');
insert into department values(333, '경제학과', '02-555-6666');
insert into department values(444, '역사학과', '02-777-8888');

commit;

create table student(
studentID number(6) primary key,
name nvarchar2(7),
age number(3),
grade number(1),
departmentCode number(3) REFERENCES department(departmentCode)
);

-- REFERENCES >> 참조키, 참조하라는 뜻
-- [외래키이름] [데이터타입(반드시일치)] REFERENCES [참조테이블명] (참조컬럼명)


insert into student values(202101, '홍길동', 23, 4, 111);
insert into student values(202102, '성춘향', 21, 2, 222);
insert into student values(202103, '이순신', 23, 1, 333);
insert into student values(202104, '이몽룡', 25, 3, 444);
insert into student values(202105, '장보고', 20, 1, 111);
insert into student values(202106, '임꺽정', 24, 3, 444);
insert into student values(202107, '홍길순', 24, 4, 222);

commit;

-- 홍길동 학생의 학과의 전화번호 찾기
SELECT name, departmentName, departmentNumber
FROM student, department
where student.departmentcode = department.departmentcode
and name = '홍길동';


SELECT * FROM Student;

-- 정렬 : ORDER BY
-- ASC : 오름차순 정렬(생략시 default)
-- DESC : 내림차순 정렬

SELECT * FROM Student ORDER BY grade ASC; --학년을 기준으로 오름차순으로 정렬
SELECT * FROM Student ORDER BY grade DESC; -- 학년을 기준으로 내림차순으로 정렬

-- 학년을 오름차순으로 정렬하고 학년이 같으면 나이를 내림차순으로 정렬
SELECT * FROM Student ORDER BY grade ASC, age DESC;


-- 산술연산자
SELECT name, age + 1 FROM Student;
SELECT name, age - 1 FROM Student;
SELECT name, age * 2 FROM Student;
SELECT name, age / 2 FROM Student;

-- 비교연산자
SELECT * FROM Student WHERE age = 23; -- 같다.
SELECT * FROM Student WHERE age != 23; -- 같지않다.
SELECT * FROM Student WHERE age <> 23; -- 같지않다.
SELECT * FROM Student WHERE age ^= 23; -- 같지않다.
SELECT * FROM Student WHERE age > 23; -- 크다
SELECT * FROM Student WHERE age < 23; -- 작다
SELECT * FROM Student WHERE age >= 23; -- 크거나 같다
SELECT * FROM Student WHERE age <= 23; -- 작거나 같다

-- 논리 연산자
-- AND : 두 가지 조건을 만족해야 한다.
SELECT * FROM Student WHERE age = 23 AND grade = 1;

-- OR : 두 가지 조건 중 하나만 만족해도 가능하다
SELECT * FROM Student WHERE age = 23 OR grade = 1;

-- NOT : 조건을 만족하지 않아야 한다.
SELECT * FROM Student WHERE NOT age = 23;

-- 연결연산자 : ||
-- 연결 연산자란 여러 컬럼을 하나의 컬럼인 것처럼 연결하거나
-- 컬럼과 리터럴을 연결한다.

SELECT name || age FROM Student; -- 컬럼과 컬럼끼리 연결

SELECT name || '의 나이는 ' || age || '살 입니다.' FROM Student;
-- 컬럼과 리터럴을 연결


-- 기타연산자(오라클에서만 쓰이는 연산자)
-- BETWEEN ~ AND : 특정 범위에 포함되는지 여부 : >= AND <=
SELECT * FROM Student WHERE grade BETWEEN 2 AND 3;

-- IN : 비교값 목록에 포함되는지 여부 (OR이 여러개일 경우에 대체하는 연산자)
SELECT * FROM Student WHERE grade IN (2,3,4);

-- NOT IN : 비교값 목록에 비포함되는지 여부
SELECT * FROM Student WHERE grade NOT IN (2,3,4);


create table KGMember(
id varchar2(10),
pw varchar2(10),
name nvarchar2(10),
age number(3),
phone char(13)
);

insert into KGMember values('hong', '1234', '홍길동', 20, '010-1111-2222');
insert into KGMember values('sung', '5678', '성춘향', 21, '010-1111-3333');
insert into KGMember values('lee', '1111', '이순신', 22, '010-1111-5555');
insert into KGMember values('jang', '2222', '장보고', 23, '010-1111-6666');


commit;







---------------------------Day2---------------------------------------------------





create table circleMember(
    name nvarchar2(10),
    age number(3),
    phone char(13),
    email varchar2(20)
);

commit;

insert into circleMember(name, age, phone, email) values ('홍길동', '20', '010-1111-2222', 'hong@naver.com');
insert into circleMember(name, age, phone, email) values ('성춘향', '21', '010-1111-3333', 'sung@naver.com');
insert into circleMember(name, age, phone, email) values ('이몽룡', '22', '010-1111-4444', 'lee@naver.com');
insert into circleMember(name, age, phone, email) values ('이순신', '23', '010-1111-5555', 'sun@naver.com');

commit;

SELECT * FROM circlemember;






---------------------------Day3---------------------------------------------------

create table memo(
    momoId number(4) primary key,
    nickName nvarchar2(20),
    contents nvarchar2(200),
    regTime timestamp default systimestamp
);

commit;

create sequence memo_seq  --시퀀스(자동으로 증가하는 순번객체)
START WITH 1            --시퀀스 값 1부터
INCREMENT BY 1          -- 1씩증가
NOMAXVALUE              -- 시퀀스의 범위를 무한대로 지정
NOCACHE;                -- 캐시값 없애기

commit;




-------------------------Day4-------------------------------------------------

create table members(
    id varchar2(20),
    pw varchar2(20),
    name nvarchar2(20),
    email varchar2(30),
    regDate timestamp,
    address nvarchar2(30),
    primary key(id)
);

commit;


DROP TABLE CIRCLEMEMBER;
DROP TABLE DEPARTMENT;
DROP TABLE KGMEMBER;
DROP TABLE MEMO;
DROP TABLE STUDENT;



-------------------------Day4-------------------------------------------------

create table members(
    id varchar2(20),
    pw varchar2(20),
    name nvarchar2(20),
    email varchar2(30),
    regDate timestamp,
    address nvarchar2(30),
    primary key(id)
);

commit;


---------------------Day5----------------------------------------------------
create table board(
    bId number(4) primary key,          --유일한 값
    bName nvarchar2(20),                --작성자
    bTitle nvarchar2(100),              --제목
    bContent nvarchar2(500),            --내용
    bDate timestamp default sysdate,    --작성일
    bHit number(4) default 0            --조회수
);

commit;

CREATE SEQUENCE board_seq               --시퀀스(자동으로 증가하는 순번객체)
START WITH 1                            -- 시퀀스 값 1부터
INCREMENT BY 1                          -- 1씩증가
NOMAXVALUE                              -- 시퀀스의 범위를 무한대로 지정
NOCACHE;                                -- 캐시값 없애기

commit;


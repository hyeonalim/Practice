<img src="/path/ANIMAL_INS 설명.jpg"></img>

Programmers Select문의 문제 풀이입니다.
---------------------------------------

모든 레코드 조회하기
1. 동물 보호소에 들어온 모든 동물의 정보를 ANIMAL_ID순으로 조회하는 SQL문을 작성해주세요.

```sql
SELECT * from ANIMAL_INS ORDER BY ANIMAL_ID;
```

  Point
  
    *: 모든 레코드 선택
    ORDER BY: ~순으로 조회 (asc 조회로, 오름차순 조회)
 
역순 정렬하기



2. 동물 보호소에 들어온 모든 동물의 이름과 보호 시작일을 조회하는 SQL문을 작성해주세요. 이때 결과는 ANIMAL_ID 역순으로 보여주세요.

```sql
SELECT NAME, DATETIME from ANIMAL_INS ORDER BY ANIMAL_ID DESC;
```

  Point
  
    ORDER BY ~ DESC: 역순으로 조회 (내림차순 조회)


아픈 동물 찾기



3. 동물 보호소에 들어온 동물 중 아픈 동물의 아이디와 이름을 조회하는 SQL 문을 작성해주세요. 이때 결과는 아이디 순으로 조회해주세요.

```sql
SELECT ANIMAL_ID, NAME FROM ANIMAL_INS WHERE INTAKE_CONDITION = 'Sick' order by ANIMAL_ID;
```

  Point
  
    WHERE: 조건 (~중, ~에서 등)

어린 동물 찾기



4. 동물 보호소에 들어온 동물 중 젊은 동물의 아이디와 이름을 조회하는 SQL 문을 작성해주세요. 이때 결과는 아이디 순으로 조회해주세요. 

```sql
SELECT ANIMAL_ID, NAME FROM ANIMAL_INS WHERE INTAKE_CONDITION!= 'Aged' order by ANIMAL_ID;
```

동물의 아이디와 이름



5. 동물 보호소에 들어온 모든 동물의 아이디와 이름을 ANIMAL_ID순으로 조회하는 SQL문을 작성해주세요. SQL을 실행하면 다음과 같이 출력되어야 합니다.

```sql
SELECT ANIMAL_ID, NAME FROM ANIMAL_INS ORDER BY ANIMAL_ID;
```

여러 기준으로 정렬하기



6. 동물 보호소에 들어온 모든 동물의 아이디와 이름, 보호 시작일을 이름 순으로 조회하는 SQL문을 작성해주세요. 단, 이름이 같은 동물 중에서는 보호를 나중에 시작한 동물을 먼저 보여줘야 합니다.

```sql
SELECT ANIMAL_ID, NAME, DATETIME FROM ANIMAL_INS ORDER BY name asc, DATETIME desc;
```

  Point
  
    정렬을 두번 사용 가능: 제일 먼저 나와있는 조건을 처음 순서로 작성, 그 다음 조건부터 차례로 조건 작성

상위 n개 레코드



7. 동물 보호소에 가장 먼저 들어온 동물의 이름을 조회하는 SQL 문을 작성해주세요.

```sql
SELECT name from ANIMAL_INS where DATETIME = (select min(datetime) from animal_ins)
```

  Point
  
    min(필드): 필드 중 최소 찾기

-- 동물 보호소에 들어온 모든 동물의 정보를 ANIMAL_ID순으로 조회
SELECT * from ANIMAL_INS ORDER BY ANIMAL_ID;

-- 동물 보호소에 들어온 모든 동물의 이름과 보호 시작일을 조회, 이때 결과는 ANIMAL_ID 역순
SELECT NAME, DATETIME from ANIMAL_INS ORDER BY ANIMAL_ID DESC;

-- 동물 보호소에 들어온 동물 중 아픈 동물의 아이디와 이름을 아이디 순으로 조회
SELECT ANIMAL_ID, NAME FROM ANIMAL_INS WHERE INTAKE_CONDITION = 'Sick' order by ANIMAL_ID;

-- 동물 보호소에 들어온 동물 중 젊은 동물1의 아이디와 이름을 아이디 순으로 조회
SELECT ANIMAL_ID, NAME FROM ANIMAL_INS WHERE INTAKE_CONDITION!= 'Aged' order by ANIMAL_ID;

-- 동물 보호소에 들어온 모든 동물의 아이디와 이름을 ANIMAL_ID순으로 조회
SELECT ANIMAL_ID, NAME FROM ANIMAL_INS ORDER BY ANIMAL_ID;

-- 동물 보호소에 들어온 모든 동물의 아이디와 이름, 보호 시작일을 이름 순으로 조회
SELECT ANIMAL_ID, NAME, DATETIME FROM ANIMAL_INS ORDER BY name asc, DATETIME desc;

-- 동물 보호소에 가장 먼저 들어온 동물의 이름을 조회
SELECT name from ANIMAL_INS where DATETIME = (select min(datetime) from animal_ins)

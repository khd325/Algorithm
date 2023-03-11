-- 코드를 입력하세요
SELECT ao.ANIMAL_ID, ao.NAME from ANIMAL_OUTS ao JOIN ANIMAL_INS ai on ao.ANIMAL_ID = ai.ANIMAL_ID order by DATEDIFF(ao.DATETIME, ai.DATETIME) desc limit 2;
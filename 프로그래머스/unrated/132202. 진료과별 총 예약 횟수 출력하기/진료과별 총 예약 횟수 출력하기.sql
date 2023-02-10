-- 코드를 입력하세요
SELECT MCDP_CD as '진료과 코드', count(APNT_NO) as '5월예약건수' from APPOINTMENT where APNT_YMD like '%2022-05%' GROUP BY MCDP_CD ORDER BY count(APNT_NO), MCDP_CD;
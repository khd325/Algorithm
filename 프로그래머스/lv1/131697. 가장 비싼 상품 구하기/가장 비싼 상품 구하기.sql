-- 코드를 입력하세요
SELECT PRICE as MAX_PRICE from PRODUCT where PRICE = (SELECT max(PRICE) from PRODUCT);
select B.car_id, case when B.AVAILABILITY = 1 then '대여중'
else '대여 가능' end AS AVAILABILITY 
from (select car_id, max(case when '2022-10-16' between start_date and end_date then 1 else 0 end)
      AS AVAILABILITY
from CAR_RENTAL_COMPANY_RENTAL_HISTORY
group by car_id) AS B order by car_id desc;

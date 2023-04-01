select date_format(A.start_date,'%c') as MONTH,
A.car_id, count(A.history_id) as record
from CAR_RENTAL_COMPANY_RENTAL_HISTORY as A
join (
    select car_id 
    from CAR_RENTAL_COMPANY_RENTAL_HISTORY
    where date_format(start_date, '%Y-%m') between '2022-08' and '2022-10'
    group by car_id
    having count(*) >= 5
) as B 
on A.car_id = B.car_id
where date_format(start_date, '%Y-%m') between '2022-08' and '2022-10'
group by date_format(A.start_date, '%c'), A.car_id
order by CAST(MONTH AS SIGNED), car_id desc;


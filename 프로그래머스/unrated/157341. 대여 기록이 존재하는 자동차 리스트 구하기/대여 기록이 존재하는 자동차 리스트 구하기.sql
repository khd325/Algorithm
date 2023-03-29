-- 코드를 입력하세요
SELECT distinct(car.car_id) from car_rental_company_car as car 
join car_rental_company_rental_history as history
on car.car_id = history.car_id
where history.start_date like '2022-10%' and car.car_type = '세단'
order by car.car_id desc;
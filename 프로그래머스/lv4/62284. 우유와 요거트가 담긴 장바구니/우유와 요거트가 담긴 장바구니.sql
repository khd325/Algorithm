select A.cart_id 
from cart_products as A
join (select distinct cart_id from cart_products where name = 'Milk') as B
on A.cart_id = B.cart_id and A.name = 'Yogurt';
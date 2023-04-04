select FIRST_HALF.FLAVOR from first_half 
join (select flavor, sum(total_order) as total_order from july group by FLAVOR) as july
on FIRST_HALF.FLAVOR = july.FLAVOR
order by (july.total_order + first_half.total_order) desc limit 3


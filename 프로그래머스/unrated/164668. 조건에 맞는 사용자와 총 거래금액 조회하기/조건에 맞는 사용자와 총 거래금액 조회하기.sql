select U.USER_ID, U.NICKNAME, sum(B.price) as TOTAL_SALES from used_goods_user as U
join used_goods_board as B on B.writer_id = U.user_id
where B.STATUS = 'DONE'
group by U.user_id
having TOTAL_SALES >= 700000
order by TOTAL_SALES;
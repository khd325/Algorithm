select p.product_code, sum(os.sales_amount) * p.price as sales from offline_sale os join product p on p.product_id = os.product_id group by os.product_id order by sales desc, p.product_code;

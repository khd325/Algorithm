select author.author_id, author.author_name, b.category, sum(total_sales) as total_sales from author
join (select book.book_id, category, sum(sales) * price as total_sales, author_id from book 
    join book_sales as sales
    on sales.book_id = book.book_id
    where sales_date like '2022-01%'
    group by book_id) as b
on author.author_id = b.author_id
group by author.author_id, b.category
order by author_id, category desc;

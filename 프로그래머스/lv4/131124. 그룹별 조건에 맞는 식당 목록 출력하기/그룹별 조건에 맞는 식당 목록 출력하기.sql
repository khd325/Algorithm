
select member_name, review_text, date_format(review_date, '%Y-%m-%d') as review_date
from rest_review as review
join member_profile
on review.member_id = member_profile.member_id
where review.member_id in (
select member_id from rest_review 
group by member_id
having count(*) = (select count(*) from rest_review group by member_id order by count(*) desc limit 1)
) order by review_date, review_text;
select a.title, ar.name from music.album a 
join artist ar on a.artist_id = ar.artist_id
order by ar.name asc;

select t.name as track_name, a.title as album_title, ar.name as artist_name, g.name as genre_name
from track t 
join album a on t.album_id = a.album_id 
join artist ar on a.artist_id = ar.artist_id
join genre g on t.genre_id = g.genre_id
order by genre_name asc;

select e.first_name,e.last_name, sum(i.total) as total_income_assisted_on
from employee e left join customer c on e.employee_id = c.support_rep_id 
join invoice i on c.customer_id = i.customer_id
group by e.first_name, e.last_name 
order by total_income_assisted_on desc;

select e.first_name,e.last_name, sum(i.total) as total_income_assisted_on
from employee e left join customer c on e.employee_id = c.support_rep_id 
join invoice i on c.customer_id = i.customer_id
group by e.first_name, e.last_name 
order by total_income_assisted_on desc
limit 1 offset 1;


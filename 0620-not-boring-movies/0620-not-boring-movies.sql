# Write your MySQL query statement below
select id, movie, description, rating  from Cinema where NOT description = "boring" AND (id % 2 = 1) ORDER BY rating DESC
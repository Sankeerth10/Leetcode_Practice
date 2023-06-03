# Write your MySQL query statement below
select b.unique_id, a.name from Employees as a left join EmployeeUNI as b on a.id = b.id 
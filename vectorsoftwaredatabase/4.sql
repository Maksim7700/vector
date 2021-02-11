select distinct s.suppliername, s.city, s.country, c.categoryname
from myshop.products p left join myshop.supplier s 
on p.supplierID = s.supplierid
inner join myshop.categories c
on c.categoryID = p.categoryID
where c.categoryname = 'Condiments';
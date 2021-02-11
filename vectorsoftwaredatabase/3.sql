select p.productID, p.productName, p.price, s.country
from myshop.products p left join myshop.supplier s 
on p.supplierID = s.supplierid  
where s.country = 'USA';
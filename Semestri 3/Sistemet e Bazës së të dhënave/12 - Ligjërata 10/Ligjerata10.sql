--listoni porosite dhe numrin e produkteve per porosi
select *,(select count(*) from OrderProduct op where op.OrderID = o.OrderID  )
from [Order] o

--listoni klientet te cilet kane realizuar porosi
select *
from Client c
where c.ClientID IN (select ClientID
					 from [Order])

--listo mesataren se sa produkte ekzistojne ne porosi - numrimi i produkteve nese kolona "quantity" nuk ekziston

select avg(Numri) as 'Mesatarja e Produkteve'
from ( select op.OrderID, count(*) as 'Numri'
	   from OrderProduct op
       group by op.OrderID) as Rezultati

--listo mesataren se sa produkte ekzistojne ne porosi - me "quantity"
select avg(Numri) as 'Mesatarja e Produkteve'
from (select op.OrderID, sum(op.Quantity) as 'Numri'
	  from OrderProduct op
      group by op.OrderID) as Rez

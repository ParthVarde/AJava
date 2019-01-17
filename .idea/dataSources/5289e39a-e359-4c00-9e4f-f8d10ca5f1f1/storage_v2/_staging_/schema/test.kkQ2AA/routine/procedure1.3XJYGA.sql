create procedure procedure1(IN ident integer)
BEGIN
  select * from demo where id = ident;

END;


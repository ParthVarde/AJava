create procedure procedure1(IN ident INTEGER(10), IN nam VARCHAR(50))
BEGIN
  select * from demo where id = ident && name = nam;
END;


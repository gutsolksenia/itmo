var
    a, b: integer;
begin
   read(a, b);
   if a > b then
       begin
          writeln('a > b');
       end
   if a <= b then
      begin
          writeln('a <= b');
      end
   if a = b then
       writeln('a = b');
   if a - b < 0 then
       writeln('a - b < 0');
   else
       writeln('a - b >= 0');
end.
CREATE OR REPLACE FUNCTION my_pi()
  RETURNS DECIMAL AS $$
BEGIN
  RETURN pi();
END;
$$ LANGUAGE 'plpgsql';

SELECT my_pi();


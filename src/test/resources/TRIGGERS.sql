DROP TRIGGER IF EXISTS idTeam_by_default$$

CREATE TRIGGER idTeam_by_default BEFORE INSERT ON employee FOR EACH ROW
BEGIN
	if NEW.idTeam < 0 OR NEW.idTeam is null then
		set NEW.idTeam = 0;
		end if;
END$$
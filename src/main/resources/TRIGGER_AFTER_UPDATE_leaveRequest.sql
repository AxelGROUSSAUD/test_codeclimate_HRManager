CREATE DEFINER=`root`@`localhost` TRIGGER `leaverequest_AFTER_UPDATE_status` AFTER UPDATE ON `leaverequest` FOR EACH ROW BEGIN
	DECLARE id_status int;
    DECLARE id_project int;
    DECLARE duration time;
    
    SET id_status = (SELECT status.id FROM status WHERE statusType = 'LEAVEREQUEST' AND name like 'V%');
	SET id_project = (SELECT id FROM project WHERE name = 'Organisation');
	SET duration = datediff(OLD.startDate, OLD.endDate);
    
	if NEW.idStatus = id_status then
		INSERT INTO task (idEmployee, idProject, idStatus, name, startDate, endDate, estimatedDuration, isAssign) VALUES (OLD.idEmployee, id_project, id_status, 'Absent', OLD.startDate, OLD.endDate, duration, true);
		end if;
END
USE employeeManager;

delimiter |

create event checkHours
	on schedule every '1' day
    starts '2024-01-01 18:00:00'
    ends '2038-01-19 03:14:07' --  date limite (bug)
do
	BEGIN
		DECLARE id_status INT;
		DECLARE lineCount INT;
        DECLARE readedLines INT;
        DECLARE getIdEmployee INT;
        DECLARE getIdHours INT;
        DECLARE dateHours DATE;
        
        
		CREATE TEMPORARY TABLE employeeHours (
			id INT AUTO_INCREMENT NOT NULL,
            id_hours INT NOT NULL,
            id_employee INT NOT NULL
        );
    
    
		SET id_status = (SELECT id FROM status WHERE statusType = 'MESSAGE' AND name  LIKE 'N%');
        SET readedLines = 1;
        SET lineCount = (SELECT COUNT(*) FROM employeeHours);
        
        
		INSERT INTO employeeHours (id_hours, id_employee)
        SELECT H.id, E.id FROM hours as H
        LEFT JOIN employee as E ON E.id = H.idEmployee
        INNER JOIN status as S ON S.id = E.idStatus
        WHERE S.statusType = 'HEURES' AND S.name LIKE 'E%';
        
        WHILE readedLines < lineCount DO
			SET getIdEmployee = (SELECT id_employee FROM employeeHours WHERE id = readedLines);
            SET getIdHours = (SELECT id_hours FROM employeeHours WHERE id = readedLines);
            SET dateHours = (SELECT date FROM hours WHERE id = getIdHours);
        
			INSERT INTO message VALUES (
				getIdEmployee,
                id_status,
                now(),
                "HRManager",
                "Heures non validées",
                "Bonjour, vous n'avez pas validé votre journée du " +  CONVERT(dateHours, CHAR) + " . Merci de la validé avant la fin de la semaine. Bonne journée."
			);
            SET readedLines = readedLines + 1;
		END WHILE;
        
        DROP DATABASE employeeHours;
        
    END|
    
    delimiter ;
CREATE DEFINER=`root`@`localhost` PROCEDURE `create_hours_everyday`()
BEGIN
	-- Déclaration des variables
	DECLARE readedLines int;
	DECLARE lineCount int;
    DECLARE id_employee int;   

	-- Création d'une table temporaire pour récupérer tous les id des employés
	CREATE TEMPORARY TABLE T_EMPLOYEE_LIST_TEMP (
		id INT AUTO_INCREMENT,
		id_employee int,
		primary key (id)
	)engine InnoDb;
	
    -- Récupération des employés
	INSERT INTO T_EMPLOYEE_LIST_TEMP (id_employee)
	SELECT id FROM employee;
    
    -- Initialisation des variables
	SET readedLines = 1;
    SET lineCount = (SELECT COUNT(*) FROM T_EMPLOYEE_LIST_TEMP);
    
    -- Tant que la liste des employés n'a pas été entièrement parcourue, les heures sont crées pour chaque employés
    WHILE readedLines < lineCount
    DO
		-- Récupère le premier employé
		SET id_employee = (SELECT id_employee FROM T_EMPLOYEE_LIST_TEMP WHERE id = readedLines);
        
        -- Crée les heures pour cet employé
		INSERT INTO hours (idStatus, idEmployee, hoursNumber, date) VALUES (17, id_employee, '00:00:00', now());
        
        -- On passe à l'employé suivant
        SET readedLines = readedLines + 1;
    END WHILE;
	
    DROP TABLE T_EMPLOYEE_LIST_TEMP;
        
END
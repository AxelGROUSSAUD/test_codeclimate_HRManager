-- DATASET FOR DB
USE employeeManager;

-- insert lines in status TABLE
INSERT INTO status (name, statusType) VALUES ('En poste','EMPLOYEE');
INSERT INTO status (name, statusType) VALUES ('Sortie','EMPLOYEE');
INSERT INTO status (name, statusType) VALUES ('Pas commencé','PROJECT');
INSERT INTO status (name, statusType) VALUES ('En cours','PROJECT');
INSERT INTO status (name, statusType) VALUES ('Bloqué','PROJECT');
INSERT INTO status (name, statusType) VALUES ('Terminé','PROJECT');
INSERT INTO status (name, statusType) VALUES ('En cours','PROJECT');
INSERT INTO status (name, statusType) VALUES ('Pas commencé','TASK');
INSERT INTO status (name, statusType) VALUES ('Bloqué','TASK');
INSERT INTO status (name, statusType) VALUES ('Terminé','TASK');
INSERT INTO status (name, statusType) VALUES ('En cours','TASK');
INSERT INTO status (name, statusType) VALUES ('En attente','LEAVEREQUEST');
INSERT INTO status (name, statusType) VALUES ('Validée','LEAVEREQUEST');
INSERT INTO status (name, statusType) VALUES ('Refusée','LEAVEREQUEST');
INSERT INTO status (name, statusType) VALUES ('Lu','MESSAGE');
INSERT INTO status (name, statusType) VALUES ('Non lu','MESSAGE');
INSERT INTO status (name, statusType) VALUES ('En attente de validation','HEURES');
INSERT INTO status (name, statusType) VALUES ('Validée','HEURES');


-- insert lines in team TABLE
INSERT INTO team (name) VALUES ('MANAGE BDD');
INSERT INTO team (name) VALUES ('ADD FEATURES');
INSERT INTO team (name) VALUES ('INFRA-RESEAU');
INSERT INTO team (name) VALUES ('CODE REVIEWING');
INSERT INTO team (name) VALUES ('FRONT-END');
INSERT INTO team (name) VALUES ('BACK-END');
INSERT INTO team (name) VALUES ('SUPPORT');

-- insert lines in employee TABLE
INSERT INTO employee (idStatus, name, firstName, mail, password, job) VALUES (1, 'GROUSSAUD', 'Axel', 'agroussaud@test.com', '1234', 'Développeur');
INSERT INTO employee (idStatus, name, firstName, mail, password, job) VALUES (1, 'DEMEL', 'Jean', 'jdemel@test.com', '4321', 'Développeur');
INSERT INTO employee (idStatus, name, firstName, mail, password, job) VALUES (2, 'GROBON', 'Samantha', 'sgrobon@test.com', 'password', 'Développeur');
INSERT INTO employee (idStatus, name, firstName, mail, password, job) VALUES (1, 'CHAREF', 'Alicia', 'acharef@test.com', '12345678', 'Développeur');
INSERT INTO employee (idStatus, name, firstName, mail, password, job) VALUES (1, 'HAMIMED', 'Walid', 'whamimed@test.com', '13579', 'Développeur');
INSERT INTO employee (idStatus, name, firstName, mail, password, job) VALUES (1, 'SERAIN', 'Tommy', 'tserain@test.com', 'tommy.serain', 'Développeur');
INSERT INTO employee (idStatus, name, firstName, mail, password, job) VALUES (1, 'ROUSSEL', 'Arthur', 'aroussel@test.com', '246812', 'Développeur');
INSERT INTO employee (idStatus, name, firstName, mail, password, job) VALUES (1, 'KLEIN', 'Paul', 'pklein@test.com', 'POPOPO', 'Développeur');
INSERT INTO employee (idStatus, name, firstName, mail, password, job) VALUES (1, 'NOENS', 'Alexandre', 'anoens@test.com', 'bloup', 'Développeur');
INSERT INTO employee (idStatus, name, firstName, mail, password, job) VALUES (1, 'BENITAH', 'Marie', 'mbenitah@test.com', 'dog', 'Développeur');
INSERT INTO employee (idStatus, name, firstName, mail, password, job) VALUES (1, 'HUET', 'Lois', 'lhuet@test.com', '2ecran', 'Développeur');
INSERT INTO employee (idStatus, name, firstName, mail, password, job) VALUES (2, 'MEZIOU', 'Chems', 'cmeziou@test.com', 'CODE.forever', 'Développeur');


-- insert lines in project TABLE
INSERT INTO project (name, description, startDate, timePassed, comment) VALUES ('Explorateur de fichiers', 'Le but sera d''avoir sera d''avoir une application lourde qui permettra de lister les fichiers et dossiers sur notre machine, de pouvoir naviguer dans ces dossiers et pourquoi pas de pouvoir intéragir avec, en rajoutant/supprimant des dossiers ou fichier, en ouvrant le contenu de certains fichier etc.', NOW(), '00:00:00', null);
INSERT INTO project (name, description, startDate, timePassed, comment) VALUES ('Conception plateforme mise en relation', 'L''objectif du projet sera de faire toute la conception et l''implémentation de la couche data d''une application de mise en relation entre des développeur⋅euses et des porteur⋅euses de projets.', NOW(), '00:00:00', null);
INSERT INTO project (name, description, startDate, timePassed, comment) VALUES ('Jeu de stratégie', 'L''objectif du projet sera de créer un petit jeu de stratégie au tour par tour en utilisant Typescript sans framework', NOW(), '00:00:00', null);
INSERT INTO project (name, description, startDate, timePassed, comment) VALUES ('Appli de partage d''argent', 'L''objectif du projet sera de créer une application front end, en Typescript sans framework, permettant de calculer et partager un budget entre ami.es', NOW(), '00:00:00', null);
INSERT INTO project (name, description, startDate, timePassed, comment) VALUES ('Organisation', 'L''objectif de ce projet est d''organiser les équipes.', NOW(), '00:00:00', null);

-- insert lines in task TABLE
INSERT INTO task (idEmployee, idProject, idStatus, name, description, startDate, endDate, estimatedDuration, progress, timePassed, isAssign, comment) VALUES (null, 1, 10, 'Découverte du projet', 'Comprendre les besoins des clients et apréhender le dev', now(), null, '04:00:00', 0, '00:00:00', false, null);
INSERT INTO task (idEmployee, idProject, idStatus, name, description, startDate, endDate, estimatedDuration, progress, timePassed, isAssign, comment) VALUES (null, 1, 10, 'Réalisation des uses cases', 'Rédiger les uses cases', now(), null, '04:00:00', 0, '00:00:00', false, null);
INSERT INTO task (idEmployee, idProject, idStatus, name, description, startDate, endDate, estimatedDuration, progress, timePassed, isAssign, comment) VALUES (null, 1, 10, 'Architecture et BDD', 'Conception de la BDD', now(), null, '04:00:00', 0, '00:00:00', false, null);
INSERT INTO task (idEmployee, idProject, idStatus, name, description, startDate, endDate, estimatedDuration, progress, timePassed, isAssign, comment) VALUES (null, 1, 10, 'Back-end', 'Réalisation de la partie back-end du projet', now(), null, '04:00:00', 0, '00:00:00', false, null);
INSERT INTO task (idEmployee, idProject, idStatus, name, description, startDate, endDate, estimatedDuration, progress, timePassed, isAssign, comment) VALUES (null, 1, 10, 'front-end', 'Réalisation de la partie front-end du projet', now(), null, '04:00:00', 0, '00:00:00', false, null);
INSERT INTO task (idEmployee, idProject, idStatus, name, description, startDate, endDate, estimatedDuration, progress, timePassed, isAssign, comment) VALUES (null, 1, 10, 'Tests', 'Réalisation des tests de l''application', now(), null, '04:00:00', 0, '00:00:00', false, null);
INSERT INTO task (idEmployee, idProject, idStatus, name, description, startDate, endDate, estimatedDuration, progress, timePassed, isAssign, comment) VALUES (null, 2, 10, 'Découverte du projet', 'Comprendre les besoins des clients et apréhender le dev', now(), null, '04:00:00', 0, '00:00:00', false, null);
INSERT INTO task (idEmployee, idProject, idStatus, name, description, startDate, endDate, estimatedDuration, progress, timePassed, isAssign, comment) VALUES (null, 2, 10, 'Réalisation des uses cases', 'Rédiger les uses cases', now(), null, '04:00:00', 0, '00:00:00', false, null);
INSERT INTO task (idEmployee, idProject, idStatus, name, description, startDate, endDate, estimatedDuration, progress, timePassed, isAssign, comment) VALUES (null, 2, 10, 'Architecture et BDD', 'Conception de la BDD', now(), null, '04:00:00', 0, '00:00:00', false, null);
INSERT INTO task (idEmployee, idProject, idStatus, name, description, startDate, endDate, estimatedDuration, progress, timePassed, isAssign, comment) VALUES (null, 2, 10, 'Back-end', 'Réalisation de la partie back-end du projet', now(), null, '04:00:00', 0, '00:00:00', false, null);
INSERT INTO task (idEmployee, idProject, idStatus, name, description, startDate, endDate, estimatedDuration, progress, timePassed, isAssign, comment) VALUES (null, 2, 10, 'front-end', 'Réalisation de la partie front-end du projet', now(), null, '04:00:00', 0, '00:00:00', false, null);
INSERT INTO task (idEmployee, idProject, idStatus, name, description, startDate, endDate, estimatedDuration, progress, timePassed, isAssign, comment) VALUES (null, 2, 10, 'Tests', 'Réalisation des tests de l''application', now(), null, '04:00:00', 0, '00:00:00', false, null);
INSERT INTO task (idEmployee, idProject, idStatus, name, description, startDate, endDate, estimatedDuration, progress, timePassed, isAssign, comment) VALUES (null, 3, 10, 'Découverte du projet', 'Comprendre les besoins des clients et apréhender le dev', now(), null, '04:00:00', 0, '00:00:00', false, null);
INSERT INTO task (idEmployee, idProject, idStatus, name, description, startDate, endDate, estimatedDuration, progress, timePassed, isAssign, comment) VALUES (null, 3, 10, 'Réalisation des uses cases', 'Rédiger les uses cases', now(), null, '04:00:00', 0, '00:00:00', false, null);
INSERT INTO task (idEmployee, idProject, idStatus, name, description, startDate, endDate, estimatedDuration, progress, timePassed, isAssign, comment) VALUES (null, 3, 10, 'Architecture et BDD', 'Conception de la BDD', now(), null, '04:00:00', 0, '00:00:00', false, null);
INSERT INTO task (idEmployee, idProject, idStatus, name, description, startDate, endDate, estimatedDuration, progress, timePassed, isAssign, comment) VALUES (null, 3, 10, 'Back-end', 'Réalisation de la partie back-end du projet', now(), null, '04:00:00', 0, '00:00:00', false, null);
INSERT INTO task (idEmployee, idProject, idStatus, name, description, startDate, endDate, estimatedDuration, progress, timePassed, isAssign, comment) VALUES (null, 3, 10, 'front-end', 'Réalisation de la partie front-end du projet', now(), null, '04:00:00', 0, '00:00:00', false, null);
INSERT INTO task (idEmployee, idProject, idStatus, name, description, startDate, endDate, estimatedDuration, progress, timePassed, isAssign, comment) VALUES (null, 3, 10, 'Tests', 'Réalisation des tests de l''application', now(), null, '04:00:00', 0, '00:00:00', false, null);
INSERT INTO task (idEmployee, idProject, idStatus, name, description, startDate, endDate, estimatedDuration, progress, timePassed, isAssign, comment) VALUES (null, 4, 10, 'Découverte du projet', 'Comprendre les besoins des clients et apréhender le dev', now(), null, '04:00:00', 0, '00:00:00', false, null);
INSERT INTO task (idEmployee, idProject, idStatus, name, description, startDate, endDate, estimatedDuration, progress, timePassed, isAssign, comment) VALUES (null, 4, 10, 'Réalisation des uses cases', 'Rédiger les uses cases', now(), null, '04:00:00', 0, '00:00:00', false, null);
INSERT INTO task (idEmployee, idProject, idStatus, name, description, startDate, endDate, estimatedDuration, progress, timePassed, isAssign, comment) VALUES (null, 4, 10, 'Architecture et BDD', 'Conception de la BDD', now(), null, '04:00:00', 0, '00:00:00', false, null);
INSERT INTO task (idEmployee, idProject, idStatus, name, description, startDate, endDate, estimatedDuration, progress, timePassed, isAssign, comment) VALUES (null, 4, 10, 'Back-end', 'Réalisation de la partie back-end du projet', now(), null, '04:00:00', 0, '00:00:00', false, null);
INSERT INTO task (idEmployee, idProject, idStatus, name, description, startDate, endDate, estimatedDuration, progress, timePassed, isAssign, comment) VALUES (null, 4, 10, 'front-end', 'Réalisation de la partie front-end du projet', now(), null, '04:00:00', 0, '00:00:00', false, null);
INSERT INTO task (idEmployee, idProject, idStatus, name, description, startDate, endDate, estimatedDuration, progress, timePassed, isAssign, comment) VALUES (null, 4, 10, 'Tests', 'Réalisation des tests de l''application', now(), null, '04:00:00', 0, '00:00:00', false, null);


-- insert lines in hours TABLE
INSERT INTO hours (idStatus, idEmployee, hoursNumber, date) VALUES (18, 1, '08:00:00','2023-12-10');
INSERT INTO hours (idStatus, idEmployee, hoursNumber, date) VALUES (18, 1, '08:00:00','2023-12-11');
INSERT INTO hours (idStatus, idEmployee, hoursNumber, date) VALUES (18, 2, '08:00:00','2023-12-10');
INSERT INTO hours (idStatus, idEmployee, hoursNumber, date) VALUES (18, 2, '08:00:00','2023-12-11');
INSERT INTO hours (idStatus, idEmployee, hoursNumber, date) VALUES (18, 3, '08:00:00','2023-12-10');
INSERT INTO hours (idStatus, idEmployee, hoursNumber, date) VALUES (18, 3, '08:00:00','2023-12-11');
INSERT INTO hours (idStatus, idEmployee, hoursNumber, date) VALUES (18, 4, '08:00:00','2023-12-10');
INSERT INTO hours (idStatus, idEmployee, hoursNumber, date) VALUES (18, 4, '08:00:00','2023-12-11');
INSERT INTO hours (idStatus, idEmployee, hoursNumber, date) VALUES (18, 5, '08:00:00','2023-12-10');
INSERT INTO hours (idStatus, idEmployee, hoursNumber, date) VALUES (18, 5, '08:00:00','2023-12-11');
INSERT INTO hours (idStatus, idEmployee, hoursNumber, date) VALUES (18, 6, '08:00:00','2023-12-10');
INSERT INTO hours (idStatus, idEmployee, hoursNumber, date) VALUES (18, 6, '08:00:00','2023-12-11');
INSERT INTO hours (idStatus, idEmployee, hoursNumber, date) VALUES (18, 7, '08:00:00','2023-12-10');
INSERT INTO hours (idStatus, idEmployee, hoursNumber, date) VALUES (18, 7, '08:00:00','2023-12-11');
INSERT INTO hours (idStatus, idEmployee, hoursNumber, date) VALUES (18, 8, '08:00:00','2023-12-10');
INSERT INTO hours (idStatus, idEmployee, hoursNumber, date) VALUES (18, 8, '08:00:00','2023-12-11');
INSERT INTO hours (idStatus, idEmployee, hoursNumber, date) VALUES (18, 9, '08:00:00','2023-12-10');
INSERT INTO hours (idStatus, idEmployee, hoursNumber, date) VALUES (18, 9, '08:00:00','2023-12-11');
INSERT INTO hours (idStatus, idEmployee, hoursNumber, date) VALUES (18, 10, '08:00:00','2023-12-10');
INSERT INTO hours (idStatus, idEmployee, hoursNumber, date) VALUES (18, 10, '08:00:00','2023-12-11');
INSERT INTO hours (idStatus, idEmployee, hoursNumber, date) VALUES (18, 11, '08:00:00','2023-12-10');
INSERT INTO hours (idStatus, idEmployee, hoursNumber, date) VALUES (18, 11, '08:00:00','2023-12-11');
INSERT INTO hours (idStatus, idEmployee, hoursNumber, date) VALUES (18, 12, '08:00:00','2023-12-10');
INSERT INTO hours (idStatus, idEmployee, hoursNumber, date) VALUES (18, 12, '08:00:00','2023-12-11');


-- insert lines in leaveRequest TABLE
INSERT INTO leaveRequest (idEmployee, idStatus, startDate, endDate, groundsRefusal) VALUES (2, 14, '2027-01-15', '2027-01-15', null);
INSERT INTO leaveRequest (idEmployee, idStatus, startDate, endDate, groundsRefusal) VALUES (6, 14, '2026-08-01', '2026-08-04', null);
INSERT INTO leaveRequest (idEmployee, idStatus, startDate, endDate, groundsRefusal) VALUES (12, 14, '2027-06-23', '2027-06-23', null);

-- insert lines in payslip TABLE
INSERT INTO payslip (idEmployee, date, payslip) VALUES (2, '2023-09-30', 'jd-bulletin de salaire_2023-09-30.pdf');
INSERT INTO payslip (idEmployee, date, payslip) VALUES (2, '2023-10-31', 'jd-bulletin de salaire_2023-10-31.pdf');
INSERT INTO payslip (idEmployee, date, payslip) VALUES (2, '2023-11-30', 'jd-bulletin de salaire_2023-11-31.pdf');
INSERT INTO payslip (idEmployee, date, payslip) VALUES (12, '2023-09-30', 'cm-bulletin de salaire_2023-09-30.pdf');
INSERT INTO payslip (idEmployee, date, payslip) VALUES (12, '2023-10-31', 'cm-bulletin de salaire_2023-10-31.pdf');
INSERT INTO payslip (idEmployee, date, payslip) VALUES (12, '2023-11-30', 'cm-bulletin de salaire_2023-11-31.pdf');

-- insert lines in message TABLE
INSERT INTO message(idEmployee, idStatus, date, author, title, message) VALUES (1, 18, NOW(), 'Tommy SERAIN', 'Nouvelle tâche assigné', 'La tâche "Réalisation des entités" vous a été assigné.');

-- insert lines in employeeMessage TABLE
-- INSERT INTO employeeTeam (idEmployee, idTeam) VALUES (1, 6);
-- INSERT INTO employeeTeam (idEmployee, idTeam) VALUES (2, 6);
-- INSERT INTO employeeTeam (idEmployee, idTeam) VALUES (4, 6);
-- INSERT INTO employeeTeam (idEmployee, idTeam) VALUES (5, 6);
-- INSERT INTO employeeTeam (idEmployee, idTeam) VALUES (6, 6);
-- INSERT INTO employeeTeam (idEmployee, idTeam) VALUES (7, 5);
-- INSERT INTO employeeTeam (idEmployee, idTeam) VALUES (8, 5);
-- INSERT INTO employeeTeam (idEmployee, idTeam) VALUES (9, 5);
-- INSERT INTO employeeTeam (idEmployee, idTeam) VALUES (10, 5);


-- insert lines in taskHours TABLE
INSERT INTO taskHours (idTask, idHours, timePassedToday) VALUES (2, 1, '08:00:00');
INSERT INTO taskHours (idTask, idHours, timePassedToday) VALUES (2, 2, '08:00:00');
INSERT INTO taskHours (idTask, idHours, timePassedToday) VALUES (2, 3, '08:00:00');
INSERT INTO taskHours (idTask, idHours, timePassedToday) VALUES (2, 4, '08:00:00');
INSERT INTO taskHours (idTask, idHours, timePassedToday) VALUES (2, 5, '08:00:00');
INSERT INTO taskHours (idTask, idHours, timePassedToday) VALUES (2, 6, '08:00:00');
INSERT INTO taskHours (idTask, idHours, timePassedToday) VALUES (2, 7, '08:00:00');
INSERT INTO taskHours (idTask, idHours, timePassedToday) VALUES (2, 8, '08:00:00');
INSERT INTO taskHours (idTask, idHours, timePassedToday) VALUES (2, 9, '08:00:00');
INSERT INTO taskHours (idTask, idHours, timePassedToday) VALUES (2, 10, '08:00:00');
INSERT INTO taskHours (idTask, idHours, timePassedToday) VALUES (2, 11, '08:00:00');
INSERT INTO taskHours (idTask, idHours, timePassedToday) VALUES (2, 12, '08:00:00');
INSERT INTO taskHours (idTask, idHours, timePassedToday) VALUES (2, 13, '08:00:00');
INSERT INTO taskHours (idTask, idHours, timePassedToday) VALUES (2, 14, '08:00:00');
INSERT INTO taskHours (idTask, idHours, timePassedToday) VALUES (2, 15, '08:00:00');
INSERT INTO taskHours (idTask, idHours, timePassedToday) VALUES (2, 16, '08:00:00');
INSERT INTO taskHours (idTask, idHours, timePassedToday) VALUES (2, 17, '08:00:00');
INSERT INTO taskHours (idTask, idHours, timePassedToday) VALUES (2, 18, '08:00:00');
INSERT INTO taskHours (idTask, idHours, timePassedToday) VALUES (2, 19, '08:00:00');
INSERT INTO taskHours (idTask, idHours, timePassedToday) VALUES (2, 20, '08:00:00');
INSERT INTO taskHours (idTask, idHours, timePassedToday) VALUES (2, 21, '08:00:00');
INSERT INTO taskHours (idTask, idHours, timePassedToday) VALUES (2, 22, '08:00:00');
INSERT INTO taskHours (idTask, idHours, timePassedToday) VALUES (2, 23, '08:00:00');
INSERT INTO taskHours (idTask, idHours, timePassedToday) VALUES (2, 24, '08:00:00');















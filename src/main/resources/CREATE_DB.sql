-- Création de la BDD
DROP DATABASE IF EXISTS employeeManager;
CREATE DATABASE employeeManager;
USE employeeManager;

-- Création de la table Status
CREATE TABLE status(
id INT AUTO_INCREMENT NOT NULL,
name VARCHAR(40) NULL,
statusType VARCHAR(30) NULL,
PRIMARY KEY (id)
)engine InnoDB;

-- Création de la table Team
CREATE TABLE team(
id INT AUTO_INCREMENT NOT NULL,
name VARCHAR(30) NULL,
PRIMARY KEY (id)
) engine InnoDB;

-- Création de la table Employé
CREATE TABLE employee(
id INT AUTO_INCREMENT NOT NULL,
idStatus INT NOT NULL,
name VARCHAR(30) NULL,
firstName VARCHAR(30) NULL,
mail VARCHAR(255) NULL,
password VARCHAR(50) NULL,
job VARCHAR(30) NULL,
PRIMARY KEY (id),
FOREIGN KEY (idStatus) REFERENCES status(id)
) engine InnoDB;

-- Création de la table Projet
CREATE TABLE project(
id INT AUTO_INCREMENT NOT NULL,
name VARCHAR(255) NULL,
description TEXT NULL,
startDate DATE NULL,
timePassed TIME NULL,
comment TEXT NULL,
PRIMARY KEY (id)
) engine InnoDB;


-- Création de la table Tâche
CREATE TABLE task(
id INT AUTO_INCREMENT NOT NULL,
idEmployee INT NULL,
idProject INT NOT NULL,
idStatus INT NOT NULL,
name VARCHAR(30) NULL,
description VARCHAR(255) NULL,
startDate DATE NULL,
endDate DATE NULL,
estimatedDuration TIME NULL,
progress INT NULL,
timePassed TIME NULL,
isAssign BOOLEAN NULL,
comment TEXT NULL,
PRIMARY KEY (id),
FOREIGN KEY (idEmployee) REFERENCES employee(id),
FOREIGN KEY (idProject) REFERENCES project(id),
FOREIGN KEY (idStatus) REFERENCES status(id)
)engine InnoDB;


-- Création de la table Heures
CREATE TABLE hours(
id INT AUTO_INCREMENT NOT NULL,
idStatus INT NOT NULL,
idEmployee INT NOT NULL,
hoursNumber TIME NULL,
date DATE NULL,
PRIMARY KEY (id),
FOREIGN KEY (idEmployee) REFERENCES employee(id),
FOREIGN KEY (idStatus) REFERENCES status(id)
)engine InnoDB;


-- Création de la table Demandes de congés
CREATE TABLE leaveRequest(
id INT AUTO_INCREMENT NOT NULL,
idEmployee INT NOT NULL,
idStatus INT NOT NULL,
startDate DATE NULL,
endDate DATE NULL,
groundsRefusal TEXT NULL,
PRIMARY KEY (id),
FOREIGN KEY (idEmployee) REFERENCES employee(id),
FOREIGN KEY (idStatus) REFERENCES status(id)
)engine InnoDB;


-- Création de la table Fiche de paie
CREATE TABLE payslip(
id INT AUTO_INCREMENT NOT NULL,
idEmployee INT NULL,
date DATE NULL,
payslip VARCHAR(255) NULL,
PRIMARY KEY (id),
FOREIGN KEY (idEmployee) REFERENCES employee(id)
)engine InnoDB;

-- Création de la table Message pour la messagerie
CREATE TABLE message(
id INT AUTO_INCREMENT NOT NULL,
idEmployee INT NOT NULL,
idStatus INT NOT NULL,
date DATETIME NOT NULL,
author VARCHAR(30) NOT NULL,
title VARCHAR(100) NULL,
message TEXT NULL,
PRIMARY KEY (id),
FOREIGN KEY (idEmployee) REFERENCES employee(id),
FOREIGN KEY(idStatus) REFERENCES status(id)
)engine InnoDB;

-- Création des tables de liaison

-- Création de la table de liaison pour les employés et les messages
-- CREATE TABLE employeeMessage(
-- id INT AUTO_INCREMENT NOT NULL,
-- idEmployee INT NOT NULL,
-- idMessage INT NOT NULL,
-- PRIMARY KEY (id),
-- FOREIGN KEY (idEmployee) REFERENCES employee(id),
-- FOREIGN KEY (idMessage) REFERENCES message(id)
-- ) engine InnoDB;

-- Création de la table de liaison pour les employés et les équipes
CREATE TABLE employeeTeam(
id INT AUTO_INCREMENT NOT NULL,
idEmployee INT NOT NULL,
idTeam INT NOT NULL,
PRIMARY KEY (id),
FOREIGN KEY (idEmployee) REFERENCES employee(id),
FOREIGN KEY (idTeam) REFERENCES team(id)
)engine InnoDB;

-- Création de la table de liaison pour les heures et les tâches
CREATE TABLE taskHours (
id INT AUTO_INCREMENT NOT NULL,
idTask INT NOT NULL,
idHours INT NOT NULL,
timePassedToday TIME NOT NULL,
PRIMARY KEY (id),
FOREIGN KEY (idTask) REFERENCES task(id),
FOREIGN KEY (idHours) REFERENCES hours(id)
)engine InnoDB;
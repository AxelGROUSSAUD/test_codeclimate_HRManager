-- DATASET FOR DBTEST
USE employeeManagerTEST;

-- insert lines in team TABLE
INSERT INTO team
SELECT id
, idStatus
, name
FROM employeemanager.team;

-- insert lines in status TABLE
INSERT INTO status
SELECT id
, name
, statusType
FROM employeemanager.status;

-- insert lines in employee TABLE
INSERT INTO employee
SELECT id
, idStatus
, name
, firstName
, mail
, password
, job
FROM employeemanager.employee;

-- insert lines in project TABLE
INSERT INTO project
SELECT id
, name
, description
, startDate
, timePassed
, comment
FROM employeemanager.project;

-- insert lines in task TABLE
INSERT INTO task
SELECT id
, idEmployee
, idProject
, idStatus
, name
, description
, startDate
, endDate
, estimatedDuration
, progress
, timePassed
, isAssign
, comment
FROM employeemanager.task;

-- insert lines in hours TABLE
INSERT INTO hours
SELECT id
, idStatus
, idEmployee
, hoursNumber
, date
FROM employeemanager.hours;

-- insert lines in leaveRequest TABLE
INSERT INTO leaveRequest
SELECT id
, idEmployee
, idStatus
, startDate
, endDate
, groundsRefusal
FROM employeemanager.leaverequest;

-- insert lines in payslip TABLE
INSERT INTO payslip
SELECT id
, idEmployee
, date
, payslip
FROM employeemanager.payslip;

-- insert lines in message TABLE
INSERT INTO message
SELECT id
, idEmployee
, idStatus
, date
, author
, title
, message
FROM employeemanager.message;

-- insert lines in employeeMessage TABLE
-- INSERT INTO employeeMessage
-- SELECT id
-- , idEmployee
-- , idMessage
-- FROM employeemanager.employeeMessage

-- insert lines in employeeTeam
INSERT INTO employeeTeam
SELECT id
, idEmployee
, idTeam
FROM employeemanager.employeeTeam


-- insert lines in taskHours
INSERT INTO taskHours
SELECT id
, idTask
, idHours
, timePassedToday
FROM employeemanager.taskHours



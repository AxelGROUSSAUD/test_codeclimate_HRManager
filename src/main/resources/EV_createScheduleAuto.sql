USE employeemanager;

create event createScheduleAuto
	on schedule every '1' day
    starts '2024-01-01 18:00:00'
    ends '2038-01-19 03:14:07' --  date limite (bug)
    do
		call create_hours_everyday();
        
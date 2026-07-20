select 
    case
        WHEN id = (select MAX(id) from Seat) and id % 2 = 1
            THEN id
        WHEN id % 2 = 1
            THEN id + 1
        WHEN id % 2 = 0
            THEN id - 1    
    END AS id,
    student

FROM Seat
order by id

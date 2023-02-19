SELECT * FROM homework;

SELECT * FROM lesson
    INNER JOIN  homework h on h.id = lesson.homework_id;

SELECT * FROM lesson
    INNER JOIN  homework h on h.id = lesson.homework_id
ORDER BY lesson."updateAt";

SELECT * FROM shedule
    INNER JOIN lesson ON shedule.id = lesson.shedule_id;

SELECT count(*) as lessons_total
FROM shedule
    INNER JOIN lesson ON shedule.id = lesson.shedule_id
GROUP BY shedule_id;


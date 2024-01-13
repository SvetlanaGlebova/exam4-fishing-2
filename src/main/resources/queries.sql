INSERT INTO FishingBoat (name, type, displacement, buildDate)
VALUES ('Судно_2', 'Тип_1', 100.5,
'2022-01-01');
INSERT INTO FishingBoat (name, type, displacement, buildDate) VALUES ('Судно_1', 'Тип_1', 100.5, '2022-01-01');
INSERT INTO FishingBoat (name, type, displacement, buildDate) VALUES ('Лодка', 'Тип_2', 50.3, '2023-02-13');
INSERT INTO FishingBoat (name, type, displacement, buildDate) VALUES ('Катер', 'Тип_3', 70,8, '2021-11-15');
INSERT INTO FishingBoat (name, type, displacement, buildDate) VALUES ('Траулер', 'Тип_4', 150.0, '2020-10-05');

//даты выхода в море для каждого катера с указанием улова
SELECT b.name, t.departure_date, fc.fish_type, fc.quantity, fc.quality FROM FishingBoat b
JOIN FishingBoatt ON b.id = t.boat_id
JOIN FishCatch fc ON t.id = fc.trip_id;

//количество рейсов для каждого катера
SELECT b.name, COUNT(t.id) AS trip_count FROM FishingTrip t ON b.id = t.boat_id GROUP BY b.id;

//список катеров, которые получили улов выше заданного значения
SELECT b.name, fc.fish_type, fc.quantity, fc.quality FROM FishingBoat b
JOIN FishingTrip t ON b.id = t.boat_id
JOIN FishCatch fc ON t.id = fc.trip_id
WHERE fc.quantity > 10;

//список сортов рыбы и для каждого сорта список рейсов с указанием даты выхода и возвращения, количества улова
SELECT fc.fish_type, t.departure_date, t.return_date, fc.quantity
FROM FishCatch fc JOIN FishingTrip t ON fc.trip_id = t.id;

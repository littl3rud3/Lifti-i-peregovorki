# Lifti-i-peregovorki
У Кати насыщенный день на работе. Ей надо передать п разных договоров коллегам. Все встречи происходят на разных этажах, а между этажами можно перемещаться только по лестничным пролетам — считается, что это улучшает физическую форму сотрудников. Прохождение каждого пролёта занимает ровно 1 минуту.

Сейчас Катя на парковочном этаже, планирует свой мершрут. Коллег можно посетить в любом порядке, но один из них покинет офис через t минут. С парковочного этажа лестницы нет — только лифт, на котором можно подняться на любой этаж.

В итоге план Кати следующий:

1. Подняться на лифте на произвольный этаж. Считается, что лифт поднимается на любой этаж за О минут.

2. Передать всем коллегам договоры, перемещаясь между этажами по лестнице. Считается, что договоры на этаже передаются мгновенно.

3. В первые t минут передать договор тому коллеге, который планирует уйти.

4. Пройти минимальное количество лестичных пролетов.

Помогите Кате выполнить все пункты ее плана

Формат входных данных

В первой строке вводятся целые положительные числа n и t (2 <= n, t <= 100) -- количество сотрудников и время, когда один из сотрудников покинет офис (в минутах). В следующей строке n чисел — номера этажей, на которых находятся сотрудники. Все числа различны и по абсолютной величине не превосходят 100. Номера этажей даны в порядке возрастания. В следующей строке записан номер сотрудника, который уйдет через t минут.

Формат результата

Выведите одно число — минимально возможное число лестничных пролетов, которое понадобится пройти Кате.

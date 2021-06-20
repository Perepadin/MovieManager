<h1>Домашнее задание к занятию «Композиция и зависимость объектов. Mockito при создании автотестов» </h1>

В качестве результата пришлите ссылки на ваши GitHub-проекты в личном кабинете студента на сайте netology.ru.

<h2>Задача №1 - "Менеджер Афиши"</h2>

<h3>Легенда</h3>
На основе проекта с лекции необходимо реализовать менеджер Афиши 
(все фильмы хранятся внутри самого менеджера в массиве, без всякого репозитория):


![Афиша](https://github.com/netology-code/javaqa-homeworks/blob/master/dependency/pic/afisha.png?raw=true)

<h3>Какие методы должны быть у менеджера?</h3>

Добавить фильм в ленту (класс фильма напишите сами по аналогии с лекции).
Выдать последние 10 добавленных фильмов* (фильмы выдаются в обратном порядке, т.е. первым в массиве результатов будет тот, который был добавлен последним).
Примечание*: если фильмов меньше 10, то выдаёте столько, сколько есть.

Сделайте так, чтобы по умолчанию выводилось последние 10 добавленных фильмов, но при создании менеджера можно было указать другое число, чтобы, например, выдавать 5 (а не 10). Т.е. у вас у менеджера должно быть два конструктора: один без параметров, выставляющий лимит менеджера в 10, а другой с параметром, берущий значение лимита для менеджера из параметра конструктора.

Метод получения последних фильмов будет очень похож на тот что был в лекции. 
Основное отличие будет в том, что вам в его начале надо будет вычислить правильный ожидаемый размер 
результирующего массива-ответа, а не просто брать длину массива что лежит в поле; 

Сделать это можно заведя целочисленную переменную в которую вы сохраните желаемый размер создаваемого массива, 
вычислите с помощью условных операторов для неё значение, а затем только создадите массив указав эту переменную как требуемый для него размер, например:

...
??? resultLength;

if ??? {

resultLength = ???

} else {

resultLength = ???

}

??? result = new ???[resultLength];

for (???) {

// заполняем result из массива что лежит в поле

// в обратном порядке

}
...

Не забывайте про использование отладчика для поиска проблем вашей реализации если тесты проходить не будут.

Напишите необходимые, с вашей точки зрения, автотесты на различные состояния менеджера (можно их делать не в одном файле).

**Требования к проекту:**

1. Подключите плагин Surefire так, чтобы сборка падала в случае отсутствия тестов.
1. Подключите плагин JaCoCo в режиме генерации отчётов (обрушать сборку по покрытию не нужно).
1. Реализуйте нужные классы и методы.
1. Напишите автотесты на методы, содержащие логику, добившись 100% покрытия по branch'ам.
1. Подключите CI на базе Github Actions и выложите всё на Github.

**Как делать:**

1. Берёте код с лекции
1. Заливаете в свой репозиторий
1. Делаете новую ветку
1. В новой ветке делаете все изменения (Surefire, JaCoCo, методы, автотесты, CI)
1. Делаете Pull Request из этой ветки к своему же репозиторию

**Итого: у вас должен быть репозиторий на GitHub, в котором расположен ваш Java-код и Pull Request.**
# Автоматизация сайта Wildberries
![wb](https://github.com/nice58/project/assets/103956147/dde0288b-cfcb-4c76-bb9d-ef1d6d61558b)

## :bookmark_tabs: Содержание:
+ [Стек технологий](#Стек-технологий)
+ [Реализованные проверки](#Реализованные-проверки)
+ [Команды запуска автотестов](#Команды-запуска-автотестов)
+ [Сборка в Jenkins](#Сборка-в-Jenkins)
+ [Пример Allure-отчета](#Пример-Allure-отчета)
+ [Уведомление в Telegram о результатах прохождения тестов](#Уведомление-в-Telegram-о-результатах-прохождения-тестов)
+ [Видеопример прохождения тестов](#Видеопример-прохождения-тестов)
  
### :wrench: ***Стек технологий***
<p>
<img width="5%" title="IntelliJ IDEA" src="img/idea.svg">
<img width="5%" title="Java" src="img/java.svg">
<img width="5%" title="Selenide" src="img/selenide.svg">
<img width="5%" title="Selenoid" src="img/selenoid.svg">
<img width="5%" title="Allure Report" src="img/allureReport.svg">
<img width="5%" title="Gradle" src="img/gradle.svg">
<img width="5%" title="JUnit5" src="img/junit5.svg">
<img width="5%" title="GitHub" src="img/github.svg">
<img width="5%" title="Jenkins" src="img/jenkins.svg">
<img width="5%" title="Telegram" src="img/telegram.svg">
</p>

### :ballot_box_with_check: ***Реализованные проверки***
- Корректность открытия главной страницы
- Открытие чата с поддержкой
- Выполнение поиска товара через строку поиска на главной странице
- Добавление товара в корзину
- Удаление товара из корзины

### :arrows_clockwise: ***Запуск автотестов***
Команда запуска тестов из терминала
```bash
gradle clean test
```
Параметры запуска в Jenkins
```bash
clean
test
-DremoteUrl=${REMOTE_URL}
-Dbrowser=${BROWSER}
-DbrowserVersion=${BROWSER_VERSION}
-DbrowserSize=${BROWSER_SIZE}
```
, где
- REMOTE_URL- адрес удаленного сервера, на котором будут запускаться тесты,
- BROWSER - выбранный браузер,
- BROWSER_VERSION - версия выбранного браузера,
- BROWSER_SIZE - размер открываемого окна браузера, в котором будут выполняться тесты

### :large_blue_circle: ***Сборка в Jenkins***
<kbd> ![image](https://github.com/nice58/project/assets/103956147/cea91215-d48b-476f-8a1a-ee780dca6db0)</kbd>

### :large_blue_circle: ***Пример Allure-отчета***
<kbd>![Screenshot_193](https://github.com/nice58/project/assets/103956147/4a2cc9d0-e9c5-4030-8ee5-6f36102ee604)</kbd>

### :large_blue_circle: ***Уведомление в Telegram о результатах прохождения тестов***
<kbd>![image](https://github.com/nice58/project/assets/103956147/70928dce-b714-474c-951e-3a9884c7ffea)</kbd>

### :large_blue_circle: ***Видеопример прохождения тестов***
![video](https://github.com/nice58/project/assets/103956147/fa000c70-458f-40e9-bb76-aa269e9fcc14)





















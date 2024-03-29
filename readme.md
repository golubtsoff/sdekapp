# Пример приложения "Курьерская доставка"

## Постановка задачи
**Проблема**: Курьер едет вручать груз. И ему внезапно потребовалось сообщить клиенту, что
он сегодня не приедет.  
Курьер за рулем и ему неудобно звонить клиенту и договариваться о новом времени приезда.

**Предлагаемое решение**:   
Курьеру нужно оповестить Call-центр в “один клик”, чтобы они
позвонили клиенту и договорились о новой дате и времени доставки.

**Техническое задание**:    
Сделать сервис для курьера, чтобы добавлять задания в Call-центр.    
Для этого нужно сделать:
Web-интерфейс для курьера, где он указывает номер заказа и нажимает кнопку “Не успеваю”.
При нажатии добавляется новое задание для call-центра в БД.     

Web-интерфейс для оператора call-центра: Список заданий для прозвона клиентов.      
Должна быть таблица с колонками:
Номер заказа,
Дата и Время добавления задания.
Также должен быть фильтр или поиск “по номеру заказа”.

## Функциональность приложения
Приложение предназначено для обработки задач курьеров и операторов Call-центра.
Для хранения контактов используется база данных MySQL.

## Используемые технологии
**JavaSE 8, Spring (spring-boot, spring-security), Thymeleaf, MySQL, Maven, Git.**  

## Сборка и запуск программы 
Сборка и запуск приложения на локальной машине осуществляется, как обычное приложение (используется встроенный контейнер сервлетов Tomcat из Spring-boot).  
Предварительно нужно настроить базу данных для работы. Дамп базы данных находится в папке base_dump.
Настройки доступа к базе данных находятся в файле '*/resourses/application.properties*'.    
После запуска приложения доступ к нему можно получить по адресу: http://localhost:8080.
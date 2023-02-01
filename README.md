
Установка JDK, Ubuntu:

`sudo apt update`

`sudo apt install openjdk-17-jdk`

`sudo update-alternatives --config java`

Донастроить локали:

`apt-get install --reinstall locales && sudo dpkg-reconfigure locales`

`dpkg-reconfigure locales`

Команда строится по принципу: 

`./gradlew` запускает тесты, вытягивая актуальные изменения из репозитория. Дополнительные команды выполняются на текущей версии.

`./gradlew clean test --tests api*` запускает тесты в пакете api

`./gradlew clean test --tests api.CashTest` запускает все тесты в классе CashTest пакета api.

`./gradlew clean test --tests api.Errors.createCashTransferDeclineByBankTest` запускает конкретный тест из пакета api и класса CashTest

`./gradlew clean test --tests *.Errors` запускает все тесты Errors из всех пакетов.

`./gradlew allureServe` - сгенерирует отчет, и запустит браузер с этим отчетом.

После прогона тестов сгенерируется отчет:`/build/reports/tests/test/index.html`

Если установить Allure CommandLine, то можно генерировать более подробный отчет следующим набором команд:
`cd ./build; allure serve`

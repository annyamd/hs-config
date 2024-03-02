# Config Server
## Как запустить

1. Добавить файл `.env` в директорию `hs-config`
    
   (он содержит токен доступа к приватному репозиторию, попросите меня, я скину)

   ```
    APP_PORT=______ (8888)
    GIT_URL=______
    GIT_USER=______
    GIT_TOKEN=______
   ```

2. Собираем jar архив с приложением:

   ``mvn clean package``

3. Пересоздаём ***образ*** и запускаем контейнер*

   ``docker-compose up --build``

* предварительно должна быть создана docker сеть `hls-lab-network`
   для взаимодействия сервисов приложения:

    docker create network hls-lab-network

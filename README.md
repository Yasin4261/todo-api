# Todo API

Bu proje, kullanıcıların yapılacaklar listelerini yönetmelerini sağlar.

## Özellikler

- Kullanıcılar oluşturma, güncelleme ve silme
- Todo'lar oluşturma, güncelleme ve silme
- Todo'ları listeleme
- Swagger UI ile API belgeleri

### Gereksinimler

- Java 17+
- Spring Boot 3.x
- MySQL
- Maven
- Docker (Opsiyonel)

## Kurulum

1. Depoyu klonlayın:

    ```bash
    git clone git@github.com:Yasin4261/todo-api.git
    ```

2. Proje dizinine gidin:

    ```bash
    cd todo-api
    ```

3. Bağımlılıkları yükleyin:

    ```bash
    ./mvnw install
    ```

4. Docker ile veritabanı başlatın:

   ```bash
   docker run --name todo-mysql -e MYSQL_ROOT_PASSWORD=root -e MYSQL_DATABASE=todo_api -p 3306:3306 -d mysql:latest
   ```

5. Uygulamayı çalıştırın:

    ```bash
    ./mvnw spring-boot:run
    ```

## Swagger UI

API'lerinizi [Swagger UI](http://localhost:8080/swagger-ui.html) üzerinden görüntüleyebilirsiniz.

## Katkıda Bulunanlar

- [Yasin](https://github.com/Yasin4261)

## Lisans

Bu proje MIT Lisansı altında lisanslanmıştır. Detaylar için [LICENSE](LICENSE) dosyasına bakın.



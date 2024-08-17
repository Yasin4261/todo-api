# Todo API

Bu proje, kullanıcıların kişisel "Yapılacaklar Listesi" (Todo List) oluşturmasını, yönetmesini ve paylaşmasını sağlayan bir RESTful API'dir. API, Spring Boot kullanılarak geliştirilmiştir ve MySQL veritabanı ile çalışır.

## Özellikler

- Kullanıcı kaydı ve kimlik doğrulama
- Kullanıcı bazında Todo ekleme, listeleme, güncelleme ve silme
- JSON formatında veri alışverişi
- Hata yönetimi ve uygun HTTP durum kodları ile yanıtlar
- Döngüsel referans sorunlarını önlemek için `@JsonIgnore` anotasyonu kullanımı

## Kurulum

### Gereksinimler

- Java 17+
- Spring Boot 3.x
- MySQL
- Maven
- Docker (Opsiyonel)

### Projeyi Klonlama

```bash
git clone https://github.com/kullanici-adi/todo-api.git
cd todo-api

docker run --name todo-mysql -e MYSQL_ROOT_PASSWORD=root -e MYSQL_DATABASE=todo_api -p 3306:3306 -d mysql:latest

mvn clean install
mvn spring-boot:run
```

### Swagger

```http
http://localhost:8080/swagger-ui/index.html#/
```
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
    git clone https://github.com/kullanici-adi/todo-api.git
    ```

2. Proje dizinine gidin:

    ```bash
    cd todo-api
    ```

3. Bağımlılıkları yükleyin:

    ```bash
    ./mvnw install
    ```

4. Uygulamayı çalıştırın:

    ```bash
    ./mvnw spring-boot:run
    ```

## Swagger UI

API'lerinizi [Swagger UI](http://localhost:8080/swagger-ui.html) üzerinden görüntüleyebilirsiniz.

## API Kullanımı

- `POST /api/users`: Kullanıcı oluşturur.
- `GET /api/users`: Kullanıcıları listeler.
- `POST /api/todos`: Todo oluşturur.
- `GET /api/todos`: Todo'ları listeler.

## Katkıda Bulunanlar

- [Adınız](https://github.com/kullanici-adi)

## Lisans

Bu proje MIT Lisansı altında lisanslanmıştır. Detaylar için [LICENSE](LICENSE) dosyasına bakın.



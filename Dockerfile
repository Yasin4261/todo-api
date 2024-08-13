FROM openjdk:17-jdk-slim

# Uygulama dosyalarını /app dizinine kopyalayın
WORKDIR /app

# Jar dosyasını /app dizinine kopyalayın
COPY target/todoApi-0.0.1-SNAPSHOT.jar app.jar

# Jar dosyasını çalıştırmak için entrypoint belirtin
ENTRYPOINT ["java", "-jar", "app.jar"]

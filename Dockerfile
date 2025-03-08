FROM adoptopenjdk/openjdk11:alpine

# Copiar el archivo JAR generado al contenedor
COPY build/libs/opentelemetry-0.0.1-SNAPSHOT.jar opentelemetry.jar

# Exponer el puerto 8080
EXPOSE 8080

# Configurar el punto de entrada para ejecutar el JAR
ENTRYPOINT ["java", "-jar", "/opentelemetry.jar"]

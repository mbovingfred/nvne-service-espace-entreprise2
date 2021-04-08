FROM openjdk:8-jdk-alpine
VOLUME /tmp

# Creation du répertoire de stockage des téléchargements
RUN mkdir /root/upload
# RUN mkdir /root/upload/cv

# Adding backend to container
ADD target/service-espace-entreprise*.jar /app.jar

CMD [ "java", "-Dspring.profiles.active=prod", "-jar", "/app.jar" ]

# Exposing container port for binding with host
EXPOSE 8081
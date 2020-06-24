FROM openjdk:8-jre
# Java variables
ENV JAVA_HOME /usr/lib/jvm/java-8-openjdk-amd64
ENV PATH $PATH:$JAVA_HOME/bin
# Time variables
ENV TIME_ZONE America/Sao_Paulo
ENV TZ=$TIME_ZONE
# Time configuration
RUN ln -snf /usr/share/zoneinfo/$TZ /etc/localtime && echo $TZ > /etc/timezone
RUN dpkg-reconfigure -f noninteractive tzdata
# App
CMD mkdir /app
COPY target/*.jar /app/app.jar
# Ports exposing
EXPOSE 8080
# Entry
CMD java ${JAVA_OPTS} -jar /app/app.jar
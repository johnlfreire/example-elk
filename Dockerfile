FROM openjdk:11

ARG PROFILE
ARG ADDITIONAL_OPTS

ENV PROFILE=${PROFILE}
ENV ADDITIONAL_OPTS=${ADDITIONAL_OPTS}

WORKDIR /usr/app

COPY /target/example*.jar spring_boot_com_mysql.jar

SHELL ["/bin/sh", "-c"]

EXPOSE 8080

CMD java ${ADDITIONAL_OPTS} -jar spring_boot_com_mysql.jar --spring.profiles.active=${PROFILE}
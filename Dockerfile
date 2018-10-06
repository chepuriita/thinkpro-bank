FROM frolvlad/alpine-oraclejdk8:slim
VOLUME /tmp
ADD target/thinkpro-bank-0.0.1-SNAPSHOT.jar thinkpro-bank.jar
RUN sh -c 'touch /thinkpro-bank.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/thinkpro-bank.jar"]
EXPOSE 9090

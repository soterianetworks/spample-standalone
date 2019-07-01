FROM clouthinkin/jdk as builder

LABEL maintainer="developer@soterianetworks.com"

RUN mkdir -p /code

ADD ./backend /code

WORKDIR /code

RUN cd /code && chmod +x gradlew && ./gradlew clean build -x test

# final stage
FROM clouthinkin/jdk

LABEL maintainer="developer@soterianetworks.com"

COPY backend/spmanaged/docker/docker-entrypoint.sh /

COPY --from=builder /code/spmanaged/build/libs/spmanaged-1.0.0-SNAPSHOT.jar /spmanaged-1.0.0-SNAPSHOT.jar

RUN chmod +x /*.sh

EXPOSE 80

WORKDIR /
ENTRYPOINT /docker-entrypoint.sh

HEALTHCHECK --interval=15s --timeout=6s --retries=12 \
            CMD nc -v -z -w 3 localhost 80 || exit 1

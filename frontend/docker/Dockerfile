#build stage
FROM node:8 as builder

RUN mkdir -p /code

ARG BUILD_TYPE=build

ADD frontend/ /code/ui/

RUN cd /code/ui && \
    npm install && \
    npm run $BUILD_TYPE && \
# verify status
   test -f /code/ui/dist/index.html

# final stage
FROM nginx:alpine

LABEL maintainer="developer@soterianetworks.com"

RUN mkdir -p /usr/share/nginx/html

ADD ./frontend/docker/etc/nginx/ /etc/nginx/

COPY ./frontend/docker/scripts/docker-entrypoint.sh /
COPY --from=builder /code/ui/dist/ /usr/share/nginx/html/

RUN chmod +x /*.sh

WORKDIR /

EXPOSE 80 443

VOLUME ["/usr/share/nginx/html/"]

ENTRYPOINT /docker-entrypoint.sh

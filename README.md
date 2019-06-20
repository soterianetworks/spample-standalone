# Overview 

The sample to show how a standalone SP is working with CIP.

# Features

Menu | Feature | Description
---|---|---
Welcome | Show Components Usage | 
CIP |  Current User Profile | Data from CIP service
SP | Current User Profile | SP Spring Security Context
Machines | Machine CRUD | 

# Getting Started

> First , please ask for a demo user and create the OAuth2 Application for the sample in CIP. 
> For example :

Key | Value
---|---
Client Id | spample-standalone
Client Secret | 
OAuth2 Grant Type | Implicit
Default Scope for Implicit | default-spample-standalone-scope
Redirect UI | http:127.0.0.1:4200


## Configure the backend 

> backend/src/main/resources/application-development.yml

```yml
spase.client:
  gatewayHost: get_address_from_CIP_provider
```

## Configure the frontend

> frontend/src/proxy.conf.json

```json
    "/gateway/*": {
        "target": "get_address_from_CIP_provider",
        "secure": true,
        "logLevel": "debug",
        "changeOrigin": true
    }
```

> frontend/src/environments/environment.ts

```json
    CIP_HOST: "get_address_from_CIP_provider",
    CLIENT_ID: "spample-standalone",
    SCOPE: "default-spample-standalone-scope",
```

## Start the server

1. redis

```shell
cd env
docker-compose up -d
```

1. backend

```shell
cd backend
gradle clean bootRun -PjvmArgs="-Dspring.profiles.active=development"
```


2. frontend

```shell
cd frontend
npm install
npm start
```

## Show cases

1. Open Chrome browser, visit the url http://127.0.0.1:4200 , it will jump to CIP host to do SSO login.
2. Complete SSO Login at CIP host , and it will redirect back to http://127.0.0.1:4200 
3. Now you can take the show cases
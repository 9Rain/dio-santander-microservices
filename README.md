# Airport Demo Microservices Project

This is a simple microservice architecture project, developed as part of Santander Bootcamp Fullstack, based on the [project](https://github.com/oswaldoneto/dio-experts) built by Oswaldo Neto, during the classes.

## Customization

The original project has 2 microservices: product catalog and shoping cart. This one was built considering an airport as example. So I replaced both of the original microservices by other 3: airplane, vehicle and shop. The new microservices follow the same concepts as the original ones.

The elastic search and redis databases were replaced by h2, for simplicity matters.

## Components
- Configuration server
- Service discovery
- Gateway
- Airplane microservice
- Vehicle microservice
- Shop microservice

## Configuration server

The config server fetch all configuration data it needs from the [configuration repository](https://github.com/9Rain/dio-santander-microservices-config).

## Running the project

Run the following terminal command in each service's folder:

```shell script
./gradlew bootRun
```

Consider the following running order:

1. Config server
2. Service discovery
3. Gateway
4. Airplane
5. Vehicle
6. Shop

## Actuator

The actuator feature checks whether the service is up or down, for some reason. 

To check a service status:

```
http://localhost:[SERVICE_PORT]/actuator/health
```

## Eureka server

The Eureka server keeps the register of all microservices in the group. 

To check Eureka's ui:

```
http://localhost:9000
```

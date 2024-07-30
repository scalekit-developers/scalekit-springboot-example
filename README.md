# Spring Boot example app

This is a simple Spring Boot application that demonstrates how to use Scalekit SDK to implement Single Sign-on.

## Running The App

To get a local copy up and running follow these simple steps.

```
# Add ReactJS submodule for frontend elements 
git clone --recursive https://github.com/scalekit-inc/scalekit-spring-boot-example.git
```


 - Get you ```env_url```, ```client_id``` and ```client_secret``` from the Scalekit dashboard.
 - update the [application.properties](https://github.com/scalekit-inc/scalekit-spring-boot-example/blob/main/src/main/resources/application.properties) file with your credentials
```
scalekit.client.id=client_id
scalekit.client.secret=client_secret
scalekit.environment.url=env_url
```

 - mvn clean install to install all dependencies
``mvn clean install``
 - ``mvn spring-boot:run`` to start the application
- App will start on port 8080



### Running Sample UI
The spring boot app runs as standalone app. To run the sample UI, follow the steps below:

- Navigate to the web directory
- Run ``npm install`` to install all dependencies
- Run ``npm start`` to start the app
- Open [http://localhost:3000](http://localhost:3000) to view it in the browser.
- Use your sample connections, organizations and users to test the app
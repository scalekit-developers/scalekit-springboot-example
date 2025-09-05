<p align="left">
  <a href="https://scalekit.com" target="_blank" rel="noopener noreferrer">
    <picture>
      <img src="https://cdn.scalekit.cloud/v1/scalekit-logo-dark.svg" height="64">
    </picture>
  </a>
  <br/>
</p>

# Scalekit Spring Boot Example

[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-2.5+-green?style=flat-square&logo=spring)](https://spring.io/projects/spring-boot)
[![Java](https://img.shields.io/badge/Java-11+-orange?style=flat-square&logo=java)](https://www.oracle.com/java/)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)

A comprehensive Spring Boot application demonstrating <a href="https://scalekit.com" target="_blank" rel="noopener noreferrer">Scalekit</a>'s **auth stack for AI apps**. This example shows how to implement both human authentication (Enterprise SSO, passwordless) and agent authorization (MCP, token vaults) in a Java/Spring Boot application.

## 🤖 What This Demo Shows

- **Agent-First Authentication**: MCP integration with delegated consent
- **Enterprise SSO**: SAML and OIDC authentication flows
- **Token Management**: Secure token storage and rotation
- **Spring Security**: Integration with Spring's security framework
- **Session Handling**: Robust user session management
- **RESTful APIs**: Modern API design patterns

## Running The App

To get a local copy up and running follow these simple steps.

```
# Add ReactJS submodule for frontend elements 
git clone --recursive https://github.com/scalekit-developers/shared-ui-for-examples.git
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

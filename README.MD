# FastStarter

![LICENCE](https://img.shields.io/badge/LICENCE-Apache%202.0-blue)
![JAVA](https://img.shields.io/badge/JAVA-17-blue)

> Unspecified versions default to the latest version.

## Design Concept
**Free and fast generation of application frameworks.**

## Metadata Design

### Language
- ```Java```

### Project
- ```Maven```

### Style
- **Simple :** A simple application structure
- **DDD :** A DDD(Domain Driven Design) style application structure

### Spring Boot
- ```3.4.0 (SNAPSHOT)```, ```3.4.0 (M1)```, ```3.3.2```, ```3.2.9 (SNAPSHOT)```, ```3.2.8```

### Project Metadata
- **Group :** ```com.example```
- **Artifact :** ```demo```
- **Name :** ```demo```
- **Description :** ```Demo project for Spring Boot```
- **Package name :** ```com.example.demo```
- **Packaging :** ```Jar``` ```War```
- **Java Version :** ```11``` ```17``` ```21``` ```22```

### Dependencies
- **DEVELOPER TOOLS :** ```GraalVM Native Support```, ```GraphQL DGS Code Generation```, ```Spring Boot DevTools```, ```Lombok```, ```Spring Configuration Processor```, ```Docker Compose Support```, ```Spring Modulith```
- **WEB :** ```Spring Web```, ```Spring Reactive Web```, ```Spring for GraphQL```, ```Rest Repositories```, ```Spring Session```, ```Rest Repositories HAL Explorer```, ```Spring HATEOAS```, ```Spring Web Services```, ```Jersey```, ```Vaadin```, ```Netflix DGS```
- **TEMPLATE ENGINES :** ```Thymeleaf```, ```Apache Freemarker```, ```Mustache```, ```Groovy Templates```
- **SECURITY :** ```Spring Security```, ```OAuth2 Client```, ```OAuth2 Authorization Server```, ```OAuth2 Resource Server```, ```Spring LDAP```, ```Okta```
- **SQL :** ```JDBC API```, ```Spring Data JPA```, ```Spring Data JDBC```, ```Spring Data R2DBC```, ```MyBatis Framework```, ```Liquibase Migration```, ```Flyway Migration```, ```JOOQ Access Layer```, ```IBM DB2 Driver```, ```Apache Derby Database```, ```H2 Database```, ```HyperSQL Database```, ```MariaDB Driver```, ```MS SQL Server Driver```, ```MySQL Driver```, ```Oracle Driver```, ```PostgreSQL Driver```
- **NOSQL :** ```Spring Data Redis (Access+Driver)```, ```Spring Data Reactive Redis```, ```Spring Data MongoDB```, ```Spring Data Reactive MongoDB```, ```Spring Data Elasticsearch (Access+Driver)```, ```Spring Data for Apache Cassandra```, ```Spring Data Reactive for Apache Cassandra```, ```Spring Data Couchbase```, ```Spring Data Reactive Couchbase```, ```Spring Data Neo4j```
- **MESSAGING :** ```Spring Integration```, ```Spring for RabbitMQ```, ```Spring for RabbitMQ Streams```, ```Spring for Apache Kafka```, ```Spring for Apache Kafka Streams```, ```Spring for Apache ActiveMQ 5```, ```Spring for Apache ActiveMQ Artemis```, ```Spring for Apache Pulsar```, ```Spring for Apache Pulsar (Reactive)```, ```WebSocket```, ```RSocket```, ```Apache Camel```, ```Solace PubSub+```
- **I/O :** ```Spring Batch```, ```Validation```, ```Java Mail Sender```, ```Quartz Scheduler```, ```Spring Cache Abstraction```, ```Spring Shell```
- **OPS :** ```Spring Boot Actuator```, ```CycloneDX SBOM support```, ```codecentric's Spring Boot Admin (Client)```, ```codecentric's Spring Boot Admin (Server)```
- **OBSERVABILITY :** ```Datadog```, ```Dynatrace```, ```Influx```, ```Graphite```, ```New Relic```, ```Prometheus```, ```Distributed Tracing```, ```Wavefront```, ```Zipkin```
- **TESTING :** ```Spring REST Docs```, ```Testcontainers```, ```Contract Verifier```, ```Contract Stub Runner```, ```Embedded LDAP Server```
- **SPRING CLOUD :** ```Cloud Bootstrap```, ```Function```, ```Task```
- **SPRING CLOUD CONFIG :** ```Config Client```, ```Config Server```, ```Vault Configuration```, ```Apache Zookeeper Configuration```, ```Consul Configuration```
- **SPRING CLOUD DISCOVERY :** ```Eureka Discovery Client```, ```Eureka Server```, ```Apache Zookeeper Discovery```, ```Consul Discovery```
- **SPRING CLOUD ROUTING :** ```Gateway```, ```Reactive Gateway```, ```OpenFeign```, ```Cloud LoadBalancer```
- **SPRING CLOUD CIRCUIT BREAKER :** ```Resilience4J```
- **SPRING CLOUD MESSAGING :** ```Cloud Bus```, ```Cloud Stream```
- **VMWARE TANZU APPLICATION SERVICE :** ```Config Client (TAS)```, ```Service Registry (TAS)```
- **MICROSOFT AZURE :** ```Azure Support```, ```Azure Active Directory```, ```Azure Cosmos DB```, ```Azure Key Vault```, ```Azure Storage```

## Dependency DSL Design

## DSL Template

```black
{
    "`dependency-key`": {
        "title": "",
        "description": "",
        "latest-version": "",
        "tags": [],
        "categories": "",
        "versions": {
            "`1.xx`": {
                "tip":"",
                "maven": {
                    "groupId":"",
                    "artifactId":"",
                    "scope":""
                }
            }
        }
    }
}

```

## Feild Description
- **`dependency-key` :** used to determine a denpdency, when using, it needs to be replaced with a user-defined key
-  **title :** the title displayed on the dependency list page in the frontend
-  **latest-version :** the lastest version of the current dependency
-  **tags :** dependency tags
-  **categories :** dependency categories
-  **versions :**  details of each version of the dependency
-  **`1.xx` :** specific version number, when using, it needs to be replaced with a real version number
-  **tip :** version tips message
-  **maven :** maven configuration

## Example
### Spring Boot
```
{
    "springboot": {
        "title": "SpringBoot",
        "description": "Buession Framework Springboot Boot",
        "latest-version": "2.3.3",
        "tags": ["spring"],
        "categories": "springboot",
        "versions": {
            "2.3.3": {
                "tip":"Vulnerabilities:CVE-2022-1471",
                "maven": {
                    "groupId":"com.buession.springboot",
                    "artifactId":"buession-springboot-boot"
                }
            },
            "2.3.2": {
                "tip":"Vulnerabilities:CVE-2022-1471",
                "maven": {
                    "groupId":"com.buession.springboot",
                    "artifactId":"buession-springboot-boot"
                }
            }
        }
    }
}
```
### Spring Boot Starter Web
```
{
    "spring-boot-starter-web": {
        "title": "Spring-Boot-Starter-Web",
        "description": "Starter for building web, including RESTful, applications using Spring MVC. Uses Tomcat as the default embedded container",
        "latest-version": "2.3.3",
        "tags": ["spring","framework","web","starter"],
        "categories": "web-frameworks",
        "versions": {
            "3.3.2": {
                "tip":"",
                "maven": {
                    "groupId":"org.springframework.boot",
                    "artifactId":"spring-boot-starter-web"
                }
            },
            "3.3.1": {
                "tip":"",
                "maven": {
                    "groupId":"org.springframework.boot",
                    "artifactId":"spring-boot-starter-web"
                }
            }
        }
    }
}
```
### Jackson Core
```
{
    "jackson-core": {
        "title": "Jackson-Core",
        "description": "Core Jackson processing abstractions (aka Streaming API), implementation for JSON",
        "latest-version": "2.17.2",
        "tags": [
            "format",
            "json",
            "serialization",
            "jackson"
        ],
        "categories": ["json-libraries"],
        "versions": {
            "2.17.2": {
                "maven": {
                    "groupId":"com.fasterxml.jackson.core",
                    "artifactId":"jackson-core"
                }
            },
            "2.17.1": {
                "maven": {
                    "groupId":"com.fasterxml.jackson.core",
                    "artifactId":"jackson-core"
                }
            }
        }
    }
}
```
### Integrated configuration
```
{
    "springboot": {
        "title": "SpringBoot",
        "description": "Buession Framework Springboot Boot",
        "latest-version": "2.3.3",
        "tags": ["spring"],
        "categories": "springboot",
        "versions": {
            "2.3.3": {
                "tip":"Vulnerabilities:CVE-2022-1471",
                "maven": {
                    "groupId":"com.buession.springboot",
                    "artifactId":"buession-springboot-boot"
                }
            },
            "2.3.2": {
                "tip":"Vulnerabilities:CVE-2022-1471",
                "maven": {
                    "groupId":"com.buession.springboot",
                    "artifactId":"buession-springboot-boot"
                }
            }
        }
    },
    "spring-boot-starter-web": {
        "title": "Spring-Boot-Starter-Web",
        "description": "Starter for building web, including RESTful, applications using Spring MVC. Uses Tomcat as the default embedded container",
        "latest-version": "2.3.3",
        "tags": ["spring","framework","web","starter"],
        "categories": "web-frameworks",
        "versions": {
            "3.3.2": {
                "tip":"",
                "maven": {
                    "groupId":"org.springframework.boot",
                    "artifactId":"spring-boot-starter-web"
                }
            },
            "3.3.1": {
                "tip":"",
                "maven": {
                    "groupId":"org.springframework.boot",
                    "artifactId":"spring-boot-starter-web"
                }
            }
        }
    },
    "jackson-core": {
        "title": "Jackson-Core",
        "description": "Core Jackson processing abstractions (aka Streaming API), implementation for JSON",
        "latest-version": "2.17.2",
        "tags": [
            "format",
            "json",
            "serialization",
            "jackson"
        ],
        "categories": ["json-libraries"],
        "versions": {
            "2.17.2": {
                "maven": {
                    "groupId":"com.fasterxml.jackson.core",
                    "artifactId":"jackson-core"
                }
            },
            "2.17.1": {
                "maven": {
                    "groupId":"com.fasterxml.jackson.core",
                    "artifactId":"jackson-core"
                }
            }
        }
    }
}
```
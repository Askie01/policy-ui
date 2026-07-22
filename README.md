<div align="center">

<img src="src/main/resources/static/images/logo.jpg" alt="Askie Solutions logo" width="120" height="120" style="border-radius: 16px;" />

# policy-ui

**A centralized, server-rendered hub for the legal & privacy policies of the Askie Network.**

[![Build](https://img.shields.io/github/actions/workflow/status/Askie01/policy-ui/test.yaml?branch=master&label=tests&logo=github)](https://github.com/Askie01/policy-ui/actions/workflows/test.yaml)
[![Java](https://img.shields.io/badge/Java-25-orange?logo=openjdk&logoColor=white)](https://openjdk.org/projects/jdk/25/)
[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-4.1.0-6DB33F?logo=springboot&logoColor=white)](https://spring.io/projects/spring-boot)
[![Docker](https://img.shields.io/badge/Docker-ready-2496ED?logo=docker&logoColor=white)](./Dockerfile)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)

</div>

---

## Overview

`policy-ui` is a small [Spring Boot](https://spring.io/projects/spring-boot) web application that
provides a single, consistent place to access and review the policies that apply across the
services within the **Askie Network** — a personal portfolio and software-demonstration ecosystem.

It renders clean, self-contained HTML pages (via [Thymeleaf](https://www.thymeleaf.org/)) and
currently serves a full **GDPR / RODO-compliant Privacy Policy**, with room to grow as more
policies are added.

## ✨ Features

- 🏠 **Welcome page** — a friendly landing page describing the service.
- 🔐 **Privacy Policy & RODO page** — a complete, GDPR-compliant privacy notice.
- 🧩 **Reusable Thymeleaf layout** — a shared base template with header, footer, side panels, and a swappable content region.
- 🩺 **Health monitoring** — Spring Boot Actuator endpoints for liveness and health checks.
- 🐳 **Containerized** — ships with a hardened, non-root `Dockerfile` and a `docker-compose` setup.
- 🚀 **Full CI/CD** — automated tests, JAR + Docker image publishing, and VPS deployment via GitHub Actions.

## 🛠️ Tech Stack

| Layer            | Technology                                            |
| ---------------- | ----------------------------------------------------- |
| Language         | Java 25                                               |
| Framework        | Spring Boot 4.1.0 (Web MVC)                            |
| View / Templating| Thymeleaf                                             |
| Monitoring       | Spring Boot Actuator                                  |
| Boilerplate      | Lombok                                                |
| Build            | Maven (with the Maven Wrapper)                        |
| Container        | Docker · Docker Compose · Eclipse Temurin 25 (JRE)    |
| CI/CD            | GitHub Actions · GitHub Packages · GHCR               |

## 🚀 Getting Started

### Prerequisites

- **JDK 25** (only required for local builds — Docker handles its own runtime)
- **Docker** & **Docker Compose** (optional, for containerized runs)

### Run locally with Maven

```bash
# Clone the repository
git clone https://github.com/Askie01/policy-ui.git
cd policy-ui

# Run the application (uses the bundled Maven Wrapper)
./mvnw spring-boot:run
```

The application starts on **port 8080** under the `/policies` context path:

| Page            | URL                                             |
| --------------- | ----------------------------------------------- |
| Welcome         | http://localhost:8080/policies/                 |
| Privacy Policy  | http://localhost:8080/policies/privacy          |
| Health check    | http://localhost:8080/policies/actuator/health  |

### Run with Docker

```bash
# Build the application JAR first
./mvnw clean package

# Build and start the container
docker compose up --build
```

## 🧪 Testing

```bash
# Run unit tests
./mvnw test -Dtest.type=unit

# Run integration tests
./mvnw test -Dtest.type=integration
```

## 📦 Project Structure

```text
policy-ui/
├── .github/workflows/          # CI/CD pipelines (test → publish → deploy)
├── src/main/
│   ├── java/org/askiesolutions/policyui/
│   │   ├── PolicyUiApplication.java
│   │   └── view/               # MVC controllers (WelcomeView, PrivacyPolicyView)
│   └── resources/
│       ├── application.yaml     # App config (context-path, app name)
│       ├── static/              # CSS & images
│       └── templates/           # Thymeleaf layout, fragments & pages
├── Dockerfile                   # Non-root runtime image (Temurin 25)
├── docker-compose.yaml
└── pom.xml
```

## 🔁 CI/CD Pipeline

The project is fully automated through three chained GitHub Actions workflows:

1. **Test** — runs unit and integration tests on every push / PR to `master`.
2. **Publish** — on a successful test run, builds and publishes the JAR to GitHub Packages and a Docker image to the GitHub Container Registry (GHCR).
3. **Deploy** — pulls the latest image and deploys it to a production VPS over SSH.

## 👤 Author

**Adam Pawłowski** ([@Askie01](https://github.com/Askie01))

[![Website](https://img.shields.io/badge/Website-askie01.com-000000?logo=googlechrome&logoColor=white)](https://askie01.com)
[![LinkedIn](https://img.shields.io/badge/LinkedIn-askie01-0A66C2?logo=linkedin&logoColor=white)](https://www.linkedin.com/in/askie01/)
[![GitHub](https://img.shields.io/badge/GitHub-Askie01-181717?logo=github&logoColor=white)](https://github.com/Askie01)
[![LeetCode](https://img.shields.io/badge/LeetCode-Askie01-FFA116?logo=leetcode&logoColor=white)](https://leetcode.com/u/Askie01/)

## 📄 License

This project is licensed under the **MIT License** — see the [pom.xml](./pom.xml) for details.

---

<div align="center">
<sub>© 2026 Askie01 · Powered by Spring Boot</sub>
</div>

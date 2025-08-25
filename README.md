# Analytics Dashboard

## Table of Contents
- [Overview](#overview)
- [Features](#features)
- [Tech Stack](#tech-stack)
- [Screenshots](#screenshots)
  - [Frontend](#frontend)
  - [Grafana Dashboard](#grafana-dashboard)
- [Setup Instructions](#setup-instructions)
  - [Backend (Spring Boot Application)](#backend-spring-boot-application)
  - [Frontend (React Application)](#frontend-react-application)
  - [Prometheus Setup](#prometheus-setup)
  - [Grafana Setup](#grafana-setup)
- [How It Works](#how-it-works)
- [API Endpoints](#api-endpoints)
- [Future Enhancements](#future-enhancements)
- [Conclusion](#conclusion)

## Overview

This project tracks when users click **Enroll Now** and **Pay Now** buttons on the frontend. It helps understand how many people show interest in a course by enrolling but do not complete the payment.

The data is collected and displayed in **Grafana** to visualize through graphs. This can help businesses to see how many users actually go from showing interest to making a payment. It also provides insights into the **drop rate**, helping businesses understand how many users abandon the process before completing the payment. This can be used in any application that involves a payment process to analyze user behavior and improve the checkout process.

## Features

- Tracks "Enroll Now" and "Pay Now" events from the frontend.
- Backend uses **Micrometer** to record metrics.
- Stores metrics in **Prometheus**.
- Visualizes data with **Grafana**.
- Helps analyze the **drop rate** (users who enroll but don’t proceed to payment).
- Can be integrated with any application that involves a payment process.

## Tech Stack

- **Backend**: Java, Spring Boot
- **Frontend**: JavaScript, React
- **Monitoring Tools**: Prometheus, Grafana

## Screenshots

### Frontend

<img width="476" alt="image" src="https://github.com/user-attachments/assets/c6e3d32e-5dee-4642-b45d-7706bf50a89c" />
<img width="389" alt="image" src="https://github.com/user-attachments/assets/c642c846-42f9-43b6-8f40-426ed487f30f" />

### Grafana Dashboard
<img width="578" alt="image" src="https://github.com/user-attachments/assets/650d6e04-353c-4f53-b758-dd375934e7eb" />
Enroll and Pay Events

<img width="616" alt="image" src="https://github.com/user-attachments/assets/b8154578-41e3-4ae9-a5fd-fb5743899b63" />
Drop Rate Graph



## Setup Instructions

### Backend (Spring Boot Application)

1. Clone the repository.
2. Install dependencies and run the Spring Boot application:
   ```sh
   mvn spring-boot:run

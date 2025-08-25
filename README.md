# Analytics Dashboard

## Table of Contents
- [Overview](#overview)
- [Features](#features)
- [Tech Stack](#tech-stack)
- [Screenshots](#screenshots)
- [Setup Instructions](#setup-instructions)
- [How It Works](#how-it-works)
- [API Endpoints](#api-endpoints)
- [Future Enhancements](#future-enhancements)
- [Conclusion](#conclusion)

## Overview

This project counts two actions in the app: when someone clicks **Enroll Now** and when they click **Pay Now**, and then shows both in Grafana through graph. With these charts we can check, 
for any time range, how many people started vs. how many finished payment 
and what percent dropped off. 

It provides insights into the **drop rate**, helping businesses understand how many users abandon the process before completing the payment. This can be used in any application that involves a payment process to analyze user behavior and improve the checkout process.

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
   ```
3. The application will start on `http://localhost:8080`.

### Frontend (React Application)

1. Navigate to the frontend folder and install dependencies:
   ```sh
   npm install
   ```
2. Start the frontend application:
   ```sh
   npm start
   ```
3. The frontend will be available at `http://localhost:5173`.

### Prometheus Setup

1. Install Prometheus locally.
2. Start Prometheus:
   ```sh
   ./prometheus --config.file=prometheus.yml
   ```
4. Open `http://localhost:9090` to access Prometheus.

### Grafana Setup

1. Install Grafana.
2. Start Grafana:
   ```sh
   ./grafana-server
   ```
3. Open `http://localhost:3000` and log in with `admin/admin`.
4. Add Prometheus as a data source (`http://localhost:9090`).
5. Create dashboards to visualize enrollment and payment metrics.

## How It Works

- When a user clicks **Enroll Now**, a metric is recorded.
- If they proceed to payment, another metric is recorded.
- Grafana displays a dashboard to compare enrollments vs. payments.
- The drop rate is calculated as:
  ```sh
  Drop Rate (%) = (100 - (sum(user_events_total{event="pay"}) / sum(user_events_total{event="enroll"}))) * 100
  ```
- This helps in analyzing how many users drop off before making a payment.

## API Endpoints

- `GET /producer/enroll` → Records an enroll event.
- `GET /producer/pay` → Records a payment event.

## Future Enhancements

- Integrate with Kafka to produce events.


## Conclusion

This project provides a simple way to track user engagement in the enrollment and payment process. By using **Prometheus** and **Grafana**, businesses can easily visualize trends, measure **drop rates**, and find ways to improve conversion rates.

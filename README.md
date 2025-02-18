# Event Tracking with Prometheus and Grafana

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

- **Backend**: Spring Boot
- **Frontend**: React
- **Monitoring Tools**: Prometheus, Grafana

## Screenshots

### Frontend

<img width="476" alt="image" src="https://github.com/user-attachments/assets/c6e3d32e-5dee-4642-b45d-7706bf50a89c" />
<img width="389" alt="image" src="https://github.com/user-attachments/assets/c642c846-42f9-43b6-8f40-426ed487f30f" />

### Grafana Dashboard
<img width="441" alt="image" src="https://github.com/user-attachments/assets/109c5499-f283-4a64-ba18-e30f82b6d7f4" /> Enroll and Payment Events
<img width="407" alt="image" src="https://github.com/user-attachments/assets/0562c2b2-5cde-4120-a854-cd6aa7038ade" /> Drop Rate Graph



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


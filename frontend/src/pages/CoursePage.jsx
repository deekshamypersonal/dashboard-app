import React from "react";
import { useNavigate } from "react-router-dom";
import "./CoursePage.css";

const CoursePage = () => {
  const navigate = useNavigate();

  const handleEnroll = async () => {
    try {
      const response = await fetch("http://localhost:8080/producer/enroll", {
        method: "GET",
      });

      if (response.ok) {
        console.log("Enroll event recorded.");
        navigate("/payment"); // Navigate to Payment Page
      } else {
        console.error("Failed to record enroll event.");
      }
    } catch (error) {
      console.error("Error connecting to enroll API:", error);
    }
  };

  return (
    <div className="container">
      <h1>Master Spring Boot with Prometheus & Grafana</h1>
      <p>
        Jumpstart your career in microservices and monitoring by learning how to
        build and observe robust applications with Spring Boot, Prometheus, and
        Grafana.
      </p>

      <p>
        <strong>Price:</strong> $99 (one-time fee)
      </p>

      <p>
        <strong>Why Enroll?</strong>
        <br />
        By enrolling, you get lifetime access to the course materials, regular
        updates, and a community of learners just like you.
      </p>

      <button className="button" onClick={handleEnroll}>
        Enroll Now
      </button>
    </div>
  );
};

export default CoursePage;

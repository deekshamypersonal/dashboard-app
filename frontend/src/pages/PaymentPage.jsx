import React from "react";
import "./PaymentPage.css";

const PaymentPage = () => {
  const handlePayment = async () => {
    try {
      const response = await fetch("http://localhost:8080/producer/pay", {
        method: "GET",
      });

      if (response.ok) {
        alert("Payment recorded. Welcome to the course!");
      } else {
        alert("Payment failed. Please try again.");
      }
    } catch (error) {
      console.error("Error connecting to payment API:", error);
      alert("Something went wrong. Please try again later.");
    }
  };

  return (
    <div className="container">
      <h1>Complete Your Payment</h1>
      <p>You are just one step away from unlocking all the course content.</p>

      <div>
        <strong>Disclaimers / Conditions:</strong>
        <ul>
          <li>
            All sales are final. <span className="warning">No refunds.</span>
          </li>
          <li>Access to course updates may require an active account.</li>
          <li>You will need a valid credit card to complete this purchase.</li>
          <li>Basic knowledge of Java is assumed.</li>
        </ul>
      </div>

      <button className="button" onClick={handlePayment}>
        Pay Now
      </button>
    </div>
  );
};

export default PaymentPage;

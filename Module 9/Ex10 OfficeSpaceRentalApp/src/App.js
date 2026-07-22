import logo from './logo.svg';
import './App.css';

import React from "react";

function App() {
  const offices = [
    {
      name: "DBS",
      rent: 50000,
      address: "Chennai"
    },
    {
      name: "Regus",
      rent: 75000,
      address: "Bangalore"
    },
    {
      name: "WeWork",
      rent: 65000,
      address: "Hyderabad"
    }
  ];

  return (
    <div style={{ padding: "20px" }}>
      <h1>Office Space Rental App</h1>

      <img
        src="/office.jpg"
        alt="Office Space"
        width="400"
        height="250"
      />

      <h2>Office Details</h2>

      {offices.map((office, index) => (
        <div key={index}>
          <h3>Name : {office.name}</h3>

          <h3
            style={{
              color:
                office.rent < 60000
                  ? "red"
                  : "green"
            }}
          >
            Rent : Rs. {office.rent}
          </h3>

          <h3>
            Address : {office.address}
          </h3>

          <hr />
        </div>
      ))}
    </div>
  );
}

export default App;

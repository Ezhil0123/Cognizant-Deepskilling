import logo from './logo.svg';
import './App.css';

import React from "react";
import LoginControl from "./Components/LoginControl";

function App() {
  return (
    <div style={{ margin: "20px" }}>
      <h1>Ticket Booking App</h1>

      <LoginControl />
    </div>
  );
}

export default App;
import logo from './logo.svg';
import './App.css';

import React from "react";
import EventExamples from "./Components/EventExamples";
import CurrencyConvertor from "./Components/CurrencyConvertor";

function App() {
  return (
    <div style={{ margin: "20px" }}>
      <EventExamples />

      <hr />

      <CurrencyConvertor />
    </div>
  );
}

export default App;
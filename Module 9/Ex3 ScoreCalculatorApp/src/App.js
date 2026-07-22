import logo from './logo.svg';
import './App.css';

import React from "react";
import CalculateScore from "./Components/CalculateScore";

function App() {
  return (
    <div>
      <CalculateScore
        name="Dhanush"
        school="ABC Higher Secondary School"
        total={450}
        goal={5}
      />
    </div>
  );
}

export default App;

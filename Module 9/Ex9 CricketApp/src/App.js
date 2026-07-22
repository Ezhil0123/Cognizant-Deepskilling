import logo from './logo.svg';
import './App.css';

import React from "react";
import ListOfPlayers from "./Components/ListOfPlayers";
import IndianPlayers from "./Components/IndianPlayers";

function App() {
  const flag = true;

  if (flag === true) {
    return (
      <div>
        <ListOfPlayers />
      </div>
    );
  } else {
    return (
      <div>
        <IndianPlayers />
      </div>
    );
  }
}

export default App;

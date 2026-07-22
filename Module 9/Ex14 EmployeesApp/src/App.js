import logo from './logo.svg';
import './App.css';

import React, { Component } from "react";
import EmployeeList from "./Components/EmployeeList";
import ThemeContext from "./ThemeContext";

class App extends Component {
  state = {
    theme: "light",
    employees: [
      {
        id: 1,
        name: "John"
      },
      {
        id: 2,
        name: "Peter"
      }
    ]
  };

  render() {
    return (
      <ThemeContext.Provider
        value={this.state.theme}
      >
        <EmployeeList
          employees={this.state.employees}
        />
      </ThemeContext.Provider>
    );
  }
}

export default App;
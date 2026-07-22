import logo from './logo.svg';
import './App.css';

import React from "react";
import {
  BrowserRouter,
  Routes,
  Route,
  Link,
  Navigate,
} from "react-router-dom";

import Home from "./components/Home";
import TrainersList from "./components/TrainersList";
import TrainerDetails from "./components/TrainerDetails";

function App() {
  return (
    <BrowserRouter>
      <div>
        <h1>
          Cognizant Academy Trainers App
        </h1>

        <nav>
          <Link to="/">Home</Link>
          {" | "}
          <Link to="/trainers">
            Trainers
          </Link>
        </nav>

        <hr />

        <Routes>
          <Route
            path="/"
            element={<Home />}
          />

          <Route
            path="/trainers"
            element={<TrainersList />}
          />

          <Route
            path="/trainers/:id"
            element={<TrainerDetails />}
          />

          <Route
            path="*"
            element={<Navigate to="/" />}
          />
        </Routes>
      </div>
    </BrowserRouter>
  );
}

export default App;
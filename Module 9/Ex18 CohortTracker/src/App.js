import logo from './logo.svg';
import './App.css';

import React from "react";
import CohortDetails from "./components/CohortDetails";

function App() {
  const cohorts = [
    {
      cohortName: "INTADMDF10 .NET FSD",
      startedOn: "22-Feb-2022",
      currentStatus: "Scheduled",
      coach: "NDP Coach",
      trainer: "NDP Trainer",
    },
    {
      cohortName: "ADM21JF014 - Java FSD",
      startedOn: "10-Sep-2021",
      currentStatus: "Ongoing",
      coach: "NDP Coach",
      trainer: "NDP Trainer",
    },
    {
      cohortName: "CDBJF21025 - Java FSD",
      startedOn: "24-Dec-2021",
      currentStatus: "Ongoing",
      coach: "NDP Coach",
      trainer: "NDP Trainer",
    },
    {
      cohortName: "INTADMDF11 .NET FSD",
      startedOn: "18-Feb-2022",
      currentStatus: "Scheduled",
      coach: "NDP Coach",
      trainer: "NDP Trainer",
    },
  ];

  return (
    <div>
      <h1 style={{ textAlign: "center" }}>
        My Academy Dashboard
      </h1>

      {cohorts.map((cohort, index) => (
        <CohortDetails
          key={index}
          cohort={cohort}
        />
      ))}
    </div>
  );
}

export default App;

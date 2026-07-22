import logo from './logo.svg';
import './App.css';

import React, { useEffect, useState } from "react";
import GitClient from "./GitClient";

function App() {
  const [repos, setRepos] = useState([]);

  useEffect(() => {
    GitClient.getRepositories("techiesyed")
      .then(data => setRepos(data))
      .catch(err => console.log(err));
  }, []);

  return (
    <div>
      <h2>Repository Names</h2>

      <ul>
        {repos.map((repo, index) => (
          <li key={index}>{repo}</li>
        ))}
      </ul>
    </div>
  );
}

export default App;
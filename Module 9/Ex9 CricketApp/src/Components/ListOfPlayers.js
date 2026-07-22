import React from "react";

function ListOfPlayers() {
  const players = [
    { name: "Virat", score: 90 },
    { name: "Rohit", score: 80 },
    { name: "Gill", score: 45 },
    { name: "Rahul", score: 60 },
    { name: "Pant", score: 72 },
    { name: "Hardik", score: 68 },
    { name: "Jadeja", score: 55 },
    { name: "Ashwin", score: 88 },
    { name: "Shami", score: 30 },
    { name: "Bumrah", score: 50 },
    { name: "Siraj", score: 40 }
  ];

  const lowScorers = players.filter(
    player => player.score < 70
  );

  return (
    <div>
      <h2>List of Players</h2>

      {players.map((player, index) => (
        <p key={index}>
          {player.name} - {player.score}
        </p>
      ))}

      <h2>Players with score below 70</h2>

      {lowScorers.map((player, index) => (
        <p key={index}>
          {player.name} - {player.score}
        </p>
      ))}
    </div>
  );
}

export default ListOfPlayers;
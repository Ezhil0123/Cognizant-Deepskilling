import React, {
  useContext
} from "react";

import ThemeContext
from "../ThemeContext";

function EmployeeCard(props) {

  const theme =
    useContext(ThemeContext);

  return (
    <div>
      <h3>
        {props.employee.name}
      </h3>

      <button
        className={theme}
      >
        View Details
      </button>
    </div>
  );
}

export default EmployeeCard;
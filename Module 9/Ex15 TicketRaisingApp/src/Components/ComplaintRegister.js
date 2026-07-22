import React, { Component } from "react";

class ComplaintRegister extends Component {
  constructor(props) {
    super(props);

    this.state = {
      employeeName: "",
      complaint: ""
    };
  }

  handleNameChange = (event) => {
    this.setState({
      employeeName: event.target.value
    });
  };

  handleComplaintChange = (event) => {
    this.setState({
      complaint: event.target.value
    });
  };

  handleSubmit = (event) => {
    event.preventDefault();

    const referenceNo =
      Math.floor(
        10000 + Math.random() * 90000
      );

    alert(
      `Thanks ${this.state.employeeName}\nYour Complaint was submitted.\nTransaction ID is : ${referenceNo}`
    );

    this.setState({
      employeeName: "",
      complaint: ""
    });
  };

  render() {
    return (
      <div className="container">
        <h1>Ticket Raising App</h1>

        <form onSubmit={this.handleSubmit}>
          <table>
            <tbody>
              <tr>
                <td>Employee Name :</td>
                <td>
                  <input
                    type="text"
                    value={this.state.employeeName}
                    onChange={
                      this.handleNameChange
                    }
                    required
                  />
                </td>
              </tr>

              <tr>
                <td>
                  Complaint :
                </td>
                <td>
                  <textarea
                    rows="5"
                    cols="25"
                    value={this.state.complaint}
                    onChange={
                      this.handleComplaintChange
                    }
                    required
                  />
                </td>
              </tr>

              <tr>
                <td></td>
                <td>
                  <button
                    type="submit"
                  >
                    Submit
                  </button>
                </td>
              </tr>
            </tbody>
          </table>
        </form>
      </div>
    );
  }
}

export default ComplaintRegister;
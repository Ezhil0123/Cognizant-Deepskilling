import React, { Component } from "react";
import GuestPage from "./GuestPage";
import UserPage from "./UserPage";

class LoginControl extends Component {
  constructor(props) {
    super(props);

    this.state = {
      isLoggedIn: false,
    };
  }

  login = () => {
    this.setState({
      isLoggedIn: true,
    });
  };

  logout = () => {
    this.setState({
      isLoggedIn: false,
    });
  };

  render() {
    let page;
    let button;

    if (this.state.isLoggedIn) {
      page = <UserPage />;

      button = (
        <button onClick={this.logout}>
          Logout
        </button>
      );
    } else {
      page = <GuestPage />;

      button = (
        <button onClick={this.login}>
          Login
        </button>
      );
    }

    return (
      <div>
        {page}
        <br />
        {button}
      </div>
    );
  }
}

export default LoginControl;
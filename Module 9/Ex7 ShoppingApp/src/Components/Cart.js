import React, { Component } from "react";

class Cart extends Component {
  render() {
    return (
      <div
        style={{
          border: "1px solid black",
          width: "300px",
          margin: "10px",
          padding: "10px",
        }}
      >
        <h3>{this.props.itemname}</h3>

        <h4>
          Price : ₹{this.props.price}
        </h4>
      </div>
    );
  }
}

export default Cart;
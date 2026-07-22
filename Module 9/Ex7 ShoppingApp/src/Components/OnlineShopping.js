import React, { Component } from "react";
import Cart from "./Cart";

class OnlineShopping extends Component {
  constructor(props) {
    super(props);

    this.items = [
      {
        itemname: "Laptop",
        price: 65000,
      },
      {
        itemname: "Mobile",
        price: 25000,
      },
      {
        itemname: "Headphones",
        price: 3000,
      },
      {
        itemname: "Smart Watch",
        price: 5000,
      },
      {
        itemname: "Keyboard",
        price: 1500,
      },
    ];
  }

  render() {
    return (
      <div>
        <h1>Online Shopping Cart</h1>

        {this.items.map((item, index) => (
          <Cart
            key={index}
            itemname={item.itemname}
            price={item.price}
          />
        ))}
      </div>
    );
  }
}

export default OnlineShopping;
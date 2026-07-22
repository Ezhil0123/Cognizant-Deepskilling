import React, { useState } from "react";

function Register() {
  const [form, setForm] = useState({
    name: "",
    email: "",
    password: "",
  });

  const [errors, setErrors] = useState({});

  const handleChange = (e) => {
    const { name, value } = e.target;

    setForm({
      ...form,
      [name]: value,
    });
  };

  const handleSubmit = (e) => {
    e.preventDefault();

    let validationErrors = {};

    // Name Validation
    if (form.name.length < 5) {
      validationErrors.name =
        "Name should contain at least 5 characters";
    }

    // Email Validation
    if (
      !form.email.includes("@") ||
      !form.email.includes(".")
    ) {
      validationErrors.email =
        "Email should contain @ and .";
    }

    // Password Validation
    if (form.password.length < 8) {
      validationErrors.password =
        "Password should contain at least 8 characters";
    }

    setErrors(validationErrors);

    if (Object.keys(validationErrors).length === 0) {
      alert("Registration Successful!");
    }
  };

  return (
    <div style={{ margin: "50px" }}>
      <h2>Mail Registration Form</h2>

      <form onSubmit={handleSubmit}>
        <div>
          <label>Name :</label>
          <input
            type="text"
            name="name"
            value={form.name}
            onChange={handleChange}
          />
          <p style={{ color: "red" }}>
            {errors.name}
          </p>
        </div>

        <div>
          <label>Email :</label>
          <input
            type="text"
            name="email"
            value={form.email}
            onChange={handleChange}
          />
          <p style={{ color: "red" }}>
            {errors.email}
          </p>
        </div>

        <div>
          <label>Password :</label>
          <input
            type="password"
            name="password"
            value={form.password}
            onChange={handleChange}
          />
          <p style={{ color: "red" }}>
            {errors.password}
          </p>
        </div>

        <button type="submit">
          Register
        </button>
      </form>
    </div>
  );
}

export default Register;
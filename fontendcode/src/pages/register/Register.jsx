import React, { useState } from "react";
import axios from "axios";
import { useNavigate } from "react-router-dom";
import "./Register.scss"; // Add styling in a separate CSS/SCSS file.

function Register() {
  const [user, setUser] = useState({
    name: "",
    email: "",
    password: "",
    phoneNumber: "",
    role: "",
    address: "",
    location: "",
  });

  const [error, setError] = useState(null);
  const navigate = useNavigate();

  const handleChange = (e) => {
    setUser({ ...user, [e.target.name]: e.target.value });
  };

  const handleSubmit = async (e) => {
    e.preventDefault();
    try {
      await axios.post("http://localhost:8080/users/register", user);
      navigate("/login");
    } catch (err) {
      setError("Registration failed. Please try again.");
    }
  };

  return (
    <div className="register">
      <form onSubmit={handleSubmit}>
        <h1>Register</h1>
        <label>Full Name</label>
        <input
          type="text"
          name="name"
          placeholder="Enter your full name"
          value={user.name}
          onChange={handleChange}
          required
        />
        <label>Email</label>
        <input
          type="email"
          name="email"
          placeholder="Enter your email"
          value={user.email}
          onChange={handleChange}
          required
        />
        <label>Password</label>
        <input
          type="password"
          name="password"
          placeholder="Enter your password"
          value={user.password}
          onChange={handleChange}
          required
        />
        <label>Phone Number</label>
        <input
          type="text"
          name="phoneNumber"
          placeholder="Enter your phone number"
          value={user.phoneNumber}
          onChange={handleChange}
        />
        <label>Role</label>
        <select
          name="role"
          value={user.role}
          onChange={handleChange}
          required
        >
          <option value="">Select Role</option>
          <option value="Farmer">Farmer</option>
          <option value="Buyer">Buyer</option>
          <option value="Admin">Admin</option>
        </select>
        <label>Address</label>
        <input
          type="text"
          name="address"
          placeholder="Enter your address"
          value={user.address}
          onChange={handleChange}
        />
        <label>Location</label>
        <input
          type="text"
          name="location"
          placeholder="Enter your location"
          value={user.location}
          onChange={handleChange}
        />
        <button type="submit">Register</button>
        {error && <p className="error">{error}</p>}
      </form>
    </div>
  );
}

export default Register;


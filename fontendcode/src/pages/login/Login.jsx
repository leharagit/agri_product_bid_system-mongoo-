import React, { useState } from "react";
import axios from "axios";
import { useNavigate } from "react-router-dom";
import "./Login.scss"; // Ensure this file has styles for the login page.

function Login() {
  const [email, setEmail] = useState(""); // Updated to match the backend field name.
  const [password, setPassword] = useState("");
  const [error, setError] = useState(null);

  const navigate = useNavigate();

  const handleSubmit = async (e) => {
    e.preventDefault();
    setError(null); // Clear previous errors.
    try {
      const response = await axios.post("http://localhost:8080/users/login", {
        email, // Sending email as expected by your backend.
        password,
      });
      // Save user information in localStorage or sessionStorage.
      localStorage.setItem("currentUser", JSON.stringify(response.data));
      navigate("/"); // Redirect to the home page after successful login.
    } catch (err) {
      setError(err.response?.data || "Invalid email or password");
    }
  };

  return (
    <div className="login">
      <form onSubmit={handleSubmit}>
        <h1>Login</h1>
        <label>Email</label>
        <input
          type="email"
          placeholder="Enter your email"
          value={email}
          onChange={(e) => setEmail(e.target.value)}
          required
        />
        <label>Password</label>
        <input
          type="password"
          placeholder="Enter your password"
          value={password}
          onChange={(e) => setPassword(e.target.value)}
          required
        />
        <button type="submit">Login</button>
        {error && <p className="error">{error}</p>}
      </form>
    </div>
  );
}

export default Login;



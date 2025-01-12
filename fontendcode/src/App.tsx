import React from "react";
import { FiSearch } from "react-icons/fi";
import "./App.css";

const App = () => {
  return (
    <div className="container">
      <header className="header">
        <h1 className="logo">auction</h1>
        <nav className="nav">
          <a href="#" className="nav-link">
            Become a seller
          </a>
          <a href="#" className="nav-link">
            Login
          </a>
          <button className="button">Sign in</button>
        </nav>
      </header>

      <main className="main">
        <h1 className="title">
          Find <span className="highlight">prefect</span> product <br />
          For your <span className="highlight">buinsess</span>
        </h1>

        <div className="search-bar">
          <input type="text" placeholder="Finds your products" className="search-input" />
          <button className="search-button">
            <FiSearch size={20} /> scerch
          </button>
        </div>

        <div className="popular">
          <p>popular :</p>
          <span className="tag">coconuts</span>
          <span className="tag">eggs</span>
          <span className="tag">rice</span>
        </div>

        <div className="fruits-image">
          <img src="/fruits_placeholder.jpg" alt="Fruits" />
        </div>
      </main>
    </div>
  );
};

export default App;


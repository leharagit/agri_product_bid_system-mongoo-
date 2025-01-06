import React, { useState } from "react";
import "./Gig.scss";
import { useNavigate } from "react-router-dom";

const Gig = () => {
  const [bid, setBid] = useState({
    productId: "",
    userId: "",
    bidAmount: 0.0,
  });

  const navigate = useNavigate();

  const handleChange = (e) => {
    const { name, value } = e.target;
    setBid({ ...bid, [name]: value });
  };

  const handleSubmit = async (e) => {
    e.preventDefault();
    try {
      const response = await fetch("http://localhost:8080/api/bids", {
        method: "POST",
        headers: {
          "Content-Type": "application/json",
        },
        body: JSON.stringify(bid),
      });

      if (response.ok) {
        alert("Bid created successfully!");
        navigate("/bids"); // Navigate to the bids list or another relevant page
      } else {
        const errorData = await response.json();
        alert(`Error: ${errorData.message}`);
      }
    } catch (error) {
      console.error("Error creating bid:", error);
      alert("Failed to create bid. Please try again.");
    }
  };

  return (
    <div className="add">
      <div className="container">
        <h1>Create a New Bid</h1>
        <form onSubmit={handleSubmit}>
          <div className="form-group">
            <label htmlFor="productId">Product ID</label>
            <input
              type="text"
              name="productId"
              id="productId"
              placeholder="Enter Product ID"
              value={bid.productId}
              onChange={handleChange}
              required
            />
          </div>

          <div className="form-group">
            <label htmlFor="userId">User ID</label>
            <input
              type="text"
              name="userId"
              id="userId"
              placeholder="Enter User ID"
              value={bid.userId}
              onChange={handleChange}
              required
            />
          </div>

          <div className="form-group">
            <label htmlFor="bidAmount">Bid Amount</label>
            <input
              type="number"
              name="bidAmount"
              id="bidAmount"
              placeholder="Enter Bid Amount"
              value={bid.bidAmount}
              onChange={handleChange}
              required
            />
          </div>

          <button type="submit">Submit Bid</button>
        </form>
      </div>
    </div>
  );
};

export default Gig;









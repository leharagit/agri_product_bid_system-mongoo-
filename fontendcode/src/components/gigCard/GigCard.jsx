import React from "react";
import "./GigCard.scss";
import { Link } from "react-router-dom";

function GigCard({ item }) {
  return (
    <Link to={`/gig/${item.id}`} className="gigCard">
      <div className="gigCard">
        <img src={item.image || "/img/image.png"} alt={item.name} />
        <div className="info">
          <h2>{item.name}</h2>
          <p>{item.description}</p>
          <span>${item.price}</span>
        </div>
      </div>
    </Link>
  );
}

export default GigCard;


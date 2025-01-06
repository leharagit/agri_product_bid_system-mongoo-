import React from "react";
import { Link } from "react-router-dom";
import "./CatCard.scss";

const CatCard = ({ card }) => {
  return (
    <Link to={`/gigs?cat=${encodeURIComponent(card.category || "design")}`}>
      <div className="catCard">
        <img src={card.img} alt={card.title || "Category Image"} />
        <div className="content">
          <span className="title">{card.title}</span>
          <span className="desc">{card.desc}</span>
        </div>
      </div>
    </Link>
  );
};

export default CatCard;


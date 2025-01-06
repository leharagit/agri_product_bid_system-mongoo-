import React from "react";
import "./Home.scss";
import Featured from "../../components/featured/Featured";
import TrustedBy from "../../components/trustedBy/TrustedBy";
import Slide from "../../components/slide/Slide";
import CatCard from "../../components/catCard/CatCard";
import ProjectCard from "../../components/projectCard/ProjectCard";
import { cards, projects } from "../../data";

function Home() {
  return (
    <div className="home">
      <Featured />
      <TrustedBy />
      <Slide slidesToShow={5} arrowsScroll={5}>
        {cards.map((card) => (
          <CatCard key={card.id} card={card} />
        ))}
      </Slide>
      <div className="features">
        <div className="container">
          <div className="item">
            <h1>A World of Agricultural Opportunities at Your Fingertips</h1>
            <div className="title">
              <img src="./img/check.png" alt="" />
              The Best for Every Budget
            </div>
            <p>
              Provide flexible pricing options for bids and services to accommodate small-scale and large-scale agricultural stakeholders.
            </p>
            <div className="title">
              <img src="./img/check.png" alt="" />
              Quality Transactions Done Quickly
            </div>
            <p>
              Enable users to find verified buyers and sellers in minutes with an easy-to-use interface.
            </p>
            <div className="title">
              <img src="./img/check.png" alt="" />
              Protected Payments, Every Time
            </div>
            <p>
              Implement escrow payment systems where funds are only released once both parties are satisfied with the transaction.
            </p>
            <div className="title">
              <img src="./img/check.png" alt="" />
              24/7 support
            </div>
            <p>
              Ensure farmers, sellers, and buyers can access help through live chat, email, or phone support at any time.
            </p>
          </div>
          <div className="item">
            <video src="./img/ve.mp4" controls />
          </div>
        </div>
      </div>
    
      <div className="features dark">
        <div className="container">
          <div className="item">
            <h1>
              Key<i> Features</i> For<i> Farmers </i>
            </h1>
            <div className="title">
              <img src="./img/check.png" alt="" />
              Easy product listing (e.g., vagitable, Fuits, Coconuts).
            </div>
            <div className="title">
              <img src="./img/check.png" alt="" />
              Real-time bidding updates on their dashboard
            </div>
            <div className="title">
              <img src="./img/check.png" alt="" />
              Secure payments and trusted buyers.
            </div>
            <button>List Your Product</button>
          </div>
          <div className="item">
            <img
              src="./img/veg3.jpg"
              alt=""
            />
          </div>
        </div>
      </div>

      <div className="features dark">
        <div className="container">
          <div className="item">
            <h1>
              Key<i> Features</i> For<i> Buyers </i>
            </h1>
            <div className="title">
              <img src="./img/check.png" alt="" />
              Access to fresh produce and high-quality items directly from farmers
            </div>
            <div className="title">
              <img src="./img/check.png" alt="" />
              Transparent bidding process, ensuring fair prices.
            </div>
            <div className="title">
              <img src="./img/check.png" alt="" />
              Flexible delivery or pickup options tailored to your convenience
            </div>
            <button>Buy Your Product</button>
          </div>
          <div className="item">
            <img
              src="./img/buy1.png"
              alt=""
            />
          </div>
        </div>
      </div>

    
    </div>
  );
}

export default Home;

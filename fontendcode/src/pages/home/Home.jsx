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
              fiverr <i>business</i>
            </h1>
            <h1>
              A business solution designed for <i>teams</i>
            </h1>
            <p>
              Upgrade to a curated experience packed with tools and benefits,
              dedicated to businesses
            </p>
            <div className="title">
              <img src="./img/check.png" alt="" />
              Connect to freelancers with proven business experience
            </div>

            <div className="title">
              <img src="./img/check.png" alt="" />
              Get matched with the perfect talent by a customer success manager
            </div>

            <div className="title">
              <img src="./img/check.png" alt="" />
              Manage teamwork and boost productivity with one powerful workspace
            </div>
            <button>Explore Fiverr Business</button>
          </div>
          <div className="item">
            <img
              src="https://fiverr-res.cloudinary.com/q_auto,f_auto,w_870,dpr_2.0/v1/attachments/generic_asset/asset/d9c17ceebda44764b591a8074a898e63-1599597624768/business-desktop-870-x2.png"
              alt=""
            />
          </div>
        </div>
      </div>
      <Slide slidesToShow={4} arrowsScroll={4}>
        {projects.map((card) => (
          <ProjectCard key={card.id} card={card} />
        ))}
      </Slide>
    </div>
  );
}

export default Home;

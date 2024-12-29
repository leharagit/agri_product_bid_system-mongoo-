import React from "react";
import "./Footer.scss";

function Footer() {
  return (
    <div className="footer">
      <div className="container">
        <div className="top">
          <div className="item">
            <h2>Categories</h2>
            <span>Vagitables</span>
            <span>Fruits</span>
            <span>Spices</span>
            <span>Fish</span>
            <span>Meat</span>
            <span>Coconuts</span>
          
          </div>
          <div className="item">
            <h2>About</h2>
            <span>Press & News</span>
            <span>Partnerships</span>
            <span>Privacy Policy</span>
            <span>Terms of Service</span>
            <span>Intellectual Property Claims</span>
            <span>Investor Relations</span>
            <span>Contact Sales</span>
          </div>
          <div className="item">
            <h2>Support</h2>
            <span>Help & Support</span>
            <span>Trust & Safety</span>
            <span>Selling on Auction</span>
            <span>Buying on Auction</span>
          </div>
          <div className="item">
            <h2>Community</h2>
            <span>Customer Success Stories</span>
            <span>Community hub</span>
            <span>Forum</span>
            <span>Events</span>
            <span>Blog</span>
            <span>Influencers</span>
            <span>Affiliates</span>
            <span>Podcast</span>
            <span>Invite a Friend</span>
            <span>Become a Seller</span>
            <span>Community Standards</span>
          </div>
          <div className="item">
            <h2>Locasions</h2>
            <span>Colombo</span>
            <span>Kurunagala</span>
            <span>Gampaha</span>
            <span>Kaluthara</span>
            <span>Rathnapura</span>
            <span>Kegolle</span>
            <span>Nuwaraeliya</span>
            <span>Kandy</span>
            <span>Anuradapura</span>
            <span>Polonaruwa</span>
          </div>
        </div>
        <hr />
        <div className="bottom">
          <div className="left">
            <h2>Auction</h2>
            <span>© Auction FULL Stack Group 05. 2024</span>
          </div>
          <div className="right">
            <div className="social">
              <img src="/img/twitter.png" alt="" />
              <img src="/img/facebook.png" alt="" />
              <img src="/img/linkedin.png" alt="" />
              <img src="/img/pinterest.png" alt="" />
              <img src="/img/instagram.png" alt="" />
            </div>
           
            <div className="link">
              <img src="/img/coin.png" alt="" />
              <span>LKR</span>
            </div>
            <img src="/img/accessibility.png" alt="" />
          </div>
        </div>
      </div>
    </div>
  );
}

export default Footer;

import Logo from "@/assets/Logo.png";

const Footer = () => {
  return (
    <footer className="bg-primary-100 py-16">
      <div className="justify-content mx-auto w-5/6 gap-16 md:flex">
        <div className="mt-16 basis-1/2 md:mt-0">
          <img alt="logo" src={Logo} />
          <p className="my-5">
          Stay connected with us for the latest updates, auction schedules, and exclusive offers! Sign up for our newsletter and joinSure! Here’s a community passionate about agriculture.
          </p>
          <p>© AuctionClick All Rights Reserved.</p>
        </div>
        
        <div className="mt-16 basis-1/4 md:mt-0">
          <h4 className="font-bold">Contact Us</h4>
          <p className="my-5">auctionclick@gmail.com</p>
          <p>(012)-345-6789</p>
        </div>
      </div>
    </footer>
  );
};

export default Footer;

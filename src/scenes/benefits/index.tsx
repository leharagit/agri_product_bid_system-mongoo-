import ActionButton from "@/shared/ActionButton";
import HText from "@/shared/HText";
import { BenefitType, SelectedPage } from "@/shared/types";
import {
  HomeModernIcon,
  UserGroupIcon,
  AcademicCapIcon,
} from "@heroicons/react/24/solid";
import { motion } from "framer-motion";
import BenefitsPageGraphic from "@/assets/BenefitsPageGraphic.png";
import Benefit from "./Benefit";

const benefits: Array<BenefitType> = [
  {
    icon: <HomeModernIcon className="h-6 w-6" />,
    title: "Support Local Farmers",
    description:
      "By participating in our auctions, you directly support local farmers and producers, helping to sustain your community's agricultural economy",
  },
  {
    icon: <UserGroupIcon className="h-6 w-6" />,
    title: "Competitive Pricing",
    description:
      "Enjoy competitive pricing through our auction system, where you can bid and potentially secure high-quality products at lower prices.",
  },
  {
    icon: <AcademicCapIcon className="h-6 w-6" />,
    title: "Educational Resources",
    description:
      "Gain access to valuable resources and guides on agricultural practices, helping you make informed decisions about your purchases.",
  },
];

const container = {
  hidden: {},
  visible: {
    transition: { staggerChildren: 0.2 },
  },
};

type Props = {
  setSelectedPage: (value: SelectedPage) => void;
};

const Benefits = ({ setSelectedPage }: Props) => {
  return (
    <section id="benefits" className="mx-auto min-h-full w-5/6 py-20">
      <motion.div
        onViewportEnter={() => setSelectedPage(SelectedPage.Benefits)}
      >
        {/* HEADER */}
        <motion.div
          className="md:my-5 md:w-3/5"
          initial="hidden"
          whileInView="visible"
          viewport={{ once: true, amount: 0.5 }}
          transition={{ duration: 0.5 }}
          variants={{
            hidden: { opacity: 0, x: -50 },
            visible: { opacity: 1, x: 0 },
          }}
        >
          <HText>MORE THAN JUST BIDDING.</HText>
          <p className="my-5 text-sm">
          Looking for the best deals on high-quality agricultural products? Join our auction today and discover unique items from local farmers! What specific products are you interested in bidding on? Let us know, and we can help you find exactly what you need!.
          </p>
        </motion.div>

        {/* BENEFITS */}
        <motion.div
          className="mt-5 items-center justify-between gap-8 md:flex"
          initial="hidden"
          whileInView="visible"
          viewport={{ once: true, amount: 0.5 }}
          variants={container}
        >
          {benefits.map((benefit: BenefitType) => (
            <Benefit
              key={benefit.title}
              icon={benefit.icon}
              title={benefit.title}
              description={benefit.description}
              setSelectedPage={setSelectedPage}
            />
          ))}
        </motion.div>

        {/* GRAPHICS AND DESCRIPTION */}
        <div className="mt-16 items-center justify-between gap-20 md:mt-28 md:flex">
          {/* GRAPHIC */}
          <img
            className="mx-auto"
            alt="benefits-page-graphic"
            src={BenefitsPageGraphic}
          />

          {/* DESCRIPTION */}
          <div>
            {/* TITLE */}
            <div className="relative">
              <div className="before:absolute before:-top-20 before:-left-20 before:z-[1] before:content-abstractwaves">
                <motion.div
                  initial="hidden"
                  whileInView="visible"
                  viewport={{ once: true, amount: 0.5 }}
                  transition={{ duration: 0.5 }}
                  variants={{
                    hidden: { opacity: 0, x: 50 },
                    visible: { opacity: 1, x: 0 },
                  }}
                >
                  <HText>
                     HAPPY MEMBERS GET WHAT THEY {" "}
                    <span className="text-primary-500">WANT</span>
                  </HText>
                </motion.div>
              </div>
            </div>

            {/* DESCRIPT */}
            <motion.div
              initial="hidden"
              whileInView="visible"
              viewport={{ once: true, amount: 0.5 }}
              transition={{ delay: 0.2, duration: 0.5 }}
              variants={{
                hidden: { opacity: 0, x: 50 },
                visible: { opacity: 1, x: 0 },
              }}
            >
              <p className="my-5">
              Experience the thrill of real-time bidding 
              on our user-friendly platform, where you can 
              engage with other buyers and make quick decisions 
              to win your desired items. We prioritize transparency 
              and trust, providing secure payment options and seller
               ratings to give you peace of mind with every transaction. 
               Our platform fosters a sense of community, connecting like-minded
               agricultural enthusiasts who share knowledge, tips, and experiences 
               to enhance your farming journey.
              </p>
              <p className="mb-5">
              Enjoy the convenience of bidding from anywhere, at 
              any time! Our online auction system allows you to 
              participate from the comfort of your home or while
               on the go. Additionally, you will gain access to 
               valuable educational resources and guides on 
               agricultural practices, empowering you to make
                informed decisions about your purchases. 
                Join us today and elevate your agricultural
                 endeavors through our innovative auction platform!
              </p>
            </motion.div>

            {/* BUTTON */}
            <div className="relative mt-16">
              <div className="before:absolute before:-bottom-20 before:right-40 before:z-[-1] before:content-sparkles">
                <ActionButton setSelectedPage={setSelectedPage}>
                  Join Now
                </ActionButton>
              </div>
            </div>
          </div>
        </div>
      </motion.div>
    </section>
  );
};

export default Benefits;

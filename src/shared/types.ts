export enum SelectedPage {
  Home = "home",
  Benefits = "benefits",
  ContactUs = "contactus",
  Login = "Loginpage",
  Payment = "paymentpage",
}

export interface BenefitType {
  icon: JSX.Element;
  title: string;
  description: string;
}

export interface ClassType {
  name: string;
  description?: string;
  image: string;
}

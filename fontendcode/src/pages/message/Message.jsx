import { useMutation, useQuery, useQueryClient } from "@tanstack/react-query";
import React from "react";
import { Link, useParams } from "react-router-dom";
import axios from "axios";
import "./Message.scss";

const Message = () => {
  const { userId } = useParams(); // Assuming `userId` is passed as a parameter
  const currentUser = JSON.parse(localStorage.getItem("currentUser"));

  const queryClient = useQueryClient();

  // Fetch notifications for the specific user
  const { isLoading, error, data } = useQuery({
    queryKey: ["notifications", userId],
    queryFn: () =>
      axios
        .get(`http://localhost:8080/api/notifications/user/${userId}`) // Update the URL to match your Spring Boot API
        .then((res) => res.data),
  });

  // Mutation to create a new notification
  const mutation = useMutation({
    mutationFn: (notification) => {
      return axios.post("http://localhost:8080/api/notifications", notification); // Update the URL to match your Spring Boot API
    },
    onSuccess: () => {
      queryClient.invalidateQueries(["notifications", userId]);
    },
  });

  // Handle form submission to send a new notification
  const handleSubmit = (e) => {
    e.preventDefault();
    mutation.mutate({
      userId: userId, // Recipient's user ID
      content: e.target[0].value,
      timestamp: new Date().toISOString(),
      status: "Unread",
    });
    e.target[0].value = ""; // Clear the textarea after submission
  };

  return (
    <div className="message">
      <div className="container">
        <span className="breadcrumbs">
          <Link to="/notifications">Notifications</Link>  User Notifications 
        </span>
        {isLoading ? (
          "Loading notifications..."
        ) : error ? (
          "Error fetching notifications."
        ) : (
          <div className="messages">
            {data.map((notification) => (
              <div
                className={`item ${notification.status === "Unread" ? "unread" : ""}`}
                key={notification.id}
              >
                <p>{notification.content}</p>
                <span className="timestamp">
                  {new Date(notification.timestamp).toLocaleString()}
                </span>
              </div>
            ))}
          </div>
        )}
        <hr />
        <form className="write" onSubmit={handleSubmit}>
          <textarea type="text" placeholder="Write a notification..." required />
          <button type="submit">Send</button>
        </form>
      </div>
    </div>
  );
};

export default Message;



import React, { use } from "react";
import { LoginContext } from "./components/loginContext";
import { useNavigate } from "react-router";

function Logout() {
  const { login, setLogin } = use(LoginContext);
  const navigate = useNavigate();

  const logoutSubmit = (e) => {
    setLogin({ result: false, id: "guest" });
    navigate("/");
  };

  return (
    <>
      <h2>logout page</h2>
      <button
        onClick={(e) => {
          logoutSubmit(e);
        }}
      >
        logout
      </button>
    </>
  );
}

export default Logout;

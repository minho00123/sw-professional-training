import React, { useContext } from "react";
import { Link, NavLink, Outlet } from "react-router";
import Logout from "../Logout";
// import { LoginContext } from "./loginContext";

function Layout({ login }) {
  // const { login } = useContext(LoginContext);
  return (
    <>
      <nav>
        <NavLink to={"/"}>home</NavLink> <NavLink to={"/intro"}>intro</NavLink>{" "}
        <NavLink to={"/dept"}>dept</NavLink>{" "}
        {login.result ? (
          <NavLink to={"/login/logout"}>logout</NavLink>
        ) : (
          <NavLink to={"/login"}>login</NavLink>
        )}
      </nav>
      <>
        <Outlet />
      </>
    </>
  );
}

export default Layout;

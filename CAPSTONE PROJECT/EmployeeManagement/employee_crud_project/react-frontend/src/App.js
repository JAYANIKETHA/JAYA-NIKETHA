import "./App.css";
import ListEmployeeComponent from "./components/ListEmployeeComponent";
import React from "react";
import { BrowserRouter as Router, Route, Routes } from "react-router-dom";
import HeaderComponent from "./components/HeaderComponent";
import FooterComponent from "./components/FooterComponent";

function App() {
  return (
    <div>
      <Router>
          <HeaderComponent></HeaderComponent>
            <div className="container">
              <Routes>
                <Route path = "/" element = {<ListEmployeeComponent/>}></Route>
                <Route path = "/employees" element = {<ListEmployeeComponent/>}></Route>
              </Routes>
            </div>
          <FooterComponent></FooterComponent>
      </Router>
    </div>
  );
}

export default App;

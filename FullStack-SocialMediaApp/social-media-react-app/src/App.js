import React, { useState, useEffect } from 'react';
import { Route, Routes } from 'react-router-dom';
import axios from 'axios';
import 'bootstrap/dist/css/bootstrap.min.css';
import Loading from './components/Loading'; // Import your loading component
import Login from './components/Login';
import Register from './components/Register';
import Welcome from './components/Welcome';
import Adminpanel from './components/Adminpanel';
import Explore from './components/Explore';
import Profile from './components/Profile';
import PageNotFound from './components/PageNotFound';

function App() {
  const [userRole, setUserRole] = useState(null);
  const [isLoading, setIsLoading] = useState(true);

  useEffect(() => {
    const username = localStorage.getItem('username');
    axios
      .get(`http://localhost:8080/user/${username}`)
      .then((response) => {
        const role = response.data.role;
        setUserRole(role);
      })
      .catch((error) => {
        console.error(`Error fetching user data: ${error}`);
      })
      .finally(() => {
        setIsLoading(false); // Set loading state to false after fetching user data
      });
  }, []);

  const isAdmin = userRole && userRole.toLowerCase() === 'admin';

  return (
    <div className="App">
      {isLoading ? (
        <Loading /> // Render the loading component while isLoading is true
      ) : (
        <Routes>
          <Route path="/" element={<Welcome />} />
          <Route path="/login" element={<Login />} />
          <Route path="/register" element={<Register />} />
          <Route path="/welcome" element={<Welcome />} />
          <Route path="/explore" element={<Explore />} />
          <Route path="/profile" element={<Profile />} />
          {isAdmin ? (
            <Route path="/adminpanel" element={<Adminpanel />} />
          ) : null}
          <Route path="/*" element={<PageNotFound />} />
        </Routes>
      )}
    </div>
  );
}

export default App;

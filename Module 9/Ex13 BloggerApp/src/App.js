import logo from './logo.svg';
import './App.css';

import React from "react";
import BookDetails from "./Components/BookDetails";
import BlogDetails from "./Components/BlogDetails";
import CourseDetails from "./Components/CourseDetails";

function App() {
  const showBooks = true;
  const showBlogs = true;
  const showCourses = true;

  return (
    <div>
      <h1>Blogger App</h1>

      {showBooks ? <BookDetails /> : null}

      {showBlogs && <BlogDetails />}

      {showCourses ? (
        <CourseDetails />
      ) : (
        <h3>No Courses Available</h3>
      )}
    </div>
  );
}

export default App;
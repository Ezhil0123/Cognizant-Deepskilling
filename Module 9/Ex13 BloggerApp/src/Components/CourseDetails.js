import React from "react";

function CourseDetails() {
  const courses = [
    {
      id: 1,
      name: "ReactJS"
    },
    {
      id: 2,
      name: "Angular"
    },
    {
      id: 3,
      name: "Spring Boot"
    }
  ];

  return (
    <div>
      <h2>Course Details</h2>

      <ul>
        {courses.map(course => (
          <li key={course.id}>
            {course.name}
          </li>
        ))}
      </ul>
    </div>
  );
}

export default CourseDetails;
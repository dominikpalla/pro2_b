package cz.uhk.pro2_b.service;

import cz.uhk.pro2_b.model.Course;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CourseService {

    List<Course> getAllCourses();

    void saveCourse(Course course);

    Course getCourse(long id);

    void deleteCourse(long id);
}

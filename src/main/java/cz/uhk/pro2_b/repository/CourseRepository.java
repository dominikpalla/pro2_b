package cz.uhk.pro2_b.repository;

import cz.uhk.pro2_b.model.Course;
import cz.uhk.pro2_b.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {

}

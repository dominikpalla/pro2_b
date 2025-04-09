package cz.uhk.pro2_b.repository;

import cz.uhk.pro2_b.model.Lecturer;
import cz.uhk.pro2_b.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LecturerRepository extends JpaRepository<Lecturer, Long> {

}

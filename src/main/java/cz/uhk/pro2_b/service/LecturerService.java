package cz.uhk.pro2_b.service;

import cz.uhk.pro2_b.model.Lecturer;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface LecturerService {

    List<Lecturer> getAllLecturers();

    void saveLecturer(Lecturer lecturer);

    Lecturer getLecturer(long id);

    void deleteLecturer(long id);
}

package CaseStudy.model.sevice.implement;

import CaseStudy.model.entity.StudyProcess;
import CaseStudy.model.repository.StudentRepository;
import CaseStudy.model.sevice.IstudyProcesses;

import java.util.List;

public class StudyProcesses implements IstudyProcesses {
    private static StudentRepository studentRepository = new StudentRepository();

    @Override
    public List<StudyProcess> getallStudyProcesses() {
        return studentRepository.findAllStudyProcesses();
    }

    @Override
    public StudyProcess getStudyProcessByStudentId(int studentId) {
        return studentRepository.findStudyProcessByStudentId(studentId);
    }


    @Override
    public void addStudyProcess(StudyProcess studyProcess) {
studentRepository.addStudyProcess(studyProcess);
    }

    @Override
    public void updateStudyProcess(StudyProcess studyProcess) {

    }
}

package CaseStudy.model.sevice;

import CaseStudy.model.entity.StudyProcess;

import java.util.List;

public interface IstudyProcesses {
    List<StudyProcess> getallStudyProcesses();

    StudyProcess getStudyProcessByStudentId(int studentId);

    void addStudyProcess(StudyProcess studyProcess);

    void updateStudyProcess(StudyProcess studyProcess);
}

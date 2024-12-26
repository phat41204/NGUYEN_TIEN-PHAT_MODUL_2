package CaseStudy.Model.Sevice;

import CaseStudy.Model.Entity.StudyProcess;

import java.util.List;

public interface IstudyProcesses {
    List<StudyProcess> getallStudyProcesses();

    StudyProcess getStudyProcessByStudentId(int studentId);

    void addStudyProcess(StudyProcess studyProcess);

    void updateStudyProcess(int studenId ,StudyProcess studyProcess);
}

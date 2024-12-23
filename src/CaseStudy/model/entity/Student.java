package CaseStudy.model.entity;

public class Student extends Preson{
    private int points;
    private StudyProcess studyProcess;

    public Student(int code, String name, String address, int age, String gender, int points) {
        super(code, name, address, age, gender);
        this.points = points;
        this.studyProcess = studyProcess;
    }

    public StudyProcess getStudyProcess() {
        return studyProcess;
    }

    public void setStudyProcess(StudyProcess studyProcess) {
        this.studyProcess = studyProcess;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    @Override
    public String toString() {
        return super.toString()+", "+
                "points=" + points ;
    }
}

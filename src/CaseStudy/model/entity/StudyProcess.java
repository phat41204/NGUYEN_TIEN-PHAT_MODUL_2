package CaseStudy.model.entity;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class StudyProcess {
    private LocalDate enrollmentDate;
    ;
    private boolean isOnLeave;

    public StudyProcess(LocalDate enrollmentDate, boolean isOnLeave) {
        this.enrollmentDate = enrollmentDate;
        this.isOnLeave = isOnLeave;
    }

    public LocalDate getEnrollmentDate() {
        return enrollmentDate;
    }

    public void setEnrollmentDate(LocalDate enrollmentDate) {
        this.enrollmentDate = enrollmentDate;
    }

    public boolean isOnLeave() {
        return isOnLeave;
    }

    public void setOnLeave(boolean onLeave) {
        isOnLeave = onLeave;
    }
    public int getYearsStudied() {
        if (enrollmentDate != null) {
            LocalDate currentDate = LocalDate.now();
            Period period = Period.between(enrollmentDate, currentDate);
            return period.getYears();
        }
        return 0;
    }
    public int getYearsRemainingForGraduation() {
        if (enrollmentDate != null) {
            LocalDate graduationDate = enrollmentDate.plusYears(4);  // Thời gian tốt nghiệp là 4 năm từ ngày nhập học
            Period period = Period.between(LocalDate.now(), graduationDate);
            return period.getYears();
        }
        return 0;
    }
}


public class Question2 {
    private String applicant;
    private String job;
    private boolean application;

    public Question2(String applicant, String job, boolean application) {
        this.applicant = applicant;
        this.job = job;
        this.application = application;
    }

    public String getApplicant() {
        return applicant;
    }

    public void setApplicant(String applicant) {
        this.applicant = applicant;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public boolean isApplication() {
        return application;
    }

    public void setApplication(boolean application) {
        this.application = application;
    }

    public String toString(){
        return" Please pay your Application fee!!\n\n\nYour Application has been submitted sucessfully!!";
    }

}

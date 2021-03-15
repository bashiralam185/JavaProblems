import javax.swing.plaf.synth.SynthRadioButtonMenuItemUI;

public class Student {
    String firstName;
    String lastName;
    String email;
    double percentage;
    String degree;

    public Student(String firstName, String lastName, String email, double percentage, String degree){
        this.firstName=firstName;
        this.lastName=lastName;
        this.email=email;
        this.percentage=percentage;
        this.degree=degree;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLastName() {
        return lastName;
    }

    public double getPercentage() {
        return percentage;
    }

    public String getDegree() {
        return degree;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String toString(){
        return "Student[firstname='"+firstName+"', lastName='"+lastName+", email='"+email+"', gpa="+percentage+", degree='"+degree+"']";
    }
}


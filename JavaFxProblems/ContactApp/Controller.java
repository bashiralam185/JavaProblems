package sample;


import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class Controller {
    private ObservableList<Contact> contacts = FXCollections.observableArrayList();
    private Contact contactSelected;
    @FXML private ListView<Contact> contactsListView;
    @FXML private TextField firstNameTextField;
    @FXML private TextField lastNameTextField;
    @FXML private TextField emailTextField;
    @FXML private TextField phoneNumberTextField;
    @FXML private TextField studentIdTextField;
    @FXML private Text errorMessage;
    @FXML void addContactButtonPressed(ActionEvent event) {
        if (isAnyEntryEmpty()) errorMessage.setText("Please fill all entries");
        else {
            errorMessage.setText("");
            Contact newContact = new Contact();
            newContact.setFirstName(firstNameTextField.getText().trim());
            newContact.setLastName(lastNameTextField.getText().trim());
            newContact.setEmail(emailTextField.getText().trim());
            newContact.setPhoneNumber(phoneNumberTextField.getText().trim());
            newContact.setStudentId(studentIdTextField.getText().trim());
            contacts.add(newContact);
        }
    }
    @FXML void deleteContactButtonPressed(ActionEvent event) {
        contacts.remove(contactSelected);
    }
    @FXML void updateContactButtonPressed(ActionEvent event) {
        if (isAnyEntryEmpty()) errorMessage.setText("Please fill all entries");
        else {
            errorMessage.setText("");
            contactSelected.setFirstName(firstNameTextField.getText().trim());
            contactSelected.setLastName(lastNameTextField.getText().trim());
            contactSelected.setEmail(emailTextField.getText().trim());
            contactSelected.setPhoneNumber(phoneNumberTextField.getText().trim());
            contactSelected.setStudentId(studentIdTextField.getText().trim());
        }
    }
    public void initialize() {
        contacts.add(new Contact("Bashir", "Alam", "bashir.alam_2023@ucentralasia.org", "+97564973", "552529"));
        contacts.add(new Contact("Aqeel", "ahamd", "Aqeelahamd@gmail.co", "+194893943", "435400"));
        contacts.add(new Contact("Khan", "dh", "abckdjkfdkd@gmail.co", "+1948487489", "045340"));
        contacts.add(new Contact("wekdf", "rkjskld", "dkfjrid@gmail.co", "+194545433", "46350"));

        contactsListView.setItems(contacts);
        contactsListView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<Contact>() {
            @Override
            public void changed(ObservableValue<? extends Contact> arg0, Contact oldValue, Contact newValue) {
                contactSelected = newValue;
                firstNameTextField.setText(newValue.getFirstName());
                lastNameTextField.setText(newValue.getLastName());
                emailTextField.setText(newValue.getEmail());
                phoneNumberTextField.setText(newValue.getPhoneNumber());
                studentIdTextField.setText(newValue.getStudentId());
            }
        });
    }
    public boolean isAnyEntryEmpty() {
        return (firstNameTextField.getText().trim().equals("") ||
                lastNameTextField.getText().trim().equals("") ||
                emailTextField.getText().trim().equals("") ||
                phoneNumberTextField.getText().trim().equals("") ||
                studentIdTextField.getText().trim().equals(""));
    }
}

class Contact {
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private String studentId;

    public Contact() {
        this("", "", "", "", "");
    }

    public Contact(String firstName, String lastName, String email, String phoneNumber, String studentId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.studentId = studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return getFirstName() + " " + getLastName().substring(0, 1) + ".";
    }
}
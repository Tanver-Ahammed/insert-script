package entities;

import java.util.List;

public class Participant {

    private Long id;

    private String firstName;

    private String lastName;

    private String designation;

    private String email;

    private String phoneNumber;

    private String imageUrl;

    private List<Session> sessions;

    private List<Session> createdSessions;

    public Participant() {
    }

    public Participant(Long id, String firstName, String lastName, String designation, String email, String phoneNumber, String imageUrl) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.designation = designation;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.imageUrl = imageUrl;
        this.sessions = sessions;
        this.createdSessions = createdSessions;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
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

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public List<Session> getSessions() {
        return sessions;
    }

    public void setSessions(List<Session> sessions) {
        this.sessions = sessions;
    }

    public List<Session> getCreatedSessions() {
        return createdSessions;
    }

    public void setCreatedSessions(List<Session> createdSessions) {
        this.createdSessions = createdSessions;
    }
}

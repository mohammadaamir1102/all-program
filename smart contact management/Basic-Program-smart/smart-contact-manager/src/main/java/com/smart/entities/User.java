package com.smart.entities;

import java.util.LinkedList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@Table(name = "user_details")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long UserId;
    // this is server side validation by hibernate validater
    @Pattern(regexp = "^[a-zA-Z ]{2,20}$", message = "use character & name should not be blank")
    @NotBlank
    @Size(min = 2, max = 20, message = "min 2 and max 20 characters are allowed !!")
    private String userName;

    @Column(unique = true)
    @Pattern(regexp = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$", message = "Invalid email !!")
    private String userEmail;

    @Pattern(regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[.!@#&()–[{}]:;',?/*~$^+=<>]).{8,20}$", message = "atlest [one (digit & lowercase & uppercase & special symbol ( . ! @ # & ( ) – [ { } ] : ; ' , ? / * ~ $ ^ + = < >) )] min 8 char ,max 32 char ")
    private String userPassword;
    private String role;
    private boolean enabled;
    private String userImageURL;

    @Column(length = 1000)
    private String userAbout;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
    private List<Contact> contacts = new LinkedList<>();

    public User() {
        super();
        // TODO Auto-generated constructor stub
    }

    public User(Long userId, String userName, String userEmail, String userPassword, String role, boolean enabled,
                String userImageURL, String userAbout, List<Contact> contacts) {
        super();
        UserId = userId;
        this.userName = userName;
        this.userEmail = userEmail;
        this.userPassword = userPassword;
        this.role = role;
        this.enabled = enabled;
        this.userImageURL = userImageURL;
        this.userAbout = userAbout;
        this.contacts = contacts;
    }

    public Long getUserId() {
        return UserId;
    }

    public void setUserId(Long userId) {
        UserId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public String getUserImageURL() {
        return userImageURL;
    }

    public void setUserImageURL(String userImageURL) {
        this.userImageURL = userImageURL;
    }

    public String getUserAbout() {
        return userAbout;
    }

    public void setUserAbout(String userAbout) {
        this.userAbout = userAbout;
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }

    @Override
    public String toString() {
        return "User [UserId=" + UserId + ", userName=" + userName + ", userEmail=" + userEmail + ", userPassword="
                + userPassword + ", role=" + role + ", enabled=" + enabled + ", userImageURL=" + userImageURL
                + ", userAbout=" + userAbout + ", contacts=" + contacts + "]";
    }

}

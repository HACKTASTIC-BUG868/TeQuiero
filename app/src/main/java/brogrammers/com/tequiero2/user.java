package brogrammers.com.tequiero2;

import java.util.Arrays;

public class User {
    private String email;
    private String name;
    private String contactNumber;
    private String[] interestList;
    private String userId;

    @Override
    public String toString() {
        return "User{" +
                "email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", contactNumber='" + contactNumber + '\'' +
                ", interestList=" + Arrays.toString(interestList) +
                ", gender='" + gender + '\'' +
                '}';
    }

    public User(String email, String name, String userId) {
        this.email = email;
        this.name = name;
        this.userId = userId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    private String gender;

    public User(String email, String name) {
        this.email = email;
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String[] getInterestList() {
        return interestList;
    }

    public void setInterestList(String[] interestList) {
        this.interestList = interestList;
    }
}

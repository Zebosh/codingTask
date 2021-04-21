
package io.dummyapi.pojoClasses;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class User1 {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("phone")
    @Expose
    private String phone;
    @SerializedName("picture")
    @Expose
    private String picture;
    @SerializedName("location")
    @Expose
    private Location1 location;
    @SerializedName("lastName")
    @Expose
    private String lastName;
    @SerializedName("dateOfBirth")
    @Expose
    private String dateOfBirth;
    @SerializedName("registerDate")
    @Expose
    private String registerDate;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("firstName")
    @Expose
    private String firstName;
    @SerializedName("gender")
    @Expose
    private String gender;

    /**
     * No args constructor for use in serialization
     *
     */
    public User1() {
    }

    /**
     *
     * @param lastName
     * @param firstName
     * @param gender
     * @param phone
     * @param location
     * @param dateOfBirth
     * @param id
     * @param title
     * @param picture
     * @param email
     * @param registerDate
     */
    public User1(String id, String phone, String picture, Location1 location, String lastName, String dateOfBirth, String registerDate, String email, String title, String firstName, String gender) {
        super();
        this.id = id;
        this.phone = phone;
        this.picture = picture;
        this.location = location;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.registerDate = registerDate;
        this.email = email;
        this.title = title;
        this.firstName = firstName;
        this.gender = gender;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

   public Location1 getLocation() { return location; }

    public void setLocation(Location1 location) {
        this.location = location;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(String registerDate) {
        this.registerDate = registerDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }


}

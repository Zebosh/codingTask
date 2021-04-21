
package io.dummyapi.pojoClasses;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Location1 {

    @SerializedName("street")
    @Expose
    private String street;
    @SerializedName("country")
    @Expose
    private String country;
    @SerializedName("state")
    @Expose
    private String state;
    @SerializedName("city")
    @Expose
    private String city;
    @SerializedName("timezone")
    @Expose
    private String timezone;

    /**
     * No args constructor for use in serialization
     *
     */
    public Location1() {
    }

    /**
     *
     * @param country
     * @param city
     * @param street
     * @param timezone
     * @param state
     */
    public Location1(String street, String country, String state, String city, String timezone) {
        super();
        this.street = street;
        this.country = country;
        this.state = state;
        this.city = city;
        this.timezone = timezone;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    @Override
    public String toString() {
        return "Location{" +
                "street='" + street + '\'' +
                ", country='" + country + '\'' +
                ", state='" + state + '\'' +
                ", city='" + city + '\'' +
                ", timezone='" + timezone + '\'' +
                '}';
    }
}

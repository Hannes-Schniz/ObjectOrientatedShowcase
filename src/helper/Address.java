package helper;

/***
 * @author Hannes Schniz
 * @version 0.1
 */
public class Address {
    private PLZ city;
    private String country;
    private String house;

    /***
     *
     * @param city
     * @param country
     * @param house
     */
    public Address(PLZ city, String country, String house) {
        this.city = city;
        this.country = country;
        this.house = house;
    }

    /***
     *
     * @return the city
     */
    public PLZ getCity() {
        return city;
    }

    /***
     *
     * @param city
     */
    public void setCity(PLZ city) {
        this.city = city;
    }

    /***
     *
     * @return the country
     */
    public String getCountry() {
        return country;
    }

    /***
     *
     * @param country
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /***
     *
     * @return the house nr
     */
    public String getHouse() {
        return house;
    }

    /***
     *
     * @param house
     */
    public void setHouse(String house) {
        this.house = house;
    }
}

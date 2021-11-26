package human;
import helper.*;

import java.awt.*;

/***
 * @author Hannes Schniz
 * @version 0.1
 */
public class Person {
    private String name;
    private Date birthdate;
    private Color eyecolor;
    private int shoesize;
    private Address address;

    /***
     *
     * @param name
     * @param address
     * @param birthdate
     * @param eyecolor
     * @param shoesize
     */
    public Person(String name, Address address, Date birthdate, Color eyecolor, int shoesize) {
        this.name = name;
        this.birthdate = birthdate;
        this.eyecolor = eyecolor;
        this.shoesize = shoesize;
        this.address = address;
    }

    /***
     *
     * @return the address
     */
    public Address getAddress() {
        return address;
    }

    /***
     *
     * @param address
     */
    public void setAddress(Address address) {
        this.address = address;
    }

    /***
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /***
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /***
     *
     * @return the shoesize
     */
    public int getShoesize() {
        return shoesize;
    }

    /***
     *
     * @param shoesize
     */
    public void setShoesize(int shoesize) {
        this.shoesize = shoesize;
    }

    /***
     *
     * @return date of birth
     */
    public Date getBirthdate() {
        return birthdate;
    }

    /***
     *
     * @return color of eye
     */
    public Color getEyecolor() {
        return eyecolor;
    }
}

package helper;

/***
 * @author Hannes Schniz
 * @version 0.1
 */
public class PLZ {
    private int PLZ;
    private String name;

    /***
     *
     * @param PLZ
     * @param name
     */
    public PLZ(int PLZ, String name) {
        this.PLZ = PLZ;
        this.name = name;
    }

    /***
     *
     * @return the PLZ
     */
    public int getPLZ() {
        return PLZ;
    }

    /***
     *
     * @return the name of the city
     */
    public String getName() {
        return name;
    }
}

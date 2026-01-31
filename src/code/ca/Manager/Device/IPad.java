package ca.Manager.Device;

import java.util.Objects;

/**
 * Represents an Ipad.
 *
 * @author Giant Mak
 * @author Markus Serban
 *
 * @version 1.0
 */
public class IPad extends IDevice
{
    private boolean hasCase;
    private String operatingSystemVersion;

    /**
     * Constructs an IPad object with all parameters inputted.
     *
     * @param hasCase to be set
     * @param operatingSystemVersion to be set
     */
    public IPad(final boolean hasCase,
                final String operatingSystemVersion)
    {
        super("learning");
        this.hasCase = hasCase;
        this.operatingSystemVersion = operatingSystemVersion;
    }

    /**
     * Gets the value of hasCase.
     *
     * @return hasCase
     */
    public boolean getHasCase()
    {
        return hasCase;
    }

    /**
     * Gets the value of operatingSystemVersion.
     *
     * @return operatingSystemVersion.
     */
    public String getOperatingSystemVersion()
    {
        return operatingSystemVersion;
    }

    /**
     * Sets the value of hasCase.
     *
     * @param hasCase to be set
     */
    public void setHasCase(final boolean hasCase)
    {
        this.hasCase = hasCase;
    }

    /**
     * Sets the value of operatingSystemVersion.
     *
     * @param operatingSystemVersion to be set
     */
     public void setOperatingSystemVersion(final String operatingSystemVersion)
    {
        this.operatingSystemVersion = operatingSystemVersion;
    }

    /**
     * Prints the details of this object.
     */
    @Override
    public void printDetails()
    {
        System.out.println("Has a case: " + hasCase);
        System.out.println("Operating system version: " + operatingSystemVersion);
    }

    /**
     * Returns concatenated String with all information about this IPad.
     *
     * @return concatenated String
     */
    @Override
    public String toString()
    {
        return super.toString() +
                "Has a case: " + hasCase + "\n" +
                "Operating system version: " + operatingSystemVersion;
    }

    /**
     * Returns if this object is equal to another object.
     *
     * @param object the reference object with which to compare.
     *
     * @return is equal or not
     */
    @Override
    public boolean equals(final Object object)
    {
        if(!super.equals(object))
        {
            return false;
        }

        IPad that = (IPad)object;

        return that.getOperatingSystemVersion().equals(operatingSystemVersion);
    }

    /**
     * Returns a hashed value based on the information of this IPad.
     *
     * @return Hashed value
     */
    @Override
    public int hashCode()
    {
        return Objects.hash(
                super.hashCode(),
                hasCase,
                operatingSystemVersion
        );
    }

}

package ca.Manager.Device;

import java.util.Objects;

/**
 * Represents an IOS device.
 *
 * @author Giant Mak
 * @author Markus Serban
 *
 * @version 1.0
 */
public abstract class IDevice
{

    private final String purpose;

    /**
     * Constructs a new IDevice object.
     *
     * @param purpose to be set
     */
    public IDevice(final String purpose)
    {
        this.purpose = purpose;
    }

    /**
     * gets the value of purpose.
     *
     * @return purpose
     */
    public String getPurpose()
    {
        return purpose;
    }

    /**
     * Method to be defined in a later class that will print the
     * details of this object.
     */
    public abstract void printDetails();

    /**
     * Returns concatenated String with all information about this IDevice.
     *
     * @return concatenated String
     */
    @Override
    public String toString()
    {
        return "The purpose of this iDevice is" + getPurpose() + "\n";
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
        if(this == object)
        {
            return true;
        }

        if(object == null || object.getClass() != this.getClass())
        {
            return false;
        }

        IDevice that = (IDevice)object;

        return that.getPurpose().equals(purpose);
    }

    /**
     * Returns a hashed value based on the information of this IDevice.
     *
     * @return Hashed value
     */
    @Override
    public int hashCode()
    {
        return Objects.hash(getPurpose());
    }

}

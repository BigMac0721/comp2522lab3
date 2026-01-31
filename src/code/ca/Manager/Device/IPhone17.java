package ca.Manager.Device;

import java.util.Objects;

/**
 * Represents a model of IPhone, IPhone17.
 *
 * @author Giant Mak
 * @author Markus Serban
 *
 * @version 1.0
 */
public class IPhone17 extends IPhone
{
    private boolean highResolutionCamera;
    private int memoryGB;

    /**
     * Constructs an IPhone17 object with all parameters inputted.
     *
     * @param minutesLeftOnPhonePlan to be set
     * @param carrier to be set
     * @param highResolutionCamera to be set
     * @param memoryGB to be set
     */
    public IPhone17(final double minutesLeftOnPhonePlan,
                    final String carrier,
                    final boolean highResolutionCamera,
                    final int memoryGB)
    {
        super(  minutesLeftOnPhonePlan,
                carrier);

        this.highResolutionCamera = highResolutionCamera;
        this.memoryGB =             memoryGB;
    }

    /**
     * Gets the value of isHighResolutionCamera.
     *
     * @return isHighResolutionCamera.
     */
    public boolean isHighResolutionCamera()
    {
        return highResolutionCamera;
    }

    /**
     * Gets the value of memoryGB.
     *
     * @return memoryGB
     */
    public int getMemoryGB()
    {
        return memoryGB;
    }

    /**
     * Sets the value of isHighResolutionCamera.
     *
     * @param highResolutionCamera to be set
     */
    public void setHighResolutionCamera(final boolean highResolutionCamera)
    {
        this.highResolutionCamera = highResolutionCamera;
    }

    /**
     * Sets the value of memoryGB
     *
     * @param memoryGB to be set
     */
    public void setMemoryGB(final int memoryGB)
    {
        this.memoryGB = memoryGB;
    }

    /**
     * Prints the details of this object.
     */
    @Override
    public void printDetails()
    {
        super.printDetails();
        System.out.println("High resolution camera: " + highResolutionCamera);
        System.out.println("Memory GB: " + memoryGB);
    }

    /**
     * Returns concatenated String with all information about this IPhone17.
     *
     * @return concatenated String
     */
    @Override
    public String toString()
    {
        return super.toString() +
                "high resolution camera: " + highResolutionCamera + "\n" +
                "memory GB: " + memoryGB;
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

        final IPhone17 that = (IPhone17)object;

        return (that.getMinutesLeftOnPhonePlan() == this.getMinutesLeftOnPhonePlan() &&
                that.highResolutionCamera == this.highResolutionCamera);
    }

    /**
     * Returns a hashed value based on the information of this IPhone17.
     *
     * @return Hashed value
     */
    @Override
    public int hashCode()
    {
        return Objects.hash(
                super.hashCode(),
                this.getMinutesLeftOnPhonePlan(),
                highResolutionCamera
        );
    }

}

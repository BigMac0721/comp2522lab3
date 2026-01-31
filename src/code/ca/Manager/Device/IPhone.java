package ca.Manager.Device;

import java.util.Objects;

/**
 * represents an IPhone.
 *
 * @author Giant Mak
 * @author Markus Serban
 *
 * @version 1.0
 */
public class IPhone extends IDevice
{
    private double minutesLeftOnPhonePlan;
    private String carrier;

    /**
     * Constructs an IPhone object with all parameters inputted.
     *
     * @param minutesLeftOnPhonePlan to be set
     * @param carrier to be set
     */
    public IPhone(final double minutesLeftOnPhonePlan,
                  final String carrier)
    {
        super("Talking");

        this.minutesLeftOnPhonePlan = minutesLeftOnPhonePlan;
        this.carrier = carrier;
    }

    /**
     * Gets the value of carrier.
     *
     * @return carrier
     */
    public String getCarrier()
    {
        return carrier;
    }

    /**
     * Gets the value of minutesLeftOnPhonePlan.
     *
     * @return minutesLeftOnPhonePlan
     */
    public double getMinutesLeftOnPhonePlan()
    {
        return minutesLeftOnPhonePlan;
    }

    /**
     * Sets the value of minutesLeftOnPhonePlan.
     *
     * @param minutesLeftOnPhonePlan to be set
     */
    public void setMinutesLeftOnPhonePlan(double minutesLeftOnPhonePlan)
    {
        this.minutesLeftOnPhonePlan = minutesLeftOnPhonePlan;
    }

    /**
     * Sets the value of carrier.
     *
     * @param carrier to be set
     */
    public void setCarrier(String carrier)
    {
        this.carrier = carrier;
    }

    /**
     * Prints the details of this object.
     */
    @Override
    public void printDetails()
    {
        System.out.println("Time left on phone plan: " + minutesLeftOnPhonePlan);
        System.out.println("Current Carrier: " + carrier);
    }

    /**
     * Returns concatenated String with all information about this IPhone.
     *
     * @return concatenated String
     */
    @Override
    public String toString()
    {
        return super.toString() +
                "Time left on phone plan: " + minutesLeftOnPhonePlan+ "\n" +
                "Current Carrier: " + carrier;
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

        final IPhone that = (IPhone)object;

        return that.getMinutesLeftOnPhonePlan() == this.getMinutesLeftOnPhonePlan();
    }

    /**
     * Returns a hashed value based on the information of this IPhone.
     *
     * @return Hashed value
     */
    @Override
    public int hashCode()
    {
        return Objects.hash(
                super.hashCode(),
                minutesLeftOnPhonePlan,
                carrier
        );
    }
}

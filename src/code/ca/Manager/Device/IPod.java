package ca.Manager.Device;

import java.util.Objects;

/**
 * Represents an Ipod.
 *
 * @author Giant Mak
 * @author Markus Serban
 *
 * @version 1.0
 */
public class IPod extends IDevice
{
    private double maximumVolumeDecibels;
    private int songsStored;

    public IPod(final int songsStored,
                final double maximumVolumeDecibels)
    {
        super("music");
        this.songsStored = songsStored;
        this.maximumVolumeDecibels = maximumVolumeDecibels;
    }

    /**
     * Gets the value of songsStored.
     *
     * @return songsStored.
     */
    public int getSongsStored()
    {
        return songsStored;
    }

    /**
     * Gets the value of maximumVolumeDecibels.
     *
     * @return maximumVolumeDecibels.
     */
    public double getMaximumVolumeDecibels()
    {
        return maximumVolumeDecibels;
    }

    /**
     * Sets the value of songsStored.
     *
     * @param songsStored to be set
     */
    public void setSongsStored(final int songsStored)
    {
        this.songsStored = songsStored;
    }

    /**
     * Sets the value of maximumVolumeDecibels.
     *
     * @param maximumVolumeDecibels to be set
     */
    public void setMaximumVolumeDecibels(final double maximumVolumeDecibels)
    {
        this.maximumVolumeDecibels = maximumVolumeDecibels;
    }

    /**
     * Prints the details of this object.
     */
    @Override
    public void printDetails()
    {
        System.out.println("Number of songs stored: " + songsStored);
        System.out.println("Maximum volume in decibels: " + maximumVolumeDecibels);
    }

    /**
     * Returns concatenated String with all information about this IPod.
     *
     * @return concatenated String
     */
    @Override
    public String toString()
    {
        return super.toString() +
                "Number of songs stored: " + songsStored + "\n" +
                "Maximum volume in decibels: " + maximumVolumeDecibels;
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

        final IPod that = (IPod) object;

        return that.getSongsStored() == songsStored;
    }

    /**
     * Returns a hashed value based on the information of this IPod.
     *
     * @return Hashed value
     */
    @Override
    public int hashCode()
    {
        return Objects.hash(
                super.hashCode(),
                songsStored,
                maximumVolumeDecibels
        );
    }
}

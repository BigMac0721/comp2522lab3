package ca.bcit.comp2522.lab3;

import java.util.Objects;

public class IPod extends IDevice
{
    private int songsStored;
    private double maximumVolumeDecibels;

    public IPod(final int songsStored,
                final double maximumVolumeDecibles)
    {
        super("music");
        this.songsStored = songsStored;
        this.maximumVolumeDecibels = maximumVolumeDecibles;
    }

    public int getSongsStored()
    {
        return songsStored;
    }

    public double getMaximumVolumeDecibles()
    {
        return maximumVolumeDecibels;
    }

    public void setSongsStored(final int songsStored)
    {
        this.songsStored = songsStored;
    }

    public void setMaximumVolumeDecibles(final double maximumVolumeDecibles)
    {
        this.maximumVolumeDecibels = maximumVolumeDecibles;
    }

    @Override
    public void printDetails()
    {
        System.out.println("Number of songs stored: " + songsStored);
        System.out.println("Maximum volume in decibels: " + maximumVolumeDecibels);
    }

    @Override
    public String toString()
    {
        return super.toString() +
                "Number of songs stored: " + songsStored + "\n" +
                "Maximum volume in decibels: " + maximumVolumeDecibels;
    }

    @Override
    public boolean equals(final Object o)
    {
        if(!super.equals(o))
        {
            return false;
        }

        IPod target = (IPod) o;

        return target.getSongsStored() == songsStored;
    }

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

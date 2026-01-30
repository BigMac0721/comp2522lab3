package ca.bcit.comp2522.lab3;

import java.util.Objects;

public abstract class IDevice
{

    private final String purpose;

    public IDevice(final String purpose)
    {
        this.purpose = purpose;
    }

    public String getPurpose()
    {
        return purpose;
    }

    public abstract void printDetails();

    @Override
    public String toString()
    {
        return "The purpose of this iDevice is + " + getPurpose() + "\n";
    }

    @Override
    public boolean equals(final Object o)
    {
        if(this == o)
        {
            return true;
        }

        if(o == null || o.getClass() != this.getClass())
        {
            return false;
        }

        IDevice target = (IDevice) o;

        return target.getPurpose().equals(purpose);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(getPurpose());
    }
}

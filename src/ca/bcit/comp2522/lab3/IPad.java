package ca.bcit.comp2522.lab3;

import java.util.Objects;

public class IPad extends IDevice
{
    private boolean hasCase;
    private String operatingSystemVersion;

    public IPad(final boolean hasCase,
                final String operatingSystemVersion)
    {
        super("learning");
        this.hasCase = hasCase;
        this.operatingSystemVersion = operatingSystemVersion;
    }

    public boolean getHasCase()
    {
        return hasCase;
    }

    public String getOperatingSystemVersion()
    {
        return operatingSystemVersion;
    }

    public void setHasCase(final boolean hasCase)
    {
        this.hasCase = hasCase;
    }

    public void setOperatingSystemVersion(final String operatingSystemVersion)
    {
        this.operatingSystemVersion = operatingSystemVersion;
    }

    @Override
    public void printDetails()
    {
        System.out.println("Has a case: " + hasCase);
        System.out.println("Operating system version: " + operatingSystemVersion);
    }

    @Override
    public String toString()
    {
        return super.toString() +
                "Has a case: " + hasCase + "\n" +
                "Operating system version: " + operatingSystemVersion;
    }

    @Override
    public boolean equals(final Object o)
    {
        if(!super.equals(o))
        {
            return false;
        }

        IPad target = (IPad) o;

        return target.getOperatingSystemVersion().equals(operatingSystemVersion);
    }

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

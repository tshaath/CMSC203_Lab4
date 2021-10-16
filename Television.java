

/**
 *The purpose of this class is to model a television
 *Tariq Shaath
 */

public class Television {
    private final String MANUFACTURER;
    private final int SCREEN_SIZE;
    private boolean powerOn;
    private int channel;
    private int volume;

    /**
     * Constructor that initialize the class members
     * @param brand to store the brand in MANUFACTURER variable
     * @param size to store the size in SCREEN_SIZE
     */
    public Television(String brand, int size)
    {
        MANUFACTURER=brand;
        SCREEN_SIZE=size;
        powerOn=false;
        volume= 20;
        channel=2;
    }
    /**
     * Returns the volume
     * @return tv volume
     */
    public int getVolume ()
    {
        return volume;
    }

    /**
     * Returns the Channel
     * @return tv Channel
     */
    public int getChannel ()
    {
        return channel;
    }

    /**
     * Returns the manufacturer name
     * @return tv brand or manufacturer
     */
    public String getManufacturer ()
    {
        return MANUFACTURER;
    }

    /**
     * Returns the Screen Size
     * @return tv SCREEN_SIZE
     */
    public int getScreenSize ()
    {
        return SCREEN_SIZE;
    }

    /**
     * sets the channel number
     * @param channelN for the channel number
     */
    public void setChannel(int channelN)
    {
        channel=channelN;
    }

    /**
     * sets the power
     */
    public void power()
    {
    powerOn=!powerOn;
    }
    /**
     * sets the volume by increasing it
     */
    public void increaseVolume()
    {
        volume++;
    }
    /**
     * sets the volume by decreasing it
     */
    public void decreaseVolume()
    {
        volume--;
    }



}

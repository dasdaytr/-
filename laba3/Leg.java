package Praktic3;

public class Leg {
    private float length,footSize;
    public Leg(float length,float footSize)
    {
        this.length = length;
        this.footSize = footSize;
    }

    public float getLength()
    {
        return length;
    }

    public float getFootSize()
    {
        return footSize;
    }

    public void setFootSize(float footSize) {
        this.footSize = footSize;
    }

    public void setLength(float length) {
        this.length = length;
    }
}

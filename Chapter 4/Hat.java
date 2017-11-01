
public class Hat
{
    private boolean hatOn;
    private int numOfHats;
    
    public Hat(boolean on, int num) {
        this.hatOn = on;
        this.numOfHats = num;
    }
    
    public int getnumOfHats() {
        return this.numOfHats;
    }
    
    public boolean gethatOn() {
        return this.hatOn;
    }
    
    public String toString() {
        return "This man is wearing: " + this.numOfHats + " hats";
    }
}

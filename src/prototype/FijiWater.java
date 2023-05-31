package prototype;

public class FijiWater extends Product implements Beverages {
    enum AqaType {Carbonated, Still}
    private float volume;
    private AqaType type;

    public AqaType getType() {
        return type;
    }
    public void setType(AqaType type) {
        this.type = type;
    }
    @Override
    public void setVolume(float volume) {
        this.volume = volume;
    }
    @Override
    public float getVolume() {
        return volume;
    }
}
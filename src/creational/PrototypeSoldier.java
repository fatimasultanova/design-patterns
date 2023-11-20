package creational;

public class PrototypeSoldier {

    private String name;
    private int height;
    private boolean isKill;

    public PrototypeSoldier(String name, int height) {
        this.name = name;
        this.height = height;
    }


    @Override
    public PrototypeSoldier clone (){
        return new PrototypeSoldier(name,height);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public boolean isKill() {
        return isKill;
    }

    public void setKill(boolean kill) {
        isKill = kill;
    }
}

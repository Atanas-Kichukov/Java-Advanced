package JavaOOP.Working_With_Abstraction.TrafficLights;

public class TrafficLight {
    //red -> green -> yellow->red
    private Colors colors;

    public TrafficLight(Colors color) {
        this.colors = color;
    }

    public Colors getColors() {
        return this.colors;
    }

    public void update() {
        switch (colors) {
            case RED:
                this.colors = Colors.GREEN;
                break;
            case GREEN:
                this.colors = Colors.YELLOW;
                break;
            case YELLOW:
                this.colors = Colors.RED;
                break;
        }
    }
}

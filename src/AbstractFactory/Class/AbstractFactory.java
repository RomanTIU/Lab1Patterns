package AbstractFactory.Class;

import AbstractFactory.Interface.Mouse;

public class AbstractFactory {
    EnMouse ab = new EnMouse();

    public EnMouse getAb() {
        return ab;
    }

    public void setAb(EnMouse ab) {
        this.ab = ab;
    }

    class EnMouse implements Mouse {

    @Override
    public void click(){
        System.out.println("Click mouse");

    }

    @Override
    public void dbclick() {
        System.out.println("Double Click");
    }

    @Override
    public void scroll(int direction) {
        if (direction > 0 ) System.out.println("Scrool up");

        else if (direction < 0 ) System.out.println("scroll down");
              else System.out.println("Not scroll!");
    }
}


}

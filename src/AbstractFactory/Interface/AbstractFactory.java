package AbstractFactory.Interface;

interface Keyboard {
        void print();
        void println();

    }

    interface Touchpad{
        void traack (int deltaX,int deltaY);
    }


    interface DeviceFactory{
        Mouse getMouse();
        Keyboard getKeyboard();
        Touchpad getTouchpad();

    }






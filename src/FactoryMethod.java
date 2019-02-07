import javax.xml.crypto.Data;
import java.util.Date;

public class FactoryMethod {

    public static void main(String[] args) {
        Watch digi = new DigitalWatch();
        digi.showTime();

    }

}

interface Watch {
    void showTime();
}

class DigitalWatch implements Watch {
    @Override
    public void showTime() {
        System.out.println(new Date());
    }
}

class RomeWatch implements Watch{
    @Override
    public void showTime() {
        System.out.println("VII-X");
    }
}


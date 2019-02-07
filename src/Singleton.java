public class Singleton {

    private static  Singleton singleton;
    private static int count = 0;



    public static synchronized Singleton getSingleton(){
        if (singleton == null){
            singleton = new Singleton();}
        return singleton;
    }


    private Singleton(){
        count++;
    }




    public void show (){
        System.out.println(count);
    }

}

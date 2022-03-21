public class Singloton {
    private static  Singloton obj;
    private  Singloton() {
    }
        synchronized public static  Singloton getInstance(){
            if(obj==null){
                obj = new Singloton();

            }
            return obj;
    }
}

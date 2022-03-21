import javax.crypto.Cipher;

public class Employerelation {
    int id;
    int City;
    Hasinheritence hasinheritence;
    Employerelation(int id, int City, Hasinheritence hasinheritence){
        this.id=id;
        this.City= City;
        this.hasinheritence= hasinheritence;

    }
    static int add(int a, int c){
        return  (a +  c);


    }
    static int add(int a, int b ,int c){
        System.out.println(a+c+b);
        return a+ b+c;

    }
    void Dispaly(){
        System.out.println(id+"values"+City);
        System.out.println(hasinheritence.address+hasinheritence.salary+hasinheritence.id);

    }
    public  static void  main(String[]args){
        Hasinheritence hasinheritence1 = new Hasinheritence(12,1233,"marathali");
        Employerelation employerelation = new Employerelation(1, 2,hasinheritence1);
        employerelation.Dispaly();
        System.out.println(Employerelation.add(12,93));

        employerelation.add(12,23);
        employerelation.add(23,45,23);


    }


}

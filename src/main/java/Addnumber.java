 class Addnumber {
    static int c;
    public  static int addnumber  (int n ,int m){
        for(int i=0;  i< m ;i++){
            c = n *i;
            System.out.println(c);
        }

        return 0;
    }
    public static  void  main(String [] args){
        addnumber(2,10);



    }

}

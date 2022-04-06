public class Sortnumber {

    public static void main(String[] args) {
        int a[] ={0,0,1,2,1,0};
        int c1=0,c2=0,c3=0;
        for(int i=0;i<a.length;i++){
            switch (a[i]){
                case 0:
                    c1++;
                    break;
                case 1:
                    c2++;
                    break;
                case 2:
                    c3++;
                    break;
            }

        }

    }


}

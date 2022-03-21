public class LargestSum {
    int target = 0;

    public int sum (int a[]) {

        for (int i = 0; i < a.length; i++) {
            int sum = a[i];
            for (int j = i+1; j < a.length; j++) {
                sum +=  a[j];
                //6 =

                ////1+2+3+4
                //1,2,3,-4,100}

                //// 1+2+3-4+100

            if(target<sum)
                target=sum;
            }


        }
        System.out.println(target);

        return target;


    }
    public static void main(String[] args) {

        int a[]={1,2,3,-4,100};
        LargestSum l = new LargestSum();
        l.sum(a);
        System.out.println("print ");

    }
}

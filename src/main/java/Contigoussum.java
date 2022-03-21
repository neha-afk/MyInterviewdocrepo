public class Contigoussum {
    public static void main(String[] args) {
        int ar[] = {1,2,0,-6,-4,5};
        int curr_sum =0;
        int max_sum =0;
        int i=0,l=0;

        while(i!=ar.length){
            curr_sum+=ar[i];
            if(curr_sum<=0){
                curr_sum=0;
            }
            else if (max_sum<=curr_sum){
                max_sum=curr_sum;
                l=i;
            }
            i++;
        }
       curr_sum= max_sum;
        while(curr_sum!=0){
            curr_sum = curr_sum-ar[l];
            System.out.println(ar[l]);
            l--;
        }
        System.out.println(max_sum);

    }

}


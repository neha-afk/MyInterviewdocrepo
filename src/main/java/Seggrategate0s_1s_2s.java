public class Seggrategate0s_1s_2s {
    public  static  void main(String [] args){
       int ar[] = {1,2,0,0,2,1,0,1,2,};
       int j =0,k=0,l=0;
       for(int i =0;i<ar.length;i++){
           if(ar[i]==0){
               j++;
           }
           else if(ar[i]==1){
               k++;
           }
           else{
               l++;
           }

       }
       for(int i =0;i<ar.length;i++){
         if(j>0){
             ar[i]=0;
             j--;

         }
         else if(k>0){
             ar[i]=1;
             k--;
         }
         else{
             ar[i]=2;
             l--;
         }

       }
       for(int i =0;i<ar.length;i++) {
           System.out.println(ar[i]);
       }
//       int ar1[] = new int[ar.length] ;
//        int ar2[] = new int[ar.length] ;
//        int ar3[] = new int[ar.length] ;
//       for(int i = 0; i < ar.length;i++){
//           if(ar[i]==0){
//               ar1 = ar;
//               System.out.println(ar1);
//
//           }
//           else if(ar[i]==1){
//               ar2 =ar;
//           }
//           else{
//               ar3 = ar;
//
//           }
//
//       }
//       for(int i =0;i<ar.length;i++){
//           ar[i] = ar1[i];
//           ar[i]=ar2[i];
//           ar[i]=ar3[i];
//           }
       }

    }


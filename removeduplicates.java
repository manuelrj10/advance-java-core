
class movezero {
    public static void main(String[] args) {
        int[] arr = {0,0,1,1,1,2,2,3,3,4};
        int low=0;
        for(int high=1;high<arr.length;high++){
            if(arr[low]!=arr[high]){
                low++;
                arr[low]=arr[high];
            }

           
        }
        System.out.println(low+1);

    
    }
}

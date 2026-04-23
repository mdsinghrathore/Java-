public class SecondlargestElement {
    public void main(String[] args){
        int[] arr = {88,26,32983,439,392,03};
        for(int i=0 ;i<arr.length;i++){
            System.err.print(arr[i]+" ");
        }
        System.err.println();
        int largest = arr[0];
        for (int i =0 ;i<arr.length;i++){
            if(largest < arr[i]){
                largest=arr[i];
            }
        }
        System.out.println("largest element = " + largest);

        int secondLargest = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<largest){
                if(secondLargest<arr[i]){
                    secondLargest = arr[i];
                }
            }
        }
        if(arr.length<=1){
            System.out.println("Second Largest Element DNE");
        }else{
            System.out.println("Second Largest Element = " +secondLargest);  
        }
        
        int thirdLargest = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<secondLargest){
                if(thirdLargest<arr[i]){
                    thirdLargest = arr[i];
                }
            }
        }
        if(arr.length<=2){
            System.err.println("Third Largest Element DNE");
        }else{
            System.out.println("Third Largest Element = "+thirdLargest);
        }
        
    }
}
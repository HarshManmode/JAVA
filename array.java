class Demo 
{
    public static void main(String[] args) {
        
        //one way
        int nums[] = {3,8,9,4};
        System.out.println("First element in array : " +nums[0]);
        System.out.println("Second element in array : " +nums[1]);
        System.out.println("Third element in array : " +nums[2]);
        System.out.println("Fourth element in array : " +nums[3]);

        //2nd way 
        int nums1[] = new int[4]; //here we did not assign values of num initially
        nums1[0]=1;
        nums1[1]=2;
        nums1[2]=3;
        nums1[3]=4;

        for(int i=0;i<4;i++)
        {
            System.out.println("element in array : "+nums1[i]);
        }
    }    
}

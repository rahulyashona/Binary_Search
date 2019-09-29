import java.util.Scanner;

class BinarySearch {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter number of Elements:");
        int n=kb.nextInt();
        int []arr=new int[n];
        System.out.println("Enter "+n+" integers:");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=kb.nextInt();
        }
        int search,first,last,middle;
        System.out.println("Enter value to find:");
        search=kb.nextInt();
        first=0;
        last=n-1;
        middle=(first+last)/2;
        while(first<=last)
        {
            if(arr[middle]<search)
                first=middle+1;
            else if(arr[middle]==search){
                System.out.println(search+" is found at location "+(middle+1));
                break;
            }
            else
                last=middle-1;
            middle=(first+last)/2;
        }
        if(first>last)
            System.out.println(search+" isn't found in the list!!!");
    }    
}

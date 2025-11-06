public class Sameelementarr {
    public static void main(String[] args) {
        int arr[]={5,6,7,5,10,11,5,5,9,6,2};
        int key=5;
        int count=0;
        int lenght=arr.length;
        for(int i=0;i<lenght;i++)
        {
            if(key==arr[i])
            {
                count++;
            }
            System.out.println("my value" +key+ "occurs" +count+"time appears");
        }
    }
}

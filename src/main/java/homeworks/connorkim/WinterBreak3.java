package homeworks.connorkim;

public class WinterBreak3 {

    public static void main(String[] args){
        int [] lists = {1,1,2,1,2,3,1,2,3,4};
        int largest = 0;
        for(int i=0; i<lists.length;i++){
            int r = 1;
            if(lists[i]>lists[r]){
                largest = lists[i];
                r++;
            }
        }
        System.out.println(largest);
    }
}

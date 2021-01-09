package homeworks.connorkim;

public class WinterBreak5 {
    public static void main(String[] args){

        int [] list = {1,1,2,2,3,3};
        int counter = 0;
        int r = 1;
        boolean matching = true;

        for(int i = 0; i < list.length; i++){
            if(list[i]==list[r]) {
                if(matching == false) {
                    matching = true;
                    counter++;
                }
            }
            if(list[i] != list[r]){
                matching = false;
            }
            r++;
        }
    System.out.println(counter);
    }
}

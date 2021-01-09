package homeworks.connorkim;

public class WinterBreak2 {

    public static void main(String[] args){

        int[] list = {};

        int value= 0;

        for(int i = 0; i < list.length; i++){
            value+=list[i];
        }
        if(value%2 == 0){
            int half = value/2;
            int halfvalue = 0;
            for(int r = 0; r < half; r++){
                halfvalue+=list[r];
                if(halfvalue == half){
                    System.out.println("True");
                }
            }


        }else{
            System.out.println("false");
        }
    }

}

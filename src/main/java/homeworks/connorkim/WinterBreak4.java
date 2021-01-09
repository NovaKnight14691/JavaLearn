package homeworks.connorkim;

public class WinterBreak4 {
    public static void main(String[] args){
        int [] outer = {1,2,3,4,5,6};
        int [] inner = {1,2,4};
        int num = 0;
        int r = 0;

        for(int i = 0; i < outer.length; i++){
            if(outer[i] == inner[r]) {
                num++;
                r++;
            }
                if(num == inner.length){
                    System.out.println("true");
                    return;

                }
                if(num > inner.length){
                    System.out.println("false");
                    return;
                }
        }
        System.out.println("false");



    }
}

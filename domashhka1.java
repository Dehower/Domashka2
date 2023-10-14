import java.util.Arrays;

public class domashhka1 {
    public static void main(String[] args) {
        int [] arra = {90, 32, 12, 23, 67, 35, 68,29};

        boolean isSorted = false;
        int buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < arra.length-1; i++) {
                if(arra[i] > arra[i+1]){
                    isSorted = false;
                    buf = arra[i];
                    arra[i] = arra[i+1];
                    arra[i+1] = buf;
                }
            }
        }
        System.out.println(Arrays.toString(arra));
    }
}
package array;
import java.util.ArrayList;
public class test {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        //list.add(1,100);

        for(int i:list) {
            i = new Integer(i * i);
            //System.out.println(i);
        }
        for(int i:list){
            System.out.println(i);
        }

    }
}

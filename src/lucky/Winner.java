package lucky;

import java.util.*;

public class Winner {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5);
        Collections.shuffle(list, new Random(System.currentTimeMillis()));
        System.out.println(list);

        }

    }


}

package com.example.firstass.result;

import java.util.ArrayList;
import java.util.List;

public class resultDa {
    List <result> result;

    public resultDa() {

        result = new ArrayList<result>();
        result.add(new result("السؤال الاول : ما هو مجموع 2 + 2 =","2","8","4"));
        result.add(new result("السؤال الثاني : ما هو مجموع 1 + 5 =","6","3","5"));
        result.add(new result("السؤال الثالث : ما هو مجموع 2 + 3 =","4","10","5"));
    }

}

package nyc.c4q.ahhhlvin;

/**
 * Created by alvin2 on 3/28/15.
 * Alvin Kuang
 * C4Q Access Code 2.1
 */
public class Dogs {

    String name = "";
    String type = "";
    int age = 0;

    // constructor syntax = public CONSTRUCTORNAME (params) ...
    public Dogs(String name, String type, int age) {
        this.name = name;
        this.type = type;
        this.age = age;

    }

    public String getName() {
        return this.name;
    }



}

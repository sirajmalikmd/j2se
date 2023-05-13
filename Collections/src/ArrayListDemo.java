import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("A");
        arrayList.add("a");
        arrayList.add(2, "d");
        arrayList.add(null);
        arrayList.add(" ");
        System.out.println("arrayList: " + arrayList);
        arrayList.remove(4);
        System.out.println("after removing 'space' arrayList: " + arrayList);
        arrayList.add(1, "b");
        System.out.println("arrayList: " + arrayList);
        System.out.println(arrayList instanceof Serializable);
        System.out.println(arrayList instanceof Cloneable);
        System.out.println(arrayList instanceof RandomAccess);
        List syncVersionList = Collections.synchronizedList(arrayList);
        System.out.println("syncVersionList: " + syncVersionList);
    }
}

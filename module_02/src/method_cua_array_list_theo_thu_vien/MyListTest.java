package method_cua_array_list_theo_thu_vien;


import static sun.misc.Version.print;

public class MyListTest {
    public static void main(String[] args) {
        MyClass<String> list = new MyClass<>();
        list.add("son");
        list.add("thanh");
        list.add("tran");
        list.add("thien");

        print(list.getElement());
        System.out.println(list.indexOf("son"));
        System.out.println(list.indexOf("som"));
        list.remove(1);
        list.add(1, "rat");
        print(list.getElement());
        MyClass<String> clone = list.clone();
        System.out.println(clone.contains("toàn"));
        System.out.println(clone.contains("không"));
        System.out.println(clone.get(3));
        System.out.println(clone.size());
        clone.clear();
        System.out.println(clone.size());
        print(clone.getElement());
    }

    static void print(Object[] list) {
        for (Object x : list) {
            if (!(x == null)) {
                System.out.println((String) x);
            }
        }
    }
}

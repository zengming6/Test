package temporary;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) {
        Person p = new Person("Xiao Ming");
        System.out.println(p.getName());
        Class c = p.getClass();
        try {
            Field f = c.getDeclaredField("name");
            f.setAccessible(true);
            f.set(p, "Xiao Hong");
            System.out.println(p.getName());
        } catch (NoSuchFieldException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}
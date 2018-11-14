package data.structures.reflection;

import java.io.IOException;

@Service
public class ReflectionTest {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        PackageScanner packageScanner = new PackageScanner();
        Class[] classes = packageScanner.getClasses("data.structures");
        for (Class c : classes) {
            Service a = (Service) c.getAnnotation(Service.class);
            if (a != null) {
                System.out.println(c.getName());
            }
        }
    }

}

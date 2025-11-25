import java.util.List;
import java.util.LinkedList;
import java.util.Scanner;
class Student {
    String name;
    int marks;
    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}
public class StudentManager {
    public static void main(String[] args) {
        List<Student> list = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
            while (true) {
                System.out.println();
                System.out.println("1. Add");
                System.out.println("2. Show");
                System.out.println("3. Search");
                System.out.println("4. Exit");
                System.out.print("Choice: ");
            int c = sc.nextInt();
            sc.nextLine();
            if (c == 1) {
                System.out.print("Name: ");
                String n = sc.nextLine();
                System.out.print("Marks: ");
                int m = sc.nextInt();
                list.add(new Student(n, m));
                System.out.println("Added");
            } 
            else if (c == 2) {
                if (list.size() == 0) {
                    System.out.println("No data");
                } else {
                    for (Student s : list) {
                        System.out.println(s.name + " - " + s.marks);
                    }
                }
            } 
            else if (c == 3) {
                System.out.print("Search name: ");
                String x = sc.nextLine();
                boolean ok = false;
                for (Student s : list) {
                    if (s.name.equalsIgnoreCase(x)) {
                        System.out.println(s.name + " - " + s.marks);
                        ok = true;
                        break;
                    }
                }
                if (!ok) System.out.println("Not found");
            } 
            else if (c == 4) {
                break;
            } 
            else {
                System.out.println("Wrong choice");
            }
        }
        sc.close();
    }
}

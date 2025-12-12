import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

class Student {
    int rollNo;
    String name;

    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }
    public String toString(){
        return "Student ....{" + "Roll.no =  ....." + rollNo + ", name = '" + name + "}";
    }
}

public class Main {
    public static void main(String[] args) {

//        Set<Integer> set = new HashSet<>();    //O(1) time complexity
//        Set<Integer> set = new LinkedHashSet<>();  //O(n) time complexity

//        Set<Integer> set = new TreeSet<>(); // O(log n) time complexity
//        set.add(10);
//        set.add(20);
//        set.add(30);
//        set.add(5);
//        System.out.println(set);
//
//        set.remove(10);
//        System.out.println(set.contains(10));;
//        System.out.println(set);
//
//        Set<String> setstring = new HashSet<>();
//        setstring.add("Akhila");
//        setstring.add("aNila");
//        setstring.add("Popsicle");
//        setstring.add("Popsicle");
//
//        System.out.println(setstring);

        Set<Student> student = new HashSet<>();
        student.add(new Student(1,"Akhila"));
        student.add(new Student(1,"Akhila"));
        student.add(new Student(2,"Anila"));

        System.out.println(student);

        }
    }

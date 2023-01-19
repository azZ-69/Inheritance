package Module;


import javax.naming.Name;
import java.util.ArrayList;

public class Children extends Parent {
    public Children(String name, int age, int grade, ArrayList<Hobby> hobbys) {
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.hobbys = hobbys;
    }

    String name;
    int age;
    int grade;
    ArrayList<Hobby> hobbys;


    public void getFullname() {
        System.out.println(this.name + " " + this.getFamilyname());


    }

    public void getHobby() {
        ArrayList<Hobby> hobby = this.hobbys;
        for (Hobby Hobbies : hobby) {
            System.out.println("The Hobby of " + this.name + " " + this.Familyname + " " + " is " + Hobbies.getName());
        }
    }
}


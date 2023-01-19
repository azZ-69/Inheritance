import Module.Children;
import Module.Hobby;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Hobby h1 = new Hobby("Playing Games", "High Interest");
        Hobby h2 = new Hobby("Reading Books", "Low Interest");
        Hobby h3 = new Hobby("Coding", "Low Interest");
        Hobby h4 = new Hobby("Cooking", "High Interest");

        ArrayList<Hobby> hobby1 = new ArrayList<>();
        hobby1.add(h1);
        hobby1.add(h2);

        ArrayList<Hobby> hobby2 = new ArrayList<>();
        hobby2.add(h3);
        hobby1.add(h4);




        Children c1=new Children("Naruto",10,15,hobby1);
        Children c2=new Children("Boruto",5,10,hobby2);
        Children c3=new Children("Himawari",1,5,hobby1);
      c1.getFullname();
      c1.getHobby();
      c2.getFullname();
      c2.getHobby();


    }
}

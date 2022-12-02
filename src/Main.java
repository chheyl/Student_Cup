import model.Student;
import model.Team;
import model.group;

import java.util.ArrayList;

public class Main {
        public static void Main(String[] args) {
            ArrayList<Student> Astudent=new ArrayList<>();
            ArrayList<Student>Bstudent=new ArrayList<>();
            ArrayList<Student>Cstudent=new ArrayList<>();
            Student p1 = new Student("Anshu", 12, 17);
            Student p2 = new Student("Shreebisha", 13, 17);
            Student p3 = new Student("Ashna", 22, 17);
            Student p4 = new Student("Aashutosh", 21, 17);
            Student p5 = new Student("Aswin", 16, 17);
            Student p6 = new Student("Neharika", 16, 17);
            Student p7 = new Student("Avarna", 16, 17);
            Student p8 = new Student("Aaisma", 16, 17);
            Student p9 = new Student("Yojana", 16, 17);
            Astudent.add(p1);
            Astudent.add(p8);
            Astudent.add(p9);

            Bstudent.add(p2);
            Bstudent.add(p7);
            Bstudent.add(p4);

            Cstudent.add(p3);
            Cstudent.add(p5);
            Cstudent.add(p6);

            Team A = new Team("A");
            Team B = new Team("B");
            Team C= new Team("C");
            ArrayList<Team> alist = new ArrayList<>();
            ArrayList<Team> blist = new ArrayList<>();
            ArrayList<Team> clist = new ArrayList<>();
            alist.add(A);
            blist.add(B);
            clist.add(C);

            group Lobuche =new group("A",alist);
            group Khumbila= new group("B",blist);
        }
    }

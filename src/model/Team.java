package model;
import java.util.ArrayList;
public class Team {
        String name;
        ArrayList<Student> students;

        public Team(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

    }
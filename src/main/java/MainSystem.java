import org.joda.time.DateTime;

public class MainSystem {



    public static void main(String [] args){
        // Creates 4 students
        Student student1 = new Student ("Sarah", 20,"23/01/2000",15627282);
        Student student2 = new Student ("John", 21,"23/05/1999",59789878);
        Student student3 = new Student ("Ellen", 30,"23/04/1970",65456456);
        Student student4 = new Student ("Jack", 29,"23/02/1971",9899978);

        // Creates two courses
        Programme bct_course = new Programme("BCT",new DateTime("2020-09-28T07:22:05Z"),new DateTime("2020-09-28T07:22:05Z"));
        Programme ece_course = new Programme("ECE", new DateTime("2020-09-28T07:22:05Z"), new DateTime("2020-09-28T07:22:05Z"));

        //Create three modules
        Module maths = new Module("MA112");
        Module hardware = new Module("EE232");
        Module softwareEngineering = new Module("CT417");

        // Add Modules to their courses
        bct_course.addModule(maths);
        bct_course.addModule(softwareEngineering);
        ece_course.addModule(hardware);
        ece_course.addModule(softwareEngineering);

        // Add students to the courses.
        bct_course.addStudentsToCourse(student1);
        bct_course.addStudentsToCourse(student2);
        ece_course.addStudentsToCourse(student3);
        ece_course.addStudentsToCourse(student4);

        //enroll students into modules
        maths.addStudentsToModule(student1);
        maths.addStudentsToModule(student2);
        softwareEngineering.addStudentsToModule(student1);
        softwareEngineering.addStudentsToModule(student2);
        softwareEngineering.addStudentsToModule(student3);
        softwareEngineering.addStudentsToModule(student4);
        hardware.addStudentsToModule(student3);
        hardware.addStudentsToModule(student4);

        // Get list of course information
        System.out.println("\n ######### BCT Course #########");
        System.out.println(bct_course.toString());

        System.out.println("\n ################# ECE Course ################");
        System.out.println(ece_course.toString());



    }

}

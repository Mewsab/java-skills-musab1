public class StudentGradeManager {

    public static String[] reverseStudentNames(String[] names) {
        String[] reversed = new String[names.length];
        for (int i = 0; i < names.length; i++) {
            reversed[i] = new StringBuilder(names[i]).reverse().toString();
        }
        return reversed;
    }

    // Returning letter grade based on the score
    public static char getGrade(int score) {
        if (score >= 90) return 'A';
        else if (score >= 80) return 'B';
        else if (score >= 70) return 'C';
        else if (score >= 60) return 'D';
        else return 'F';
    }

    // Returning names that are failing
    public static String[] findFailingStudents(String[] names, int[] scores) {
        int count = 0;
        for (int score : scores) {
            if (score < 60) count++;
        }

        String[] failing = new String[count];
        int idx = 0;
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] < 60) {
                failing[idx++] = names[i];
            }
        }
        return failing;
    }

    public static void main(String[] args) {
        String[] students = {"Alice", "Bob", "Charlie", "Diana"};
        int[] scores = {95, 67, 45, 78};

        // Reversed Names
        String[] reversedNames = reverseStudentNames(students);
        System.out.println("Reversed Names:");
        for (String name : reversedNames) {
            System.out.println(name);
        }

        // Grades
        System.out.println("Letter Grades:");
        for (int i = 0; i < students.length; i++) {
            char grade = getGrade(scores[i]);
            System.out.println(students[i] + ": " + grade);
        }
        // Failing students
        String[] failing = findFailingStudents(students, scores);
        System.out.println("Students who need to retake exam: " + "");
        for (String name : failing) {
            System.out.println(name);
        }
    }

}

package com.epam.mjc;


public class StudentManager {

    private static final long[] IDs = {1, 22, 3, 4, 5, 6, 7, 8, 9, 10, 11};
//    private static final long[] IDs = {1, 2, 11, 3};

    public Student find(long studentID) {
        Student student = Student.getValueOf(studentID);

        if (student != null) {
            return student;
        } else {
            throw new CouldNotFindStudentWithIDException("Could not find student with ID " + studentID);
        }
    }


    public static void main(String[] args) {
        StudentManager manager = new StudentManager();

        for (int i = 0; i < IDs.length; i++) {
            Student student = manager.find(IDs[i]);
            try {
                System.out.println("Student name " + student.getName());
            } catch (NullPointerException e) {
                System.out.println("Could not find student with ID " + IDs[i]);
            }
        }
    }
}




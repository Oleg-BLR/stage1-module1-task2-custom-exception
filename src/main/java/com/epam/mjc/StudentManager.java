package com.epam.mjc;


public class StudentManager {

    private static final long[] IDs = {1, 2, 3, 4, 555, 6, 7, 8, 9, 10, 11};
//    private static final long[] IDs = {1, 2, 11, 3};

    public Student find(long studentID) {    //throws CouldNotFindStudentWithIDException { - с этим тоже не работает
        return Student.getValueOf(studentID);
    }


    public static void main(String[] args) {
        StudentManager manager = new StudentManager();

        for (int i = 0; i < IDs.length; i++) {
            Student student = manager.find(IDs[i]);
            try {
                System.out.println("Student name " + student.getName());
            } catch (NullPointerException e) {    /* здесь с моим CouldNotFindStudentWithIDException не работает,
                                                даже если CouldNotFindStudentWithIDException extends NullPointerException.
                                                Почему?
                                                */
                System.out.println("Could not find student with ID " + IDs[i]);
            }
        }
    }

}

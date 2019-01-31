/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week1.softwarefundamental;

/**
 *
 * @author mehta = 31st Jan,2019
 */
public class Student1 {
    
   private String name;
    private int Student_ID;
    /**
     * @return the Student_ID
     */
    public int getStudent_ID() {
        return Student_ID;
    }

    /**
     * @param Student_ID the Student_ID to set
     */
    public void setStudent_ID(int Student_ID) {
        this.Student_ID = Student_ID;
    }


    /**
     * @return the name
     */
    public String getName() {
        return name;
    }
   

    /**
     * @param givenName the name to set
     */
    public void setName(String givenName) {
            name = givenName;
    }
    
}

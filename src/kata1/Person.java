/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata1;

import java.util.Date;

/**
 *
 * @author Usuario
 */
public class Person {
    private final String name;
    private final Date birthDay;
    private final static int MS_PER_SECOND=1000;
    private final static int MS_PER_MINUT=60;
    private final static int MS_PER_HOUR=60;
    private final static double MS_PER_DAY=24;
    private final static double MS_PER_YEAR=365.25;
    public Person(String name, Date birthDay) {
        this.name = name;
        this.birthDay = birthDay;
    }
    public Date getBirthDay(){
        return birthDay;
    }
    public int getAge(){
        return (int) ((new Date().getTime()-birthDay.getTime())/MS_PER_YEAR);
    }
    //control shift abajo para copiar
    
}

package ua.smartprog.bankProject;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Admin on 12.02.2017.
 */
public class IDtest {
    @Test
    public void checkID() throws Exception{
        Officer officer_test = new Officer();
        Consulter consulter_test = new Consulter();
        assertEquals(officer_test.getMyID(), consulter_test.getMyID() - 1);
    }
}

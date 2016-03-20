/**
 * Created by brubert on 3/19/16.
 */
package com.javacodegeeks.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class FirstDayAtSchoolTest {

    FirstDayAtSchool school = new FirstDayAtSchool();
    String[] bag1 = { "Books", "Notebooks", "Pens" };
    String[] bag2 = { "Books", "Notebooks", "Pens", "Pencils" };

    @Test
    public void testPrepareMyBag() {
        System.out.println("Inside testPrepareMyBag()");
        assertArrayEquals(bag1, school.prepareMyBag());
    }

    @Test
    public void testAddPencils() {
        System.out.println("Inside testAddPencils()");
        assertArrayEquals(bag2, school.addPencils());
    }

}
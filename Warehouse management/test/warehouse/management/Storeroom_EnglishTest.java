/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package warehouse.management;

import java.util.Scanner;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ali
 */
public class Storeroom_EnglishTest {
    
    public Storeroom_EnglishTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class Storeroom_English.
     */
//    @Test
//    public void testMain() {
//        System.out.println("main");
//        String[] args = null;
//        Storeroom_English.main(args);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of show_menu method, of class Storeroom_English.
     */
//    @Test
//    public void testShow_menu() {
//        System.out.println("show_menu");
//        Storeroom_English.show_menu();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of Registration_of_goods method, of class Storeroom_English.
     */
    @Test
    public void testRegistration_of_goods() {
        System.out.println("Registration_of_goods");
        String[] name = null;
        int[] tadad = null;
        int code_kala = 0;
        Scanner input = null;
        Storeroom_English.Registration_of_goods(name, tadad, code_kala, input);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of Take_out_the_goods method, of class Storeroom_English.
     */
    @Test
    public void testTake_out_the_goods() {
        System.out.println("Take_out_the_goods");
        String[] name = null;
        int[] tadad = null;
        int code_kala = 0;
        Scanner input = null;
        Storeroom_English.Take_out_the_goods(name, tadad, code_kala, input);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of Show_goods method, of class Storeroom_English.
     */
    @Test
    public void testShow_goods() {
        System.out.println("Show_goods");
        String[] name = null;
        int[] tadad = null;
        int code_kala = 0;
        Scanner input = null;
        Storeroom_English.Show_goods(name, tadad, code_kala, input);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of Search_for_goods method, of class Storeroom_English.
     */
    @Test
    public void testSearch_for_goods() {
        System.out.println("Search_for_goods");
        String[] name = null;
        int[] tadad = null;
        int code_kala = 0;
        Scanner input = null;
        Storeroom_English.Search_for_goods(name, tadad, code_kala, input);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
}

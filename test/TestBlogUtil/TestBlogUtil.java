/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestBlogUtil;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author Laurent-LIM
 */
public class TestBlogUtil {

    @Before
    public void avant() {

        Persistence.createEntityManagerFactory("PU");

//        em.getTransaction().begin();
//
//        em.createQuery("DELETE FROM UTIL p").executeUpdate();
//        em.createQuery("DELETE FROM PAGE p").executeUpdate();
//
//
//        em.getTransaction().commit();
    }
    
    @Test
    public void test(){
        
    }
    
    

}

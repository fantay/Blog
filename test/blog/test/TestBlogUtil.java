/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blog.test;

import javax.persistence.Persistence;
import org.junit.Test;
import org.junit.Before;

/**
 *
 * @author Laurent-LIM
 */
public class TestBlogUtil {

    @Before
    public void avant() {

        Persistence.createEntityManagerFactory("PU");

    }
    
    @Test
    public void test(){
        
    }
    
    

}

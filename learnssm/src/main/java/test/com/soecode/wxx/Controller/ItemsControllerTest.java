package test.com.soecode.wxx.Controller; 

import com.soecode.wxx.dto.ItemsCustom;
import com.soecode.wxx.service.ItemsService;
import org.junit.Before; 
import org.junit.After;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/** 
* ItemsController Tester. 
* 
* @author <Authors name> 
* @since <pre></pre>
* @version 1.0
*/

@RunWith(SpringJUnit4ClassRunner.class)

@ContextConfiguration(locations={"classpath:/spring/spring-service.xml",
                "classpath:/spring/spring-dao.xml"
        })

public class ItemsControllerTest {


    @Autowired
    private ItemsService itemsService;
@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: queryItems() 
* 
*/ 
@org.junit.Test
public void testQueryItems() throws Exception { 
//TODO: Test goes here...
    List<ItemsCustom> itemsList=itemsService.findItemsList(null);
    System.out.println(itemsList.size());
}


} 

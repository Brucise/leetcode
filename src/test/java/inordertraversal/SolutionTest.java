package inordertraversal;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import java.lang.reflect.Field;

import static org.powermock.configuration.ConfigurationType.PowerMock;


/**
 * Solution Tester.
 *
 * @author <$name>
 * @version 1.0
 * @since <pre>02/26/2019</pre>
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest(Solution.class)
public class SolutionTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: inorderTraversal(TreeNode root)
     */
    @Test
    public void testInorderTraversal() throws Exception {
//TODO: Test goes here... 
    }


    /**
     * Method: recursion(ArrayList<Integer> integers, TreeNode root)
     */
    @Test
    public void testRecursion() throws Exception {
//TODO: Test goes here... 
/* 
try { 
   Method method = Solution.getClass().getMethod("recursion", ArrayList<Integer>.class, TreeNode.class); 
   method.setAccessible(true); 
   method.invoke(<Object>, <Parameters>); 
} catch(NoSuchMethodException e) { 
} catch(IllegalAccessException e) { 
} catch(InvocationTargetException e) { 
} 
*/
    }

    /**
     * Method: flag()
     */
    @Test
    public void testFlag() throws Exception {
        Solution solution = new Solution();
        System.out.println(solution.getClass().getName());
        Field x = solution.getClass().getDeclaredField("x");
        x.setAccessible(true);
//TODO: Test goes here... 
/* 
try { 
   Method method = Solution.getClass().getMethod("flag"); 
   method.setAccessible(true); 
   method.invoke(<Object>, <Parameters>); 
} catch(NoSuchMethodException e) { 
} catch(IllegalAccessException e) { 
} catch(InvocationTargetException e) { 
} 
*/
    }

} 

package lin.louis.aop.method;

import javax.inject.Inject;

import lin.louis.aop.mock.FooService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author llin
 * @created 20/05/14 10:32
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-config-test.xml"})
public class MethodAspectTest {
    @Inject
    private FooService fooService;

    @Test
    public void testMethodAspect() {
        fooService.foo("testMethodAspect");
    }
}

import chapter4.DemoService;
import chapter4.MyMvcConfig;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpSession;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

/**
 * created by xdCao on 2017/10/23
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {MyMvcConfig.class})
@WebAppConfiguration("classpath:")
public class TestControllerIntegrationTests {

    private MockMvc mockMvc;

    @Autowired
    private DemoService demoService;

    @Autowired
    WebApplicationContext webApplicationContext;

    @Autowired
    MockHttpSession session;

    @Autowired
    MockHttpServletRequest request;


    @Before
    public void setup(){
        this.mockMvc= MockMvcBuilders.webAppContextSetup(this.webApplicationContext).build();
    }

    @Test
    public void testNormalController() throws Exception {
        mockMvc.perform(get("/normal"))
                .andExpect(status().isOk())
                .andExpect(view().name("page"))
                .andExpect(model().attribute("msg",demoService.say()));
    }




}

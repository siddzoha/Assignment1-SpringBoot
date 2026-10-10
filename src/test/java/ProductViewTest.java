import ca.sheridan.siddzoha.assign1.siddiquizassign1.SiddiquiZAssign1Application;
import ca.sheridan.siddzoha.assign1.siddiquizassign1.controllers.ProductController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

/**
 * @author Zohaib Siddiqui
 * @author Zain Malik
 * @version Oct 10, 2026
 * Student ID: 991578873
 */

@WebMvcTest(ProductController.class)
@ContextConfiguration(classes = SiddiquiZAssign1Application.class)
public class ProductViewTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void testIndexRendersCorrectly() throws Exception {
        MvcResult result = mockMvc.perform(get("/"))
                .andReturn();

        assertEquals(200,  result.getResponse().getStatus());
        assertEquals("index", result.getModelAndView().getViewName());
    }

    @Test
    void testAddProductAndFormSubmission() throws Exception {
        MvcResult result = mockMvc.perform(post("/addProduct")
                .param("code", "SKU4363")
                .param("brand", "HP")
                .param("quantity", "41")
                .param("unitPrice", "589.99"))
                .andReturn();

        assertEquals(200, result.getResponse().getStatus());
        assertEquals("confirm", result.getModelAndView().getViewName());
    }
}

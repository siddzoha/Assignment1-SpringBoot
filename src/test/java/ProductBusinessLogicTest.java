import ca.sheridan.siddzoha.assign1.siddiquizassign1.controllers.ProductController;
import ca.sheridan.siddzoha.assign1.siddiquizassign1.model.Product;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.ui.ConcurrentModel;
import org.springframework.ui.Model;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Zohaib Siddiqui
 * @author Zain Malik
 * @version Oct 10, 2026
 * Student ID: 991578873
 */

public class ProductBusinessLogicTest {

    private ProductController controller;

    @BeforeEach
    void setUp() {
        controller = new ProductController();
    }

    @Test
    void testIndexPreparesEmptyFormModel() {
        Model model = new ConcurrentModel();

        String viewName = controller.index(model);

        assertEquals("index", viewName);
        assertNotNull(model.getAttribute("product"));
        assertTrue(model.getAttribute("product") instanceof Product);
    }

    @Test
    void testAddProductStoresProductsAndRoutesToConfirmation() {
        Model model = new ConcurrentModel();
        Product product = new Product("SKU45645", "Nintendo", 2, 349.99);

        String viewName = controller.addProduct(product, model);

        assertEquals("confirm", viewName);
        assertEquals(product, model.getAttribute("product"));
    }

    @Test
    void testViewProductAttachesCatalogToModel() {
        Model tempModel = new ConcurrentModel();

        controller.addProduct(new Product("SKU6786", "LG", 9, 1944.99), tempModel);
        controller.addProduct(new Product("SKU2342", "Dell", 67, 949.99), tempModel);

        Model viewModel = new ConcurrentModel();
        String viewName = controller.viewProducts(viewModel);

        assertEquals("products", viewName);

        List<Product> catalog = (List<Product>) viewModel.getAttribute("products");
        assertNotNull(catalog);
        assertEquals(2, catalog.size());
    }
}

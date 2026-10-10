import ca.sheridan.siddzoha.assign1.siddiquizassign1.model.Product;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class ProductDataTest {

    @Test
    void testProductConstructorsGettersAndSetters() {
        Product product = new Product("SKU1001", "Apple", 5, 999.9);


        assertEquals("SKU1001", product.getCode());
        assertEquals("Apple", product.getBrand());
        assertEquals(5, product.getQuantity());
        assertEquals(999.9, product.getUnitPrice());
    }

    @Test
    void testSettersUpdateProductState() {
        Product product = new Product();

        product.setCode("SKU1002");
        product.setBrand("Samsung");
        product.setQuantity(7);
        product.setUnitPrice(599.89);

        assertEquals("SKU1002", product.getCode());
        assertEquals("Samsung", product.getBrand());
        assertEquals(7, product.getQuantity());
        assertEquals(599.89, product.getUnitPrice());

    }

}

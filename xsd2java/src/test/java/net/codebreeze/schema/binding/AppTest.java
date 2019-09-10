package net.codebreeze.schema.binding;

import generated.PurchaseOrder;
import org.junit.jupiter.api.Test;

import java.time.ZonedDateTime;

import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * Unit test for simple App.
 */
class AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    void shouldAnswerWithTrue() {
        PurchaseOrder purchaseOrder1 = new PurchaseOrder();
        PurchaseOrder purchaseOrder2 = PurchaseOrder.builder()
                .withOrderDate(ZonedDateTime.now())
                .build();
        PurchaseOrder purchaseOrder3 = purchaseOrder1.clone();
        PurchaseOrder purchaseOrder4 = purchaseOrder1.createCopy();

        assertNotNull(purchaseOrder1);
        assertNotNull(purchaseOrder2);
        assertNotNull(purchaseOrder3);
        assertNotNull(purchaseOrder4);
    }
}

package net.codebreeze.schema.binding;

import generated.PurchaseOrder;
import org.junit.jupiter.api.Test;

import java.time.ZonedDateTime;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class AppTest {
    @Test
    void shouldAnswerWithTrue() {
        PurchaseOrder purchaseOrder1 = new PurchaseOrder();
        PurchaseOrder purchaseOrder2 = new PurchaseOrder();
        purchaseOrder2.setOrderDate(Date.from(ZonedDateTime.now().toInstant()));

        assertNotNull(purchaseOrder1);
        assertNotNull(purchaseOrder2);
    }
}

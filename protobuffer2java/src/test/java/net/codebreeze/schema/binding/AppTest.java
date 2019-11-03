package net.codebreeze.schema.binding;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class AppTest {
    @Test
    void shouldAnswerWithTrue() {
        LocalDate orderDate = LocalDate.now();
        PurchaseOrder purchaseOrder1 = PurchaseOrder.newBuilder()
                .build();
        PurchaseOrder purchaseOrder2 = PurchaseOrder.newBuilder()
                .setOrderDate(
                        Date.newBuilder()
                                .setYear(orderDate.getYear())
                                .setMonth(orderDate.getMonthValue())
                                .setDay(orderDate.getDayOfMonth())
                                .build()
                )
                .build();

        assertNotNull(purchaseOrder1);
        assertNotNull(purchaseOrder2);
    }
}

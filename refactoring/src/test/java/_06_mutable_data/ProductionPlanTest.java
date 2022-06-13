package _06_mutable_data;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductionPlanTest {

    @Test
    void getProduction() {
        ProductionPlan productionPlan = new ProductionPlan();
        productionPlan.applyAdjustment(10);
        productionPlan.applyAdjustment(20);
        assertEquals(30, productionPlan.getProduction());
    }
}
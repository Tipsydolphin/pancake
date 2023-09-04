import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import com.stripe.model.PaymentIntent;
import org.junit.jupiter.api.Test;

public class PaymentServiceTest {

    @Test
    public void testCreatePaymentIntent() {
        PaymentService paymentService = new PaymentService();

        // Test case for successful payment intent creation
        PaymentIntent intent = paymentService.createPaymentIntent();
        assertNotNull(intent, "PaymentIntent should not be null");

        // Add more test cases as needed
    }

    // You can add more test methods to test other functionalities
}

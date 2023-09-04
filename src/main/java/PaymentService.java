import com.stripe.model.PaymentIntent;
import com.stripe.param.PaymentIntentCreateParams;

public class PaymentService {
    public PaymentIntent createPaymentIntent() {
        PaymentIntentCreateParams params = PaymentIntentCreateParams.builder()
                .setCurrency("usd")
                .setAmount(1000L) // amount in cents
                .build();

        try {
            PaymentIntent intent = PaymentIntent.create(params);
            return intent;
        } catch (Exception e) {
            // Handle exception
            return null;
        }
    }
}

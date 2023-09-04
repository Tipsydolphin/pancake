import com.stripe.model.Event;
import com.stripe.net.Webhook;

public class WebhookHandler {
    public void handleWebhook(String payload, String sigHeader) {
        try {
            String endpointSecret = "your_webhook_secret";
            Event event = Webhook.constructEvent(payload, sigHeader, endpointSecret);

            // Handle the event
            if (event.getType().equals("payment_intent.succeeded")) {
                // Payment was successful
            } else if (event.getType().equals("payment_intent.payment_failed")) {
                // Payment failed
            }
        } catch (Exception e) {
            // Handle exception
        }
    }
}

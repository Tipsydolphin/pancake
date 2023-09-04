import com.stripe.Stripe;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ApplicationStartup {
    public static void main(String[] args) {
        // Initialize properties object
        Properties prop = new Properties();

        // Load properties from config.properties
        try (InputStream input = ApplicationStartup.class.getClassLoader().getResourceAsStream("config.properties")) {
            // Check if the input stream is null, meaning the file was not found
            if (input == null) {
                System.out.println("Sorry, unable to find config.properties");
                return;
            }

            // Load the properties file
            prop.load(input);

            // Get the property values and set them in Stripe
            String stripeApiKey = prop.getProperty("stripeApiKey");
            String stripeApiTestKey = prop.getProperty("stripeApiTestKey");

             // Debug statements to confirm Stripe API Keys
            System.out.println("Stripe Live API Key: " + stripeApiKey);
            System.out.println("Stripe Test API Key: " + stripeApiTestKey);

           // Set the Stripe API key based on your application's needs
           // For example, you could use a boolean flag to decide which key to use
            boolean useLiveKey = true; // or false, depending on your needs

           if (useLiveKey) {
            Stripe.apiKey = stripeApiKey;
        } else {
            Stripe.apiKey = stripeApiTestKey;
        }
            String endpointSecret = prop.getProperty("endpointSecret");
            String yourDomain = prop.getProperty("yourDomain");

            // Your application logic here

        } catch (IOException ex) {
            ex.printStackTrace();
        }

        // The rest of your application startup logic
    }
}

import org.apache.shiro.crypto.hash.DefaultHashService;
import org.apache.shiro.crypto.hash.HashRequest;
import org.junit.Test;

public class ShiroTest {

    @Test
    public void test() {
        DefaultHashService service = new DefaultHashService();
        service.setHashAlgorithmName("SHA1");
        service.setHashIterations(1);
        HashRequest request = new HashRequest.Builder()
                .setSalt("edbe2384cf59c")
                .setSource("user2_password")
                .build();
        String hashedPassword = service.computeHash(request).toHex();
        System.out.println(hashedPassword);
    }
}

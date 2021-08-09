import java.util.Base64;
import java.util.function.Function;

public class FunctionHandler implements Function<FunctionHandler.Request, byte[]> {

    @Override
    public byte[] apply(Request request) {
        return Base64.getDecoder()
                .decode("iVBORw0KGgoAAAANSUhEUgAAAAEAAAABCAYAAAAfFcSJAAAADUlEQVR42mNk+M/wHwAEBgIApD5fRAAAAABJRU5ErkJggg==");
    }

    public static class Request {
        public String httpMethod;
        public String body;
    }
}

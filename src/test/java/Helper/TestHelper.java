package Helper;


import com.google.gson.Gson;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import ru.yandex.qatools.allure.annotations.Attachment;
import ru.yandex.qatools.allure.annotations.Step;

import java.lang.reflect.Array;
import java.util.HashSet;

public class TestHelper {

    private static OkHttpClient client;
    private static Gson gson;

    public static OkHttpClient getClient() {
        if (client == null)
            client = new OkHttpClient();
        return client;
    }

    public static Gson getGson() {
        if (gson == null)
            gson = new Gson();
        return gson;
    }

    @Attachment(type = "image/png")
    public static byte[] makeScreenshot(WebDriver driver) {
        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
    }
}

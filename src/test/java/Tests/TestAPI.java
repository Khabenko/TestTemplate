package Tests;

import Helper.TestConfiguration;
import Helper.TestHelper;
import Model.API.APIParameters;
import Model.API.RequestType;
import Model.API.Response.BlockchainTransactions;
import com.google.gson.Gson;
import io.qameta.allure.Step;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import ru.yandex.qatools.allure.annotations.Title;
import ru.yandex.qatools.allure.annotations.*;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class TestAPI {
    private Response response;
    private OkHttpClient httpClient;
    private Gson gson;
    private TestConfiguration testConfiguration;

    @Before
    public void setUp() throws Exception {
       this.httpClient =  TestHelper.getClient();
       this.gson = TestHelper.getGson();
       this.testConfiguration = TestConfiguration.getTestConfiguration();
    }

    @Title("Get Private Blockchain Transactions [GET]")
    @Test
    public void getPrivateBlockchainTransactio() {
        StringBuilder reqestUrl =  new StringBuilder();
        reqestUrl.append(testConfiguration.getBaseURL())
                 .append(APIParameters.requestType+"="+RequestType.getPrivateBlockchainTransactions)
                 .append("&")
                 .append(APIParameters.publicKey+"="+testConfiguration.getPublicKey());
        
        Request request = new Request.Builder()
                .url(reqestUrl.toString())
                .get()
                .build();
        try {

            Response  response = httpClient.newCall(request).execute();
            assertEquals(200, response.code());
            BlockchainTransactions blockchainTransactions = gson.fromJson(response.body().string().toString(), BlockchainTransactions.class);
            //assert blockchainTransactions

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

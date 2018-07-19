package Model.API.Response;

import Model.Transaction;

import java.util.ArrayList;

public class BlockchainTransactions {
    private String serverPublicKey;
    private float requestProcessingTime;
    ArrayList <Transaction> transactions = new ArrayList<Transaction>();

    public String getServerPublicKey() {
        return serverPublicKey;
    }

    public float getRequestProcessingTime() {
        return requestProcessingTime;
    }

    public void setServerPublicKey(String serverPublicKey) {
        this.serverPublicKey = serverPublicKey;
    }

    public void setRequestProcessingTime(float requestProcessingTime) {
        this.requestProcessingTime = requestProcessingTime;
    }
}

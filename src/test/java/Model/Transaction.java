package Model;

public class Transaction {
    private String signature;
    private Long transactionIndex;
    private Long type;
    private Boolean phased;
    private String ecBlockID;
    private String signatureHash;
    private Attachment attachment;
    private Long subtype;
    private String block;
    private Long blockTimestamp;
    private Long deadline;
    private Long timestamp;
    private Long height;
    private Long confirmations;
    private String fullHash;
    private Long version;
    private String amountATM;
    private String sender;
    private String recipient;
    private String feeATM;
    private Long ecBlockHeight;
    private String transaction;
    private String encryptedTransaction;

    public String getSignature() { return signature; }
    public void setSignature(String value) { this.signature = value; }

    public Long getTransactionIndex() { return transactionIndex; }
    public void setTransactionIndex(Long value) { this.transactionIndex = value; }

    public Long getType() { return type; }
    public void setType(Long value) { this.type = value; }

    public Boolean getPhased() { return phased; }
    public void setPhased(Boolean value) { this.phased = value; }

    public String getEcBlockID() { return ecBlockID; }
    public void setEcBlockID(String value) { this.ecBlockID = value; }

    public String getSignatureHash() { return signatureHash; }
    public void setSignatureHash(String value) { this.signatureHash = value; }

    public Attachment getAttachment() { return attachment; }
    public void setAttachment(Attachment value) { this.attachment = value; }

    public Long getSubtype() { return subtype; }
    public void setSubtype(Long value) { this.subtype = value; }

    public String getBlock() { return block; }
    public void setBlock(String value) { this.block = value; }

    public Long getBlockTimestamp() { return blockTimestamp; }
    public void setBlockTimestamp(Long value) { this.blockTimestamp = value; }

    public Long getDeadline() { return deadline; }
    public void setDeadline(Long value) { this.deadline = value; }

    public Long getTimestamp() { return timestamp; }
    public void setTimestamp(Long value) { this.timestamp = value; }

    public Long getHeight() { return height; }
    public void setHeight(Long value) { this.height = value; }

    public Long getConfirmations() { return confirmations; }
    public void setConfirmations(Long value) { this.confirmations = value; }

    public String getFullHash() { return fullHash; }
    public void setFullHash(String value) { this.fullHash = value; }

    public Long getVersion() { return version; }
    public void setVersion(Long value) { this.version = value; }

    public String getAmountATM() { return amountATM; }
    public void setAmountATM(String value) { this.amountATM = value; }

    public String getSender() { return sender; }
    public void setSender(String value) { this.sender = value; }

    public String getRecipient() { return recipient; }
    public void setRecipient(String value) { this.recipient = value; }

    public String getFeeATM() { return feeATM; }
    public void setFeeATM(String value) { this.feeATM = value; }

    public Long getEcBlockHeight() { return ecBlockHeight; }
    public void setEcBlockHeight(Long value) { this.ecBlockHeight = value; }

    public String getTransaction() { return transaction; }
    public void setTransaction(String value) { this.transaction = value; }

    public String getEncryptedTransaction() { return encryptedTransaction; }
    public void setEncryptedTransaction(String value) { this.encryptedTransaction = value; }
}

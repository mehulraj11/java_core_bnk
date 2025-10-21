package models;

public class Account {
    private long accountNumber;
    private final static String IFSC = "MEHUL000";
    private String branch;
    private long mobile;


    public Account() {
    }

    ;

    public Account(long accountNumber, String branch, long mobile) {
        this.accountNumber = accountNumber;
        this.branch = branch;
        this.mobile = mobile;
    }

    // Getters
    public long getAccountNumber() {
        return accountNumber;
    }

    public String getIFSC() {
        return IFSC;
    }

    public String getBranch() {
        return branch;
    }

    public long getMobile() {
        return mobile;
    }
}

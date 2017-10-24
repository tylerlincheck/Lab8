/**
 * Class implementing a bank account.
 * <p>
 * Complete and document this class as part of Lab 8.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/8/">Lab 8 Description</a>
 */
public class BankAccount {

    /**
     * You may want to use this to distinguish between different kinds of accounts.
     */
    public enum BankAccountType {
        /**
         * CHECKINGS,.
         */
        CHECKINGS,
        /**
         * SAVINGS,.
         */
        SAVINGS,
        /**
         * STUDENT,.
         */
        STUDENT,
        /**
         * WORKPLACE.
         */
        WORKPLACE
    }
/**
 * Account number.
 */
    private int accountNumber;
    /**
     * Account type.
     */
    private BankAccountType accountType;
    /**
     * Account balance.
     */
    private double accountBalance;
    /**
     * Owner name.
     */
    private String ownerName;
    /**
     * Interest Rate.
     */
    private double interestRate;
    /**
     * Amount of interest earned.
     */
    private double interestEarned;
/**
 *
 * @param name the owner name
 * @param accountCategory the account type
 */
    public BankAccount(final String name, final BankAccountType accountCategory) {
        /*
         * Implement this function
         */
        ownerName = name;
        accountType = accountCategory;
        Bank.totalAccounts += 1;
    }

    /*
     * Implement getters and setters as appropriate for private variables.
     */
    /**
     *
     * @return accountNumber
     */
    public int getAccountNumber() {
        return this.accountNumber;
    }
    /**
     *
     * @param n set account number.
     */
    public void setAccountNumber(final int n) {
        this.accountNumber = n;
    }
    /**
     *
     * @return accountType
     */
    public BankAccountType getAccountType() {
        return this.accountType;
    }
    /**
     *
     * @param b set account type.
     */
    public void setAccountType(final BankAccountType b) {
        this.accountType = b;
    }
    /**
     *
     * @return accountBalance
     */
    public double getAccountBalance() {
        return this.accountBalance;
    }
    /**
     *
     * @param a set account balance.
     */
    public void setAccountBalance(final double a) {
        this.accountBalance = a;
    }
    /**
     *
     * @return ownerName
     */
    public String getOwnerName() {
        return this.ownerName;
    }
    /**
     *
     * @param o set owner name.
     */
    public void setOwnerName(final String o) {
        this.ownerName = o;
    }
    /**
     *
     * @return interestRate
     */
    public double getInterestRate() {
        return this.interestRate;
    }
    /**
     *
     * @param i set interest rate.
     */
    public void setInterestRate(final double i) {
        this.interestRate = i;
    }
    /**
     *
     * @return interestEarned
     */
    public double getInterestEarned() {
        return this.interestEarned;
    }
    /**
     *
     * @param e set interst earned.
     */
    public void setInterestEarned(final double e) {
        this.interestEarned = e;
    }
}

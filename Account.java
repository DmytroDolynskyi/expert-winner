package InnerClasses;

public class Account {
    private String personFirstName;
    private String personLastName;
    private String bank;
    private String bankAccount;
    private Operations operations;
    public Account(String personFirstName, String personLastName, String bank) {
        this.personFirstName = personFirstName;
        this.personLastName = personLastName;
        this.bank = bank;
    }

    private class Operations {

        private String cashWithdrawal;
        private String payments;
        private String income;

        public void setCashWithdrawal(String cashWithdrawal) {
            this.cashWithdrawal = cashWithdrawal;
        }

        public void setPayments(String payments) {
            this.payments = payments;
        }

        public void setIncome(String income) {
            this.income = income;
        }
    }
}

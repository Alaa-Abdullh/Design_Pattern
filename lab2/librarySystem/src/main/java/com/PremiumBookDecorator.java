package com;

public class PremiumBookDecorator extends ExternalBookDecorator {
    private double premiumFee;
    private int extendedLoanDays;

    public PremiumBookDecorator(ExternalBook decoratedBook, double premiumFee, int extendedLoanDays) {
        super(decoratedBook);
        this.premiumFee = premiumFee;
        this.extendedLoanDays = extendedLoanDays;
    }

    @Override
    public boolean isBorrowable() {
        // Premium books are always borrowable
        return true;
    }

    @Override
    public String getBookTitle() {
        return "[PREMIUM] " + super.getBookTitle();
    }

    // Additional premium-specific methods
    public double getPremiumFee() {
        return premiumFee;
    }

    public int getExtendedLoanDays() {
        return extendedLoanDays;
    }

    public String getPremiumBenefits() {
        return "Benefits include: " + extendedLoanDays + " day loan period, priority access, and premium support";
    }

    public String formatPremiumDetails() {
        return String.format("Premium Book Details:\n" +
                        "Title: %s\n" +
                        "Premium Fee: $%.2f\n" +
                        "Extended Loan: %d days\n" +
                        "Original Author: %s",
                getBookTitle(), premiumFee, extendedLoanDays, getAuthorName());
    }
}
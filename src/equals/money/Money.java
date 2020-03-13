package equals.money;

class Money {
    public Money(int amount, String currencyCode) {
		super();
		this.amount = amount;
		this.currencyCode = currencyCode;
	}
	int amount;
    String currencyCode;
    
    
    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Money))
            return false;
        Money other = (Money)o;
        boolean currencyCodeEquals = (this.currencyCode == null && other.currencyCode == null)
          || (this.currencyCode != null && this.currencyCode.equals(other.currencyCode));
        return this.amount == other.amount && currencyCodeEquals;
    }
}


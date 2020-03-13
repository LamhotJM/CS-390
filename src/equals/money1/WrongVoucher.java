package equals.money1;

class WrongVoucher extends Money {
	
	public WrongVoucher(int amount, String currencyCode, String store) {
		super(amount, currencyCode);
		this.store = store;
	}

	private String store;
	 
    public WrongVoucher(int amount, String currencyCode) {
		super(amount, currencyCode);
		// TODO Auto-generated constructor stub
	}
 

	@Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof WrongVoucher))
            return false;
        WrongVoucher other = (WrongVoucher)o;
        boolean currencyCodeEquals = (this.currencyCode == null && other.currencyCode == null)
          || (this.currencyCode != null && this.currencyCode.equals(other.currencyCode));
        boolean storeEquals = (this.store == null && other.store == null)
          || (this.store != null && this.store.equals(other.store));
        return this.amount == other.amount && currencyCodeEquals && storeEquals;
    }
 
    // other methods
}
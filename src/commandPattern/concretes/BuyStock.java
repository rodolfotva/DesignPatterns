package commandPattern.concretes;

import commandPattern.interfaces.Order;
import commandPattern.request.Stock;

public class BuyStock implements Order{

	private Stock abcStock;
	
	public BuyStock(Stock abcStock) {
		super();
		this.abcStock = abcStock;
	}

	@Override
	public void execute() {
		abcStock.buy();
	}

}

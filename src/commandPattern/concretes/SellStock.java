package commandPattern.concretes;

import commandPattern.interfaces.Order;
import commandPattern.request.Stock;

public class SellStock implements Order{

	private Stock abcStock;
	
	public SellStock(Stock abcStock) {
		super();
		this.abcStock = abcStock;
	}

	@Override
	public void execute() {
		abcStock.sell();;
	}

}

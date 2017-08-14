package game.Game.Operations;

import game.Game.OperationData;

public class Box extends Operation {
	
	public Box() {
		super("Box");
		setPrice(OperationData.Box.getPrice());
		setCapacity(OperationData.Box.getSpace());
		setCellCost(OperationData.Box.getCellCost());
		setMoneyCost(OperationData.Box.getMoneyCost());
	}
}

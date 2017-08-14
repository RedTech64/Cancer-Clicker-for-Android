package game.Game.Operations;

import game.Game.OperationData;

public class Garage extends Operation {
	
	public Garage() {
		super("Garage");
		setPrice(OperationData.Garage.getPrice());
		setCapacity(OperationData.Garage.getSpace());
		setCellCost(OperationData.Garage.getCellCost());
		setMoneyCost(OperationData.Garage.getMoneyCost());
	}
}

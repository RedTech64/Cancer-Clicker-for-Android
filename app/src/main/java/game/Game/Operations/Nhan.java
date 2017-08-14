package game.Game.Operations;

import game.Game.OperationData;

public class Nhan extends Operation {
	
	public Nhan() {
		super("Nhan");
		setPrice(OperationData.Nhan.getPrice());
		setCapacity(OperationData.Nhan.getSpace());
		setCellCost(OperationData.Nhan.getCellCost());
		setMoneyCost(OperationData.Nhan.getMoneyCost());
		setCellMult(OperationData.Nhan.getCellMult());
		setMoneyMult(OperationData.Nhan.getMoneyMult());
		setSuperCellMult(OperationData.Nhan.getSuperCellMult());
	}
}

package game.Game.Operations;

import game.Game.OperationData;

public class School extends Operation {
	
	public School() {
		super("School");
		setPrice(OperationData.School.getPrice());
		setCapacity(OperationData.School.getSpace());
		setCellMult(OperationData.School.getCellMult());
		setMoneyMult(OperationData.School.getMoneyMult());
		setSuperCellMult(OperationData.School.getSuperCellMult());
	}
}

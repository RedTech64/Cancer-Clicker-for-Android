package game.Game;

import game.Main.Price;

public enum CharacterData {
	Brian(new Price(100,0,0),1,0,0,0,0,1),
	Garrett(new Price(800,0,0),2,0,0,0,0,5),
	Noah(new Price(4000,0,0),5,0,0,0,0,4),
	Andrew(new Price(10000,0,0),10,0,0,0,0,4),
	Daniel(new Price(100000,0,0),50,0,0,0,0,2),
	Amine(new Price(500000,0,0),100,0,0,0,0,1),
	Chris(new Price(1000000,0,0),250,0,0,0,0,1),
	Tinky(new Price(1000000000,0,10),1000,0,0,0,0,1),
	
	Jake(new Price(0,10,0),0,0,0,0,0,3),
	Lance(new Price(0,50,0),0,0,0,0,0,4),
	Nhan(new Price(0,100,1),0,0,0,0,0,3),
	Alex(new Price(0,1000,5),0,0,0,0,0,20),
	BP(new Price(0,600,10),0,0,0,0,0,20),
	Patreon(new Price(0,400,0),0,1,0,200,0,10),
	Apple(new Price(0,5000,10),40,5,0.4,0,0,200),
	Trump(new Price(0,10000,0),0,0,0,0,0,1);
	
	private Price p;
	private int cellRate;
	private int moneyRate;
	private double superCellMult;
	private int cellCost;
	private int moneyCost;
	private int space;
	
	CharacterData(Price p, int cellRate, int moneyRate, double superCellMult, int cellCost, int moneyCost, int space) {
		this.p = p;
		this.cellRate = cellRate;
		this.moneyRate = moneyRate;
		this.superCellMult = superCellMult;
		this.space = space;
	}
	
	public int getCellCost() {
		return cellCost;
	}

	public int getMoneyCost() {
		return moneyCost;
	}

	public Price getPrice() {
		return p;
	}
	
	public int getCellRate() {
		return cellRate;
	}
	
	public int getMoneyRate() {
		return moneyRate;
	}
	
	public double getSuperCellMult() {
		return superCellMult;
	}
	
	public int getSpace() {
		return space;
	}
}

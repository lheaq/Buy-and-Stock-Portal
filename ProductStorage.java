public class ProductStorage {
	double bpprice = 15.00, 
		pprice = 10.25, 
		whprice = 50.75, 
		fourprice = 20.50, 
		crossprice = 25.00, 
		lengthprice = 25.00, 
		dottedprice = 30.90, 
		gridprice = 25.00, 
		linedprice = 25.00, 
		clearprice = 30.00, 
		cortapeprice = 20.00, 
		liqcorprice = 15.75;
		
	 static int bpstock = 350, 
		pstock = 275, 
		whstock = 253, 
		fourstock = 289, 
		crossstock = 481, 
		lengthstock = 202, 
		dottedstock = 124, 
		gridstock = 82, 
		linedstock = 42, 
		clearstock = 281,
		cortapestock = 62, 
		liqcorstock = 154;
		
	String[] product = {"Pen", "Pad Paper", "Notebook", "Erasers"};
	String[][] items = new String[4][]; 
	
	
	public ProductStorage() {
		items[0] = new String[] { "Ballpen", "Pencil"};   
		items[1] = new String[] { "Whole", "1/4", "Crosswise", "Lengthwise" };                  
		items[2] = new String[] { "Dotted", "Grid", "Lined", "Clear" }; 
		items[3] = new String[] { "Correction Tape", "Liquid Correction" };   
	}
	
	public String[] getItems(int productIndex) {
        if (productIndex >= 0 && productIndex < product.length) {
            return items[productIndex];
        } else {
            return new String[0];
        }
    }

	
	//ballpen/////////////////////////////////
	int getBPStock() {
		return bpstock;
	}
	void setBPStock (int bpstock) {
		this.bpstock = bpstock;
	}
	double getBPprice() {
		return bpprice;
	}
	void setBPprice(double bpprice) {
		this.bpprice = bpprice;
	}
	
	//pencil//////////////////////////////////
	int getPencilStock() {
		return pstock;
	}
	void setPencilStock (int pstock) {
		this.pstock = pstock;
	}
	double getPencilPrice() {
		return pprice;
	}
	void setPencilPrice(double pprice) {
		this.pprice = pprice;
	}
	
	//whole//////////////////////////////////
	int getWholeStock() {
		return whstock;
	}
	void setWholeStock (int whstock) {
		this.whstock = whstock;
	}
	double getWholeprice() {
		return whprice;
	}
	void setWholeprice(double whprice) {
		this.whprice = whprice;
	}
	
	//one fourth/////////////////////////////////
	int getOneFourthStock() {
		return fourstock;
	}
	void setOneFourthStock (int fourstock) {
		this.fourstock = fourstock;
	}
	double getOneFourthPrice() {
		return fourprice;
	}
	void setOneFourthPrice(double fourprice) {
		this.fourprice = fourprice;
	}
	
	//cross////////////////////////////////////////////////////////////////////
	int getCrossStock() {
		return crossstock;
	}
	void setCrossStock (int crossstock) {
		this.crossstock = crossstock;
	}
	double getCrossPrice() {
		return crossprice;
	}
	void setCrossPrice(double crossprice) {
		this.crossprice = crossprice;
	}
	
	//length////////////////////////////////////////////////////////////////////
	int getLenStock() {
		return lengthstock;
	}
	void setLenStock (int lengthstock) {
		this.lengthstock = lengthstock;
	}
	double getLenPrice() {
		return lengthprice;
	}
	void setLenPrice(double lengthprice) {
		this.lengthprice = lengthprice;
	}
	
	//dotted//////////////////////////////////////////////////////////////////
	int getDotStock() {
		return dottedstock;
	}
	void setDotStock (int dottedstock) {
		this.dottedstock = dottedstock;
	}
	double getDotPrice() {
		return dottedprice;
	}
	void setDotPrice(double dottedprice) {
		this.dottedprice = dottedprice;
	}
	
	//grid////////////////////////////////////////////////////////////////////
	int getGridStock() {
		return gridstock;
	}
	void setGridStock (int gridstock) {
		this.gridstock = gridstock;
	}
	double getGridprice() {
		return gridprice;
	}
	void setGridprice(double gridprice) {
		this.gridprice = gridprice;
	}
	
	//lined////////////////////////////////////////////////////////////////
	int getLinedStock() {
		return linedstock;
	}
	void setLinedStock (int linedstock) {
		this.linedstock = linedstock;
	}
	double getLinedPrice() {
		return linedprice;
	}
	void setLinedPrice(double linedprice) {
		this.linedprice = linedprice;
	}
	
	//clear////////////////////////////////////////////////////////////////
	int getClearStock() {
		return clearstock;
	}
	void setClearStock (int clearstock) {
		this.clearstock = clearstock;
	}
	double getClearPrice() {
		return clearprice;
	}
	void setClearPrice(double clearprice) {
		this.clearprice = clearprice;
	}
	
	//cortape
	int getCorTapeStock() {
		return cortapestock;
	}
	void setCorTapeStock (int cortapestock) {
		this.cortapestock = cortapestock;
	}
	double getCorTapePrice() {
		return cortapeprice;
	}
	void setCorTapePrice(double cortapeprice) {
		this.cortapeprice = cortapeprice;
	}
	
	//liqcor
	int getLQStock() {
		return liqcorstock;
	}
	void setLQStock(int liqcorstock) {
		this.liqcorstock = liqcorstock;
	}
	double getLQPrice() {
		return liqcorprice;
	}
	void setLQPrice(double liqcorprice) {
		this.liqcorprice = liqcorprice;
	}
	
	
	public static void main(String [] args) {
	
	}
}
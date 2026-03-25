import java.util.*;
import javax.swing.*;
import java.awt.*;

public class BuyAndStockPortal {
	
	public void OwnerPage() {
		Scanner ownerInput = new Scanner(System.in);
		Object[] buttons = {"View Stock", "Add Stock"};
		
		int actionChoice = JOptionPane.showOptionDialog(
				null, 
				"Please choose an action.", 
				null, 
				JOptionPane.YES_NO_OPTION, 
				JOptionPane.PLAIN_MESSAGE, 
				null, 
				buttons, 
				null);
		
		//////THIS IS FOR VIEW STOCK ONLY////////////////////////////////////////////////////////////////////////////////////////////////
		if (actionChoice == 0) {
			Object[] prodCat = {"Pens", "Pad Papers", "Notebooks", "Erasers"};
			int productChoice = JOptionPane.showOptionDialog(
					null, 
					"Choose a product category", 
					"Product Categories", 
					JOptionPane.DEFAULT_OPTION, 
					JOptionPane.PLAIN_MESSAGE, 
					null,
					prodCat,
					null
					);
			
			
			ProductStorage prod = new ProductStorage();
			
			//////FOR PEN ITEMS/////////////////////////////////////////////////////////////////////
			if (productChoice == 0) {
				Object[] penItem = {"Ballpen", "Pencil"};
				
				int choosenItem = JOptionPane.showOptionDialog(
						null, 
						"Choose an item: ", 
						"PEN ITEMS", 
						JOptionPane.YES_NO_OPTION, 
						JOptionPane.PLAIN_MESSAGE, 
						null, penItem, null);
				
				if (choosenItem == 0) {
					JOptionPane.showMessageDialog(
							null,
							"Stock: " + prod.getBPStock(),
							"Ballpen Stock Count",
							JOptionPane.INFORMATION_MESSAGE
							);
				} else if (choosenItem == 1) {
					JOptionPane.showMessageDialog(
							null,
							"Stock: " + prod.getPencilStock(),
							"Pencil Stock Count",
							JOptionPane.INFORMATION_MESSAGE
							);
				}
				
			}
			
			////////////FOR PAD PAPER ITEMS//////////////////////////////////////////////////////////////////
			if (productChoice == 1) {
				Object[] padPaperItem = {"Whole", "1/4", "Crosswise", "Lengthwise"};
				
				int choosenItem = JOptionPane.showOptionDialog(
						null, 
						"Choose an item: ", 
						"PAD PAPER ITEMS", 
						JOptionPane.YES_NO_OPTION, 
						JOptionPane.PLAIN_MESSAGE, 
						null, padPaperItem, null);
				
				if (choosenItem == 0) {
					JOptionPane.showMessageDialog(
							null,
							"Stock: " + prod.getWholeStock(),
							"Whole sheet Stock Count",
							JOptionPane.INFORMATION_MESSAGE
							);
				} else if (choosenItem == 1) {
					JOptionPane.showMessageDialog(
							null,
							"Stock: " + prod.getOneFourthStock(),
							"1/4 sheet Stock Count",
							JOptionPane.INFORMATION_MESSAGE
							);
				} else if (choosenItem == 2) {
					JOptionPane.showMessageDialog(
							null,
							"Stock: " + prod.getCrossStock(),
							"1/2 Crosswise Stock Count",
							JOptionPane.INFORMATION_MESSAGE
							);
				} else if (choosenItem == 3) {
					JOptionPane.showMessageDialog(
							null,
							"Stock: " + prod.getLenStock(),
							"1/2 Lengthwise Stock Count",
							JOptionPane.INFORMATION_MESSAGE
							);
				}
				
				
			}
			
			/////FOR NOTEBOOKS//////////////////////////////////////////////////
			if (productChoice == 2) {
				Object[] notebookItem = {"Dotted", "Grid", "Lined", "Clear"};
				
				int choosenItem = JOptionPane.showOptionDialog(
						null, 
						"Choose an item: ", 
						"NOTEBOOK ITEMS", 
						JOptionPane.YES_NO_OPTION, 
						JOptionPane.PLAIN_MESSAGE, 
						null, notebookItem, null);
				
				if (choosenItem == 0) {
					JOptionPane.showMessageDialog(
							null,
							"Stock: " + prod.getDotStock(),
							"Dotted Notebook Stock Count",
							JOptionPane.INFORMATION_MESSAGE
							);
				} else if (choosenItem == 1) {
					JOptionPane.showMessageDialog(
							null,
							"Stock: " + prod.getGridStock(),
							"Grid Notebook Stock Count",
							JOptionPane.INFORMATION_MESSAGE
							);
				} else if (choosenItem == 2) {
					JOptionPane.showMessageDialog(
							null,
							"Stock: " + prod.getLinedStock(),
							"Lined Notebook Stock Count",
							JOptionPane.INFORMATION_MESSAGE
							);
				} else if (choosenItem == 3) {
					JOptionPane.showMessageDialog(
							null,
							"Stock: " + prod.getClearStock(),
							"Clear Notebook Stock Count",
							JOptionPane.INFORMATION_MESSAGE
							);
				}
			}
			
			/////FOR ERASERS///////////////////////////////////////////////////////////////////
			if (productChoice == 3) {
				Object[] eraserItem = {"Correction Tape", "Liquid Correction"};
				
				int choosenItem = JOptionPane.showOptionDialog(
						null, 
						"Choose an item: ", 
						"ERASER ITEMS", 
						JOptionPane.YES_NO_OPTION, 
						JOptionPane.PLAIN_MESSAGE, 
						null, eraserItem, null);
				
				if (choosenItem == 0) {
					JOptionPane.showMessageDialog(
							null,
							"Stock: " + prod.getCorTapeStock(),
							"Correction Tape Stock Count",
							JOptionPane.INFORMATION_MESSAGE
							);
				} else if (choosenItem == 1) {
					JOptionPane.showMessageDialog(
							null,
							"Stock: " + prod.getLQStock(),
							"Liquid Correction Stock Count",
							JOptionPane.INFORMATION_MESSAGE
							);
				}
			}
		}
		
		////THIS IS FOR ADD STOCK ONLY///////////////////////////////////////////////////////////////////////////////////
		if (actionChoice == 1) {
			Object[] prodCat = {"Pens", "Pad Papers", "Notebooks", "Erasers"};
			int productChoice = JOptionPane.showOptionDialog(
					null, 
					"Choose a product category", 
					"Product Categories", 
					JOptionPane.DEFAULT_OPTION, 
					JOptionPane.PLAIN_MESSAGE, 
					null,
					prodCat,
					null
					);
			
			
			ProductStorage prod = new ProductStorage();
			
			//////FOR PEN ITEMS/////////////////////////////////////////////////////////////////////
			if (productChoice == 0) {
				Object[] penItem = {"Ballpen", "Pencil"};
				
				int choosenItem = JOptionPane.showOptionDialog(
						null, 
						"Choose an item: ", 
						"PEN ITEMS", 
						JOptionPane.YES_NO_OPTION, 
						JOptionPane.PLAIN_MESSAGE, 
						null, penItem, null);
				
				if (choosenItem == 0) {
					String addBPStockStr = JOptionPane.showInputDialog(null, "Enter stock count to be added: ", "Add Stock");
					int addBPStock = Integer.parseInt(addBPStockStr);
					
					int currentBP = addBPStock + prod.getBPStock();
					prod.setBPStock(currentBP);
					
					/////////JOptionPane.showMessageDialog(null, "Stock updated!", null, JOptionPane.INFORMATION_MESSAGE);
				
				} else if (choosenItem == 1) {
					String addPStockStr = JOptionPane.showInputDialog(null, "Enter stock count to be added: ", "Add Stock");
					int addPStock = Integer.parseInt(addPStockStr);
					int currentP = addPStock + prod.getPencilStock();
					prod.setPencilStock(currentP);
				}
				
			}
			
			////////////FOR PAD PAPER ITEMS//////////////////////////////////////////////////////////////////
			if (productChoice == 1) {
				Object[] padPaperItem = {"Whole", "1/4", "Crosswise", "Lengthwise"};
				
				int choosenItem = JOptionPane.showOptionDialog(
						null, 
						"Choose an item: ", 
						"PAD PAPER ITEMS", 
						JOptionPane.YES_NO_OPTION, 
						JOptionPane.PLAIN_MESSAGE, 
						null, padPaperItem, null);
				
				if (choosenItem == 0) {
					String addwholeStockStr = JOptionPane.showInputDialog(null, "Enter stock count to be added: ", "Add Stock");
					int addwholeStock = Integer.parseInt(addwholeStockStr);
					
					int currentwhole = addwholeStock + prod.getWholeStock();
					prod.setWholeStock(currentwhole);
					
				} else if (choosenItem == 1) {
					String addfourthStockStr = JOptionPane.showInputDialog(null, "Enter stock count to be added: ", "Add Stock");
					int addfourthStock = Integer.parseInt(addfourthStockStr);
					
					int currentfourth = addfourthStock + prod.getOneFourthStock();
					prod.setOneFourthStock(currentfourth);
				} else if (choosenItem == 2) {
					String addCrossStockStr = JOptionPane.showInputDialog(null, "Enter stock count to be added: ", "Add Stock");
					int addCrossStock = Integer.parseInt(addCrossStockStr);
					
					int currentCross = addCrossStock + prod.getCrossStock();
					prod.setCrossStock(currentCross);
				} else if (choosenItem == 3) {
					String addLenStockStr = JOptionPane.showInputDialog(null, "Enter stock count to be added: ", "Add Stock");
					int addLenStock = Integer.parseInt(addLenStockStr);
					
					int currentLen = addLenStock + prod.getLenStock();
					prod.setLenStock(currentLen);
				}
			}
			
			/////FOR NOTEBOOKS//////////////////////////////////////////////////
			if (productChoice == 2) {
				Object[] notebookItem = {"Dotted", "Grid", "Lined", "Clear"};
				
				int choosenItem = JOptionPane.showOptionDialog(
						null, 
						"Choose an item: ", 
						"NOTEBOOK ITEMS", 
						JOptionPane.YES_NO_OPTION, 
						JOptionPane.PLAIN_MESSAGE, 
						null, notebookItem, null);
				
				if (choosenItem == 0) {
					String addDotStockStr = JOptionPane.showInputDialog(null, "Enter stock count to be added: ", "Add Stock");
					int addDotStock = Integer.parseInt(addDotStockStr);
					
					int currentDot = addDotStock + prod.getDotStock();
					prod.setDotStock(currentDot);
				} else if (choosenItem == 1) {
					String addGridStockStr = JOptionPane.showInputDialog(null, "Enter stock count to be added: ", "Add Stock");
					int addGridStock = Integer.parseInt(addGridStockStr);
					
					int currentGrid = addGridStock + prod.getGridStock();
					prod.setGridStock(currentGrid);
				} else if (choosenItem == 2) {
					String addLinedStockStr = JOptionPane.showInputDialog(null, "Enter stock count to be added: ", "Add Stock");
					int addLinedStock = Integer.parseInt(addLinedStockStr);
					
					int currentLined = addLinedStock + prod.getLinedStock();
					prod.setLinedStock(currentLined);
				} else if (choosenItem == 3) {
					String addClearStockStr = JOptionPane.showInputDialog(null, "Enter stock count to be added: ", "Add Stock");
					int addClearStock = Integer.parseInt(addClearStockStr);
					
					int currentClear = addClearStock + prod.getClearStock();
					prod.setClearStock(currentClear);
				}
			}
			
			/////FOR ERASERS///////////////////////////////////////////////////////////////////
			if (productChoice == 3) {
				Object[] eraserItem = {"Correction Tape", "Liquid Correction"};
				
				int choosenItem = JOptionPane.showOptionDialog(
						null, 
						"Choose an item: ", 
						"ERASER ITEMS", 
						JOptionPane.YES_NO_OPTION, 
						JOptionPane.PLAIN_MESSAGE, 
						null, eraserItem, null);
				
				if (choosenItem == 0) {
					String addCorTapeStockStr = JOptionPane.showInputDialog(null, "Enter stock count to be added: ", "Add Stock");
					int addCorTapeStock = Integer.parseInt(addCorTapeStockStr);
					
					int currentcortape = addCorTapeStock + prod.getCorTapeStock();
					prod.setCorTapeStock(currentcortape);
				} else if (choosenItem == 1) {
					String addliqcorStockStr = JOptionPane.showInputDialog(null, "Enter stock count to be added: ", "Add Stock");
					int addliqcorStock = Integer.parseInt(addliqcorStockStr);
					
					int currentliqcor = addliqcorStock + prod.getLQStock();
					prod.setLQStock(currentliqcor);
				}
			}
		}	
	}
	
	public void CustomerPage() {

		ProductStorage call = new ProductStorage();
		ArrayList<String> receiptItems = new ArrayList<>();
		ArrayList<Double> receiptPrices = new ArrayList<>();

		int addItem;
		
		do {
			addItem = JOptionPane.showOptionDialog(
					null,
					"Do you want to add to your cart?",
					"Order Page",
					JOptionPane.YES_NO_OPTION,
					JOptionPane.PLAIN_MESSAGE,
					null, null, null);

			if (addItem == JOptionPane.YES_OPTION) {
				JLabel message = new JLabel("Choose a category of products");
				message.setHorizontalAlignment(SwingConstants.CENTER);

				Object[] categories = {"PENS", "PAD PAPERS", "NOTEBOOKS", "ERASERS"};
				int productCategory = JOptionPane.showOptionDialog(
						null,
						message,
						"Product Categories",
						JOptionPane.DEFAULT_OPTION,
						JOptionPane.PLAIN_MESSAGE,
						null,
						categories,
						null);

				String[] itemsInCategory = call.getItems(productCategory);

				int selectedItem = JOptionPane.showOptionDialog(
						null,
						"Choose an item",
						categories[productCategory] + " Items",
						JOptionPane.DEFAULT_OPTION,
						JOptionPane.PLAIN_MESSAGE,
						null,
						itemsInCategory,
						null);

				if (selectedItem >= 0) {
					String buyStr = JOptionPane.showInputDialog(
							null,
							"Number of Purchase",
							"Purchase Amount",
							JOptionPane.PLAIN_MESSAGE);

					int buyCount = Integer.parseInt(buyStr);
					String chosenItemName = itemsInCategory[selectedItem];
					double chosenItemPrice = 0;

					// --- Handle all items ---
					if (chosenItemName.equals("Ballpen")) {
						chosenItemPrice = call.getBPprice();
						call.setBPStock(call.getBPStock() - buyCount);
					} else if (chosenItemName.equals("Pencil")) {
						chosenItemPrice = call.getPencilPrice();
						call.setPencilStock(call.getPencilStock() - buyCount);
					} else if (chosenItemName.equals("Whole")) {
						chosenItemPrice = call.getWholeprice();
						call.setWholeStock(call.getWholeStock() - buyCount);
					} else if (chosenItemName.equals("1/4")) {
						chosenItemPrice = call.getOneFourthPrice();
						call.setOneFourthStock(call.getOneFourthStock() - buyCount);
					} else if (chosenItemName.equals("Crosswise")) {
						chosenItemPrice = call.getCrossPrice();
						call.setCrossStock(call.getCrossStock() - buyCount);
					} else if (chosenItemName.equals("Lengthwise")) {
						chosenItemPrice = call.getLenPrice();
						call.setLenStock(call.getLenStock() - buyCount);
					} else if (chosenItemName.equals("Dotted")) {
						chosenItemPrice = call.getDotPrice();
						call.setDotStock(call.getDotStock() - buyCount);
					} else if (chosenItemName.equals("Grid")) {
						chosenItemPrice = call.getGridprice();
						call.setGridStock(call.getGridStock() - buyCount);
					} else if (chosenItemName.equals("Lined")) {
						chosenItemPrice = call.getLinedPrice();
						call.setLinedStock(call.getLinedStock() - buyCount);
					} else if (chosenItemName.equals("Clear")) {
						chosenItemPrice = call.getClearPrice();
						call.setClearStock(call.getClearStock() - buyCount);
					} else if (chosenItemName.equals("Correction Tape")) {
						chosenItemPrice = call.getCorTapePrice();
						call.setCorTapeStock(call.getCorTapeStock() - buyCount);
					} else if (chosenItemName.equals("Liquid Correction")) {
						chosenItemPrice = call.getLQPrice();
						call.setLQStock(call.getLQStock() - buyCount);
					}

					// Add items and prices to receipt
					for (int i = 0; i < buyCount; i++) {
						receiptItems.add(chosenItemName);
						receiptPrices.add(chosenItemPrice);
					}

					JOptionPane.showMessageDialog(
							null,
							buyCount + "x " + chosenItemName + " added to cart.",
							"Added to Cart",
						JOptionPane.INFORMATION_MESSAGE);
				}
			}
		} while (addItem == JOptionPane.YES_OPTION);

		// --- Print receipt ---
		if (receiptItems.size() > 0) {
			String receipt = "Your Receipt:\n";
			ArrayList<String> countedItems = new ArrayList<>();
			double totalPayment = 0;

			for (int i = 0; i < receiptItems.size(); i++) {
				String item = receiptItems.get(i);
				double price = receiptPrices.get(i);

				if (!countedItems.contains(item)) {
					int count = 0;
					double itemTotal = 0;

					for (int j = 0; j < receiptItems.size(); j++) {
						if (receiptItems.get(j).equals(item)) {
							count++;
							itemTotal += receiptPrices.get(j);
						}
					}

					receipt += count + "x " + item + " = ₱" + String.format("%.2f", itemTotal) + "\n";
					totalPayment += itemTotal;
					countedItems.add(item);
				}
			}

			receipt += "--------------------------\n";
			receipt += "Total Payment = ₱" + String.format("%.2f", totalPayment);

			JOptionPane.showMessageDialog(
					null,
					receipt,
					"Receipt",
					JOptionPane.INFORMATION_MESSAGE);
			} else {
				JOptionPane.showMessageDialog(
					null,
					"No items were purchased.",
					"Receipt",
					JOptionPane.INFORMATION_MESSAGE);
			}
	}


	public static void main(String [] args) {
		
		int choosen;
			
		do {
			JLabel progName = new JLabel("Buy and Stock Portal");
			progName.setHorizontalAlignment(SwingConstants.CENTER);
		
			//first module
			Object[] options = {"Owner", "Customer"};
			choosen = JOptionPane.showOptionDialog(
				null, 
				progName, 
				"Homepage", 
				JOptionPane.YES_NO_OPTION, 
				JOptionPane.PLAIN_MESSAGE, 
				null, 
				options, 
				null);
    
			if (choosen == 0) {
				JPasswordField pf = new JPasswordField();
				int result = JOptionPane.showConfirmDialog(
						null, 
						pf, 
						"Enter Password", 
						JOptionPane.OK_CANCEL_OPTION, 
						JOptionPane.PLAIN_MESSAGE);

				if (result == JOptionPane.OK_OPTION) {
					String password = new String(pf.getPassword());
					//password input of owner		
					if (password == null || password.trim().isEmpty()) {
						JOptionPane.showMessageDialog(null, "Must enter password to continue", "Error", JOptionPane.WARNING_MESSAGE);
					}
					else if (password.equals("admin123")) {
						BuyAndStockPortal call = new BuyAndStockPortal();
						call.OwnerPage();
					}
					else {
						JOptionPane.showMessageDialog(null, "Incorrect password!", "Error", JOptionPane.ERROR_MESSAGE);
					}
				}
			}
		
			else if (choosen == 1) {
				BuyAndStockPortal call = new BuyAndStockPortal();
				call.CustomerPage();
			}
		} while (choosen != -1);
	}
}
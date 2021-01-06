# Grab Goods Online Shopping

## Order Service
Order Service maintains `stockMap` and `priceMap` data of Goods
- StockMap: Item Name, Available Count
- PriceMap: Item Name, Price Per Item

And provides functionality which
- **Processes Order** 
- **Calculates Bill**

### _Interaction Command Line:_

Please input your order with comma separated goods 

**Input**

Apple, Guava, Apple, Orange

**Output**
```
========================
GrabGoods OnlineShopping
======= ORDER ==========
Apple 	(2) 	: 0.6
Guava 	(1) 	: 0.3
Orange 	(1) 	: 0.25
========================
Total 		: 1.75
```

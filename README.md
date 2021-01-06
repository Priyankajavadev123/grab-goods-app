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

#### After Offers In Place

Available Stock {Apple=20, Orange=15, Guava=2} 

Please input your order with comma separated goods 

**Input**

Apple, Apple

**Output**

```
========================
GrabGoods OnlineShopping
======= ORDER ==========
Apple 	(2) 	: 0.6
========================
Total 		: 0.60
```

#### With Notification Service 
##### - Order Received Message
Available Stock {Apple=20, Orange=15, Guava=2} 

Please input your order with comma separated goods 

**Input**

Guava, Guava, Orange

**Output**

`>>> Message: Order Received`


```
========================
GrabGoods OnlineShopping
======= ORDER ==========
Guava 	(2) 	: 0.3
Orange 	(1) 	: 0.25
========================
Total 		: 0.85
```
##### - Limited Stock Message
Available Stock {Apple=20, Orange=15, Guava=2} 

Please input your order with comma separated goods 

**Input**

Guava, Guava, Guava, Apple

**Output**

`>>> Message: Some item(s) of Order are Out Of Stock`
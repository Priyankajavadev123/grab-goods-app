# Grab Goods Online Shopping

## Order Service
Order Service maintains `stockMap` and `priceMap` data of Goods
- StockMap: Item Name, Available Count
- PriceMap: Item Name, Price Per Item

And provides functionality which
- **Processes Order** 
    - Checks Whether All Order Items available with StockMap
    - Prints Order Items (with Count of Each Item, Price per Item)
- **Calculates Bill**
    - Applies Offer and Calculates Total Bill

## _Interaction Command Line:_

### Step 1
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
### Step 2

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

### Step 3 & 4
#### With Notification Service 
##### - Step 3) Order Received Message
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
##### - Step 4) Limited Stock Message
Available Stock {Apple=20, Orange=15, Guava=2} 

Please input your order with comma separated goods 

**Input**

Guava, Guava, Guava, Apple

**Output**

`>>> Message: Some item(s) of Order are Out Of Stock`
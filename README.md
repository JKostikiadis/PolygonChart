# PolygonChart

Implementation of multi-type Polygon Chart in pure JavaFX. This project was created due to lack of JavaFX default charts and for previous projects needs.

## Installation

You can clone this project and build it by yourself, or you can grab the pre-build jar library and import it directly into your project and you are ready to go.

#### Pre-Build Jar 
[PolygonChart.jar V1.0](https://github.com/JKostikiadis/PolygonChart/raw/master/build/PolygonChart.jar)

## Code Example

Creating a new chart:

```java

String categories[] = { "  Category A", "Category B", "Category C", "Category D", "Category E", "Category F"};
// new PolygonChart(width, height, numberOfTicks, categories, minValue, maxValue)
PolygonChart chart = new PolygonChart(485, 400, 4, categories, 0, 10);
```

The shape of the chart depends on number of categories you will pass as an argument into the constructor. You have create any kind of polygon for example : 

![Most Of Chart Types ](./preview/ChartTypes.png)


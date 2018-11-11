/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment_4.analytics.Analyzers;

/**
 *
 * @author Ninad Subhedar (NUID : 001472377)
 */
public enum AnalyzerFactory {
    TOP_THREE_PRODUCTS_BY_REVENUE(new TopThreeProductsAnalyzer(),"1. Top 3 most popular product by revenue"),
    TOP_THREE_PRODUCTS_BY_ORDERS(new TopThreeProductAnalyzerByOccurence(),"2. Top 3 most popular product by occurence"),
    TOP_THREE_CUSTOMERS(new TopThreeCustomersAnalyzer(),"3. Top 3 best customers"),
    TOP_THREE_SALESPERSON(new TopThreeSalesPersonAnalyzer(),"4. Top 3 best sales people"),
    TOTAL_REVENUE(new TotalRevenueAnalyzer(),"5. Total revenue for the year"),
    EXIT(null,"6. Exit");
    
    private final Analyzer analyzer;
    private final String menuDisplay;

    public String getMenuDisplay() {
        return menuDisplay;
    }

    public Analyzer getAnalyzer() {
        return analyzer;
    }

    private AnalyzerFactory(Analyzer analyzer,String menuDisplay) {
        this.analyzer = analyzer;
        this.menuDisplay = menuDisplay;
    }
    
    
    
}

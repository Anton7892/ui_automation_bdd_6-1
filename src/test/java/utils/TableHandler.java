package utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class TableHandler {

        public static List<WebElement> getTableRow(int rowNumber){
            return Driver.getDriver().findElements(By.cssSelector("tr:nth-child(" + rowNumber + ") td"));
        }

        public static List<WebElement> getTableColumn(int columnNumber){
            return Driver.getDriver().findElements(By.cssSelector("td:nth-child(" + columnNumber +")"));
        }
        public static List<List<WebElement>> getTableData(WebElement table){
            // create a new list of list to hold table data
            // each inner list represents one row of the table
            List<List<WebElement>> tableData= new ArrayList<>();
            //  1	Amazon	1,523,000	USA
            //  2	Alibaba	245,700	China
            //  3	Microsoft	221,000	USA
            //  4	Apple	154,000	USA
            //  5	Samsung	116,915	S. Korea


            // get all rows from the table at once (table rows) that are direct children of tbody
            List<WebElement> rows = table.findElements(By.cssSelector("tbody > tr"));

            for(WebElement row: rows){
                tableData.add(row.findElements(By.tagName("td")));
            }
            return tableData;
        }
}




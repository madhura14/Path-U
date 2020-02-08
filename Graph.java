package utility;



import java.awt.Color;
import java.io.IOException;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.application.Application;

 


public class Graph extends Application{
 Details dt=new Details();
     final static String austria = "DGN Execution";
    final static String brazil = "DLN Execution";
   

    
   @Override public void start(Stage stage) {
       System.err.println(stage);
       stage.setTitle("Bar Chart Sample");
        final CategoryAxis xAxis = new CategoryAxis();
        final NumberAxis yAxis = new NumberAxis();
        final BarChart<String,Number> bc = 
            new BarChart<String,Number>(xAxis,yAxis);

        
        
         bc.setTitle("Execution time & Accuracy");
       bc.setStyle("-fx-background-color:white;-fx-background-radius: 10;");
     
        xAxis.setLabel("PathUility");  
           // xAxis.setTickLabelRotation(90);
        yAxis.setLabel("Execution Time in MS");
      
        
        //XYChart.Series series1 = new XYChart.Series();
      //  series1.setName("2003");  
        
      //  series1.getData().add(new XYChart.Data(austria, 25)); //value pass in 2 Parameter
     

      XYChart.Series series2 = new XYChart.Series();
       
         series2.setName("Execution Time");
      series2.getData().add(new XYChart.Data(austria, dt.execution,Color.BLACK));
      series2.getData().add(new XYChart.Data("",0)); 
      series2.getData().add(new XYChart.Data(brazil, dt.DLN));
         
        
//        series2.getData().add(new XYChart.Data(france, 14));
//        series2.getData().add(new XYChart.Data(italy, 11));
//        series2.getData().add(new XYChart.Data(usa, 14));  
//     
   
        
        
     //   XYChart.Series series3 = new XYChart.Series();
      //  series3.setName("2005dfdfdfds");
     // series3.getData().add(new XYChart.Data(austria, 4));
         
        
         
          bc.setLegendVisible(true);

        Scene scene  = new Scene(bc,400,500);
        bc.getData().addAll(series2);
        stage.setScene(scene);
        stage.show();
    }
 
    
    public static void main(String []args) throws IOException  {
        javafx.application.Application.launch(args);
      
        

    
  
//    URL location = PdfReader.class.getProtectionDomain().getCodeSource().getLocation();
//System.out.println(location.getPath());
 
}
}

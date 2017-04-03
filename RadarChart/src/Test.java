import com.kostikiadis.radarChart.RadarChart;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Test extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {

		String categories[] = { "  Category A", "Category B", "Category C", "Category D", "Category E" };
		RadarChart radarChart = new RadarChart(500, 400, 4, categories, 0, 10);

		double values[] = { 5, 2, 8, 6, 9 };

		radarChart.setValues(values);

		VBox box = new VBox();

		box.getChildren().addAll(radarChart);

		primaryStage.setScene(new Scene(box));
		primaryStage.show();

		double values2[] = { 6, 4, 3, 7, 2 };

		radarChart.setValues(values2);
	}

}

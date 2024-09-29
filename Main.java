package thenewswall;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import org.json.*;

public class Main extends Application{
    public void start(Stage primaryStage) throws Exception {
        HttpRequest request = HttpRequest.newBuilder()
        .uri(URI.create("https://newsapi.org/v2/top-headlines?country=in&apiKey=9db7de8519714a2f8d7a0ffdd51dcbe1"))
        .method("GET",HttpRequest.BodyPublishers.noBody())
        .build();

        HttpResponse<String>response = null;

        try{
            response = HttpClient.newHttpClient().send(request,HttpResponse.BodyHandlers.ofString());
        } catch (IOException e){
            e.printStackTrace();
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        
        //System.out.println(response.body());

        Text header = new Text();
        header.setX(600);
        header.setY(50);
        header.setFont(Font.font("Helvetica",FontWeight.BOLD,FontPosture.REGULAR,50));
        header.setFill(Color.BLACK);
        header.setText("Top headlines");

        Group root = new Group();
        Scene scene = new Scene(root, 500, 500, Color.rgb(69, 173, 151));

        root.getChildren().add(header);
        
        JSONObject obj = new JSONObject(response.body());
        JSONArray arr = obj.getJSONArray("articles");

        String h1 = arr.getJSONObject(0).getString("title");
        String a1 = arr.getJSONObject(0).getString("author");
        String u1 = arr.getJSONObject(0).getString("url");

        Text headline1 = new Text();
        headline1.setX(10);
        headline1.setY(100);
        headline1.setFont(Font.font("Helvetica",25));
        headline1.setText(h1);

        root.getChildren().add(headline1);

        primaryStage.setScene(scene);
        primaryStage.setTitle("TheNewswall");
        primaryStage.getIcons().add(new Image(getClass().getResourceAsStream("icon.png")));
        primaryStage.setMaximized(true);
        primaryStage.show();
    }

    public static void main(String[] args){
        launch(args);
    }
}

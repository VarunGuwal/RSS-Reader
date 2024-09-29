package thenewsoftheworld;

import javafx.application.Application;
import javafx.scene.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.scene.image.*;
import javafx.scene.paint.*;
import javafx.scene.shape.*;
import javafx.scene.text.*;
import javafx.scene.layout.*;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import org.json.*;
import javafx.scene.Scene;
import javafx.scene.paint.Color;

// Java program to set a fill for the background  
// of a container 
import javafx.application.Application; 
import javafx.scene.Scene; 
import javafx.scene.control.*; 
import javafx.scene.layout.*; 
import javafx.stage.Stage; 
import javafx.event.ActionEvent; 
import javafx.event.EventHandler; 
import javafx.scene.canvas.*; 
import javafx.scene.web.*; 
import javafx.scene.layout.*; 
import javafx.scene.image.*; 
import java.io.*; 
import javafx.geometry.*; 
import javafx.scene.Group; 
import javafx.scene.paint.*; 

import java.awt.Desktop;
import java.awt.Label;
import java.net.URI;


public class Main extends Application{

    private int lastClickedIndex = -1; 

    public void start(Stage primaryStage) throws Exception {
        TabPane headlines = new TabPane();
        Tab general = new Tab("General");
        Tab health = new Tab("Health");
        Tab sportsTab = new Tab("Sports");
        Tab entertainmentTab = new Tab("Entertainment");
        Tab techTab = new Tab("Technology");
        Tab bTab = new Tab("Business");
        Tab sTab = new Tab("Science");


        headlines.getTabs().add(general);
        headlines.getTabs().add(health);
        headlines.getTabs().add(entertainmentTab);
        headlines.getTabs().add(sportsTab);
        headlines.getTabs().add(techTab);
        headlines.getTabs().add(bTab);
        headlines.getTabs().add(sTab);

        VBox general_VBox = new VBox();
        ScrollPane general_scroll = new ScrollPane(general_VBox);
        Scene generalScene = new Scene(headlines);
        primaryStage.setScene(generalScene);

        //BackgroundFill background_fill = new BackgroundFill(Color.GAINSBORO,CornerRadii.EMPTY, Insets.EMPTY); 
        BackgroundFill background_fill = new BackgroundFill(Color.HONEYDEW,CornerRadii.EMPTY, Insets.EMPTY); 

        // create Background 
        Background background = new Background(background_fill); 

        general_VBox.setBackground(background); 
        
        TextField tf =new TextField();    
        Button b = new Button("Submit"); 
        b.setBackground(new Background(new BackgroundFill(Color.HONEYDEW, null, null)));

        BorderStroke borderStroke1 = new BorderStroke(Color.GREEN,BorderStrokeStyle.SOLID,CornerRadii.EMPTY, new BorderWidths(2));
        Border border1 = new Border(borderStroke1);
        b.setBorder(border1);


        Label l=new Label(); 
        //String var="bitcoin";

        EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e)
            {
                if(tf.getText().equals("sports"))
                {

                    Desktop d=Desktop.getDesktop();

                   
							try
                            {
                                d.browse(new URI("https://www.bbc.com/sport"));	
                            }

                            catch(Exception eee)
                            {
                                System.out.println("sports");
                            }

                }

                else if(tf.getText().equals("politics"))
                {

                    Desktop d=Desktop.getDesktop();

                   
							try
                            {
                                d.browse(new URI("https://www.bbc.com/politics"));	
                            }

                            catch(Exception eee)
                            {
                                System.out.println("politics");
                            }
                }

                else if(tf.getText().equals("business"))
                {

                    Desktop d=Desktop.getDesktop();

                   
							try
                            {
                                d.browse(new URI("https://www.bbc.com/business"));	
                            }

                            catch(Exception eee)
                            {
                                System.out.println("business");
                            }
                }

                else if(tf.getText().equals("innovation"))
                {

                    Desktop d=Desktop.getDesktop();

                   
							try
                            {
                                d.browse(new URI("https://www.bbc.com/innovation"));	
                            }

                            catch(Exception eee)
                            {
                                System.out.println("innovation");
                            }
                }

                else if(tf.getText().equals("culture"))
                {

                    Desktop d=Desktop.getDesktop();

                   
							try
                            {
                                d.browse(new URI("https://www.bbc.com/culture"));	
                            }

                            catch(Exception eee)
                            {
                                System.out.println("culture");
                            }
                }

                else
                {
                    Desktop d=Desktop.getDesktop();

							try
                            {
                                d.browse(new URI("https://www.bbc.com"));	
                            }

                            catch(Exception eee)
                            {
                                System.out.println("general");
                            }
                }

            }
        };
        b.setOnAction(event);
        tf.setPromptText("Search Topics: such as politics, sports, business...");
        tf.setFocusTraversable(false);
        tf.setPrefSize(24, 33);
        tf.setLayoutX(6);
        tf.setLayoutY(9);
        b.setLayoutX(50);
        b.setLayoutY(100); 

        general_VBox.getChildren().add(tf);
        general_VBox.getChildren().add(b);

        Text app_header = new Text();
        app_header.setX(420);
        app_header.setY(50);
        app_header.setFont(Font.font("Book Antiqua",FontWeight.BOLD,FontPosture.REGULAR,40));
        app_header.setFill(Color.DARKGREEN);
        app_header.setText("Today's headlines");
        general_VBox.getChildren().add(app_header);

        HttpRequest top_headlines_request = HttpRequest.newBuilder()
        .uri(URI.create("https://newsapi.org/v2/top-headlines?country=us&apiKey=4c9156e7f0a14c09899d13383a1f3016"))
        .method("GET",HttpRequest.BodyPublishers.noBody())
        .build();

        HttpResponse<String> top_headlines_response = null;
        try{
            top_headlines_response = HttpClient.newHttpClient().send(top_headlines_request,HttpResponse.BodyHandlers.ofString());
        } catch (IOException e){
            e.printStackTrace();
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        
        JSONObject top_headlines_obj = new JSONObject(top_headlines_response.body());
        JSONArray top_headlines_arr = top_headlines_obj.getJSONArray("articles");

        for(int i = 0; i < top_headlines_arr.length(); i++)
        {
            String h = top_headlines_arr.getJSONObject(i).getString("title");
            String u = top_headlines_arr.getJSONObject(i).getString("url");
            Hyperlink h_Hyperlink = new Hyperlink();
            h_Hyperlink.setFont(Font.font("Helvetica",25));
            h_Hyperlink.setText(h);
            h_Hyperlink.setOnAction(top_headlines_event -> {
                getHostServices().showDocument(u);
            });

            FlowPane pane = new FlowPane();
            pane.setPrefHeight(120);
            BorderStrokeStyle borderStrokeStyle = new BorderStrokeStyle(StrokeType.INSIDE, StrokeLineJoin.MITER, StrokeLineCap.BUTT, 2, 0, null);
            BorderStroke borderStroke = new BorderStroke(Color.BLACK, borderStrokeStyle, new CornerRadii(0), new BorderWidths(6));
            Border border = new Border(borderStroke);
            pane.setBorder(border);
            pane.getChildren().add(h_Hyperlink);
            general_VBox.getChildren().add(pane);

        }
        general.setContent(general_scroll);
        


        VBox health_VBox = new VBox();
        ScrollPane health_scroll = new ScrollPane(health_VBox);
        Scene healthScene = new Scene(health_scroll,1920,1080);

        
        BackgroundFill background_fill1 = new BackgroundFill(Color.HONEYDEW,CornerRadii.EMPTY, Insets.EMPTY); 

        // create Background 
        Background background1 = new Background(background_fill1); 

        health_VBox.setBackground(background1); 

        Text health_header = new Text();
        health_header.setX(420);
        health_header.setY(50);
        health_header.setFont(Font.font("Book Antiqua",FontWeight.BOLD,FontPosture.REGULAR,40));
        health_header.setFill(Color.DARKGREEN);
        health_header.setText("Health");
        health_VBox.getChildren().add(health_header);
        
        HttpRequest health_request = HttpRequest.newBuilder()
        .uri(URI.create("https://newsapi.org/v2/top-headlines?category=health&apiKey=4c9156e7f0a14c09899d13383a1f3016"))
        .method("GET",HttpRequest.BodyPublishers.noBody())
        .build();

        HttpResponse<String> health_response = null;
        try{
            health_response = HttpClient.newHttpClient().send(health_request,HttpResponse.BodyHandlers.ofString());
        }
        catch(Exception exception){
            exception.printStackTrace();
        }

        JSONObject health_obj = new JSONObject(health_response.body());
        JSONArray health_arr = health_obj.getJSONArray("articles");

        for(int i = 0; i < health_arr.length(); i++)
        {
            String h = health_arr.getJSONObject(i).getString("title");
            String u = health_arr.getJSONObject(i).getString("url");
            Hyperlink h_Hyperlink = new Hyperlink();
            h_Hyperlink.setFont(Font.font("Helvetica",25));
            h_Hyperlink.setText(h);
            h_Hyperlink.setOnAction(health_event -> {
                getHostServices().showDocument(u);
            });

            FlowPane pane = new FlowPane(Orientation.VERTICAL,5,5);
            pane.setPrefHeight(120);
            pane.setPrefWidth(50);
            BorderStrokeStyle borderStrokeStyle = new BorderStrokeStyle(StrokeType.INSIDE, StrokeLineJoin.MITER, StrokeLineCap.BUTT, 2, 0, null);
            BorderStroke borderStroke = new BorderStroke(Color.BLACK, borderStrokeStyle, new CornerRadii(0), new BorderWidths(6));
            Border border = new Border(borderStroke);
            pane.setBorder(border); 
            pane.getChildren().add(h_Hyperlink);
        
            health_VBox.getChildren().add(pane);
        }

        health.setContent(health_scroll);

        //NEW VBOX
        VBox e_VBox = new VBox();
        ScrollPane e_scroll = new ScrollPane(e_VBox);
        Scene eScene = new Scene(e_scroll,1920,1080);

        Text e_header = new Text();
        e_header.setX(420);
        e_header.setY(50);
        e_header.setFont(Font.font("Book Antiqua",FontWeight.BOLD,FontPosture.REGULAR,40));
        e_header.setFill(Color.DARKGREEN);
        e_header.setText("Entertainment");
        e_VBox.getChildren().add(e_header);
        
        HttpRequest e_request = HttpRequest.newBuilder()
        .uri(URI.create("https://newsapi.org/v2/top-headlines?category=entertainment&apiKey=4c9156e7f0a14c09899d13383a1f3016"))
        .method("GET",HttpRequest.BodyPublishers.noBody())
        .build();

        HttpResponse<String> e_response = null;
        try{
            e_response = HttpClient.newHttpClient().send(e_request,HttpResponse.BodyHandlers.ofString());
        }
        catch(Exception exception){
            exception.printStackTrace();
        }

        JSONObject e_obj = new JSONObject(e_response.body());
        JSONArray e_arr = e_obj.getJSONArray("articles");

        for(int i = 0; i < e_arr.length(); i++)
        {
            String h = e_arr.getJSONObject(i).getString("title");
            String u = e_arr.getJSONObject(i).getString("url");
            Hyperlink e_Hyperlink = new Hyperlink();
            e_Hyperlink.setFont(Font.font("Helvetica",25));
            e_Hyperlink.setText(h);
            e_Hyperlink.setOnAction(e_event -> {
                getHostServices().showDocument(u);
            });

            FlowPane pane = new FlowPane(Orientation.VERTICAL,5,5);
            pane.setPrefHeight(120);
            pane.setPrefWidth(50);
            BorderStrokeStyle borderStrokeStyle = new BorderStrokeStyle(StrokeType.INSIDE, StrokeLineJoin.MITER, StrokeLineCap.BUTT, 2, 0, null);
            BorderStroke borderStroke = new BorderStroke(Color.BLACK, borderStrokeStyle, new CornerRadii(0), new BorderWidths(6));
            Border border = new Border(borderStroke);
            pane.setBorder(border); 
            pane.getChildren().add(e_Hyperlink);
        
            e_VBox.getChildren().add(pane);
        }

        BackgroundFill background_fill2 = new BackgroundFill(Color.HONEYDEW,CornerRadii.EMPTY, Insets.EMPTY); 

        // create Background 
        Background background2 = new Background(background_fill2); 

        e_VBox.setBackground(background2); 

        entertainmentTab.setContent(e_scroll);


        //sports
        VBox sports_VBox = new VBox();
        ScrollPane sports_scroll = new ScrollPane(sports_VBox);
        Scene sportsScene = new Scene(sports_scroll,1920,1080);

        Text sports_header = new Text();
        sports_header.setX(420);
        sports_header.setY(50);
        sports_header.setFont(Font.font("Book Antiqua",FontWeight.BOLD,FontPosture.REGULAR,40));
        sports_header.setFill(Color.DARKGREEN);
        sports_header.setText("Sports");
        sports_VBox.getChildren().add(sports_header);
        
        HttpRequest sports_request = HttpRequest.newBuilder()
        .uri(URI.create("https://newsapi.org/v2/top-headlines?category=sports&apiKey=4c9156e7f0a14c09899d13383a1f3016"))
        .method("GET",HttpRequest.BodyPublishers.noBody())
        .build();

        HttpResponse<String> sports_response = null;
        try{
            sports_response = HttpClient.newHttpClient().send(sports_request,HttpResponse.BodyHandlers.ofString());
        }
        catch(Exception exception){
            exception.printStackTrace();
        }

        JSONObject sports_obj = new JSONObject(sports_response.body());
        JSONArray sports_arr = sports_obj.getJSONArray("articles");

        for(int i = 0; i < sports_arr.length(); i++)
        {
            String h = sports_arr.getJSONObject(i).getString("title");
            String u = sports_arr.getJSONObject(i).getString("url");
            Hyperlink sports_Hyperlink = new Hyperlink();
            sports_Hyperlink.setFont(Font.font("Helvetica",25));
            sports_Hyperlink.setText(h);
            sports_Hyperlink.setOnAction(e_event -> {
                getHostServices().showDocument(u);
            });

            FlowPane pane = new FlowPane(Orientation.VERTICAL,5,5);
            pane.setPrefHeight(120);
            pane.setPrefWidth(50);
            BorderStrokeStyle borderStrokeStyle = new BorderStrokeStyle(StrokeType.INSIDE, StrokeLineJoin.MITER, StrokeLineCap.BUTT, 2, 0, null);
            BorderStroke borderStroke = new BorderStroke(Color.BLACK, borderStrokeStyle, new CornerRadii(0), new BorderWidths(6));
            Border border = new Border(borderStroke);
            pane.setBorder(border); 
            pane.getChildren().add(sports_Hyperlink);
        
            sports_VBox.getChildren().add(pane);
        }

        sportsTab.setContent(sports_scroll);
        BackgroundFill background_fill3 = new BackgroundFill(Color.HONEYDEW,CornerRadii.EMPTY, Insets.EMPTY); 

        // create Background 
        Background background3 = new Background(background_fill3); 

        sports_VBox.setBackground(background3); 

        //technology

        
        VBox tech_VBox = new VBox();
        ScrollPane tech_scroll = new ScrollPane(tech_VBox);
        Scene techScene = new Scene(tech_scroll,1920,1080);

        Text tech_header = new Text();
        tech_header.setX(420);
        tech_header.setY(50);
        tech_header.setFont(Font.font("Book Antiqua",FontWeight.BOLD,FontPosture.REGULAR,40));
        tech_header.setFill(Color.DARKGREEN);
        tech_header.setText("Technology");
        tech_VBox.getChildren().add(tech_header);
        
        HttpRequest tech_request = HttpRequest.newBuilder()
        .uri(URI.create("https://newsapi.org/v2/top-headlines?category=technology&apiKey=4c9156e7f0a14c09899d13383a1f3016"))
        .method("GET",HttpRequest.BodyPublishers.noBody())
        .build();

        HttpResponse<String> tech_response = null;
        try{
            tech_response = HttpClient.newHttpClient().send(tech_request,HttpResponse.BodyHandlers.ofString());
        }
        catch(Exception exception){
            exception.printStackTrace();
        }

        JSONObject tech_obj = new JSONObject(tech_response.body());
        JSONArray tech_arr = tech_obj.getJSONArray("articles");

        for(int i = 0; i < tech_arr.length(); i++)
        {
            String h = tech_arr.getJSONObject(i).getString("title");
            String u = tech_arr.getJSONObject(i).getString("url");
            Hyperlink tech_Hyperlink = new Hyperlink();
            tech_Hyperlink.setFont(Font.font("Helvetica",25));
            tech_Hyperlink.setText(h);
            tech_Hyperlink.setOnAction(tech_event -> {
                getHostServices().showDocument(u);
            });

            FlowPane pane = new FlowPane(Orientation.VERTICAL,5,5);
            pane.setPrefHeight(120);
            pane.setPrefWidth(50);
            BorderStrokeStyle borderStrokeStyle = new BorderStrokeStyle(StrokeType.INSIDE, StrokeLineJoin.MITER, StrokeLineCap.BUTT, 2, 0, null);
            BorderStroke borderStroke = new BorderStroke(Color.BLACK, borderStrokeStyle, new CornerRadii(0), new BorderWidths(6));
            Border border = new Border(borderStroke);
            pane.setBorder(border); 
            pane.getChildren().add(tech_Hyperlink);
        
            tech_VBox.getChildren().add(pane);
        }

        BackgroundFill background_fill4 = new BackgroundFill(Color.HONEYDEW,CornerRadii.EMPTY, Insets.EMPTY); 

        // create Background 
        Background background4 = new Background(background_fill4); 

        tech_VBox.setBackground(background4); 


        techTab.setContent(tech_scroll);

        //business
        VBox b_VBox = new VBox();
        ScrollPane b_scroll = new ScrollPane(b_VBox);
        Scene bScene = new Scene(b_scroll,1920,1080);

        Text b_header = new Text();
        b_header.setX(420);
        b_header.setY(50);
        b_header.setFont(Font.font("Book Antiqua",FontWeight.BOLD,FontPosture.REGULAR,40));
        b_header.setFill(Color.DARKGREEN);
        b_header.setText("Business");
        b_VBox.getChildren().add(b_header);
        
        HttpRequest b_request = HttpRequest.newBuilder()
        .uri(URI.create("https://newsapi.org/v2/top-headlines?category=business&apiKey=4c9156e7f0a14c09899d13383a1f3016"))
        .method("GET",HttpRequest.BodyPublishers.noBody())
        .build();

        HttpResponse<String> b_response = null;
        try{
            b_response = HttpClient.newHttpClient().send(b_request,HttpResponse.BodyHandlers.ofString());
        }
        catch(Exception exception){
            exception.printStackTrace();
        }

        JSONObject b_obj = new JSONObject(b_response.body());
        JSONArray b_arr = b_obj.getJSONArray("articles");

        for(int i = 0; i < b_arr.length(); i++)
        {
            String h = b_arr.getJSONObject(i).getString("title");
            String u = b_arr.getJSONObject(i).getString("url");
            Hyperlink b_Hyperlink = new Hyperlink();
            b_Hyperlink.setFont(Font.font("Helvetica",25));
            b_Hyperlink.setText(h);
            b_Hyperlink.setOnAction(e_event -> {
                getHostServices().showDocument(u);
            });

            FlowPane pane = new FlowPane(Orientation.VERTICAL,5,5);
            pane.setPrefHeight(120);
            pane.setPrefWidth(50);
            BorderStrokeStyle borderStrokeStyle = new BorderStrokeStyle(StrokeType.INSIDE, StrokeLineJoin.MITER, StrokeLineCap.BUTT, 2, 0, null);
            BorderStroke borderStroke = new BorderStroke(Color.BLACK, borderStrokeStyle, new CornerRadii(0), new BorderWidths(6));
            Border border = new Border(borderStroke);
            pane.setBorder(border); 
            pane.getChildren().add(b_Hyperlink);
        
            b_VBox.getChildren().add(pane);
        }


        BackgroundFill background_fill5= new BackgroundFill(Color.HONEYDEW,CornerRadii.EMPTY, Insets.EMPTY); 

        // create Background 
        Background background5 = new Background(background_fill5); 

        b_VBox.setBackground(background5); 

        bTab.setContent(b_scroll);

        //science
 
        VBox s_VBox = new VBox();
        ScrollPane s_scroll = new ScrollPane(s_VBox);
        Scene sScene = new Scene(s_scroll,1920,1080);

        Text s_header = new Text();
        s_header.setX(420);
        s_header.setY(50);
        s_header.setFont(Font.font("Book Antiqua",FontWeight.BOLD,FontPosture.REGULAR,40));
        s_header.setFill(Color.DARKGREEN);
        s_header.setText("Science");
        s_VBox.getChildren().add(s_header);
        
        HttpRequest s_request = HttpRequest.newBuilder()
        .uri(URI.create("https://newsapi.org/v2/top-headlines?category=science&apiKey=4c9156e7f0a14c09899d13383a1f3016"))
        .method("GET",HttpRequest.BodyPublishers.noBody())
        .build();

        HttpResponse<String> s_response = null;
        try{
            s_response = HttpClient.newHttpClient().send(s_request,HttpResponse.BodyHandlers.ofString());
        }
        catch(Exception exception){
            exception.printStackTrace();
        }

        JSONObject s_obj = new JSONObject(s_response.body());
        JSONArray s_arr = s_obj.getJSONArray("articles");

        for(int i = 0; i < s_arr.length(); i++)
        {
            String h = s_arr.getJSONObject(i).getString("title");
            String u = s_arr.getJSONObject(i).getString("url");
            Hyperlink s_Hyperlink = new Hyperlink();
            s_Hyperlink.setFont(Font.font("Helvetica",25));
            s_Hyperlink.setText(h);
            s_Hyperlink.setOnAction(tech_event -> {
                getHostServices().showDocument(u);
            });

            FlowPane pane = new FlowPane(Orientation.VERTICAL,5,5);
            pane.setPrefHeight(120);
            pane.setPrefWidth(50);
            BorderStrokeStyle borderStrokeStyle = new BorderStrokeStyle(StrokeType.INSIDE, StrokeLineJoin.MITER, StrokeLineCap.BUTT, 2, 0, null);
            BorderStroke borderStroke = new BorderStroke(Color.BLACK, borderStrokeStyle, new CornerRadii(0), new BorderWidths(6));
            Border border = new Border(borderStroke);
            pane.setBorder(border); 
            pane.getChildren().add(s_Hyperlink);
        
            s_VBox.getChildren().add(pane);
        }

        BackgroundFill background_fill6 = new BackgroundFill(Color.HONEYDEW,CornerRadii.EMPTY, Insets.EMPTY); 

        // create Background 
        Background background6 = new Background(background_fill6); 

        s_VBox.setBackground(background6); 


        sTab.setContent(s_scroll);
       
        //Scene scene = new Scene(scroll, 500, 500, Color.rgb(204, 255, 229));
        //primaryStage.setScene(scene);
        primaryStage.setTitle("TheNewsOfTheWorld");
        primaryStage.getIcons().add(new Image(getClass().getResourceAsStream("icon.png")));
        primaryStage.setMaximized(true);
        primaryStage.show();
    }

    public static void main(String[] args){
        launch(args);
    }
}

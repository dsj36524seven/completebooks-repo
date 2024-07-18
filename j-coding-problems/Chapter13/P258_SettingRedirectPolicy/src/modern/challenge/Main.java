package modern.challenge;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {

        HttpClient client = HttpClient.newBuilder()
                //.followRedirects(HttpClient.Redirect.ALWAYS)
                .followRedirects(HttpClient.Redirect.NEVER)
                .build();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://reqres.in/api/users/2"))
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println("Status code: " + response.statusCode());
        System.out.println("\n Body: " + response.body());

        if (request.uri().equals(response.uri())){
            System.out.println(" No redirect occurred");
        } else {
            System.out.println("Redirect NEVER irrelevant :-( ");
        }





    }



}

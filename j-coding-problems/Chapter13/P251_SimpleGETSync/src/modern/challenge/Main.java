package modern.challenge;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()               
                .uri(URI.create("https://reqres.in/api/users/2"))                
                .build();

        HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
        
        System.out.println("Status code: " + response.statusCode());        
        System.out.println("\n Body: " + response.body());


        // -------------------- //
        // explicitly downgrading to HTTP/1.1


        HttpClient client2 = HttpClient.newHttpClient();

        HttpRequest request1 = HttpRequest.newBuilder()
                .version((HttpClient.Version.HTTP_1_1))
                .uri(URI.create("https://reqres.in/api/users2"))
                .build();

        HttpResponse<String> response1 = client.send(request1, BodyHandlers.ofString());

        System.out.println();
        System.out.println("Explicitly downgrading to HTTP/1.1");
        System.out.println("Status code: " + response1.statusCode());
        System.out.println("\n Body: " + response1.body());

    }
}

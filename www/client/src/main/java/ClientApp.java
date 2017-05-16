import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ClientApp
{

    public static void main(String[] args) throws Exception
    {
        HttpClient client = new DefaultHttpClient();
        HttpPost post = new HttpPost("http://192.168.50.4:2017/");
        HttpResponse response = client.execute(post);
        BufferedReader rd = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
        String line;
        while ((line = rd.readLine()) != null)
        {
            System.out.println("Response form server is " + line);
        }
    }
}
